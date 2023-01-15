/*Realizar un programa el cual solicite el nombre de una ciudad capital y el país.
  Al finalizar debe imprimir en pantalla el siguiente mensaje
  "La ciudad [Nombre de la Ciudad], es la capital del país [Nombre del País]"*/

package Taller1;

import Principal.Ejercicio;

public class Ejercicio4 extends Ejercicio {

    private String ciudadCapital;
    private String pais;

    public Ejercicio4(String ciudadCapital, String pais) {
        this.ciudadCapital = ciudadCapital;
        this.pais = pais;
    }

    public Ejercicio4(){
        this.ciudadCapital = null;
        this.pais = null;
    }

    public String getCiudadCapital() {
        return ciudadCapital;
    }

    public void setCiudadCapital(String ciudadCapital) {
        this.ciudadCapital = ciudadCapital;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void pedirCiudadCapital(){
        System.out.println("Ingrese la ciudad: ");
        ciudadCapital = sc.nextLine();
    }

    public void pedirPais(){
        System.out.println("Ingrese el país: ");
        pais = sc.nextLine();
    }

    public String toString(){
        return "La ciudad " + this.ciudadCapital + ", es la capital del país " + this.pais;
    }

    @Override
    public void ejecutar() {
        pedirCiudadCapital();
        pedirPais();

        System.out.println(this);
    }
}