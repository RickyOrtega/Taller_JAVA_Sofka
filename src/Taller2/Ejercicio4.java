//La video tienda que presta sus servicios de alquiler de películas
//a los usuarios del barrio el Porvenir, requiere de una aplicación
//que permita registrar el alquiler de las películas que adquieren
//sus usuarios. Para cada usuario se debe permitir la opción de
//alquilar película, consultar películas disponibles y recibir
//película en la video tienda con la opción de realizar anotaciones
//sobre estas si se llegan a presentar daños u otra novedad sobre la película.

//Aprovechando que estoy en Java, usaré ArrayList para simular una base de datos

package Taller2;

import Principal.Ejercicio;
import Taller2.Clases.Pelicula;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Ejercicio4 extends Ejercicio {

    private ArrayList<Pelicula> peliculas = new ArrayList<>();
    private ArrayList<String> usuarios = new ArrayList<>();

    private void menu() {

        int opcion = 0;

        try {
            System.out.print(this.ANSI_RESET);
            System.out.println("1. Alquilar película");
            System.out.println("2. Consultar películas disponibles");
            System.out.println("3. Recibir película");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            if (opcion < 1 || opcion > 4) {
                System.out.println(this.ANSI_RED + "Opción inválida");
                opcion = 0;
                menu();
            } else {
                switch (opcion) {
                    case 1:
                        alquilarPelicula();
                        break;
                    case 2:
                        consultarPeliculasDisponibles();
                        menu();
                        break;
                    case 3:
                        recibirPelicula();
                        break;
                    case 4:
                        System.out.println(this.ANSI_RESET + "Saliendo...");
                        break;
                }
            }

        } catch (InputMismatchException e){
            System.out.println( this.ANSI_RED + "Solo se permiten números enteros positivos");
            sc.next();
            menu();
        }
    }

    private void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }

    private void agregarPelicula(String nombre, String genero, String director, String anioSalida, String anotaciones, boolean alquilada){
        Pelicula pelicula = new Pelicula(nombre, genero, director, anioSalida, anotaciones, alquilada);
        peliculas.add(pelicula);
    }

    private void agregarUsuario(String usuario){
        usuarios.add(usuario);
    }

    private void alquilarPelicula(){
        System.out.println(this.ANSI_RESET + "Alquilar película");
        System.out.print("Nombre de usuario: ");
        String usuario = sc.next();
        agregarUsuario(usuario);
        System.out.println("Películas disponibles:");
        consultarPeliculasDisponibles();

        try{
            System.out.print("Opción: ");
            String opcion = sc.next();

            if(opcion.equalsIgnoreCase("menu")){
                menu();
            } else {
                if (Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > peliculas.size() || peliculas.get(Integer.parseInt(opcion) - 1).isAlquilada()){
                    System.out.println(this.ANSI_RED + "Opción inválida");
                    alquilarPelicula();
                } else {
                    peliculas.get(Integer.parseInt(opcion)-1).setAlquilada(true);
                    System.out.println(this.ANSI_GREEN + "Película alquilada");
                    menu();
                }
            }
        } catch (InputMismatchException e){
            System.out.println( this.ANSI_RED + "Solo se permiten números enteros positivos");
            sc.next();
            alquilarPelicula();
        } catch (NumberFormatException e){
            System.out.println( this.ANSI_RED + "Solo se permiten números enteros positivos");
            sc.next();
            alquilarPelicula();
        }
    }

    private void consultarPeliculasDisponibles(){

        if(peliculas.isEmpty()){
            System.out.println(this.ANSI_RED + "No hay películas disponibles en el momento.");
        } else {
            System.out.println(this.ANSI_RESET + "Catálogo:");
            for (int i = 0; i < peliculas.size(); i++) {
                if (!peliculas.get(i).isAlquilada()){
                    System.out.print(this.ANSI_GREEN);
                } else {
                    System.out.print(this.ANSI_RED);
                }
                System.out.println((i+1) + ". " + peliculas.get(i).getNombre());
            }
        }

        System.out.println(this.ANSI_RESET);
    }

    private void consultarPeliculasAlquiladas(String usuario){
        System.out.println(this.ANSI_RESET + "Películas alquiladas por " + usuario + ":");
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).isAlquilada()){
                System.out.println((i+1) + ". " + peliculas.get(i).getNombre());
            }
        }
        System.out.println();
    }

    private void recibirPelicula(){
        System.out.println(this.ANSI_RESET + "Recibir película");
        System.out.print("Nombre de usuario: ");
        String usuario = sc.next();
        if (!usuarios.contains(usuario)){
            System.out.println(this.ANSI_RED + "Usuario no encontrado");
            recibirPelicula();
        } else {
            System.out.println("Películas alquiladas:");
            consultarPeliculasAlquiladas(usuario);
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            if (opcion < 1 || opcion > peliculas.size() || !peliculas.get(opcion - 1).isAlquilada()){
                System.out.println(this.ANSI_RED + "Opción inválida");
                recibirPelicula();
            } else {
                peliculas.get(opcion-1).setAlquilada(false);
                System.out.println(this.ANSI_GREEN + "Película recibida");
                menu();
            }
        }

        System.out.println();
    }

    private void cargarPeliculasPredefinidas(){
        Pelicula pelicula1 = new Pelicula("El señor de los anillos", "Fantasía", "Peter Jackson", "2001", "Ninguna", false);
        Pelicula pelicula2 = new Pelicula("El padrino", "Drama", "Francis Ford Coppola", "1972", "Ninguna", false);
        Pelicula pelicula3 = new Pelicula("El club de la lucha", "Drama", "David Fincher", "1999", "Ninguna", false);
        Pelicula pelicula4 = new Pelicula("El pianista", "Drama", "Roman Polanski", "2002", "Ninguna", false);
        Pelicula pelicula5 = new Pelicula("El silencio de los corderos", "Drama", "Jonathan Demme", "1991", "Ninguna", false);
        Pelicula pelicula6 = new Pelicula("El laberinto del fauno", "Fantasía", "Guillermo del Toro", "2006", "Ninguna", false);
        Pelicula pelicula7 = new Pelicula("El gran dictador", "Comedia", "Charles Chaplin", "1940", "Ninguna", false);
        Pelicula pelicula8 = new Pelicula("El caballero oscuro", "Acción", "Christopher Nolan", "2008", "Ninguna", false);
        Pelicula pelicula9 = new Pelicula("El club de la lucha", "Drama", "David Fincher", "1999", "Ninguna", false);
        Pelicula pelicula10 = new Pelicula("El pianista", "Drama", "Roman Polanski", "2002", "Ninguna", false);

        agregarPelicula(pelicula1);
        agregarPelicula(pelicula2);
        agregarPelicula(pelicula3);
        agregarPelicula(pelicula4);
        agregarPelicula(pelicula5);
        agregarPelicula(pelicula6);
        agregarPelicula(pelicula7);
        agregarPelicula(pelicula8);
        agregarPelicula(pelicula9);
        agregarPelicula(pelicula10);
    }

    @Override
    public void ejecutar() {

        cargarPeliculasPredefinidas();

        menu();
    }
}
