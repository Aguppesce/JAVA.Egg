package com.springboot.ejercicio01.servicios;

import com.springboot.ejercicio01.entidades.Autor;
import com.springboot.ejercicio01.excepciones.MiExcepcion;
import com.springboot.ejercicio01.repositorios.AutorRepositorio;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServicio {
    
    @Autowired
    private AutorRepositorio autorRepositorio;
    
    @Transactional
    public Autor crearAutor(String nombre) throws MiExcepcion{        
        validarAutor(nombre);
        
        Autor autor = new Autor();
        
        if(nombre == null || nombre.trim().isEmpty()){
            throw new MiExcepcion("El nombre no puede ser nulo");
        }
        
        autor.setNombre(nombre);
        
        autorRepositorio.save(autor);
        
        return autor;
    }
    
    @Transactional
    public void modificarAutor(String nombre) throws MiExcepcion{
        validarAutor(nombre);
        
        Optional<Autor> respuesta = autorRepositorio.findById(nombre);
        if(respuesta.isPresent()){
            Autor autor = respuesta.get();
            autor.setNombre(nombre);
            
            autorRepositorio.save(autor);
        }else{
            throw new MiExcepcion("No se encontró el autor solicitado");
        }
    }
    
    
    public void validarAutor(String nombre) throws MiExcepcion{        
        try{
            Optional<Autor> respuesta = autorRepositorio.findById(nombre);
            if(respuesta.isPresent()){
                System.out.println("Autor ya registrado. Ingrese otro.");                
            }
        }catch(Exception e){
            throw e;                     
        }       
    }
    
    
    
    
}
