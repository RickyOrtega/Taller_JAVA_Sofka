package Taller3.Otras_Clases.Ejercicio7;

public class Motocicleta {
    private String placa;
    private String marca;
    private String nombrePropietario;

    public Motocicleta(String placa, String marca, String nombrePropietario) {
        this.placa = placa;
        this.marca = marca;
        this.nombrePropietario = nombrePropietario;
    }

    public Motocicleta() {
        this.placa = "";
        this.marca = "";
        this.nombrePropietario = "";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }
}