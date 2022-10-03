package POO_08_Ejercicio.servicios;

import POO_08_Ejercicio.entidades.Cadena;

import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class ServicioCadena {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cadena crearCadena(){
        System.out.printf("Ingrese una frase: ");
        String frase = leer.next();
        int longitud = frase.length();
        return new Cadena(frase,longitud);
    }

    public void mostrarVocales(Cadena cadena){
        int contVocales = 0;
        for(int i = 0; i < cadena.getLongitud(); i++){
            if(cadena.getFrase().contains("a") ||
               cadena.getFrase().contains("e") ||
               cadena.getFrase().contains("i") ||
               cadena.getFrase().contains("o") ||
               cadena.getFrase().contains("u")){
                contVocales++;
            }
        }
        System.out.println("Cantidad de vocales: "+contVocales);
    }

    public void invertirFrase(Cadena cadena){
        for (int i = cadena.getLongitud()-1; i >= 0; i--){

        }
    }

    private void mostrarMenu() {
        System.out.printf("-----------MENÚ-----------\n" +
                "1) Crear frase\n" +
                "2) Mostrar focales\n" +
                "3) Invertir frase\n" +
                "0) Salir\n" +
                "Ingrese su opción: ");
    }

    public void ejecutarMenuCadena(){
        int opcion;
        do{
            mostrarMenu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Cadena c1 = crearCadena();
                    break;
                case 2:

            }
        }while(opcion!=0);
    }
}
