/*Imprimir los números primos del 1 al 1000,
el resultado debe ser buscado de forma matemática.*/

package Taller4;

import Principal.Ejercicio;

public class Ejercicio3 extends Ejercicio {

    private int primos[] = new int[200];
    private int posicionActual = 0;

    private boolean comprobarPrimo(int a) {

        int contador = 0;

        for (int x = 1; x <= a; x++) {

            if (a % x == 0) {
                contador++;
            }

        }

        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }

    private void numeros() {
        for (int i = 2; i <= 1000; i++) {

            if (comprobarPrimo(i)) {
                primos[posicionActual] = i;
                posicionActual++;
            }

        }
    }


    private void mostrar() {

        System.out.print("Todos los números primos encontrados desde 1 hasta 1000: ");


        for (int i = 0; i < posicionActual; i++) {
            System.out.print(primos[i]);

            if (i != posicionActual -1 ){
                System.out.print(", ");
            }
        }
    }

    @Override
    public void ejecutar() {
        numeros();
        mostrar();
    }
}