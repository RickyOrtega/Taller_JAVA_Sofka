package Taller3.Otras_Clases.Ejercicio7;

public class Cliente {
    private String nombreCompleto;
    private String numeroTelefono;

    public Cliente(String nombreCompleto, String numeroTelefono) {
        this.nombreCompleto = nombreCompleto;
        this.numeroTelefono = numeroTelefono;
    }

    public Cliente() {
        this.nombreCompleto = "";
        this.numeroTelefono = "";
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}