/**
 * Clase para crear representantes de los clientes
 * @authors Daniela Anaya Solis, Mauricio López Miranda 
 * @version 1.0 /Nov/2021
 */
public class ClienteProxy implements Cliente,Observador {
    private ClienteReal cliente;
    private TiendaOnlineMex m = new TiendaOnlineMex();
    private TiendaOnlineEsp e = new TiendaOnlineEsp();
    private TiendaOnlineUsa u = new TiendaOnlineUsa();
    private String ofertas;

    /**
     * constructor de la clase 
     * @param cliente recibe un cliente real
     */
    public ClienteProxy(ClienteReal cliente){
        this.cliente = cliente;
    }
    /**
     * Método get para obtener el nombre de usuario del cliente
     * @return copia del nombre de usuario
     */
    public String getNombreUsuario(){
        return cliente.getNombreUsuario();
    }
    /**
     * Método get para obtener la contraseña del cliente
     * @return copia de lacontreseña del cliente
     */
    public String getContraseña(){
        return cliente.getContraseña();
    }
    /**
     * Método get para obtener el país dónde reside el cliente
     * @return copia del país dónde recide 
     */
    public String getPais(){
        return cliente.getPais();
    }
    /**
     * Método get para obtener la cuenta del cliente 
     * @return copia de la cuenta
     */
    public String getCuentaBancaria(){
        return cliente.getCuentaBancaria();
    }
    /**
     * método para d¿verificar si la cuenta es la misma que la de usuario
     * @param cuenta cadena a verificar
     * @return true si la cadena coincide, false en otro caso
     */
    public boolean verificaCuenta(String cuenta){
        String cuentaB = cliente.getCuentaBancaria();
        if(cuenta.equals(cuentaB)){
            return true;
        }else{
            return false;
        }
    }
    /**
     * método que sobreescribe el método actualizar de la interface Observador
     * para mandar una notficcación de las ofertas
     */
    public void actualizar(){
        String key = cliente.getPais();
        switch (key) {
            case "México":
                ofertas = m.getOferta();
                verOferta();    
                return;
            case "España":
                ofertas = e.getOferta();
                verOferta();
                return;
            case "Estados Unidos":
                ofertas = u.getOferta();
                verOferta();
                return;
            default:
                break;
        }
    }
    /**
     * metodo para visualizar ofertas 
     */
    public void verOferta(){
        System.out.println(cliente.getNombreCliente()+
        " Es un gusto notificarte que tenemos la siguiente oferta para ti: "
        + ofertas);
    }    
}
