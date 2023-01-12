/**
 * Interfaz para implementar strategy
 * @authors Daniela Anaya Solis, Mauricio López Miranda 
 * @version 1.0 /Nov/2021
 */
public interface TiendaOnline extends Sujeto{
    /**
     * método para saludar al usuario
     */
    public void saludar();
    /**
     * método para desplegar los menus del sistema
     */
    public void despliegaMenu();
    /**
     * metodo para despedir al usuario
     */
    public void despedida();
}