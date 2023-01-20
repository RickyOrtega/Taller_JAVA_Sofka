package Taller3.Otras_Clases.Ejercicio8;

public class Usuario {
    private String nombre;
    private String cedula;
    private Licencia licencia;
    private boolean estadoLicencia;

    public Usuario(String nombre, String cedula, Licencia licencia, boolean estadoLicencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.licencia = licencia;
        this.estadoLicencia = estadoLicencia;
    }

    public Usuario() {
        this.nombre = "";
        this.cedula = "";
        this.licencia = new Licencia();
        this.estadoLicencia = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public boolean getEstadoLicencia() {
        return estadoLicencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    public void setEstadoLicencia(boolean estadoLicencia) {
        this.estadoLicencia = estadoLicencia;
    }

    public String toString(){

        String texto = "Nombre: " + nombre + "\nCédula: " + cedula + "\nLicencia: " + licencia.getTipo() + "\nEstado de la licencia: " ;

        if(estadoLicencia){
            texto += "Aprobado";
        }else{
            texto += "No aprobado";
        }

        return texto;
    }
}