/**
 * ClienteReal clase donde se guardan todos los datos sencibles del cliente 
 * @authors Daniela Anaya Solis, Mauricio López Miranda 
 * @version 1.0 /Nov/2021
 */
public class ClienteReal implements Cliente{

    private String nombreDeUsuario;
    private String contraseña;
    private String nombreCliente;
    private String telefono;
    private String direccion;
    private String cuentaBancaria;
    private String reside;
    private String identificador;
    
    /**
     * Constructor de la clase
     * @param nombreU nombre de la cuenta del cliente
     * @param contraseña contraseña de la cuenta del cliente 
     * @param nombreC nombre del cliente 
     * @param telefono número asociado a la cuenta del cliente
     * @param direccion dirección donde se enviarán los productos
     * @param cuenta cuenta bancaria del cliente 
     * @param pais país donde reside el usuario
     * @param id identificador único del cliente 
     */
    public ClienteReal(String nombreU, String contraseña, String nombreC, String telefono,
     String direccion, String cuenta, String pais, String id){
         this.nombreDeUsuario = nombreU;
         this.contraseña = contraseña;
         this.nombreCliente = nombreC;
         this.telefono = telefono;
         this.direccion = direccion;
         this.cuentaBancaria = cuenta;
         this.reside = pais;
         this.identificador = id;
         
    }
    /**
     * Método get para obtener el nombre de usuario
     * @return nombre de la cuenta del cliente
     */
    public String getNombreUsuario(){
        return nombreDeUsuario;
    }
    /**
     * Método get para obtener la contraseña del usuario
     * @return contraseña de la cuenta del cliente
     */
    public String getContraseña(){
        return contraseña;
    }
    /**
     * Método get para obtener el nombre del cliente
     * @return nombre del cliente
     */
    public String getNombreCliente(){
        return nombreCliente;
    }
    /**
     * Método get para obtener el telefono del cliente
     * @return telefono del cliente
     */
    public String getTelefono(){
        return telefono;
    }
    /**
     * Método get para obtener la dirección del cliente
     * @return dirección del cliente
     */
    public String getDireccion(){
        return direccion;
    }
    /**
     * Método get para obtener la cuenta del cliente
     * @return cuenta del cliente
     */
    public String getCuentaBancaria(){
        return cuentaBancaria;
    }
    /**
     * Método get para obtener el país dónde reside el cliente
     * @return país dónde recide 
     */
    public String getPais(){
        return reside;
    }
    /**
     * Método get para obtener el identificador del cliente
     * @return nombre de la cuenta del cliente
     */
    public String getIdentificador(){
        return identificador;
    }

    
}