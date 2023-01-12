import java.util.LinkedList;
import java.util.Scanner;
/** 
 * Clase TiendaOnlineEsp que extiende TiendaOnline y se despliega si el usuario es de españa
 * @authors Daniela Anaya Solis, Mauricio López Miranda 
 * @version 1.0 /Nov/2021
 */
public class TiendaOnlineEsp implements TiendaOnline {

    private Oferta electrodomestico = new OfertaTecnologia();
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
            "Oferta\n"+
            "*************************************************\n");
            for (ClienteProxy c : datos){
                c.actualizar();
            }
        }
    }
    /**
     * método para saludar al cliente español
     */
    @Override
    public void saludar(){
        System.out.println("Maj@ os encanta verte por aquí ");
    }
    /**
     * método para desplegar los menús de la tienda de españa 
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
                    System.out.println("Selecciona la opción que deseas ejecutar\n");
                    System.out.println("1: ver catalogo\n"+
                    "2: realizar una compra\n"+
                    "3: salir\n");
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
                        System.out.println("Selecciona la opción que deseas ejecutar: \n"+
                        "1:agregar un producto al carrito (Recuerda que solo puedes agregar de uno en uno)\n"+
                        "2:salir\n");
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
                                            System.out.println("Seleciona la opcion que desees ejecutar:\n"+
                                            "1:agregar celular\n"+ "2:bocina inteligente\n"+ "3:agregar laptop\n"+
                                            "4:agregar freidora\n"+ "5:agregar refrigerador\n"+ "6:agregar lavadora\n"+
                                            "7:agregar comida para perro\n" + "8:agregar arroz\n" + "9:agregar mayonesa\n"+
                                            "10:Proceder al pago\n" + "11: Salir");
                                        }
                                        carro = scannerCarrito.nextInt();
                                        switch (carro) {
                                            case 1:
                                                carrito.add(catalogo.getProducto(0));
                                                nombres.add("celular ");
                                                precios. add("$3,099");
                                                System.out.println("flipante, se agregó correctamente, tú carro: "+ nombres +
                                                "\n hunde enter para retornar al menu");
                                                break;
                                            case 2:
                                                carrito.add(catalogo.getProducto(1));
                                                nombres.add("bocina ");
                                                precios.add("$1,299");
                                                System.out.println("flipante, se agregó correctamente, tú carro: "+ nombres +
                                                "\n hunde enter para retornar al menu");
                                                break;
                                            case 3:
                                                carrito.add(catalogo.getProducto(2));
                                                nombres.add("laptop ");
                                                precios.add("$13,999");
                                                System.out.println("flipante, se agregó correctamente, tú carro: "+ nombres +
                                                "\n hunde enter para retornar al menu");
                                                break;
                                            case 4:
                                                carrito.add(catalogo.getProducto(3));
                                                nombres.add("freidora ");
                                                precios.add("$1,150");
                                                System.out.println("flipante, se agregó correctamente, tú carro: "+ nombres +
                                                "\n hunde enter para retornar al menu");
                                                break;
                                            case 5:
                                                carrito.add(catalogo.getProducto(4));
                                                nombres.add("refrigerador ");
                                                catalogo.getProducto(4).setPrecio(electrodomestico.Ofertas());
                                                precios.add(catalogo.getProducto(4).getPrecio());
                                                System.out.println("flipante, se agregó correctamente, tú carro: "+ nombres +
                                                "\n hunde enter para retornar al menu");
                                                break;
                                            case 6:
                                                carrito.add(catalogo.getProducto(5));
                                                nombres.add("lavadora ");
                                                precios.add("$12,743");
                                                System.out.println("flipante, se agregó correctamente, tú carro: "+ nombres +
                                                "\n hunde enter para retornar al menu");
                                                break;
                                            case 7:
                                                carrito.add(catalogo.getProducto(6));
                                                nombres.add("comida para perro ");
                                                precios.add("$187");
                                                System.out.println("flipante, se agregó correctamente, tú carro: "+ nombres +
                                                "\n hunde enter para retornar al menu");
                                                break;
                                            case 8:
                                                carrito.add(catalogo.getProducto(7));
                                                nombres.add("arroz ");
                                                precios.add("$31");
                                                System.out.println("flipante, se agregó correctamente, tú carro: "+ nombres +
                                                "\n hunde enter para retornar al menu");
                                                break;
                                            case 9:
                                                carrito.add(catalogo.getProducto(8));
                                                nombres.add("mayonesa ");
                                                precios.add("$52");
                                                System.out.println("flipante, se agregó correctamente, tú carro: "+ nombres +
                                                "\n hunde enter para retornar al menu");
                                                break;
                                            case 10:
                                                System.out.println("chavalon/a ingresa tu tarjeta asocida a esta cuenta");
                                                Scanner scannerCuenta = new Scanner(System.in);
                                                String cuenta = scannerCuenta.nextLine();
                                                if(cuenta.equals(cuenta)){
                                                    if(carrito.size()>0){
                                                        System.out.println("en hora buena la compra se relizo de manera flipante\n"+
                                                        "*********************************************************"+
                                                        "Ticket\n"+"*********************************************************\n"+
                                                        "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n"+
                                                        nombres +"\n"+ precios + "\n"+"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
                                                    }else{
                                                        System.out.println("joder que el carro está vació");
                                                    }
                                                    scannerCuenta.close();
                                                    return;
                                                }

                                                break;
                                            case 11:

                                                return;
                                            default:
                                                System.out.println("Vamos tí@ que no es una opción válida\n"+
                                                "hunde enter para retornar al menu");
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
     * método par despedir al usuario español
     */
    public void despedida(){
        System.out.println("adios chavalón");
    }
}
