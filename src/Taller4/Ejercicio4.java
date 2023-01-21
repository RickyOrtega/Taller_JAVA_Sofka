/*Dada la siguiente matriz bidimensional, el cual debe de quemar en el código
        o	01 02 03 04 05
        o	06 07 08 09 10
        o	11 12 13 14 15
        o	16 17 18 19 20
Utilizando el conocimiento adquirido, a excepción de hacerlo de forma manual,
imprima la siguiente matriz bidimensional:
        o	01 02 03 04 05
        o	10 09 08 07 06
        o	11 12 13 14 15
        o	20 19 18 17 16
*/


package Taller4;

import Principal.Ejercicio;

public class Ejercicio4 extends Ejercicio {

    private int matriz[][] = new int[4][5];

    private void llenarMatriz() {

        int contador = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }
    }

    private void mostrarMatriz() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] < 10) {
                    System.out.print("0");
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void mostrarMatrizAlReves() {
        for (int i = 0; i < 4; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    if (matriz[i][j] < 10) {
                        System.out.print("0");
                    }
                    System.out.print(matriz[i][j] + " ");
                }
            } else {
                for (int j = 4; j >= 0; j--) {
                    if (matriz[i][j] < 10) {
                        System.out.print("0");
                    }
                    System.out.print(matriz[i][j] + " ");
                }
            }

            System.out.println();
        }
    }

    @Override
    public void ejecutar() {
        llenarMatriz();
        System.out.println(ANSI_GREEN + "\nMatriz al derecho:" + ANSI_RESET);
        mostrarMatriz();
        System.out.println(ANSI_GREEN + "\nMatriz con filas pares impresas al contrario:" + ANSI_RESET);
        mostrarMatrizAlReves();
    }
}
