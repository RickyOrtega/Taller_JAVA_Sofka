/*Realizar la siguiente figura por medio del ciclo Mientras - Hacer (while)*/

package Taller3;

import Principal.Ejercicio;

public class Ejercicio2 extends Ejercicio {

    private void mostrarFigura(int n) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n) {
            while (k < n - i - 1) {
                System.out.print(" ");
                k++;
            }
            k = 0;
            j = 0;

            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    @Override
    public void ejecutar() {
        mostrarFigura(10);
    }
}
