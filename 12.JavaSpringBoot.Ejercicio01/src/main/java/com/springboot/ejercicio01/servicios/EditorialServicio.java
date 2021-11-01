package com.springboot.ejercicio01.servicios;

import com.springboot.ejercicio01.entidades.Editorial;
import com.springboot.ejercicio01.excepciones.MiExcepcion;
import com.springboot.ejercicio01.repositorios.EditorialRepositorio;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialServicio {
    
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
    @Transactional
    public Editorial crearEditorial(String nombre) throws MiExcepcion{
        validarEditorial(nombre);
        
        Editorial editorial = new Editorial();
        
        if(nombre == null || nombre.trim().isEmpty()){
            throw new MiExcepcion("El nombre de la editorial no puede ser nulo");
        }
        
        editorial.setNombre(nombre);
        
        editorialRepositorio.save(editorial);
        
        return editorial;
    }
    
    @Transactional
    public void modificarEditorial(String nombre) throws MiExcepcion{
        validarEditorial(nombre);
        
        Optional<Editorial> respuesta = editorialRepositorio.findById(nombre);
        if(respuesta.isPresent()){
            Editorial editorial = respuesta.get();
            editorial.setNombre(nombre);
            
            editorialRepositorio.save(editorial);
        }else{
            throw new MiExcepcion("No se encontró el editorial solicitado");
        }
    }
    
    public void validarEditorial(String nombre) throws MiExcepcion{
        try{
            Optional<Editorial> respuesta = editorialRepositorio.findById(nombre);
            if(respuesta.isPresent()){
                System.out.println("Editorial ya registrada. Ingrese otra.");
            }
        }catch(Exception e){
            throw e;
        }
    }
    
}
