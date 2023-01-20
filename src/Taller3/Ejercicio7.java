/*El parqueadero "El guardián" presta sus servicios
de parqueadero nocturno para los usuarios del barrio
y requiere una aplicación que permita registrar los
vehículos que se cuidan en estas instalaciones.

Se sugiere que el parqueadero tenga los atributos del
vehículo como son, placa y marca,
y los datos del cliente como son nombre completo y
número de teléfono.

Para cada vehículo se debe permitir la opción de
ingresar al parqueadero, retirar del parqueadero y
consultar si un vehículo se encuentra en el parqueadero.

Recuerde que el sistema debe terminar cuando el usuario
así lo indique. Tenga en presente que el parqueadero solo
puede almacenar máximo 5 vehículos.*/

package Taller3;

import Principal.Ejercicio;
import Taller3.Otras_Clases.Ejercicio7.Cliente;
import Taller3.Otras_Clases.Ejercicio7.Motocicleta;

public class Ejercicio7 extends Ejercicio {

    private Cliente[] clientes = new Cliente[5];
    private int cantidadClientes = 0;

    private Motocicleta[] motocicletas = new Motocicleta[5];

    public void menu() {
        int opcion = 0;
        while (opcion != 4) {
            try {
                System.out.println("Parqueadero El Guardián");
                System.out.println("1. Ingresar vehículo");
                System.out.println("2. Retirar vehículo");
                System.out.println("3. Consultar vehículo");
                System.out.println("4. Salir");
                System.out.print("Opción: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:

                        if(cantidadClientes >= 5) {
                            System.out.println("El parqueadero está lleno");
                            break;
                        } else {
                            ingresarVehiculo();
                        }

                        break;
                    case 2:
                        if(cantidadClientes > 0) {
                            retirarVehiculo();
                        } else {
                            System.out.println(ANSI_RED + "No hay vehículos en el parqueadero" + ANSI_RESET);
                        }
                        break;
                    case 3:
                        if(cantidadClientes > 0) {
                            System.out.println(ANSI_YELLOW + "Para consultar un vehículo necesita el número de teléfono del cliente y la placa del vehículo." + ANSI_RESET);
                            consultarVehiculo();
                        } else {
                            System.out.println(ANSI_RED + "No hay vehículos en el parqueadero" + ANSI_RESET);
                        }
                        break;
                    case 4:
                        System.out.println("Gracias por usar el programa");
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            } catch (Exception e) {
                System.out.println(ANSI_RED + "Error: " + e.getMessage() + ANSI_RESET);
                sc.nextLine();
            }
        }
    }

    private void consultarVehiculo() {

        try {
            System.out.print("Número teléfono cliente: ");
            String telefono = sc.next();

            if(!existeCliente(telefono)) {
                throw new Exception("El cliente no existe");
            }

            System.out.print("Placa vehículo: ");
            String placaVehiculo = sc.next();

            if(!existeVehiculo(placaVehiculo)) {
                throw new Exception("El vehículo no existe");
            } else {
                System.out.println(ANSI_GREEN + "El vehículo se encuentra en el parqueadero" + ANSI_RESET);
            }

        } catch (Exception e) {
            System.out.println(ANSI_RED + "Error: " + e.getMessage() + ANSI_RESET);
        }
    }

    private boolean existeVehiculo(String placaVehiculo) {
        for (int i = 0; i < motocicletas.length; i++) {
            if(motocicletas[i] != null && motocicletas[i].getPlaca().equals(placaVehiculo)) {
                return true;
            }
        }
        return false;
    }

    private boolean existeCliente(String telefono) {

        for (int i = 0; i < cantidadClientes; i++) {
            if(clientes[i].getNumeroTelefono().equals(telefono)) {
                return true;
            }
        }
        return false;
    }

    private void retirarVehiculo() {
        try {
            System.out.print("Número teléfono cliente: ");
            String telefono = sc.next();

            if(!existeCliente(telefono)) {
                throw new Exception("El cliente no existe");
            }

            System.out.print("Placa vehículo: ");
            String placaVehiculo = sc.next();

            if(!existeVehiculo(placaVehiculo)) {
                throw new Exception("El vehículo no existe");
            }

            for (int i = 0; i < motocicletas.length; i++) {
                if(motocicletas[i] != null && motocicletas[i].getPlaca().equals(placaVehiculo)) {
                    motocicletas[i] = null;
                    cantidadClientes--;
                    System.out.println("Vehículo retirado");
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(ANSI_RED + "Error: " + e.getMessage() + ANSI_RESET);
        }
    }

    private void ingresarVehiculo() {
        try {
            System.out.println("Ingrese los datos del vehículo");
            System.out.print("Placa: ");
            String placa = sc.next();

            if(existeVehiculo(placa)) {
                throw new Exception(ANSI_RED + "El vehículo ya existe" + ANSI_RESET);
            }

            System.out.print("Marca: ");
            String marca = sc.next();
            System.out.println("Ingrese los datos del cliente");
            System.out.print("Nombre completo: ");
            String nombreCompleto = sc.next();
            System.out.print("Número de teléfono: ");
            String numeroTelefono = sc.next();

            motocicletas[cantidadClientes] = new Motocicleta(placa, marca, nombreCompleto);
            clientes[cantidadClientes] = new Cliente(nombreCompleto, numeroTelefono);

            cantidadClientes++;

        } catch (Exception e) {
            System.out.println(ANSI_RED + "Error: " + e.getMessage() + ANSI_RESET);
            sc.nextLine();
        }
    }


    @Override
    public void ejecutar() {
        menu();
    }
}
