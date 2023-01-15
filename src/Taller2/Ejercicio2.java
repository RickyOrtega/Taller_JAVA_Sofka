//Realizar un programa en el cual se solicite la edad de una persona.
//Si la persona es menor a 18 años, deberá mostrar en pantalla:
//Usted aún es un niño(a).

package Taller2;

import Principal.Ejercicio;

public class Ejercicio2 extends Ejercicio {

    private int edad;

    public Ejercicio2(int edad) {
        super();
        this.edad = edad;
    }

    public Ejercicio2() {
        this(0);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void leerEdad(){
        System.out.print("Ingrese su edad: ");
        this.edad = sc.nextInt();
    }

    @Override
    public String toString(){
        return (this.edad < 18) ? "Usted aún es un niño(a)." : "Usted ya es mayor de edad.";
    }

    @Override
    public void ejecutar() {
        leerEdad();
        System.out.println(this);
    }
}
