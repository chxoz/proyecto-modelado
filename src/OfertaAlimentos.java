/**
 * Clase Oferta alimentos para genrar ofertas  aleatorias sobre la coida de perro
 * extiende Oferta
 * @authors Daniela Anaya Solis, Mauricio López Miranda 
 * @version 1.0 /Nov/2021
 */
public class OfertaAlimentos extends Oferta {
    /**
     * método abstracto para aplicar un descuento a un producto
     * @param random porcentaje a descontar
     * @return cadena con el precio rebajado
     */  
    private Catalogo catalogo = new Catalogo(); 
    public String aplicaOferta(int random){
        catalogo.creaCatalogo();
        Producto rebajado = catalogo.getProducto(6);
        int precio = 187;
        int descuento = (random * precio)/100;
        precio = precio - descuento;
        String nPrecio = precio+"";
        rebajado.setPrecio(nPrecio);
        return nPrecio;
    }
}
