/*A. Rectángulo: Base x Altura*/

package Taller2.Otras_Clases.Ejercicio9;

public class AreaRectangulo extends FiguraGeometrica {
    protected double base;
    protected double altura;

    public AreaRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public AreaRectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    protected double calcularArea() {

        area = base * altura;

        return area;
    }

    public String toString() {
        return "El área del rectángulo es: " + calcularArea();
    }

    public void leerBase() {
        System.out.print("Base: ");

        try{
            base = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            sc.next();
            leerBase();
        }
    }

    public void leerAltura() {
        System.out.print("Altura: ");

        try{
            altura = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            sc.next();
            leerAltura();
        }
    }
}
