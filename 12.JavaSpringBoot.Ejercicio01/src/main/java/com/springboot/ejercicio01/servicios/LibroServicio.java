package com.springboot.ejercicio01.servicios;

import com.springboot.ejercicio01.entidades.Autor;
import com.springboot.ejercicio01.entidades.Editorial;
import com.springboot.ejercicio01.entidades.Libro;
import com.springboot.ejercicio01.excepciones.MiExcepcion;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;

import com.springboot.ejercicio01.repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class LibroServicio {

    @Autowired
    private LibroRepositorio libroRepositorio;

    @Autowired
    private AutorServicio autorServicio;

    @Autowired
    private EditorialServicio editorialServicio;

    @Transactional
    public void crearLibro(String isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, String autor, String editorial) throws MiExcepcion{

        validarLibro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes);

        Libro libro = new Libro();

        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(ejemplaresRestantes);

        Autor nuevoAutor = autorServicio.crearAutor(autor);
        libro.setAutor(nuevoAutor);

        Editorial nuevaEditorial = editorialServicio.crearEditorial(editorial);
        libro.setEditorial(nuevaEditorial);

        libroRepositorio.save(libro);

    }

    @Transactional
    public void modificar(String id, String isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, String autor, String editorial) throws MiExcepcion{

        validarLibro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes);

        Optional<Libro> respuesta = libroRepositorio.findById(titulo);
        if(respuesta.isPresent()){
            Libro libro = respuesta.get();
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);

            libroRepositorio.save(libro);
        }else {
            throw new MiExcepcion("No se encontró el libro solicitado");
        }
    }

    @Transactional
    public void deshabilitarLibro(String id) throws MiExcepcion{
        Optional<Libro> respuesta = libroRepositorio.findById(id);
        if(respuesta.isPresent()){
            Libro libro = respuesta.get();
            libro.setAlta(false);
            libroRepositorio.save(libro);
        }else {
            throw new MiExcepcion("No se encontró el libro solicitado");
        }
    }

    @Transactional
    public void habilitarLibro(String id) throws MiExcepcion{
        Optional<Libro> respuesta = libroRepositorio.findById(id);
        if(respuesta.isPresent()){
            Libro libro = respuesta.get();
            libro.setAlta(true);
            libroRepositorio.save(libro);
        }else {
            throw new MiExcepcion("No se encontró el libro solicitado");
        }
    }

    public Libro buscarPorId(String id) throws MiExcepcion {
        return libroRepositorio.getOne(id);
    }
    
    public List<Libro> listarLibros(){
        List<Libro> libros = libroRepositorio.findAll(Sort.by(Sort.Direction.ASC, "libro.titulo"));
        return libros;
    }

    public void validarLibro(String isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes) throws MiExcepcion {
        try{
            if(isbn == null || isbn.isEmpty()){
            throw new MiExcepcion("El isbn no puede ser nulo.");
            }
            if(titulo == null || titulo.isEmpty()){
                throw new MiExcepcion("El título del libro no puede ser nulo.");
            }
            if(anio == null || anio<=0 || anio>2022){
                throw new MiExcepcion("El año no puede ser nulo.");
            }
            if(ejemplares == null || ejemplares<=0){
                throw new MiExcepcion("La cantidad de ejemplares no puede ser nula y tiene que se mayor a o igual a 0.");
            }
            if(ejemplaresPrestados == null || ejemplaresPrestados<=0){
                throw new MiExcepcion("La cantidad de ejemplares prestados no puede ser nula y tiene que se mayor a o igual a 0.");
            }
            if(ejemplaresRestantes == null || ejemplaresRestantes<=0){
                throw new MiExcepcion("La cantidad de ejemplares restantes no puede ser nula y tiene que se mayor a o igual a 0.");
            }
        }catch(MiExcepcion e){

        }

    }
}
