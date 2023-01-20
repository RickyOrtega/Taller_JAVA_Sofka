package Taller3.Otras_Clases.Ejercicio6;

public class Contacto {
    private String nombreCompleto;
    private String telefono;
    private String organizacion;

    public Contacto() {
        this.nombreCompleto = "";
        this.telefono = "";
        this.organizacion = "";
    }

    public Contacto(String nombreCompleto, String telefono, String organizacion) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.organizacion = organizacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }
}
