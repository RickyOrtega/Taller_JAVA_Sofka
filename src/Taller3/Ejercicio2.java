/*Realizar la siguiente figura por medio del ciclo Mientras - Hacer*/

package Taller3;

import Principal.Ejercicio;

public class Ejercicio2 extends Ejercicio {

    private void mostrarFigura(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    @Override
    public void ejecutar() {
        mostrarFigura(10);
    }
}
