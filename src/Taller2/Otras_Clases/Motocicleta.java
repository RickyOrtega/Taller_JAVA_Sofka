package Taller2.Otras_Clases;

import java.util.ArrayList;

public class Motocicleta {
    private String placa;
    private String marca;
    private String modelo;
    private String cilindraje;
    private String color;
    private ArrayList<Arreglo> trabajos;

    public Motocicleta(String placa, String marca, String modelo, String cilindraje, String color) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.color = color;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Arreglo> getTrabajos() {
        return trabajos;
    }

    public void agregarTrabajo(Arreglo arreglo) {
        trabajos.add(arreglo);
    }
}