//Realizar un programa en el cual se solicite el nombre, apellidos y edad de la persona.

//Si la persona es mayor o igual a 18 a�os, entonces se deber� imprimir en pantalla
//[Nombre completo] usted es mayor de edad, por lo tanto, puede entrar a la fiesta.

//Si la edad de la persona es menor que 18 a�os, entonces, deber� imprimirse el siguiente mensaje:
//[Nombre completo] usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.

package Taller2;

import Principal.Ejercicio;

public class Ejercicio3 extends Ejercicio {

    private String nombre;
    private String apellidos;
    private int edad;

    public Ejercicio3(String nombre, String apellidos, int edad) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Ejercicio3() {
        this("", "", 0);
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void leerDatos(){
        System.out.print("Ingrese su nombre: ");
        this.nombre = sc.nextLine();
        System.out.print("Ingrese sus apellidos: ");
        this.apellidos = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        this.edad = sc.nextInt();
    }

    public String toString(){

        return this.nombre + " " + this.apellidos +
                " usted es " + (this.edad >= 18 ? "mayor" : "menor") +
                " de edad, por lo tanto, " + (this.edad >= 18 ? "puede" : "no puede") + " entrar a la fiesta.";
    }

    @Override
    public void ejecutar() {
        leerDatos();
        System.out.println(this);
    }
}
