/**
 * interfaz para el uso de Proxy
 * @authors Daniela Anaya Solis, Mauricio López Miranda 
 * @version 1.0 /Nov/2021
 */
public interface Cliente {
    /**
     * Método get para obtener el nombre de usuario del cliente
     */
    public String getNombreUsuario();
    /**
     * Método get para obtener la contraseña del usuario
     */
    public String getContraseña();
    /** 
     * Método get para obtener el país dónde reside el cliente
     */
    public String getPais();
    /**
     * Método get para obtener la cuenta del cliente
     */
    public String getCuentaBancaria();
}

