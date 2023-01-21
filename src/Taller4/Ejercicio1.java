/*Crear un vector de tipo Entero con 5 posiciones,
llenarlo con información solicitada al usuario.
Después de recoger toda la información, se requiere
imprimir el índice de cada posición en el arreglo
con su valor de la siguiente manera

[0] = 55
[1] = 99
[2] = 11
[3] = 56
[4] = 69
*/

package Taller4;

import Principal.Ejercicio;

import java.util.InputMismatchException;

public class Ejercicio1 extends Ejercicio {

    private int vector[] = new int[5];
    private int indiceActual = 0;

    @Override
    public void ejecutar() {
        llenarArreglo();
        mostrarVector();
    }

    private void llenarArreglo() {

        try{
            System.out.print("Ingrese el valor del vector en la posición " + (indiceActual+1) + ": " );
            vector[indiceActual] = sc.nextInt();
            indiceActual++;

            if(indiceActual<=4){
                llenarArreglo();
            }

        } catch (InputMismatchException e){
            System.out.println(ANSI_RED  + "Error: Solo puede ingresar números sin decimales (enteros)." + ANSI_RESET);
            sc.next();
            llenarArreglo();
        }
    }

    private void mostrarVector(){
        System.out.println();

        for(int i=0; i<=4; i++){
            System.out.println("[" + i + "] = " + vector[i]);
        }
    }
}
