package Ejercicio01;

import Ejercicio01.entidades.Persona;
import Ejercicio01.servicios.ServicioPersona;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class PersonaAPP {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ServicioPersona sp = new ServicioPersona();

        Persona pNull0 = new Persona(null, null, null, null, null);        
        Persona pNull1 = new Persona("Maria",null,"F",45,1.87);
        Persona pNull2 = new Persona();
        //sp.esMayorDeEdad(pNull1);
        try {
            sp.esMayorDeEdad(pNull2);
        } catch (NullPointerException e) {
            System.out.println("La edad no puede ser null");
        }
        
        try {
            sp.esMayorDeEdad(null);
        } catch (Exception e) {
            System.out.println(e.toString());
            e.getMessage();
            e.printStackTrace();
        }   

        

//        Persona p1 = sp.crearPersona();
//        Persona p2 = sp.crearPersona();
//        Persona p3 = sp.crearPersona();
//        Persona p4 = sp.crearPersona();
//        Persona p2 = new Persona("Maria",14,"F",45,1.87);
//        Persona p3 = new Persona("Martin",24,"M",69,1.20);
//        Persona p4 = new Persona("Monica",34,"F",58,1.56);
//        do{
//            System.out.println("\n----------MENU------------");          
//            System.out.println("1. Calcular Peso");
//            System.out.println("2. Verificar edad");
//            System.out.println("3. Promedio peso");
//            System.out.println("4. Promedio edad");            
//            System.out.println("5. Salir");
//            Integer opc = leer.nextInt();
//            switch(opc){
//                case 1: 
//                    sp.calcularIMC(p1);
//                    sp.calcularIMC(p2);
//                    sp.calcularIMC(p3);
//                    sp.calcularIMC(p4);
//                    break;
//                case 2: 
//                    sp.esMayorDeEdad(p1);
//                    sp.esMayorDeEdad(p2);
//                    sp.esMayorDeEdad(p3);
//                    sp.esMayorDeEdad(p4);
//                    break;
//                case 3: 
//                    sp.promedioPeso();
//                    break;
//                case 4: 
//                    sp.promedioEdad();
//                    break;
//                default:
//                    System.out.println("Opción inválida!");
//                    break;
//            }
//        }while(opc!=5);       
    }
}
