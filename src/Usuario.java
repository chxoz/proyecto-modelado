public class Usuario {
    private ClienteReal cliente;
    private String nombre;
    private String contraseña;
    private String pais;
    private String id;

    public void creaUsuario(ClienteReal c){
        this.nombre = cliente.getNombreUsuario();
        this.contraseña = cliente.getContraseña();
        this.pais = cliente.getPais();
        this.pais = cliente.getIdentificador();
    }

    public String getNombre(){
        return nombre;
    }

    public String getContraseña(){
        return contraseña;
    }

    public String getPais(){
        return pais;
    }

    public String getID(){
        return id;
    }
}

