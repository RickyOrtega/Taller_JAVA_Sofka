//Realizar un programa el cual solicite su nombre y apellidos.

package Taller1;

import Principal.Ejercicio;

public class Ejercicio1 extends Ejercicio {

    private String nombres;

    public Ejercicio1(String nombres){
        nombres=nombres;
    }

    public Ejercicio1(){
        nombres=null;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void pedirNombres() {

        System.out.print("Ingrese su nombre completo: ");
        nombres = sc.nextLine();

    }

    public void mostrarNombres() {
        System.out.println("Su nombre completo es: " + nombres);
    }

    public String toString(){
        return "Su nombre completo es: " + nombres;
    }

    @Override
    public void ejecutar() {

        pedirNombres();
        System.out.println(this);

    }
}