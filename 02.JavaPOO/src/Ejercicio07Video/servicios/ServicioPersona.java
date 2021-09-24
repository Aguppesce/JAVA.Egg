package Ejercicio07Video.servicios;

import Ejercicio07Video.entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private final int IMC_BAJO = -1;
    private final int IMC_IDEAL = 0;
    private final int IMC_ALTO = 1;
    
    public Persona crearPersona(){
        System.out.print("Ingrese el nombre");
        String nombre = leer.next();
        System.out.print("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.print("Ingrese sexo - Hombre('H), Mujer('M'), Otro('O'): ");
        char sexo = Character.toUpperCase(leer.next().charAt(0));
        System.out.print("Ingrese el peso(kg): ");
        double peso = leer.nextDouble();
        System.out.print("Ingrese altura: ");
        double altura = leer.nextDouble();
        
        while(sexo != 'M' && sexo!= 'H' && sexo!='O'){
            System.out.print("Ingrese un sexo valido!: ");
            sexo = Character.toUpperCase(leer.next().charAt(0));
        }
        
        while(peso < 1 ){
            System.out.print("Ingrese un peso superior a 0: ");
            peso = leer.nextDouble();
        }
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public int calcularIMC(Persona persona){
        double altura = persona.getAltura();
        double peso = persona.getPeso();
        double imc = peso / (Math.pow(altura, 2));
        
        if(imc<20){
            return IMC_BAJO;
        }else if(imc>25){
            return IMC_ALTO;
        }else{
            return IMC_IDEAL;
        }       
    }
    
    public boolean esMayorDeEdad(Persona persona){
        
        return persona.getEdad()>=18;
//        boolean mayor = persona1.getEdad()>=18;
//        
//        return mayor;
    }
    
    public Persona[] crearPersonas(int cant){
        Persona[] personas = new Persona[cant];
        
        for (int i = 0; i < personas.length; i++) {
            personas[i] = crearPersona();
        }
        return personas;
    }
    
    public void porcentajesPeso(Persona[] personas){
        int contAlto = 0;
        int contBajo = 0;
        int contIdeal = 0;
        int cantPersonas = personas.length;
        
        //FOR EACH
        for (Persona persona: personas){
            switch(calcularIMC(persona)){
                case -1:
                    System.out.println(persona.getNombre()+" está por debajo del peso ideal");
                    contBajo++;
                    break;
                case 0:
                    System.out.println(persona.getNombre()+" está en el peso ideal");
                    contIdeal++;
                    break;
                case 1:
                    System.out.println(persona.getNombre()+" está por encima del peso ideal");
                    contAlto++;
                    break;                
            }            
        }
        System.out.println("Hay "+((contBajo*100)/cantPersonas)+"% de personas están por debajo de su peso ideal");
        System.out.println("Hay "+((contIdeal*100)/cantPersonas)+"% de personas están por debajo de su peso ideal");
        System.out.println("Hay "+((contAlto*100)/cantPersonas)+"% de personas están por debajo de su peso ideal");
    }
    
    public void porcentajeEdad(Persona[] personas){
        int cantPersonas = personas.length;
        int contMayor=0;
        
        for(Persona persona:personas){
            if(esMayorDeEdad(persona)){
                contMayor++;
                System.out.println(persona.getNombre()+" es mayor de edad!");
            }
        }
        System.out.println("Hay "+((contMayor*100)/cantPersonas)+"% de mayores de edad");
        System.out.println("Hay "+(((cantPersonas-contMayor)*100)/cantPersonas)+"% de menores de edad");
    }
    
    public Persona[] crearPersonasTest(){
        
        Persona[] personas = new Persona[4];
        
        personas[0] = new Persona("Pepito", 15, 'H', 75.0, 1.85);
        personas[1] = new Persona("Juana", 29, 'M', 48.0, 1.62);
        personas[2] = new Persona("Manolo", 58, 'O', 99.0, 1.82);
        personas[3] = new Persona("Marta", 40, 'M', 60.0, 1.68);
        
        return personas;
    }
}
