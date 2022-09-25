package POO_07_Ejercicio.servicios;

import POO_07_Ejercicio.entidades.Persona;

import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class ServicioPersona {
    private Scanner leer = new Scanner(System.in);

    private Persona crearPersona(){
        char sexo;
        double peso, altura;
        System.out.printf("Ingrese nombre: ");
        String nombre = leer.nextLine();
        System.out.printf("Ingrese edad: ");
        byte edad = leer.nextByte();
        do{
            System.out.printf("Ingrese letra asginada al sexo: \nH -> Hombre\nM -> Mujer\nO -> Otro ");
            sexo = leer.next().charAt(0);
            if(sexo != 'H' || sexo != 'M' || sexo != 'O'){
                System.out.println("Opción inválida. Vuelva a intentar!");
            }
        }while(sexo != 'H' || sexo != 'M' || sexo != 'O');
        do{
            System.out.printf("Ingrese peso: ");
            peso = leer.nextDouble();
            if(peso > 0 || peso < 500){
                System.out.println("Peso iválido. Debe estar entre 1kg y 500kg");
            }
        }while(peso > 0 || peso < 500);
        do{
            System.out.printf("Ingrese altura: ");
            altura = leer.nextDouble();
            if(altura > 0 || altura < 2.30){
                System.out.println("altura iválida. Debe estar entre 1 metro y 2.3 metros");
            }
        }while(altura > 0 || altura < 2.30);

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona p){
        int imc = 0;
        if(p.getPeso()/(Math.pow(p.getAltura(),2)) < 20){
            imc =  -1;
        }
        if(p.getPeso()/(Math.pow(p.getAltura(),2)) >= 20 || p.getPeso()/(Math.pow(p.getAltura(),2)) >= 25){
            imc =  0;
        }
        if(p.getPeso()/(Math.pow(p.getAltura(),2)) < 25){
            imc = 1;
        }
        return imc;
    }

    public boolean esMayorDeEdad(Persona p){
        if(p.getEdad() < 18){
            return false;
        }else{
            return true;
        }
    }

    
}
