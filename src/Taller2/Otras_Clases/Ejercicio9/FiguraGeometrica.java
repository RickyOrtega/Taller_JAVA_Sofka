package Taller2.Otras_Clases.Ejercicio9;

import java.util.Scanner;

public abstract class FiguraGeometrica {

    protected Scanner sc = new Scanner(System.in);
    protected double area;

    protected abstract double calcularArea();

}
