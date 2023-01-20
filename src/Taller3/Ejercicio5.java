/*Utilizando el ciclo que usted desee, crear un menú de
ejecución infinita hasta que el usuario desee terminar
dicho ciclo.

Menú de usuario.

1. Captura nombre
2. Saludar persona
3. Salir del sistema.*/

package Taller3;

import Principal.Ejercicio;

public class Ejercicio5 extends Ejercicio {

    private int opcion = 0;
    private String nombre = "";

    private void menu(){
        while(opcion != 3){
            try{
                System.out.println(ANSI_CYAN + "Menú de usuario." + ANSI_RESET);
                System.out.println("1. Captura nombre");
                System.out.println("2. Saludar persona");
                System.out.println("3. Salir del sistema.");
                System.out.print("Ingrese una opción: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        capturaNombre();
                        break;
                    case 2:
                        saludarPersona();
                        break;
                    case 3:
                        System.out.println("Saliendo del sistema...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }

            } catch (Exception e){
                System.out.println(ANSI_RED + "Error: " + e.getMessage() + ANSI_RESET);
            } finally {
                sc.nextLine();
            }
        }
    }

    private void capturaNombre(){
        System.out.print("Ingrese su nombre: ");
        nombre = sc.next();
    }

    private void saludarPersona(){
        System.out.println("Hola " + nombre);
    }

    @Override
    public void ejecutar() {
        menu();
    }
}