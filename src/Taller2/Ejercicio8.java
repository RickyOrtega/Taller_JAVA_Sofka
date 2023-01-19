/*El pastelero Don Carlos es el mejor pastelero de la ciudad y requiere
una aplicación que le permita registrar los pedidos de los clientes en
cuanto a las tortas que realiza. Cada torta tiene unas características
propias como sabor, cantidad (porciones) y decoraciones.

Se requiere que la aplicación permita registrar los pedidos, las tortas
disponibles y las ventas que se registren diariamente.*/

package Taller2;

import Principal.Ejercicio;
import Taller2.Otras_Clases.Torta;
import Taller2.Otras_Clases.VentaTorta;

import java.util.ArrayList;
import java.util.Date;

public class Ejercicio8 extends Ejercicio {

    private ArrayList<Torta> tortasDisponibles;
    private ArrayList<VentaTorta> ventas;
    private ArrayList<Integer> numeroTortas;

    public Ejercicio8() {
        tortasDisponibles = new ArrayList<>();
        ventas = new ArrayList<>();
        numeroTortas = new ArrayList<>();
    }

    private void agregarTorta(Torta torta) {
        tortasDisponibles.add(torta);
    }

    private void agregarVenta(VentaTorta venta) {
        ventas.add(venta);
    }

    private void agregarNumeroTortas(int numero) {
        numeroTortas.add(numero);
    }

    private void mostrarTortasDisponibles() {
        if (tortasDisponibles.size() == 0) {
            System.out.println(ANSI_RED + "No hay tortas disponibles." + ANSI_RESET);
            return;
        } else {
            System.out.println("Tortas disponibles:");
            for (int i = 0; i < tortasDisponibles.size(); i++) {
                System.out.println(ANSI_GREEN + "Torta " + (tortasDisponibles.get(i).getId() + 1) + ":" + ANSI_RESET);
                System.out.println("Sabor = " + tortasDisponibles.get(i).getSabor());
                System.out.println("Porciones = " + tortasDisponibles.get(i).getCantidad());
                System.out.println("Decoraciones = " + tortasDisponibles.get(i).getDecoraciones());
                System.out.println("Disponibles = " + numeroTortas.get(i));
                System.out.println();
            }
        }
    }

    private void menu() {
        System.out.println(ANSI_CYAN + "Don Carlos Pastelería" + ANSI_RESET);
        System.out.println("1. Agregar torta");
        System.out.println("2. Agregar venta");
        System.out.println("3. Mostrar tortas disponibles");
        System.out.println("4. Mostrar ventas");
        System.out.println("5. Salir");
        System.out.print("Opción: ");
        try {
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    tortaNueva();
                    menu();
                    break;
                case 2:
                    ventaNueva();
                    menu();
                    break;
                case 3:
                    mostrarTortasDisponibles();
                    menu();
                    break;
                case 4:
                    mostrarVentas();
                    menu();
                case 5:
                    System.exit(0);
                    break;
            }

        } catch (Exception e) {
            System.out.println("Opción inválida");
            sc.next();
            menu();
        }
    }

    private void mostrarVentas() {
        if (ventas.size() == 0) {
            System.out.println(ANSI_RED + "No hay ventas registradas.");
            return;
        } else {
            System.out.println("Ventas registradas:");
            for (int i = 0; i < ventas.size(); i++) {
                System.out.println(ANSI_GREEN + "Venta " + (ventas.get(i).getId() + 1) + ":" + ANSI_RESET);
                System.out.println("Fecha = " + ventas.get(i).getFecha());
                System.out.println("Torta = " + tortasDisponibles.get(ventas.get(i).getIdTorta()).getSabor());
                System.out.println("Cantidad = " + ventas.get(i).getCantidad());
                System.out.println("Cliente = " + ventas.get(i).getCliente());

            }
        }
    }


    private void ventaNueva() {
        mostrarTortasDisponibles();
        if(!(tortasDisponibles.size() == 0)) {
            System.out.print("Ingrese el número de la torta que desea comprar: ");

            try {
                int opcion = sc.nextInt();

                if (opcion > tortasDisponibles.size() || opcion < 1) {
                    System.out.println("Opción inválida");
                    ventaNueva();
                } else {
                    System.out.println("Ingrese la cantidad de tortas que desea comprar: ");
                    int cantidad = sc.nextInt();

                    if (cantidad > numeroTortas.get(opcion - 1)) {
                        System.out.println("No hay suficientes tortas disponibles");
                        ventaNueva();
                    } else {

                        System.out.print("Ingrese el nombre del cliente: ");
                        String cliente = sc.next();

                        agregarVenta(new VentaTorta(tortasDisponibles.get(opcion - 1).getId(), new Date().toString(), cliente, cantidad, cantidad * tortasDisponibles.get(opcion - 1).getPrecio()));
                        numeroTortas.set(opcion - 1, numeroTortas.get(opcion - 1) - cantidad);
                    }
                }
            } catch (Exception e) {
                System.out.println("Opción inválida");
                sc.next();
                ventaNueva();
            }
        }
    }

    private void tortaNueva() {

        int tamagnoNumeroTortas = numeroTortas.size();

        System.out.print("Ingrese el sabor de la torta:");
        String sabor = sc.next();
        System.out.print("Ingrese la cantidad de porciones:");
        int cantidad = sc.nextInt();
        System.out.print("Ingrese las decoraciones:");
        String decoraciones = sc.next();
        System.out.print("Ingrese el precio:");
        int precio = sc.nextInt();

        Torta torta = new Torta(sabor, cantidad, decoraciones, precio);
        agregarTorta(torta);

        System.out.print("Ingrese la cantidad de tortas de este tipo:");
        int numero = sc.nextInt();
        agregarNumeroTortas(numero);
        tamagnoNumeroTortas++;

        if (tamagnoNumeroTortas > numeroTortas.size()) {
            System.out.println(ANSI_RED + "Ocurrió un error");
        } else {
            System.out.println(ANSI_GREEN + "Se agregó la torta");
        }

        System.out.print(ANSI_RESET);
    }

    @Override
    public void ejecutar() {
        menu();
    }
}
