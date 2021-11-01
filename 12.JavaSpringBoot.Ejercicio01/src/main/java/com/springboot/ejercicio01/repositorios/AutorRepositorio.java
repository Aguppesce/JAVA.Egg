package com.springboot.ejercicio01.repositorios;


import com.springboot.ejercicio01.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor, String>{
    
    @Query("SELECT a FROM Autor a WHERE a.nombre = :nombre")
    public Autor buscarPorNombre(@Param("nombre") String nombre);


//    Método para buscar nombre y apellido del autor por separado
//    @Query("SELECT c FROM Autor c WHERE c.nombre = :nombre AND c.apellido =:apellido")
//    public Autor buscarAutorPorNombreApellido(@Param("nombre") String nombre, @Param("apellido") String apellido);
}
