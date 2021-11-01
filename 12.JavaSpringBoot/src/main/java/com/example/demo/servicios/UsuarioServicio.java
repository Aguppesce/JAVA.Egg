package com.example.demo.servicios;

import com.example.demo.entidades.Foto;
import com.example.demo.entidades.Usuario;
import com.example.demo.excepciones.MiExcepcion;
import com.example.demo.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UsuarioServicio implements UserDetailsService{
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    @Autowired
    private FotoServicio fotoServicio;
    
    @Autowired
    private NotificacionServicio notificacionServicio;
    
    @Transactional
    public void registrar(MultipartFile archivo, String nombre, String apellido, String mail, String clave) throws MiExcepcion{
        
        validar(nombre, apellido, mail, clave);
        
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setMail(mail);
        
        String encriptada = new BCryptPasswordEncoder().encode(clave);
        usuario.setClave(encriptada);
        
        usuario.setAlta(new Date());        
        
        Foto foto = fotoServicio.guardar(archivo);
        usuario.setFoto(foto);
        
        usuarioRepositorio.save(usuario);
        
        notificacionServicio.enviar("Bienvenidos al Tinder de mascota!", "Tinder de Mesacota", usuario.getMail());
    }
    
    @Transactional
    public void modificar(MultipartFile archivo, String id, String nombre, String apellido, String mail, String clave) throws MiExcepcion{
        
        validar(nombre, apellido, mail, clave);
        
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        if(respuesta.isPresent()){
            Usuario usuario = respuesta.get();
            usuario.setApellido(apellido);
            usuario.setNombre(nombre);
            usuario.setMail(mail);
            
            String encriptada = new BCryptPasswordEncoder().encode(clave);
            usuario.setClave(encriptada);
            
            String idFoto = null;
            if(usuario.getFoto() != null){
                idFoto = usuario.getFoto().getId();
            }
            
            Foto foto = fotoServicio.actualizar(idFoto, archivo);
            usuario.setFoto(foto);
            
            usuarioRepositorio.save(usuario);
        }else {
            throw new MiExcepcion("No se encontró el usuario solicitado");
        }
    }
    
    @Transactional
    public void deshabilitar(String id) throws MiExcepcion{
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        if(respuesta.isPresent()){
            Usuario usuario = respuesta.get();
            usuario.setBaja(new Date());            
            usuarioRepositorio.save(usuario);
        }else {
            throw new MiExcepcion("No se encontró el usuario solicitado");
        }
    }
        
    @Transactional
    public void habilitar(String id) throws MiExcepcion{
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        if(respuesta.isPresent()){
            Usuario usuario = respuesta.get();
            usuario.setBaja(null);            
            usuarioRepositorio.save(usuario);
        }else {
            throw new MiExcepcion("No se encontró el usuario solicitado");
        }
    }
    
    public void validar(String nombre, String apellido, String mail, String clave) throws MiExcepcion {
        if(nombre == null || nombre.isEmpty()){
            throw new MiExcepcion("El nombre del usuario no puede ser nulo.");
        }
        if(apellido == null || apellido.isEmpty()){
            throw new MiExcepcion("El apellido del usuario no puede ser nulo.");
        }
        if(mail == null || mail.isEmpty()){
            throw new MiExcepcion("El mail del usuario no puede ser nulo.");
        }
        if(clave == null || clave.isEmpty() || clave.length() <= 6){
            throw new MiExcepcion("La clave del usuario no puede ser nula y tiene que tener más de 6 dígitos.");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepositorio.buscarPorMail(mail);
        if(usuario != null){
            
            List<GrantedAuthority> permisos = new ArrayList<>();
            
            GrantedAuthority p1 = new SimpleGrantedAuthority("MODULO FOTOS");
            permisos.add(p1);
            
            GrantedAuthority p2 = new SimpleGrantedAuthority("MODULO MASCOTAS");
            permisos.add(p2);
            
            GrantedAuthority p3 = new SimpleGrantedAuthority("MODULO VOTOS");
            permisos.add(p3);
            
            User user = new User(usuario.getMail(), usuario.getClave(), permisos);
            return user;
        } else {
            return null;
        }
    }
}
