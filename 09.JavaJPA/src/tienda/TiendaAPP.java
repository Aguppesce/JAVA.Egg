//package tienda;
//
//import java.util.Collection;
//import java.util.UUID;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.NoResultException;
//import javax.persistence.Persistence;
//import tienda.entidades.Fabricante;
//import tienda.entidades.Producto;
//import tienda.menu.TiendaMenu;
//
//public class TiendaAPP {
//    public static void main(String[] args) {
////        TiendaMenu menu = new TiendaMenu();
////        menu.menuPrincipal();
//
//          try {
//              EntityManagerFactory emf = Persistence.createEntityManagerFactory("09.JavaJPAPU");
//              EntityManager em = emf.createEntityManager();
//              
//              //**************************CREAR - CREATE******************************
//              Fabricante fabricante1 = new Fabricante();
//              fabricante1.setId(UUID.randomUUID().toString());
//              fabricante1.setCodigo(1);
//              fabricante1.setNombre("ASUS");
//              
//              em.getTransaction().begin();
//              em.persist(fabricante1);
//              em.getTransaction().commit();
//              
//              Fabricante fabricante2 = new Fabricante();
//              fabricante2.setId(UUID.randomUUID().toString());
//              fabricante2.setCodigo(2);
//              fabricante2.setNombre("SAMSUNG");
//              
//              em.getTransaction().begin();
//              em.persist(fabricante2);
//              em.getTransaction().commit();
//              
//              //Creo un producto
//              Producto producto = new Producto();
//              producto.setId(UUID.randomUUID().toString());
//              producto.setCodigo(100);
//              producto.setNombre("PC Portátil");
//              producto.setPrecio(500d);
//              producto.setCodigoFabricante(fabricante1);
//              
//              em.getTransaction().begin();
//              em.persist(producto);
//              em.getTransaction().commit();
//          
//          }catch (Exception e){
//              System.out.println("Error de sistemas");;
//          }
//          
//          
//          //**************************LEER - READ - CONSULTAS******************************
//          //Busco fabricante por criterio
//          int codigo = 1;
//          Fabricante fabricante1 = (Fabricante) em.createQuery("SELECT f "
//                                                            + "FROM Fabricante f"
//                                                            + "WHERE f.codigo = :codigo").
//                                                            setParameter("codigo",codigo).
//                                                            getSingleResult();
//          
//          //Busco fabricante por id
//          Fabricante fabricante2 = em.find(Fabricante.class, fabricante1.getId());
//          
//          //Listo fabricantes
//          Collection<Fabricante> fabricantes = em.createQuery("SELECT f"
//                                                            + " FROM Fabricante f").
//                                                            getResultList();
//          
//          //Recorremos e imprimimos los fabricantes
//          for (Fabricante f : fabricantes){
//              System.out.println(f.getCodigo());
//              System.out.println(f.getNombre());
//          }
//          
//          //Buscamos un producto
//          Producto producto = (Producto) em.createQuery("SELECT p"
//                                                      + " FROM Producto p"
//                                                      + " WHERE p.codigo = :codigo").
//                                                      setParameter("codigo", 100).
//                                                      getSingleResult();
//          
//          //Imprimo el producto
//          System.out.println(producto.getCodigo());
//          System.out.println(producto.getNombre());
//          System.out.println(producto.getPrecio());
//          System.out.println(producto.getCodigoFabricante().getNombre());
//          
//          
//          //Busco un producto de código inexistente
//          try {
//              Producto producto2 = (Producto) em.createQuery("SELECT p"
//                                                            + " FROM Producto p"
//                                                            + " WHERE p.codigo = :codigo").
//                                                            setParameter("codigo", 150).
//                                                            getSingleResult();
//                                                            
//          }catch(NoResultException e){
//              System.out.println("No se encontró producto para el código indicado");
//          }
//          
//          //**************************MODIFICAR - UPDATE******************************
//          try{
//              //Busco fabricante por criterio
//              int codigo = 1;
//              Fabricante fabricante = (Fabricante) em.createQuery("SELECT f "
//                                                                 + "FROM Fabricante f"
//                                                                 + "WHERE f.codigo = :codigo").
//                                                                 setParameter("codigo",codigo).
//                                                                 getSingleResult();
//              
//              //Modifico el nombre
//              fabricante.setNombre("Lenovo");
//              
//              em.getTransaction().begin();
//              em.merge(fabricante);
//              em.getTransaction().commit();
//          }catch(Exception e){
//              System.out.println("Error de sistemas");
//          }
//          
//          //**************************ELIMINAR - DELETE******************************
//          try{
//              //Busco producto
//              Producto producto = (Producto) em.createQuery("SELECT p"
//                                                      + " FROM Producto p"
//                                                      + " WHERE p.codigo = :codigo").
//                                                      setParameter("codigo", 100).
//                                                      getSingleResult();
//              
//              em.getTransaction().begin();
//              em.remove(producto);
//              em.getTransaction().commit();
//          }catch(Exception e){
//              e.printStackTrace();
//              System.out.println("Error de sistemas");
//          }
//          
//    }
//    
//}
