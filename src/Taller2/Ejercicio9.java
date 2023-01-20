/*El profesor de geometr�a est� explicando a sus estudiantes
las f�rmulas para calcular el �rea de diferentes figuras
geom�tricas, para ello requiere una aplicaci�n que le
facilite el ejercicio solicit�ndole los valores al estudiante.
La aplicaci�n debe permitir que el estudiante seleccione
si desea calcular el �rea de un rect�ngulo, tri�ngulo o
trapecio. No olvide solicitar los datos necesarios para
realizar cada c�lculo y mostrar su respectivo resultado.

A. Trapecio: ((Base mayor + base menor) /2)x altura
A. Triángulo: (Base x Altura)/2
A. Rectángulo: Base x Altura*/

package Taller2;

import Principal.Ejercicio;
import Taller2.Otras_Clases.Ejercicio9.AreaRectangulo;
import Taller2.Otras_Clases.Ejercicio9.AreaTrapecio;
import Taller2.Otras_Clases.Ejercicio9.AreaTriangulo;

public class Ejercicio9 extends Ejercicio {

    private AreaRectangulo areaRectangulo;
    private AreaTrapecio areaTrapecio;
    private AreaTriangulo areaTriangulo;

    @Override
    public void ejecutar() {
        menu();
    }

    private void menu() {
        System.out.println("Área de figuras geométricas.");
        System.out.println("1. Rectángulo");
        System.out.println("2. Trapecio");
        System.out.println("3. Triángulo");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                areaRectangulo = new AreaRectangulo();
                System.out.println("Para calcular el área de un rectángulo necesitamos Base y Altura.");
                areaRectangulo.leerBase();
                areaRectangulo.leerAltura();
                System.out.println(areaRectangulo);
                break;
            case 2:
                areaTrapecio = new AreaTrapecio();
                System.out.println("Para calcular el área de un trapecio necesitamos Base mayor, Base menor y Altura.");
                areaTrapecio.leerBaseMayor();
                areaTrapecio.leerBaseMenor();
                areaTrapecio.leerAltura();
                System.out.println(areaTrapecio);
                break;
            case 3:
                areaTriangulo = new AreaTriangulo();
                System.out.println("Para calcular el área de un triángulo necesitamos Base y Altura.");
                areaTriangulo.leerBase();
                areaTriangulo.leerAltura();
                System.out.println(areaTriangulo);
                break;
            case 4:
                System.out.println("Gracias por usar el programa.");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
}
