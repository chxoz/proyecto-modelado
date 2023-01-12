import java.util.LinkedList;
/**
 * Cataligo da instancias del catalogo  
 * @authors Daniela Anaya Solis, Mauricio López Miranda 
 * @version 1.0 /Nov/2021
 */
public class Catalogo {

    private LinkedList<Producto> catalogo = new LinkedList<Producto>();
    
    /**
     * método que llena la lista de Productos
     */
    public void creaCatalogo(){
        Producto celular = new Producto ("Samsung Galaxy A12", "ST3099", "camara frontal de 8 MP\n Batería de 5000 mAh\n Sistema Operativo Android 10", "Tecnología", "$3,099");
        Producto bocinaInteligente = new Producto("EchoDot 4ta Gen", "ET1299", "Diseño elegante y compacto\n Voces nítidas y bajos equilibrados\n Contol por voz", "Tecnología", "$1,299");
        Producto laptop = new Producto("Huawei matebook D15", "HT13939", "Procesador Intel i3\n RAM 16 GB\n Sensor de huella dactilar", "Tecnología", "$13,939");
        Producto freidora = new Producto("Oster CKSTAF18D","OE1150","Cuenta con 7 funciones digitales pre-establecidas\n Cocinas sin aceite\n De fácil manejo","Electrodomésticos","$1,150");
        Producto refrigerador = new Producto("Mabe RME360FDMRX0","ME17289","Amplio espacio, para guardar recipientes de gran tamaño\n Ahorra energía\n Mejor conservación de los alimentos","Electrodomésticos","$17,289");
        Producto lavadora = new Producto("Aqua saver green LMH74201WDAB", "AE12743", "Lavado con infusor que potencializa el ahorro de agua\n Reduce el enredo de las prendas", "Electrodoméstico", "$12,743");
        Producto comidaPerro = new Producto("Purina Dog Chow pollo", "PA187", "Preparado con ingredientes de alta calidad\n Gracias a su consistencia e ingredientes le da una alta textura y sabor", "Alimentos", "$187");
        Producto arroz = new Producto("Arroz Verde Valle", "AA31", "Pertenece a la variedad de grano largo que es la más consumida en México ", "Alimentos", "$31");
        Producto mayonesa = new Producto("Mayonesa McCormick", "MA52", "Contiene Omega 3 y vitamina 3 y tiene un delicioso sabor y consistencia", "Alimentos", "$52");

        catalogo.add(celular);
        catalogo.add(bocinaInteligente);
        catalogo.add(laptop);
        catalogo.add(freidora);
        catalogo.add(refrigerador);
        catalogo.add(lavadora);
        catalogo.add(comidaPerro);
        catalogo.add(arroz);
        catalogo.add(mayonesa);

    }
    /**
     * método para visualizar todos los productos del catalogo 
     */
    public void verCatalogo(){
        System.out.println(catalogo.get(0).muestraInformacion() + "\n"+
        catalogo.get(1).muestraInformacion() + "\n"+
        catalogo.get(2).muestraInformacion() +"\n"+
        catalogo.get(3).muestraInformacion() + "\n"+
        catalogo.get(4).muestraInformacion() + "\n"+
        catalogo.get(5).muestraInformacion() + "\n"+
        catalogo.get(6).muestraInformacion() + "\n"+
        catalogo.get(7).muestraInformacion() + "\n"+
        catalogo.get(8).muestraInformacion());
    }
    /**
     * método get para obtener prodictos del catalogo
     * @param i indice del producto a obtener
     * @return Producto deseado
     */
    public Producto getProducto(int i){
        return catalogo.get(i);
    }
    
}
