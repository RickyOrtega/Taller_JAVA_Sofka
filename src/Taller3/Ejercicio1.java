/*Realizar la siguiente figura por medio del ciclo Para (for)*/
//Lo hice así, porque sí, pueden elegir la cantidad de asteriscos que quieran, pero por defecto es 10,
//lo cual cumple con el enunciado.

package Taller3;

import Principal.Ejercicio;

public class Ejercicio1 extends Ejercicio {

    private void mostrarFigura(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void ejecutar() {
        mostrarFigura(10);
    }
}
