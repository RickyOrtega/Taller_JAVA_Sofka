/*Se debe de imprimir el siguiente cuadro

El usuario deberá insertar la fila y columna
de la cual desea ver el resultado, el resultado
de cada celda debe estar previamente calculado
en una matriz bidimensional la cual cada resultado
obedecerá a la fila y columna insertada por el
usuario.*/

package Taller4;

import Principal.Ejercicio;

public class Ejercicio5 extends Ejercicio {

    private int matriz[][] = new int[10][10];

    private void mostrarCuadro() {

        String cadenaFilas = "F I L A S ";

        System.out.println("                                       C O L U M N A S                                       ");
        System.out.println("          0        1        2        3        4        5        6        7        8         9");

        for (int i = 0; i < 10; i++) {

            System.out.print(cadenaFilas.charAt(i) + "   ");
            System.out.print(i + "   ");

            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (i + 1) * (j+1);

                System.out.print((j + 1) + " x " + (i + 1) + "   ");

                if (i < 9) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private void resultados(){
        int fila = 0;
        int columna = 0;

        try{
            System.out.print("Ingrese la fila (0 - 9): ");
            fila = sc.nextInt();

            if(fila < 0 || fila > 9){
                throw new Exception();
            }

            System.out.print("Ingrese la columna (0 - 9): ");
            columna = sc.nextInt();

            if(columna < 0 || columna > 9){
                throw new Exception();
            }

            System.out.println("El resultado es: " + ANSI_GREEN + matriz[fila][columna]
                                + ANSI_BLUE + "\n-----------------------------------------" + ANSI_RESET);

        } catch (Exception e){
            System.out.println(ANSI_RED + "Error. Solo puede ingresar un número entero entre 0 y 9." + ANSI_RESET);
        } finally {
            resultados();
        }
    }

    @Override
    public void ejecutar() {
        mostrarCuadro();
        resultados();
    }
}