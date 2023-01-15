//Realizar un programa el cual solicite su nombre, apellidos, edad y estatura.

package Taller1;


import Principal.Ejercicio;

public class Ejercicio2 extends Ejercicio {

    private String nombre;
    private String apellidos;
    private String edad;
    private String estatura;

    public Ejercicio2(String nombre, String apellidos, String edad, String estatura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = estatura;
    }

    public Ejercicio2() {
        this.nombre = null;
        this.apellidos = null;
        this.edad = null;
        this.estatura = null;
    }

    public String getNombres() {
        return nombre;
    }

    public void setNombres(String nombres) {
        this.nombre = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public void pedirNombres() {

        System.out.print("Ingrese su nombre completo: ");
        nombre = sc.nextLine();

    }

    public void mostrarNombres() {
        System.out.println("Su nombre es: " + nombre);
    }

    public void pedirApellidos() {

        System.out.print("Ingrese sus apellidos: ");
        apellidos = sc.nextLine();

    }

    public void mostrarApellidos() {
        System.out.println("Sus apellidos son: " + apellidos);
    }

    public void pedirEdad() {

        System.out.print("Ingrese su edad: ");
        edad = sc.nextLine();

    }

    public void mostrarEdad(){
        System.out.println("Su edad es: " + edad);
    }

    public void pedirEstatura() {

        System.out.print("Ingrese su estatura: ");
        estatura = sc.nextLine();

    }

    public void mostrarEstatura(){
        System.out.println("Su estatura es: " + estatura);
    }

    public String toString(){

        String cadena = String.format("Nombre: %s\nApellidos: %s\nEdad: %s\nEstatura: %s\n", nombre, apellidos, edad, estatura);

        return cadena;
    }

    @Override
    public void ejecutar() {
        pedirNombres();
        pedirApellidos();
        pedirEdad();
        pedirEstatura();

        System.out.println(this);
    }
}