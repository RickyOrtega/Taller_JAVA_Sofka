//La escuela automovilística "El Maestro" requiere una aplicación
//que permita registrar a sus clientes en los cursos de enseñanza
//automovilística y establecer quienes lo han aprobado para
//continuar con el trámite de adquirir la licencia de conducción.
//Para cada usuario se debe permitir registrar su ingreso al
//curso, consultar usuarios que hayan presentado el curso y
//resultados de la prueba del curso (si fueron aprobados o no).
//Recuerde que el sistema debe terminar cuando el usuario así
//lo indique.

//Tenga presente que la escuela tiene capacidad
//máxima de gestionar 8 usuarios en su totalidad.

//Para la simulación usaré el estándar de licencias de conducción colombianas

//Las tomé de: motor.com.co/industria/Conozca-los-tipos-de-licencia-de-conduccion-en-Colombia-20220523-0004.html

//A1: Motos de bajo cilindraje.
//A2: Motos de alto cilindraje.
//B1: Autos particulares.
//B2: Camiones y buses de uso particular.
//B3: Vehículos articulados particulares.
//C1: Autos pequeños de servicio público.
//C2: Autos grandes de servicio público.
//C3: Vehículos articulados de servicio público.

package Taller3;

import Principal.Ejercicio;
import Taller3.Otras_Clases.Ejercicio8.Licencia;
import Taller3.Otras_Clases.Ejercicio8.Licencias;
import Taller3.Otras_Clases.Ejercicio8.Usuario;

public class Ejercicio8 extends Ejercicio {

    private Usuario[] usuarios = new Usuario[8];
    private int cantidadUsuarios = 0;

    @Override
    public void ejecutar() {
        menu();
    }

    private void menu() {
        int opcion = 0;
        do{
            System.out.println(ANSI_BLUE + "Escuela Automovilística El Maestro" + ANSI_RESET);
            System.out.println("1. Registrar usuario");
            System.out.println("2. Consultar usuarios");
            System.out.println("3. Consultar resultados de la prueba");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if(cantidadUsuarios < 8){
                        registrarUsuario();
                    } else {
                        System.out.println(ANSI_RED + "No se pudo registrar el usuario. La escuela está llena." + ANSI_RESET);
                    }
                    break;
                case 2:
                    if(cantidadUsuarios == 0){
                        System.out.println(ANSI_RED + "No hay usuarios registrados" + ANSI_RESET);
                    } else {
                        consultarUsuarios();
                    }
                    break;
                case 3:
                    if(cantidadUsuarios == 0){
                        System.out.println(ANSI_RED + "No hay usuarios registrados" + ANSI_RESET);
                    } else {
                        consultarResultados();
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 4);
    }

    private void consultarResultados() {
        System.out.println("Consultar resultados de la prueba");
        System.out.print("Ingrese el número de cédula del usuario: ");
        String cedula = sc.next();
        for (int i = 0; i < cantidadUsuarios; i++) {
            if(usuarios[i].getCedula().equals(cedula)){
                if(usuarios[i].getEstadoLicencia()){
                    System.out.println(ANSI_GREEN + "El usuario ha aprobado la prueba" + ANSI_RESET);
                } else {
                    System.out.println(ANSI_RED + "El usuario no ha aprobado la prueba" + ANSI_RESET);
                }
                return;
            }
        }
        System.out.println(ANSI_RED + "No se encontró el usuario" + ANSI_RESET);
    }

    private void consultarUsuarios() {
        System.out.println("Usuarios registrados");
        for (int i = 0; i < cantidadUsuarios; i++) {
            System.out.println(usuarios[i].getNombre());
        }
    }

    private void registrarUsuario() {
        try{
            System.out.println("Registro de usuario");
            System.out.print("Ingrese el nombre del usuario: ");
            String nombre = sc.next();
            System.out.print("Ingrese la cédula del usuario: ");
            String cedula = sc.next();
            System.out.println("Ingrese el tipo de licencia que desea obtener");
            System.out.println("A1: Motos de bajo cilindraje.");
            System.out.println("A2: Motos de alto cilindraje.");
            System.out.println("B1: Autos particulares.");
            System.out.println("B2: Camiones y buses de uso particular.");
            System.out.println("B3: Vehículos articulados particulares.");
            System.out.println("C1: Autos pequeños de servicio público.");
            System.out.println("C2: Autos grandes de servicio público.");
            System.out.println("C3: Vehículos articulados de servicio público.");
            System.out.print("Ingrese el tipo de licencia: ");
            String tipoLicencia = sc.next();
            Licencia lc;

            switch (tipoLicencia){
                case "A1":
                    lc = Licencias.getA1();
                    break;
                case "A2":
                    lc = Licencias.getA2();
                    break;
                case "B1":
                    lc = Licencias.getB1();
                    break;
                case "B2":
                    lc = Licencias.getB2();
                    break;
                case "B3":
                    lc = Licencias.getB3();
                    break;
                case "C1":
                    lc = Licencias.getC1();
                    break;
                case "C2":
                    lc = Licencias.getC2();
                    break;
                case "C3":
                    lc = Licencias.getC3();
                    break;
                default:
                    System.out.println(ANSI_RED + "Tipo de licencia inválido" + ANSI_RESET);
                    return;
            }

            System.out.println("¿El usuario aprobó el curso?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            System.out.print("Ingrese una opción: ");
            int opcion = sc.nextInt();

            boolean aprobado = false;

            usuarios[cantidadUsuarios] = new Usuario(nombre, cedula, lc, aprobado);
            cantidadUsuarios++;
        } catch (Exception e){
            System.out.println(ANSI_RED + "Error al registrar el usuario" + ANSI_RESET);
        }
    }
}