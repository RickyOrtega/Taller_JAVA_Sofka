package Taller2.Otras_Clases;

public class Torta {
    private String sabor;
    private int cantidad;
    private String decoraciones;
    private int precio;
    private int id;
    private static int idActual = 0;

    public Torta(String sabor, int cantidad, String decoraciones, int precio) {
        this.sabor = sabor;
        this.cantidad = cantidad;
        this.decoraciones = decoraciones;
        this.precio = precio;

        this.id = idActual;
        idActual++;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDecoraciones() {
        return decoraciones;
    }

    public void setDecoraciones(String decoraciones) {
        this.decoraciones = decoraciones;
    }

    public int getId() {
        return id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
