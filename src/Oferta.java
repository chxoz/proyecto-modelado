import java.util.Random;
/**
 * Clase abstracta para implementar Template
 * @authors Daniela Anaya Solis, Mauricio López Miranda 
 * @version 1.0 /Nov/2021
 */
public abstract class Oferta {
    private int random;
    /**
     * metodo que genera ofertas dependiendo el país
     * @return una cadena que es el nuevo precio del producto
     */
    public String Ofertas(){
        random = determinaPorcentaje();
        return aplicaOferta(random);
    }
    /**
     * método que genera un número aleatorio entre 10 y 20 y ese será el porcentaje a descontar
     * @return entero aletorio
     */
    public int determinaPorcentaje(){
        Random random = new Random();
        int min = 10;
        int max = 20;
        int r = random.nextInt(max -min)+ min;
        return r;
    }
    /**
     * método abstracto para aplicar un descuento a un producto
     * @param random porcentaje a descontar
     * @return cadena con el precio rebajado
     */
    public abstract String aplicaOferta(int random);
    
}
