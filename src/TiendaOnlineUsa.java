import java.util.LinkedList;
import java.util.Scanner;

/** 
 * Clase TiendaOnlineEsp que extiende TiendaOnline y se despliega si el usuario es de EUA
 * @authors Daniela Anaya Solis, Mauricio López Miranda 
 * @version 1.0 /Nov/2021
 */
public class TiendaOnlineUsa implements TiendaOnline {
    
    private Oferta tecnologia = new OfertaTecnologia();
    private String oferta ="We have a special deal for you if you decide to buy a refigerator";
    /**
     * método get para obtener la cadena con la oferta de la tienda
     * @return oferta
     */
    public String getOferta(){
        return oferta;
    }
    /**
     * sobreescritura del método notificar de la interfaz Sujeto para notificar a los usuarios de la lista sobre las ofertas
     * @param datos lista de clietes
     */
    public void notificar(LinkedList<ClienteProxy> datos){    
        if(datos.size()>0){
            System.out.println("*************************************************\n"+
            "Offert\n"+
            "*************************************************\n");
            for (ClienteProxy c : datos){
                c.actualizar();
            }
        }
    }
    /**
     * método para saludar al cliente gringo
     */
    public void saludar(){
        System.out.println("*************************************************\n" + 
        "Welcome\n" + "*************************************************\n");
    }
    /**
     * método para desplegar los menús de la tienda de EUA 
     */
    public void despliegaMenu(){
        Scanner scannerOpcion = new Scanner(System.in);
        int opcion;
        do{        
            while(true){
                try{
                    String opcionUsuario = scannerOpcion.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                }catch(NumberFormatException ex){
                    System.out.println("please type one of the following options \n");
                    System.out.println("1: see inventory\n"+
                    "2: buy\n"+
                    "3: exit\n");
                }
                opcion = scannerOpcion.nextInt();
                switch (opcion) {
                    case 1:
                        Catalogo catalogo = new Catalogo();
                        catalogo.creaCatalogo();
                        catalogo.verCatalogo();
                        
                        break;
                    case 2:
                        catalogo = new Catalogo();
                        catalogo.creaCatalogo();
                        catalogo.verCatalogo();
                        System.out.println("please type one of the following options: \n"+
                        "1:add products (You only have to select them one by one)\n"+
                        "2:exit\n");
                        LinkedList<Producto> carrito = new LinkedList<>();
                        LinkedList<String> nombres = new LinkedList<>();
                        LinkedList<String> precios = new LinkedList<>();
                        Scanner scannerCompras = new Scanner(System.in);
                        int compras = scannerCompras.nextInt();
                        switch (compras) {
                            case 1:
                                Scanner scannerCarrito  = new Scanner(System.in);
                                int carro;
                                do{
                                    while(true){
                                        try{
                                            String opcionUsuario2 = scannerOpcion.nextLine();
                                            carro = Integer.parseInt(opcionUsuario2);
                                        }catch(NumberFormatException ex){
                                            System.out.println("please type one of the following options:\n"+
                                            "1:add cellphone\n"+ "2:add echo dot\n"+ "3:add laptop\n"+
                                            "4:add air fryer\n"+ "5:add refrigerator\n"+ "6:add washing machine\n"+
                                            "7:add dog food\n" + "8:add rice\n" + "9:add mayonnaise\n"+
                                            "10:proceed to payment\n" + "11: exit");
                                        }
                                        carro = scannerCarrito.nextInt();
                                        switch (carro) {
                                            case 1:
                                                carrito.add(catalogo.getProducto(0));
                                                nombres.add("cellphone ");
                                                precios. add("$3,099");
                                                System.out.println("was successfully added to the basket: "+ nombres +
                                                "\n to return to the menu press enter");
                                                break;
                                            case 2:
                                                carrito.add(catalogo.getProducto(1));
                                                nombres.add("echo dot");
                                                precios.add("$1,299");
                                                System.out.println("was successfully added to the basket: "+ nombres +
                                                "\n to return to the menu press enter");
                                                break;
                                            case 3:
                                                carrito.add(catalogo.getProducto(2));
                                                nombres.add("laptop ");
                                                catalogo.getProducto(2).setPrecio(tecnologia.Ofertas());
                                                precios.add(catalogo.getProducto(2).getPrecio());
                                                System.out.println("was successfully added to the basket: "+ nombres +
                                                "\n to return to the menu press enter");
                                                break;
                                            case 4:
                                                carrito.add(catalogo.getProducto(3));
                                                nombres.add("air fryer ");
                                                precios.add("$1,150");
                                                System.out.println("was successfully added to the basket: "+ nombres +
                                                "\n to return to the menu press enter");
                                                break;
                                            case 5:
                                                carrito.add(catalogo.getProducto(4));
                                                nombres.add("refrigerator ");
                                                precios.add("$17,289");
                                                System.out.println("Se agregó correctamente, tú carrito: "+ nombres +
                                                "\n to return to the menu press enter");
                                                break;
                                            case 6:
                                                carrito.add(catalogo.getProducto(5));
                                                nombres.add("washing machine ");
                                                precios.add("$12,743");
                                                System.out.println("was successfully added to the basket: "+ nombres +
                                                "\n to return to the menu press enter");
                                                break;
                                            case 7:
                                                carrito.add(catalogo.getProducto(6));
                                                nombres.add("dog food ");
                                                precios.add("$187");
                                                System.out.println("was successfully added to the basket: "+ nombres +
                                                "\n to return to the menu press enter");
                                                break;
                                            case 8:
                                                carrito.add(catalogo.getProducto(7));
                                                nombres.add("rice ");
                                                precios.add("$31");
                                                System.out.println("was successfully added to the basket: "+ nombres +
                                                "\n to return to the menu press enter");
                                                break;
                                            case 9:
                                                carrito.add(catalogo.getProducto(8));
                                                nombres.add("mayonnaise ");
                                                precios.add("$52");
                                                System.out.println("was successfully added to the basket: "+ nombres +
                                                "\n to return to the menu press enter");
                                                break;
                                            case 10:
                                                System.out.println("type the number of your card associate to this account");
                                                Scanner scannerCuenta = new Scanner(System.in);
                                                String cuenta = scannerCuenta.nextLine();
                                                if(cuenta.equals(cuenta)){
                                                    if(carrito.size()>0){
                                                        System.out.println("your purchase was succesfully executed\n"+
                                                        "*********************************************************"+
                                                        "Ticket\n"+"*********************************************************\n"+
                                                        "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n"+
                                                        nombres +"\n"+ precios + "\n"+"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
                                                    }else{
                                                        System.out.println("your basket is empty");
                                                    }
                                                    scannerCuenta.close();
                                                    return;
                                                }

                                                break;
                                            case 11:

                                                return;
                                            default:
                                                System.out.println("please insert valid options\n"+
                                                "to return to the menu press enter");
                                                break;
                                        }
                                        
                                    }
                                    
                                }while(carro !=10 );
                                
                            case 2:
                                return;
                            default:

                                break;
                        }
                        break;
                    case 3:
                        
                        return;
                    default:
                    
                        break;
                }
                
            }
                
        }while(opcion!=3);
            
    }
    /**
     * método par despedir al usuario gringo
     */
    public void despedida(){
        System.out.println("Good Bye");
    }
}
