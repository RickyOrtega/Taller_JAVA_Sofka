package Taller2.Clases;

public class Pelicula {
    private String nombre;
    private String genero;
    private String director;
    private String anioSalida;
    private String anotaciones;
    private boolean alquilada;

    private int id = 0;
    private static int idSiguiente = 0;

    public Pelicula(String nombre, String genero, String director, String anioSalida, String anotaciones, boolean alquilada) {
        this.nombre = nombre;
        this.genero = genero;
        this.director = director;
        this.anioSalida = anioSalida;
        this.anotaciones = anotaciones;
        this.alquilada = alquilada;

        id = idSiguiente;
        idSiguiente++;
    }

    public Pelicula() {
        this.nombre = "";
        this.genero = "";
        this.director = "";
        this.anioSalida = "";
        this.anotaciones = "";
        this.alquilada = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAnioSalida() {
        return anioSalida;
    }

    public void setAnioSalida(String anioSalida) {
        this.anioSalida = anioSalida;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    public boolean isAlquilada() {
        return alquilada;
    }

    public void setAlquilada(boolean alquilada) {
        this.alquilada = alquilada;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " Género: " + this.genero + " Director: " + this.director + " Año de salida: " + this.anioSalida + " Anotaciones: " + this.anotaciones + " Alquilada: " + this.alquilada;
    }
}