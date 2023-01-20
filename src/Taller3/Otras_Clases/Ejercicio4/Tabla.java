package Taller3.Otras_Clases.Ejercicio4;

public class Tabla {
    private int numero;
    private int resultado;

    public Tabla(int numero) {
        this.numero = numero;
    }

    public void mostrarTabla() {
        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(i + " x " + numero + " = " + resultado);
        }
    }
}
