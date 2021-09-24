package EjercicioExtra04.servicios;

import EjercicioExtra04.entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioNIF {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public NIF crearNif() {
        System.out.print("Ingrese DNI: ");
        long DNI = leer.nextLong();
        System.out.print("Ingrese Letra: ");
        char letra = leer.next().charAt(0);
        char letraM = Character.toUpperCase(letra);

        return new NIF(DNI, letraM);
    }

    public void mostrar(NIF nif) {
        long resto = nif.getDNI() % 23;
        long resultado = 0;
        char[] vector = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        for (int i = 0; i < vector.length; i++) {
            if (resto >= 0 && resto <= 22) {
                resultado=resto;
                nif.setDNI(resultado);
            }
        }
        System.out.print(nif.getDNI() + "-" + nif.getLetra());
        System.out.println("\n");
    }

}
