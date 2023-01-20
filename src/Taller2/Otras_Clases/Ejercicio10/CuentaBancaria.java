package Taller2.Otras_Clases.Ejercicio10;

public class CuentaBancaria {
    private int idCuenta;
    private static int idSigCuenta = 1;
    private String titular;
    private double cantidad;

    public CuentaBancaria(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;

        idCuenta = idSigCuenta;
        idSigCuenta++;
    }

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdCuenta() {
        return idCuenta;
    }
}