package IntroColecciones.mascotapp;

import IntroColecciones.mascotapp.entidades.Mascota;
import IntroColecciones.mascotapp.servicios.ServicioMascota;
import IntroColecciones.mascotapp.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author Agu
 * TreeSet = Recomendado para ordenar un conjunto de datos ya que tiene la capacidad de ordenarse en principio por un criterio predeterminado
 * HashSet = Recomendado para asegurarse que no hay elementos duplicados
 * LinkedHashSet = Recomendado para asegurarse que no hay elementos duplicados ya que no soporta elementos duplicados
 * Tanto HashSet como LinkedHashSet no se puede ordenar de forma natural, pueden ordenarse a través de otros recursos
 */
public class MascotaAPP {
    public static void main(String[] args) {
        
        //Recordar: si queremos trabajar con mapas y en caso de querer usar el HashMap o algun otro tipo de mapa
        //          no esta de más implementar el "equals y hashcode y el comparable", de esta forma dejamos el objeto
        //          con las funciones necesarias
        HashMap<String, Mascota> mascotas = new HashMap();
        
        mascotas.put("1",new Mascota("Fer","Chiquito","Perro"));
        mascotas.put("2",new Mascota("Pepa","Lola","Gato"));
        
        //1ra forma de eliminar objetos
        mascotas.remove("1",new Mascota("Fer","Chiquito","Perro"));
        
        //2da forma de eliminar objetos
        mascotas.remove("1");
        
        for (Map.Entry<String, Mascota> aux : mascotas.entrySet()) {
            String key = aux.getKey();
            Mascota value = aux.getValue();
            
            System.out.println("key "+key+" value "+value);
        }
        
//        HashMap<String, String> nombres = new HashMap();
//        
//        nombres.put("1", "Chiquito");
//        nombres.put(String.valueOf(Long.MAX_VALUE), "Lola");
//        
//        for (Map.Entry<String, String> aux : nombres.entrySet()) {
//            String key = aux.getKey();
//            String value = aux.getValue();
//            
//            System.out.println("Key "+key+" value "+value);
//        }
//        HashMap<Integer, String> nombres = new HashMap();
//        nombres.put("1", "Chiquito");
//        nombres.put(Integer.MAX_VALUE+1, "Lola");
//        
//        for (Map.Entry<Integer, String> aux : nombres.entrySet()) {
//            Integer key = aux.getKey();
//            String value = aux.getValue();
//            
//            System.out.println("Key " +key+" Value "+value);
//        }
        
        
        
        //MAIN PERTENECIENTE AL VIDEO 7
//        Set<Mascota> mascotas = new TreeSet();
//        
//        mascotas.add(new Mascota("Fer","Chiquito","Perro"));
//        mascotas.add(new Mascota("Fer","Chiquito","Perro"));
//        mascotas.add(new Mascota("Fer","Chiquito","Perro"));
//        mascotas.add(new Mascota("Fer","Chiquito","Perro"));
//        mascotas.add(new Mascota("Fer","Chiquito","Perro"));
//        mascotas.add(new Mascota("Fer","Chiquito","Perro"));
//        mascotas.add(new Mascota("Pepa","Lola","Gato"));
//        mascotas.add(new Mascota("Pepa","Lola","Gato"));
//        mascotas.add(new Mascota("Pepa","Lola","Gato"));
//        mascotas.add(new Mascota("Pepa","Lola","Gato"));
//        mascotas.add(new Mascota("Pepa","Lola","Gato"));
//        mascotas.add(new Mascota("Pepa","Lola","Gato"));
//        
//        for (Mascota mascota : mascotas) {
//            System.out.println(mascota);
//        }
        //Set<String> nombres = new HashSet(); //Conjunto de tipo String
        
        //HashSet<String> nombres = new HashSet();
        
//        TreeSet<String> nombres = new TreeSet();
//        
//        nombres.add("Chiquito");
//        nombres.add("Chiquito");
//        nombres.add("Chiquito");
//         
//        for (String nombre : nombres) {
//            System.out.println(nombre);//Solo muestra uno ya tanto HashSet como TreeSet no admite elementos duplicados        
//        }
        
        ///MAIN PERTENECIENTE AL VIDEO 6
//        ArrayList<Mascota> mascotas = new ArrayList();
//        
//        mascotas.add(new Mascota("Fer","Chiquito","Perro"));
//        mascotas.add(new Mascota("Fer","Chiquito","Perro"));
//        mascotas.add(new Mascota("Fer","Chiquito","Perro"));
//        mascotas.add(new Mascota("Fer","Chiquito","Perro"));
//        mascotas.add(new Mascota("Fer","Chiquito","Perro"));
//        mascotas.add(new Mascota("Fer","Chiquito","Perro"));
//        mascotas.add(new Mascota("Pepa","Lola","Gato"));
//        mascotas.add(new Mascota("Pepa","Lola","Gato"));
//        mascotas.add(new Mascota("Pepa","Lola","Gato"));
//        mascotas.add(new Mascota("Pepa","Lola","Gato"));
//        mascotas.add(new Mascota("Pepa","Lola","Gato"));
//        mascotas.add(new Mascota("Pepa","Lola","Gato"));
//        
//        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
//        
//        Collections.shuffle(mascotas);
//        
//        for (Mascota mascota : mascotas) {
//            System.out.println(mascota);
//        }

        //Esta es la forma de declarar una Matriz de Arrays
//        ArrayList<ArrayList<String>> matriz = new ArrayList();
        
        
        //MAIN PERTENECIENTE AL VIDEO 5
//        ServicioMascota servMasc = new ServicioMascota();
//
//        servMasc.fabricaMascota(1);
//        
//        servMasc.eliminarMascotaPorNombre("Lola");
//        
//        servMasc.mostrarMascotas();
    }    
}

