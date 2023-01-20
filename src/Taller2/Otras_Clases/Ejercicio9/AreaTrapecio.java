/*A. Trapecio: ((Base mayor + base menor) /2)x altura*/

package Taller2.Otras_Clases.Ejercicio9;

public class AreaTrapecio extends FiguraGeometrica{
    private double baseMayor;
    private double baseMenor;
    private double altura;

    public AreaTrapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public AreaTrapecio() {
        this.baseMayor = 0;
        this.baseMenor = 0;
        this.altura = 0;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    protected double calcularArea() {

        area = ((baseMayor + baseMenor) / 2) * altura;

        return area;
    }

    public String toString() {
        return "El área del trapecio es: " + calcularArea();
    }

    public void leerBaseMayor() {
        System.out.print("Base mayor: ");

        try{
            baseMayor = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            sc.next();
            leerBaseMayor();
        }
    }

    public void leerBaseMenor() {
        System.out.print("Base menor: ");

        try{
            baseMenor = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            sc.next();
            leerBaseMenor();
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
