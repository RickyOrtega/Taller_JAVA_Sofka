package Taller2.Otras_Clases;

public class Arreglo {
    private String empleado;
    private String trabajo;
    private String repuesto;
    private String costo;
    private String fecha;
    private String observaciones;
    private int id;
    private static int idActual = 0;

    public Arreglo(String empleado, String trabajo, String repuesto, String costo, String fecha, String observaciones) {
        this.empleado = empleado;
        this.trabajo = trabajo;
        this.repuesto = repuesto;
        this.costo = costo;
        this.fecha = fecha;
        this.observaciones = observaciones;

        this.id = idActual;
        idActual++;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(String repuesto) {
        this.repuesto = repuesto;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}