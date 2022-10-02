package POO_07_Ejercicio_Solucion_02.servicios;

import POO_07_Ejercicio_Solucion_02.entidades.Persona;

import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class ServicioPersona {

    int pesoBajo = 0, pesoIdeal = 0, sobrePeso = 0, cantMayor = 0, cantMenor = 0;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        boolean flag = false;
        String sexo;
        System.out.print("Ingrese nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese edad: ");
        int edad = leer.nextInt();
        System.out.print("Sexo: 'F' Femenino | 'M' Masculino | 'O' Otro");
        do {
            System.out.print("\nSu opcion: ");
            sexo = leer.next();
            sexo = sexo.toUpperCase();
            if (sexo.equals("M") || sexo.equals("F") || sexo.equals("O")) {
                flag = true;
            } else {
                System.out.println("Opción inváilda!");
            }
        } while (!flag);
        System.out.print("Ingrese peso: ");
        int peso = leer.nextInt();
        System.out.print("Ingrese altura: ");
        double altura = leer.nextInt();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona persona1) {
        int calculoPeso=0;

        if ((persona1.getPeso()) / (persona1.getAltura()*persona1.getAltura()) > 25) {
            sobrePeso = sobrePeso + 1;
            calculoPeso=1;
            System.out.println("Sobrepeso");
        }else if ((persona1.getPeso()) / (persona1.getAltura()*persona1.getAltura()) >= 20) {
            pesoIdeal = pesoIdeal + 1;
            calculoPeso=0;
            System.out.println("Peso ideal");
        }else {
            pesoBajo = pesoBajo + 1;
            calculoPeso=-1;
            System.out.println("Peso bajo");
        }

        return calculoPeso;
    }

    public boolean esMayorDeEdad(Persona persona1) {
        boolean bandera = false;
        if (persona1.getEdad() > 18) {
            cantMayor = cantMayor + 1;
            System.out.println("Es mayor de edad");
            return bandera = true;
        } else {
            cantMenor = cantMenor + 1;
            System.out.println("Es menor de edad");
            return bandera;
        }
    }

    public void promedioPeso(){
        double promedioBajo;
        double promedioIdeal;
        double promedioSobre;
        promedioBajo = (pesoBajo*100)/4;
        promedioIdeal = (pesoIdeal*100)/4;
        promedioSobre = (sobrePeso*100)/4;
        System.out.println("Cantidad de personas con peso bajo: "+ pesoBajo);
        System.out.println("Cantidad de personas con peso ideal: "+ pesoIdeal);
        System.out.println("Cantidad de personas con sobrepeso: "+ sobrePeso);
        System.out.println("Promedio de personas con peso bajo: "+ promedioBajo);
        System.out.println("Promedio de personas con peso ideal: "+ promedioIdeal);
        System.out.println("Promedio de personas con sobrepeso: "+ promedioSobre);
    }
    public void promedioEdad(){
        double promedioMenores;
        double promedioMayores;
        promedioMenores = (cantMenor*100)/4;
        promedioMayores = (cantMayor*100)/4;
        System.out.println("Cantidad de personas mayores de edad: "+ cantMayor);
        System.out.println("Cantidad de personas menores de edad: "+ cantMenor);
        System.out.println("Promedio personas mayores de edad: "+ promedioMayores);
        System.out.println("Promedio personas menores de edad: "+ promedioMenores);
    }
}
