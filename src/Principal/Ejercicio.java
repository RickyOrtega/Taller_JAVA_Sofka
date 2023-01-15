package Principal;

import java.util.Scanner;

public abstract class Ejercicio implements Ejecutable, Coloreable{

    protected Scanner sc = new Scanner(System.in);
    protected String nombreEjercicio;

    public Ejercicio() {
        this.nombreEjercicio = this.getClass().getSimpleName();
    }

    public abstract void ejecutar();
}