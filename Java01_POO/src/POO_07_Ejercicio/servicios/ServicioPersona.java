package POO_07_Ejercicio.servicios;

import POO_07_Ejercicio.entidades.Persona;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class ServicioPersona {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Persona crearPersona() {
        char sexo;
        byte edad;
        double peso, altura;
        System.out.printf("Ingrese nombre: ");
        String nombre = leer.next().toUpperCase();
        do{
            System.out.printf("Ingrese su edad: ");
            edad = leer.nextByte();
            if(edad < 0 && edad > 130){
                System.out.println("Edad inválida. Vuelva a intentar.");
            }
        }while (edad < 0 && edad > 130);
        do {
            System.out.printf("Ingrese letra asginada al sexo \n\tH(Hombre)\n\tM(Mujer)\n\tO(Otro)\nSu opción: ");
            sexo = Character.toUpperCase(leer.next().charAt(0));
            if (sexo != 'H' && sexo != 'M' && sexo != 'O') {
                System.out.println("Opción inválida. Vuelva a intentar!");
            }
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        do {
            System.out.printf("Ingrese peso: ");
            peso = leer.nextDouble();
            if (peso < 0 && peso > 300) {
                System.out.println("Peso iválido. Debe estar entre 1kg y 500kg");
            }
        } while (peso < 0 && peso > 300);
        do {
            System.out.printf("Ingrese altura: ");
            altura = leer.nextDouble();
            if (altura < 0 && altura > 2.30) {
                System.out.println("altura iválida. Debe estar entre 1 metro y 2.3 metros");
            }
        } while (altura < 0 && altura > 2.30);

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona p) {
        int imc = 0;
        if (p.getPeso() / (Math.pow(p.getAltura(), 2)) < 20) {
            imc = -1;
        }
        if (p.getPeso() / (Math.pow(p.getAltura(), 2)) >= 20 && p.getPeso() / (Math.pow(p.getAltura(), 2)) >= 25) {
            imc = 0;
        }
        if (p.getPeso() / (Math.pow(p.getAltura(), 2)) < 25) {
            imc = 1;
        }
        return imc;
    }

    public boolean esMayorDeEdad(Persona p) {
        if (p.getEdad() < 18) {
            return false;
        } else {
            return true;
        }
    }

    public void mostrarMenu() {
        System.out.printf("-----------MENÚ-----------\n" +
                "1) Crear Persona\n" +
                "2) Calcular IMC y mayoría de edad\n" +
                "3) Calcular promedio\n" +
                "4) Mostrar personas\n" +
                "5) Modificar datos\n" +
                "0) Salir\n" +
                "Ingrese su opción: ");
    }

    public void ejecutarMenuPersona() {
        int opcion = 0;
        String nombre;
        ArrayList<Persona> personas = new ArrayList<>();
        do {
            mostrarMenu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Persona p = crearPersona();
                    personas.add(p);
                    break;
                case 2:
                    System.out.printf("Ingrese su nombre: ");
                    nombre = leer.next().toUpperCase();
                    for (Persona persona : personas) {
                        if (persona.getNombre().equals(nombre)) {
                            System.out.println(persona.getNombre() + " Es mayor de edad?: " + esMayorDeEdad(persona));
                            if (calcularIMC(persona) == -1) {
                                System.out.println(persona.getNombre() + " Tiene un peso ideal");
                            }
                            if (calcularIMC(persona) == 0) {
                                System.out.println(persona.getNombre() + " Esta por debajo del peso ideal");
                            }
                            if (calcularIMC(persona) == 1) {
                                System.out.println(persona.getNombre() + " Tiene sobrepeso");
                            }
                        }
                        if (!persona.getNombre().equals(nombre)){
                            System.out.println("Usted no está en la lista. Primero debe registrar sus datos");
                        }
                    }
                    break;
                case 3:
                    int contadorMenorEdad = 0, contadorPesoIdeal = 0, contadorPesoBajo = 0, contadorPesoAlto = 0, contadorMayorEdad = 0;
                    for (Persona persona : personas) {
                        if (esMayorDeEdad(persona)) {
                            contadorMayorEdad++;
                        } else {
                            contadorMenorEdad++;
                        }
                        if (calcularIMC(persona) == -1) {
                            contadorPesoIdeal++;
                        }
                        if (calcularIMC(persona) == 0) {
                            contadorPesoBajo++;
                        }
                        if (calcularIMC(persona) == 1) {
                            contadorPesoAlto++;
                        }
                    }
                    System.out.println("Personas mayores de edad: " + contadorMayorEdad);
                    System.out.println("Personas menores de edad: " + contadorMenorEdad);
                    System.out.println("Personas con peso ideal: " + contadorPesoIdeal);
                    System.out.println("Personas con sobrepeso: " + contadorPesoAlto);
                    System.out.println("Personas con peso bajo: " + contadorPesoBajo);
                    break;
                case 4:
                    for (Persona persona : personas) {
                        System.out.println(persona);
                    }
                    break;
                case 5:
                    double peso, altura;
                    char sexo;
                    byte edad;
                    System.out.printf("Ingrese su nombre: ");
                    nombre = leer.next().toUpperCase();
                    for(Persona persona : personas){
                        if (persona.getNombre().equals(nombre)) {
                            System.out.printf("Ingrese nuevo nombre: ");
                            nombre = leer.next().toUpperCase();
                            do{
                                System.out.printf("Ingrese nueva edad: ");
                                edad = leer.nextByte();
                                if(edad < 0 && edad > 130){
                                    System.out.println("Edad inválida. Vuelva a intentar.");
                                }
                            }while (edad < 0 && edad > 130);
                            do {
                                System.out.printf("Ingrese su sexo \n\tH(Hombre)\n\tM(Mujer)\n\tO(Otro)\nSu opción: ");
                                sexo = Character.toUpperCase(leer.next().charAt(0));
                                if (sexo != 'H' && sexo != 'M' && sexo != 'O') {
                                    System.out.println("Opción inválida. Vuelva a intentar!");
                                }
                            } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
                            do {
                                System.out.printf("Ingrese peso: ");
                                peso = leer.nextDouble();
                                if (peso < 0 && peso > 300) {
                                    System.out.println("Peso iválido. Debe estar entre 0,1kg y 500kg");
                                }
                            } while (peso < 0 && peso > 300);
                            do {
                                System.out.printf("Ingrese altura: ");
                                altura = leer.nextDouble();
                                if (altura < 0 && altura > 2.30) {
                                    System.out.println("Altura iválida. Debe estar entre 1 metro y 2.3 metros");
                                }
                            } while (altura < 0 && altura > 2.30);
                            persona.setNombre(nombre);
                            persona.setAltura(altura);
                            persona.setPeso(peso);
                            persona.setEdad(edad);
                            persona.setSexo(sexo);
                            //persona = new Persona(nombre, edad, sexo, peso, altura);
                        }
                        if (!persona.getNombre().equals(nombre)){
                            System.out.println("Usted no está en la lista. Primero debe registrar sus datos");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Vuelva pronto!");
                    break;
                default:
                    System.out.println("Opción inválida!");
                    break;
            }
        } while (opcion != 0);
    }
}
