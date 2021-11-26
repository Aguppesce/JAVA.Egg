package com.springboot.ejercicio01.controladores;

import com.springboot.ejercicio01.entidades.Libro;
import com.springboot.ejercicio01.excepciones.MiExcepcion;
import com.springboot.ejercicio01.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/libro")
public class LibroControlador {

    @Autowired
    private LibroServicio libroServicio;

    @PostMapping("/registrar")
    public String registrarLibro(ModelMap modelo, @RequestParam String isbn, @RequestParam String titulo, @RequestParam Integer anio, @RequestParam Integer ejemplares, @RequestParam Integer ejemplaresPrestados, @RequestParam Integer ejemplaresRestantes, @RequestParam String autor, @RequestParam String editorial){
        try{

            libroServicio.crearLibro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, autor, editorial);

        }catch(MiExcepcion e){

            //modelo.put("error", e.getMessage());
            modelo.put("isbn", isbn);
            modelo.put("titulo",titulo);
            modelo.put("anio", anio);
            modelo.put("ejemplares", ejemplares);
            modelo.put("ejemplaresPrestados", ejemplaresPrestados);
            modelo.put("ejemplaresRestantes", ejemplaresRestantes);
            modelo.put("autor", autor);
            modelo.put("editorial", editorial);

            //return "registro.html";
        }
        //modelo.put("mensaje", "Tu libro fue registrado exitosamente!.");

        return "registro.html";
    }

    @GetMapping("/editar")
    public String editarLibro(ModelMap modelo, @RequestParam String id, @RequestParam String isbn, @RequestParam String titulo, @RequestParam Integer anio, @RequestParam Integer ejemplares, @RequestParam Integer ejemplaresPrestados, @RequestParam Integer ejemplaresRestantes, @RequestParam String autor, @RequestParam String editorial){
        Libro libro = null;
        try{
            libro = libroServicio.buscarPorId(id);
            libroServicio.modificar(id, isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, autor, editorial);
        } catch (MiExcepcion e){

        }
        return "redirect:/registro.html";
    }

    @GetMapping("/mis-libros")
    public String misLibros(ModelMap modelo){
        List<Libro> libros = libroServicio.listarLibros();
        modelo.addAttribute("libros", libros);

        return "redirect:/libro/mis-libros";
    }

}
