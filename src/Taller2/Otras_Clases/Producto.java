//Esta clase describe los productos que se venden en la droguería

package Taller2.Otras_Clases;

public class Producto {
    private String nombre;
    private String marca;
    private String descripcion;
    private String precio;
    private int cantidad;
    private String anotaciones;
    private boolean receta;

    private int id = 0;
    private static int idSiguiente = 0;

    public Producto(String nombre, String marca, String descripcion, String precio, int cantidad, String anotaciones) {
        this.nombre = nombre;
        this.marca = marca;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.anotaciones = anotaciones;
        this.receta = false;

        id = idSiguiente;
        idSiguiente++;
    }

    public Producto(String nombre, String marca, String descripcion, String precio, int cantidad, String anotaciones, boolean receta) {
        this.nombre = nombre;
        this.marca = marca;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.anotaciones = anotaciones;
        this.receta = receta;

        id = idSiguiente;
        idSiguiente++;
    }

    public Producto() {
        this("","","","",0,"", false);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    public boolean getReceta() {
        return receta;
    }

    public void setReceta(boolean receta) {
        this.receta = receta;
    }
}
