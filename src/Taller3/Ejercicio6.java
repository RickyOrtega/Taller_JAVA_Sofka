/*Se está creando una aplicación que va a estar
conectada con un prototipo que permita almacenar
contactos telefónicos en el dispositivo. Para ello
cada contacto debe contener nombre completo,
teléfono y organización. Se requiere que la aplicación
permita añadir 3 contactos verificando que el número
no esté almacenado, buscar contactos almacenados y
eliminar contactos si el usuario lo requiere.
Recuerde que el sistema debe terminar cuando el
usuario así lo indique.
*/

package Taller3;

import Principal.Ejercicio;
import Taller3.Otras_Clases.Ejercicio6.Contacto;

public class Ejercicio6 extends Ejercicio {

    private Contacto[] contactos = new Contacto[3];
    private int contador = 0;
    int opcion = 0;

    private void menu() {
        while(opcion != 4) {
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            
            switch(opcion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    buscarContacto();
                    break;
                case 3:
                    eliminarContacto();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }

    private void buscarContacto() {
        if(contador == 0) {
            System.out.println(ANSI_RED + "No hay contactos" + ANSI_RESET);
            return;
        } else {
            System.out.print("Ingrese el nombre del contacto: ");
            String nombre = sc.next();
            for(int i = 0; i < contador; i++) {
                if(contactos[i].getNombreCompleto().equals(nombre)) {
                    System.out.println("Nombre: " + contactos[i].getNombreCompleto());
                    System.out.println("Teléfono: " + contactos[i].getTelefono());
                    System.out.println("Organización: " + contactos[i].getOrganizacion());
                    return;
                }
            }
            System.out.println(ANSI_RED + "No se encontró el contacto" + ANSI_RESET);
        }
    }

    private void agregarContacto() {
        if(contador == 3) {
            System.out.println(ANSI_RED + "No se pueden agregar más contactos" + ANSI_RESET);
            return;
        } else {
            System.out.print("Ingrese el nombre completo: ");
            String nombre = sc.next();
            System.out.print("Ingrese el teléfono: ");
            String telefono = sc.next();
            System.out.print("Ingrese la organización: ");
            String organizacion = sc.next();
            contactos[contador] = new Contacto(nombre, telefono, organizacion);
            contador++;
            System.out.println(ANSI_GREEN + "Contacto agregado" + ANSI_RESET);
        }
    }

    private void eliminarContacto() {
        if(contador == 0) {
            System.out.println(ANSI_RED + "No hay contactos" + ANSI_RESET);
            return;
        } else {
            System.out.print("Ingrese el nombre del contacto: ");
            String nombre = sc.next();
            for(int i = 0; i < contador; i++) {
                if(contactos[i].getNombreCompleto().equals(nombre)) {
                    for(int j = i; j < contador - 1; j++) {
                        contactos[j] = contactos[j + 1];
                    }
                    contador--;
                    System.out.println("Contacto eliminado");
                    return;
                }
            }
            System.out.println(ANSI_RED + "No se encontró el contacto" + ANSI_RESET);
        }
    }

    @Override
    public void ejecutar() {
        menu();
    }
}
