/*A. Triángulo: (Base x Altura)/2*/

package Taller2.Otras_Clases.Ejercicio9;

public class AreaTriangulo extends AreaRectangulo{
    public AreaTriangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public AreaTriangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public double calcularArea() {

        area = (base * altura) / 2;

        return area;
    }

    public String toString() {
        return "El área del triángulo es: " + calcularArea();
    }
}
