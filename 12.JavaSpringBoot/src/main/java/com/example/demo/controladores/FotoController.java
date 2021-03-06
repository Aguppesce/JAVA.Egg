
package com.example.demo.controladores;

import com.example.demo.entidades.Usuario;
import com.example.demo.excepciones.MiExcepcion;
import com.example.demo.servicios.UsuarioServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/foto")
public class FotoController {
    
    @Autowired
    private UsuarioServicio usuarioServicio;
    
    @GetMapping("/usuario{id}")
    public ResponseEntity<byte[]> fotoUsuario(@PathVariable String id){        
        try {
            Usuario usuario = usuarioServicio.buscarPorId(id);
            if(usuario.getFoto() == null){
                throw new MiExcepcion("El usuario no tiene una foto asignada.");
            }
            byte[] foto = usuario.getFoto().getContenido();
            
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);
            
            return new ResponseEntity<>(foto, headers, HttpStatus.OK);
        } catch (MiExcepcion ex) {
            Logger.getLogger(FotoController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
