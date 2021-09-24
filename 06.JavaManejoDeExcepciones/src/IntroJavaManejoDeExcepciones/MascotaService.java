package JavaManejoDeExcepciones;
/**
 *
 * @author Agu
 */
public class MascotaService {
    public void crearMascota(String nombre, String tipo, String color, String raza, String sexo, double peso, double altura, boolean vacuna, boolean desparasitada) throws MascotaException{
        
        try{            
            
            if(nombre.isEmpty()){
                throw new MascotaException("Debe indicar el nombre de la mascota");
                //MascotaException es el constructor de la clase MascotaException
            }
            
            if(tipo.isEmpty()){
                throw new MascotaException("Debe indicar el tipo de mascota");
            }
            
            if(color.isEmpty()){
                throw new MascotaException("Debe indicar el color de la mascota");
            }
            
            if(raza.isEmpty()){
                throw new MascotaException("Debe indicar la raza de la mascota");
            }
            
            if(sexo.isEmpty()){
                throw new MascotaException("Debe indicar el sexo de la mascota");
            }
            
            if(peso<=0){
                throw new MascotaException("El peso de la mascota no puede ser menor o igual a cero");
            }
            
            if(altura<=0.0){
                throw new MascotaException("La altura de la mascot ano puede ser menor o igual a cero");
            }
            
            
            //Creo un objeto mascota
            Mascota mascota = new Mascota();
            
            //Asigno los valores al objeto
//            mascota.setNombre(nombre);
//            mascota.setTipoMascota(tipo);
//            mascota.setColor(color);
//            mascota.setRaza(raza);
//            mascota.setSexo(sexo);
//            mascota.setPeso(peso);
//            mascota.setAltura(altura);
//            
//           guardarMascota(mascota);
        
        }catch(MascotaException e){
            throw e;
        }catch(Exception e){
            e.printStackTrace();
            throw new MascotaException("Error de sistema");
        }
    }
}