//        List<String> nombres = new ArrayList();
//        nombres.add("Lola");
//        nombres.add("Roman");
//        nombres.add("Chiquito");
        
        //Es un patrón que se implementó para recorrer distintos TIPOS DE DATOS. 
        //Iterator lo que hace es cargar una lista, desarmar los objetos y nos los devuelve en una fila.
//        Iterator<String> it = nombres.iterator();
        
        //En este bloque de código utilizamos el iterator creado anteriormente (it) y lo utilizamos junto con el while para iterar 
//        while(it.hasNext()){
//            String aux = it.next(); // "it.hasNext()" evalua un objeto de la lista y luego salta al siguiente y con "it.next()" toma un objeto, finalmente lo mostramos con println
//            
//            System.out.println(aux);
//            
//            if(aux.equals("Lola")){
//                it.remove();
//            }
//        }
        
        //Es igual al FOREACH, no se utiliza para ELIMINAR objetos de una lista. Es recomendable comenzar utilizando el for i
//        for (int i = 0; i < nombres.size(); i++) {
//            String m = nombres.get(i);
//            
//            if(m.equals("Lola")){
//                 nombres.remove(m);
//            }
//        }
        //No se utiliza para ELIMINAR objetos de una lista
//        for(String aux: nombres){
//            if(aux.equals("Lola")){
//                nombres.remove(aux);
//            }
//        }       
        
        //PODEMOS HACER LLAMADOS CONSECUTIVOS DE FUNCIONALIDADES (EJ: LISTA, STREAM Y COUNT)
//        nombres.stream().count();
        //CUMPLE LA MISMA FUNCIÓN QUE EL FOREACH CONVENCIONAL, 
        //CON LA DIFERENCIA DE QUE SE ESCRIBRE EN UNA SOLA LÍNEA
//        nombres.forEach((e)->System.out.println(e));
        //PARA RECORRER UNA COLECCIÓN DESDE EL FINAL AL PRINCIPIO USAMOS FOR I
//        for (int i = 0; i < nombres.size(); i++) {
//            System.out.println(nombres.get(i));
//        }
        //USAR FOREACH SOLO PARA MOSTRAR O ACTUALIZAR
//        for(String aux: nombres){
//            System.out.println(aux);
//        }




          //Main final video 4
//        String[] nombres={"Pepe","Pepa"};
//        List <String> nombresList = new ArrayList(Arrays.asList(nombres));
//        
//        List <String> nombresList2 = new ArrayList();
//        
//        nombresList2.addAll(nombresList);
//        
          //Main perteneciente al video 3 y 4         
//        ServicioMascota servMasc = new ServicioMascota();
//        
//        servMasc.fabricaMascota(1);
//        
//        servMasc.mostrarMascotas();
//        
//        servMasc.actualizarMascota(0);
//        
//        servMasc.mostrarMascotas();
//        
//        servMasc.eliminarMascota(3);
//        
//        servMasc.mostrarMascotas();
        
        

//Main perteneciente al video 1 y 2
        //Arrays
//        String[] nombresArray = new String[5];
//        
//        for (int i = 0; i < nombresArray.length; i++) {
//            nombresArray[i] = "Chiquito " + (i+1);
//        }
//        
//        for(String var: nombresArray) {
//            System.out.println(var);
//        }
//        
        //Collections
//        ArrayList<String> nombresArrayList = new ArrayList<>();
//        
//        nombresArrayList.add("Chiquito");
//        nombresArrayList.add("Chiquito");
//        nombresArrayList.add("Chiquito");
//        
//        System.out.println(nombresArrayList.size());
//        
//        nombresArrayList.remove("Chiquito");
//        
//        System.out.println(nombresArrayList.size());
//        
//        System.out.println(Integer.MAX_VALUE); //cantidad de datos que soporta un arraylist
//        
//        
//        ServicioMascota servMasc = new ServicioMascota();
//        
//        servMasc.crearMascota();
//        servMasc.crearMascota();
//        
//        servMasc.mostrarMascotas();
