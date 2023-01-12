import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;
/**
 * Clase Simulación para probar el sistema
 * @authors Daniela Anaya Solis, Mauricio López Miranda 
 * @version 1.0 /Nov/2021
 */
public class Simulacion {
    private static ClienteProxy mex;
    private static ClienteProxy esp;
    private static ClienteProxy usa;
    private static HashMap<String, String> datos;
    private static LinkedList<ClienteProxy> clientes;
    /**
     * método privado para obtener el país de un cliente en una lista
     * @param cl lista de clientes 
     * @param usu cadena ingresada en términal
     * @param pass cadena ingresada en términal
     * @return
     */
    private static String getPais(LinkedList<ClienteProxy> cl, String usu, String pass){
        if(cl.get(0).getNombreUsuario().equals(usu) && cl.get(0).getContraseña().equals(pass) ){
            return cl.get(0).getPais();
        }else if(cl.get(1).getNombreUsuario().equals(usu) && cl.get(1).getContraseña().equals(pass)){
            return cl.get(1).getPais();
        }else if(cl.get(2).getNombreUsuario().equals(usu) && cl.get(2).getContraseña().equals(pass)){
            return cl.get(2).getPais();
        }else{
            return "";
        }
        
    }
    /**
     * método privado para determinar que idioma y tienda se van a desplegar en el main
     * @param pais cadena obtenida del método privado get país
     * @return cadena con el país del cliente
     */
    private static String escogeIdioma(String pais){
        if("México".equals(pais) ){
            return "español";
        }else if("España".equals(pais)){
            return "castellano";
        }else if ("Estados Unidos".equals(pais)){
            return "ingles";
        }else{
            return "default";
        }
    }
    /**
     * método para añadir clientes a una lista
     * @return lista con clientes del sistema
     */
    private LinkedList<ClienteProxy> listaClientes(){
        clientes = new LinkedList<ClienteProxy>();
        clientes.add(mex);
        clientes.add(esp);
        clientes.add(usa);
        return clientes;
    }

    /**
     * método privado para crear usuarios del sistema y añadir contraseñas y nombres de usuarios a un diccionario
     * @return diccionario con usuarios y contraseñas
     */
    private HashMap<String, String> creaDatos(){
        ClienteReal mexReal = new ClienteReal("spiwi", "1234", "Mauricio", "5564784254", "Santigo", "1111", "México", "1");
        ClienteReal espReal = new ClienteReal("niki","5678","Nicole","5555555555","Madrid","2222","España","2");
        ClienteReal usaReal = new ClienteReal("killer","9101","Jhon","5546872445","Michigan","3333","Estados Unidos","3");
        mex = new ClienteProxy(mexReal);
        esp = new ClienteProxy(espReal);
        usa = new ClienteProxy(usaReal);

        datos = new HashMap<String,String>();
        datos.put(mex.getNombreUsuario(), mex.getContraseña());
        datos.put(esp.getNombreUsuario(), esp.getContraseña());
        datos.put(usa.getNombreUsuario(), usa.getContraseña());
        return datos;
    }
    /**
     * método para verificar si el usuario y contraseña de términal están en el diccionario de clientes
     * @param user usuario ingresado en términal
     * @param password contrseña ingresada en términal
     * @param map diccionario
     * @return true si el usuaio esta en el diccionario, false en otro caso
     */
    private static boolean verifica(String user, String password, HashMap<String , String> map ){
        if(map.get(user).equals(password)){
            return true;
        }else{
            return  false;
        }
    } 
    public static void main(String[] args){
        int exit = 1;
        do{
            Simulacion prueba = new Simulacion();
            Catalogo catalogo = new Catalogo();
            catalogo.creaCatalogo();
            HashMap<String, String>  datos = prueba.creaDatos();
            clientes = prueba.listaClientes(); 
            System.out.println("User:");
            Scanner sc = new Scanner(System.in);
            String user = sc.nextLine(); 
            System.out.println("Password:");
            Scanner scPassword = new Scanner(System.in);
            String password = scPassword.nextLine();
            if(datos.containsKey(user)){
                if(verifica(user, password, datos)){
                    String auxPais = getPais(clientes, user, password);
                    String idioma = escogeIdioma(auxPais);
                    switch (idioma) {
                        case "español":
                            TiendaOnlineMex tiendaMexico = new TiendaOnlineMex();
                            tiendaMexico.saludar();
                            mex.actualizar();
                            tiendaMexico.despliegaMenu();
                            tiendaMexico.despedida();     
                            exit=0;           
                            break;
                        case "castellano":
                            TiendaOnlineEsp  tiendaEspaña = new TiendaOnlineEsp();
                            tiendaEspaña.saludar();
                            esp.actualizar();
                            tiendaEspaña.despliegaMenu();
                            tiendaEspaña.despedida();
                            exit = 0;
                            break;
                        case "ingles":
                            TiendaOnlineUsa tiendaUsa = new TiendaOnlineUsa();
                            tiendaUsa.saludar();
                            usa.actualizar();
                            tiendaUsa.despliegaMenu();
                            tiendaUsa.despedida();
                            exit = 0;
                            break;
                        default:
                            System.out.println("invalid user or invalid ");
                            break;
                    }
                }else{
                    System.out.println("invalid user or invalid password");
                }    
            }else{
                System.out.println("invalid user or invalid password");
            }
        }while(exit!=0);
        
    }
    
}
