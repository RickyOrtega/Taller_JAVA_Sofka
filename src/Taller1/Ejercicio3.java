/*Realizar un programa el cual solicite su nombre y apellidos,
también debe capturar nombre y apellidos de su padre y madre.
Al finalizar debe imprimir en pantalla el siguiente mensaje
"Yo [Nombre Completo], soy hijo de [Nombre de la Madre] y [Nombre del Padre]".*/

package Taller1;

import Principal.Ejecutable;
import Principal.Ejercicio;

public class Ejercicio3 extends Ejercicio {

    private String nombre;
    private String apellidos;
    private String nombrePadre;
    private String apellidosPadre;
    private String nombreMadre;
    private String apellidosMadre;

    public Ejercicio3(String nombre, String apellidos, String nombrePadre, String apellidosPadre, String nombreMadre, String apellidosMadre) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombrePadre = nombrePadre;
        this.apellidosPadre = apellidosPadre;
        this.nombreMadre = nombreMadre;
        this.apellidosMadre = apellidosMadre;
    }

    public Ejercicio3() {
        this.nombre = null;
        this.apellidos = null;
        this.nombrePadre = null;
        this.apellidosPadre = null;
        this.nombreMadre = null;
        this.apellidosMadre = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getApellidosPadre() {
        return apellidosPadre;
    }

    public void setApellidosPadre(String apellidosPadre) {
        this.apellidosPadre = apellidosPadre;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getApellidosMadre() {
        return apellidosMadre;
    }

    public void setApellidosMadre(String apellidosMadre) {
        this.apellidosMadre = apellidosMadre;
    }

    public void pedirNombre(){
        System.out.println("Ingresa tu nombre: ");
        nombre=sc.nextLine();
    }

    public void pedirApellidos(){
        System.out.println("Ingresa tu apellido/s: ");
        apellidos=sc.nextLine();
    }

    public void pedirNombrePadre(){
        System.out.println("Ingresa el nombre de tu padre: ");
        nombrePadre=sc.nextLine();
    }

    public void pedirApellidosPadre(){
        System.out.println("Ingresa los apellido/s de tu padre: ");
        apellidosPadre=sc.nextLine();
    }

    public void pedirNombreMadre(){
        System.out.println("Ingresa el nombre de tu madre: ");
        nombreMadre=sc.nextLine();
    }

    public void pedirApellidosMadre(){
        System.out.println("Ingresa los apellido/s de tu madre: ");
        apellidosMadre=sc.nextLine();
    }

    public String toString(){
        return "Yo " + this.nombre + " " + this.apellidos + ", soy hijo de " + this.nombreMadre + " " + this.apellidosMadre + " y " + this.nombrePadre + " " + this.apellidosPadre;
    }

    @Override
    public void ejecutar() {
        pedirNombre();
        pedirApellidos();
        pedirNombrePadre();
        pedirApellidosPadre();
        pedirNombreMadre();
        pedirApellidosMadre();

        System.out.println(this);
    }
}