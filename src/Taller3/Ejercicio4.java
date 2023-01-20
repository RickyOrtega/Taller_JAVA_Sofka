/*Se requiere un programa que pueda crear la tabla de multiplicar
del número que el usuario indique por medio del ciclo Para (for);
esta debe ser impresa del 1 al 10.

Ejemplo, si el usuario indica que desea crear la tabla del 5,
entonces el resultado debería ser el siguiente:

1 x 5 = 5
2 x 5 = 10
3 x 5 = 15
4 x 5 = 20
5 x 5 = 25
6 x 5 = 30
7 x 5 = 35
8 x 5 = 40
9 x 5 = 45
10 x 5 = 50
*/

package Taller3;

import Principal.Ejercicio;
import Taller3.Otras_Clases.Ejercicio4.Tabla;

public class Ejercicio4 extends Ejercicio {

    private String numero;

    private void menu() {
        try{
            System.out.print("Ingrese el número de la tabla que desea crear: ");
            numero = sc.next();

            Tabla tabla = new Tabla(Integer.parseInt(numero));
            tabla.mostrarTabla();

        } catch (Exception e) {
            System.out.println(ANSI_RED + "Error: Debe ingresar un número entero." + ANSI_RESET);
            sc.nextLine();
        } finally {
            menu();
        }
    }

    @Override
    public void ejecutar() {
        menu();
    }
}
