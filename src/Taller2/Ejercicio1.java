/*Realizar un programa en el cual se solicite la edad de una persona.
Si la persona es mayor o igual a 18 años, deberá mostrar en pantalla: Usted es mayor de edad.*/

package Taller2;

import Principal.Ejercicio;

import java.util.InputMismatchException;

public class Ejercicio1 extends Ejercicio {

    private int edad;

    public Ejercicio1(int edad) {
        this.edad = edad;
    }

    public Ejercicio1() {
        this.edad = 0;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void pedirEdad(){
        System.out.print("Ingrese su edad: ");

        try {

            this.edad = sc.nextInt();

            if (this.edad < 0) {
                System.out.println("La edad no puede ser negativa");
                edad=0;
                pedirEdad();
            }
        } catch (InputMismatchException e){
            System.out.println("La edad debe ser un número entero");
            edad=0;
            sc.next();
            pedirEdad();
        } finally {
            sc.close();
            System.out.println("--------------------");
        }
    }

    public void mostrarMayoria(){
        if (this.edad >= 18) {
            System.out.println("Usted es mayor de edad.");
        }
    }

    @Override
    public void ejecutar() {
        pedirEdad();
        mostrarMayoria();
    }
}
