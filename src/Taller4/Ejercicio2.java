/* Crear un arreglo de números enteros de 20 posiciones,
el cual, debe ser llenado con números aleatorios entre
1 y 100; después de haber llenado dicho arreglo, se debe
volver a recorrer utilizando un ciclo diferente al que se
usó para llenarse e imprimir los números pares e impares.

Ejemplo:

        o	Números pares: 2, 4, 6, 8, 10
        o	Números impares: 1, 3, 5, 7, 9
*/


package Taller4;

import Principal.Ejercicio;

import java.util.Random;

public class Ejercicio2 extends Ejercicio {
    private int vector[] = new int[20];
    private Random rnd = new Random();
    private int pares[] = new int[20];
    private int indicePares = 0;
    private int impares[] = new int[20];
    private int indiceImpares = 0;

    private void llenarArreglo() {
        for (int i = 0; i < 20; i++) {
            //En la documentación de la API de Java 8 dice que este método es inclusive en el origin y exclusive en el bound
            vector[i] = rnd.nextInt(1, 101);
        }
    }

    private void evaluarParesImpares() {
        int i = 0;
        while (i < 20) {
            if (vector[i] % 2 == 0) {
                pares[indicePares] = vector[i];
                indicePares++;
            } else {
                impares[indiceImpares] = vector[i];
                indiceImpares++;
            }
            i++;
        }
    }

    private void mostrar() {

        int i = 0;

        do {
            System.out.println("[" + i + "] = " + vector[i]);
            i++;
        } while (i < 20);

        i = 0;

        System.out.print(ANSI_GREEN + "\nPares: " + ANSI_RESET);

        textoParesImpares(pares, indicePares);

        System.out.print(ANSI_GREEN + "\nImpares: " + ANSI_RESET);

        textoParesImpares(impares, indiceImpares);

        System.out.println();
    }

    private void textoParesImpares(int vector[], int indiceVector) {

        int i = 0;

        do {
            System.out.print(vector[i]);
            if (i != indiceVector - 1) {
                System.out.print(", ");
            }
            i++;
        } while (i < indiceVector);
    }

    // En el ejercicio no especifica que estén ordenados,
    // pero en el ejemplo sí muestran los números con
    // cierto orden ascendente.
    private int[] ordenamiento(int vector[], int a) {

        int auxiliar = 0;

        for (int i = 0; i < (a - 1); i++) {
            for (int x = 0; x < (a - 1); x++) {
                if (vector[x] > vector[x + 1]) {
                    auxiliar = vector[x];
                    vector[x] = vector[x + 1];
                    vector[x + 1] = auxiliar;
                }
            }
        }
        return vector;
    }

    private void ordenar() {
        pares = ordenamiento(pares, indicePares);
        impares = ordenamiento(impares, indiceImpares);
    }

    @Override
    public void ejecutar() {
        llenarArreglo();
        evaluarParesImpares();
        ordenar();
        mostrar();
    }
}
