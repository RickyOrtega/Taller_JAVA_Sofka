/*La Droguería Mi Salud presta sus servicios en la localidad de Suba
y requiere una aplicación para poder facturar los productos que vende
a sus clientes y para ello, los productos tienen unas características
que deben indicársele al cliente para que pueda escoger el producto
a comprar. Para cada cliente, se tienen las opciones de compra de producto,
consulta de precios por producto y devoluciones en caso de que se presenten.*/

package Taller2;

import Principal.Ejercicio;
import Taller2.Otras_Clases.Producto;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Ejercicio5 extends Ejercicio {

    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<String> clientes = new ArrayList<>();

    private void cargarProductosPredefinidos(){
        productos.add(new Producto("Acetaminofen 500 mg","American Generics","Analgésico y antipirético.","100",1000,"No requiere receta médica."));
        productos.add(new Producto("Ibuprofeno 800 mg","Genfar","Analgésico, antiinflamatorio y antipirético.","400",500,"No requiere receta médica."));
        productos.add(new Producto("Metocarbamol 750","Laproff","Relajante muscular.","500",800,"No requiere receta médica."));
        productos.add(new Producto("Naproxeno 500 mg","American Generics","Antiinflamatorio.","500",400,"No requiere receta médica."));
        productos.add(new Producto("Vitafer","No sé","Multivitamínico.","2000",120,"No requiere receta médica."));
        productos.add(new Producto("Vitamina B12 1000 mcg","Colmed","Vitamina para el sistema nervioso.","300",300,"No requiere receta médica."));
        productos.add(new Producto("Vitamina C 500 mg","Ecar","Vitamina para las defensas.","300",400,"No requiere receta médica."));
        productos.add(new Producto("Vitamina D 400 UI","Colmed","Vitamina para el sistema inmune.","300",300,"No requiere receta médica."));
        productos.add(new Producto("Vitamina E 400 UI","Colmed","Antioxidante.","300",300,"No requiere receta médica."));
    }

    private void agregarUsuario(String usuario){
        clientes.add(usuario);
    }

    private void comprarProducto(){

        System.out.println(this.ANSI_RESET + "Comprar producto");
        System.out.print("Nombre de usuario: ");
        String usuario = sc.next();
        agregarUsuario(usuario);
        System.out.println("Productos disponibles:");

        try{
            System.out.print("Opción: ");
            String opcion = sc.next();

            if(opcion.equalsIgnoreCase("menu")){
                menu();
            } else {

            }
        } catch (InputMismatchException e){
            System.out.println( this.ANSI_RED + "Solo se permiten números enteros positivos");
            sc.next();
            comprarProducto();
        } catch (NumberFormatException e){
            System.out.println( this.ANSI_RED + "Solo se permiten números enteros positivos");
            sc.next();
            comprarProducto();
        }

    }

    private void consultarProductos(){

        System.out.println("Consultar productos");

        if(productos.isEmpty()){
            System.out.println(this.ANSI_RED + "No hay productos registrados");
            menu();
        } else {
            for (int i = 0; i < productos.size(); i++) {
                System.out.println((i+1) + ". " + productos.get(i).getNombre());
            }
            System.out.print("Opción: ");
            String opcion = sc.next();

            if(opcion.equalsIgnoreCase("menu")){
                menu();
            } else {
                if (Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > productos.size()){
                    System.out.println(this.ANSI_RED + "Opción inválida");
                    consultarProductos();
                } else {
                    System.out.println(this.ANSI_GREEN + "Nombre: " + productos.get(Integer.parseInt(opcion)-1).getNombre());
                    System.out.println("Marca: " + productos.get(Integer.parseInt(opcion)-1).getMarca());
                    System.out.println("Descripción: " + productos.get(Integer.parseInt(opcion)-1).getDescripcion());
                    System.out.println("Precio: " + productos.get(Integer.parseInt(opcion)-1).getPrecio());
                    System.out.println("Cantidad: " + productos.get(Integer.parseInt(opcion)-1).getCantidad());

                    if(productos.get(Integer.parseInt(opcion)-1).getReceta()) {
                        System.out.println(ANSI_RED + "Requiere receta médica");
                    } else {
                        System.out.println(ANSI_BLUE + "No requiere receta médica");
                    }

                    menu();
                }
            }
        }

    }

    private void devolverProducto(){

    }

    private void menu() {

        int opcion = 0;

        try {
            System.out.print(this.ANSI_RESET);
            System.out.println("1. Comprar producto");
            System.out.println("2. Consultar precios por producto");
            System.out.println("3. Devoluciones");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    comprarProducto();
                    break;
                case 2:
                    consultarProductos();
                    break;
                case 3:
                    devolverProducto();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    menu();
                    break;
            }

        } catch (InputMismatchException e){
            System.out.println( this.ANSI_RED + "Solo se permiten números enteros positivos");
            sc.next();
            menu();
        }
    }

    @Override
    public void ejecutar() {

        cargarProductosPredefinidos();

        System.out.println("Bienvenido a la Droguería Mi Salud.");

        menu();

    }
}
