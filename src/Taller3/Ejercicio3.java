//Realizar la siguiente figura por medio del ciclo Repetir - Hasta Que (do-while)

package Taller3;

import Principal.Ejercicio;

public class Ejercicio3 extends Ejercicio {

    private void mostrarFigura() {

        int n = 10;
        int i = 0;
        int j = 0;
        int k = 0;

        do {
            do {
                System.out.print(" ");
                k++;
            } while (k <= n - i - 1);
            k = 0;
            j = 0;

            do {
                System.out.print("*");
                j++;
            } while (j <= i);

            j = 0;

            if (i != 0) {
                do {
                    System.out.print("*");
                    j++;
                } while (j <= i - 1);
            }

            System.out.println();
            i++;
        } while (i < n);

        i = 0;
        j = 2;
        k = 0;

        String cadenaTexto = "         **";
        String base = "*";

        System.out.println(cadenaTexto + base);

        do {

            System.out.print(cadenaTexto + base);
            cadenaTexto = cadenaTexto.substring(1);

            do{
                cadenaTexto = cadenaTexto + "**";
                j++;
            } while (j < i);

            i++;
            j=0;
            System.out.println();

        } while (i < 3);
    }

    @Override
    public void ejecutar() {
        mostrarFigura();
    }
}