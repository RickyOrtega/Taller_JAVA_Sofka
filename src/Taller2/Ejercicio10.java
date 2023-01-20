// El banco "Su banco fiel" es un banco que inicia sus actividades
// financieras y necesita una aplicación para llevar las cuentas
// de sus usuarios; por lo tanto, se sugiere que la cuenta tenga
// los atributos titular y cantidad.
//
// Para cada cliente las cuentas permitirán realizar ingresos,
// retiros o consultas de valor. En los ingresos no se pueden
// insertar valores negativos y para los retiros el valor no
// puede ser mayor al valor que tiene en la cuenta.

package Taller2;

import Principal.Ejercicio;
import Taller2.Otras_Clases.Ejercicio10.CuentaBancaria;
import Taller2.Otras_Clases.Ejercicio10.GestionarCuenta;

import java.util.ArrayList;

public class Ejercicio10 extends Ejercicio {

    private ArrayList<CuentaBancaria> cuentas;

    public Ejercicio10(){
        cuentas = new ArrayList<>();
    }

    @Override
    public void ejecutar() {
        menu();
    }

    private void crearCuenta(){
        System.out.print("Ingrese el nombre del titular de la cuenta:");
        String titular = sc.next();
        System.out.print("Ingrese la cantidad de dinero que desea ingresar:");
        double cantidad = sc.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(titular, cantidad);
        System.out.println(ANSI_GREEN + "Su cuenta fue creada con éxito. Su número de cuenta es: " + ANSI_GREEN + cuenta.getIdCuenta());
        cuentas.add(cuenta);
        menu();
    }

    private void menu() {
        System.out.println(ANSI_BLUE + "Bienvenido a Su Banco Fiel" + ANSI_RESET);
        System.out.println("1. Crear cuenta");
        System.out.println("2. Ingresar");
        System.out.println("3. Retirar");
        System.out.println("4. Consultar");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opción: ");

        try {
            int opcion = sc.nextInt();

            //Aquí obviamente no se puede simplemente mostrar todos los datos de las cuentas, así que solo se mostrará el titular y la cantidad, siempre y cuando el nombre esté bien escrito
            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                case 2:

                    if(cuentas.size() == 0){
                        System.out.println(ANSI_RED + "No hay cuentas creadas" + ANSI_RESET);
                        menu();
                    } else{
                        ingresarEnCuenta();
                    }

                    break;
                case 3:

                    if (cuentas.size() == 0) {
                        System.out.println(ANSI_RED + "No hay cuentas creadas" + ANSI_RESET);
                        menu();
                    } else {
                        retirarDeCuenta();
                    }

                    break;
                case 4:

                    if(cuentas.size() == 0){
                        System.out.println(ANSI_RED + "No hay cuentas creadas" + ANSI_RESET);
                        menu();
                    } else{
                        consultarCuenta();
                    }

                    break;
                case 5:
                    System.out.println("Gracias por usar Su Banco Fiel");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

        } catch (Exception e) {
            System.out.println("Opción inválida");
            menu();
        }
    }

    private void ingresarEnCuenta() {
        int id = 0;
        try {
            System.out.print("Ingrese el Número (ID) de la cuenta:");
            id = sc.nextInt();
            System.out.print("Ingrese la cantidad de dinero que desea ingresar:");
            double cantidad = sc.nextDouble();
            GestionarCuenta.ingresar(cuentas.get(id-1), cantidad);
        } catch (Exception e) {
            System.out.println(ANSI_RED + "No se pudo ingresar la cantidad de dinero en la cuenta " + id + ANSI_RESET);
            sc.next();
        } finally {
            System.out.println("Saldo: " + cuentas.get(id-1).getCantidad());
            menu();
        }
    }

    private void retirarDeCuenta(){
        int id = 0;
        try{
            System.out.print("Ingrese el Número (ID) de la cuenta:");
            id = sc.nextInt();
            System.out.print("Ingrese la cantidad de dinero que desea retirar:");
            double cantidad = sc.nextDouble();
            GestionarCuenta.retirar(cuentas.get(id-1), cantidad);
        } catch (Exception e){
            System.out.println(ANSI_RED + "No se pudo retirar la cantidad de dinero de la cuenta " + id + ANSI_RESET);
            sc.next();
        } finally {
            System.out.println("Saldo: " + cuentas.get(id-1).getCantidad());
            menu();
        }
    }

    private void consultarCuenta(){
        try{
            System.out.print("Ingrese el Número (ID) de la cuenta:");
            int id = sc.nextInt();
            System.out.println("Titular: " + cuentas.get(id-1).getTitular());
            System.out.println("Saldo: " + cuentas.get(id-1).getCantidad());
        } catch (Exception e){
            System.out.println(ANSI_RED + "No se pudo consultar la cuenta" + ANSI_RESET);
            sc.next();
        } finally {
            menu();
        }
    }
}
