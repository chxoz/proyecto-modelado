/**
 * Clase Producto para guardar información importante sobre cada producto
 * @authors Daniela Anaya Solis, Mauricio López Miranda 
 * @version 1.0 /Nov/2021
 */
public class Producto {
    private String nombre;
    private String codigoDeBarras;
    private String descripcion;
    private String departamento;
    private String precio;

    /**
     * constructor de la clase 
     * @param nombre nombre del producto
     * @param codigo código de barras del producto
     * @param desc descripción del producto
     * @param departamento departamento del producto
     * @param precio precio del producto
     */
    public Producto(String nombre, String codigo, String desc, String departamento, String precio){
        this.nombre = nombre;
        this.codigoDeBarras = codigo;
        this.descripcion = desc;
        this.departamento = departamento;
        this.precio = precio;
    }
    /**
     * Método get para obtener el nombre del producto
     * @return nombre del producto
     */
    public String getNombreProducto(){
        return nombre;
    }
    /**
     * Método get para obtener el código de barras
     * @return código de barras
     */
    public String getCodigo(){
        return codigoDeBarras;
    }
    /**
     * Método get para obtener la descripción
     * @return descripción del producto
     */
    public String getDescripcion(){
        return descripcion;
    }
    /**
     * Método get para obtener el departamento del producto
     * @return departamento del producto
     */
    public String getDepartamento(){
        return departamento;
    }
    /**
     * Método get para obtener el precio del producto
     * @return precio del producto
     */
    public String getPrecio(){
        return precio;
    }
    /**
     * método para cambiar o poner el precio del producto
     * @param nPrecio precio nuevo deseado
     */
    public void setPrecio(String nPrecio){
        precio = nPrecio;
    }
    /**
     * método para generar una cadena con toda la información
     * @return cadena con información
     */
    public String muestraInformacion(){
        String info ="Departamento: " + getDepartamento()+ "\n"+
            "Nombre del producto: "+ getNombreProducto()+"\n"+
            "Descripción del producto: " + getDescripcion() + "\n"+
            "Precio del producto: " + getPrecio() + "\n"+
            "Código de barras: " + getCodigo() +"\n";
            return info;
            
    }
}
