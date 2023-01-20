package Taller3.Otras_Clases.Ejercicio8;

public class Licencia {
    private String tipo;
    private String descripcion;

    public Licencia(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public Licencia() {
        this.tipo = "";
        this.descripcion = "";
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
