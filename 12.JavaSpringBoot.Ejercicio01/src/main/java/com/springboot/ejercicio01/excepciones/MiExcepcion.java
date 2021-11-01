package com.springboot.ejercicio01.excepciones;

public class MiExcepcion extends Exception{

    public MiExcepcion() {
    }

    public MiExcepcion(String msg) {
        super(msg);
    }
}
