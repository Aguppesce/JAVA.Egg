package com.example.demo.controladores;

import com.example.demo.entidades.Mascota;
import com.example.demo.entidades.Usuario;
import com.example.demo.entidades.Zona;
import com.example.demo.enumeracion.Sexo;
import com.example.demo.enumeracion.Tipo;
import com.example.demo.excepciones.MiExcepcion;
import com.example.demo.repositorios.ZonaRepositorio;
import com.example.demo.servicios.MascotaServicio;
import com.example.demo.servicios.UsuarioServicio;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@PreAuthorize("hasAnyRole('ROLE_USUARIO_REGISTRADO')")
@Controller
@RequestMapping("/mascota")
public class MascotaController {
    
    
    @Autowired
    private UsuarioServicio usuarioServicio;
    
    @Autowired
    private MascotaServicio mascotaServicio;    
    
    @GetMapping("/editar-perfil")
    public String editarPerfil(HttpSession session, @RequestParam(required = false) String id, ModelMap model){
        
        Mascota mascota = new Mascota();
        model.put("perfil", mascota);
        model.put("sexos", Sexo.values());
        model.put("tipos", Tipo.values());
        
        return "mascota.html";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USUARIO_REGISTRADO')")
    @PostMapping("/actualizar-perfil")
    public String actualizar(ModelMap modelo, HttpSession session, MultipartFile archivo, @RequestParam String id, @RequestParam String nombre, @RequestParam Sexo sexo, @RequestParam Tipo tipo){        
        
        Usuario usuario = (Usuario)session.getAttribute("usuariosession"); 
          try{
            if(id == null || id.isEmpty()){                
                mascotaServicio.agregarMascota(archivo, usuario.getId(), nombre, sexo, tipo);
            } else {                 
                mascotaServicio.modificar(archivo, usuario.getId(), id, nombre, sexo, tipo);
            }            
            return "redirect:/inicio"; 
        }catch(MiExcepcion e){          
            Mascota mascota = new Mascota();       
            mascota.setId(id);            
            mascota.setNombre(nombre);
            mascota.setSexo(sexo);
            mascota.setTipo(tipo);
        
            modelo.put("sexos", Sexo.values());
            modelo.put("tipos", Tipo.values());           
            modelo.put("error", e.getMessage());
            modelo.put("perfil", usuario);
            
            return "mascota.html";
        }        
    }
    
}
