package Taller2.Otras_Clases;

public class VentaTorta {
    private int idTorta;
    private String fecha;
    private String cliente;
    private int valorVenta;
    private int cantidad;
    private int id;
    private static int idActual = 0;

    public VentaTorta(int torta, String fecha, String cliente, int cantidad, int valorVenta) {
        this.idTorta = torta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.valorVenta = valorVenta;

        this.id = idActual;
        idActual++;
    }

    public int getIdTorta() {
        return idTorta;
    }

    public void setTorta(int idTorta) {
        this.idTorta = idTorta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(int valorVenta) {
        this.valorVenta = valorVenta;
    }
}
