import java.util.LinkedList;
/**
 * Interfaz Sujeto que sirve para Observer
 * @authors Daniela Anaya Solis, Mauricio López Miranda 
 * @version 1.0 /Nov/2021
 */
public interface Sujeto {
    /**
     * notifica a todos los usuarios de la lista sobre las ofertas
     * @param clientes lista de clientes
     */
    public void notificar(LinkedList<ClienteProxy> clientes);
}
