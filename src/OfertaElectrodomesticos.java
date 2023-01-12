/**
 * Clase Oferta alimentos para genrar ofertas  aleatorias sobre el refrigerador
 * extiende Oferta
 * @authors Daniela Anaya Solis, Mauricio López Miranda 
 * @version 1.0 /Nov/2021
 */
public class OfertaElectrodomesticos extends Oferta{
    private Catalogo catalogo;
    /**
     * método abstracto para aplicar un descuento a un producto
     * @param random porcentaje a descontar
     * @return cadena con el precio rebajado
     */
    public String aplicaOferta(int random){
        Producto rebajado = catalogo.getProducto(4);
        int precio = 17289;
        int descuento = (random * precio)/100;
        precio = precio - descuento;
        String nPrecio = precio+"";
        rebajado.setPrecio(nPrecio);
        return nPrecio;

    }
    
}
