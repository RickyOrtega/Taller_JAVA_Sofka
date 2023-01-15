/*Realizar un programa el cual solicite el nombre de su mascota,
  edad de la mascota, el tipo de mascota y su nombre completo.
  Al finalizar el sistema debe e imprimir en pantalla el siguiente mensaje:
  [Nombre de Mascota] es un(a) [Tipo de Mascota], el cual, tiene [Edad de la Mascota] años de edad y [Nombre Completo] es actualmente su dueño(a).*/

package Taller1;

import Principal.Ejercicio;

public class Ejercicio5 extends Ejercicio {

    private String nombreMascota;
    private String tipoMascota;
    private String edadMascota;
    private String nombreDuegno;

    public Ejercicio5(String nombreMascota, String tipoMascota, String edadMascota, String nombreDuegno) {
        this.nombreMascota = nombreMascota;
        this.tipoMascota = tipoMascota;
        this.edadMascota = edadMascota;
        this.nombreDuegno = nombreDuegno;
    }

    public Ejercicio5() {
        this.nombreMascota = null;
        this.tipoMascota = null;
        this.edadMascota = null;
        this.nombreDuegno = null;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(String edadMascota) {
        this.edadMascota = edadMascota;
    }

    public String getNombreDuegno() {
        return nombreDuegno;
    }

    public void setNombreDuegno(String nombreDuegno) {
        this.nombreDuegno = nombreDuegno;
    }

    public void pedirNombreMascota() {
        System.out.println("Ingrese el nombre de su mascota: ");
        nombreMascota = sc.nextLine();
    }

    public void pedirEdadMascota() {
        System.out.println("Ingrese la edad de su mascota: ");
        edadMascota = sc.nextLine();
    }

    public void pedirTipoMascota() {
        System.out.println("Ingrese el tipo de mascota que es " + this.nombreMascota + ": ");
        tipoMascota = sc.nextLine();
    }

    public void pedirNombreCliente() {
        System.out.println("Ingrese su nombre: ");
        nombreDuegno = sc.nextLine();
    }

    public String toString() {
        return this.nombreMascota + " es un(a) " + this.tipoMascota + ", el cual, tiene " + this.edadMascota + " años de edad y " + this.nombreDuegno + " es actualmente su dueño(a)";
    }

    @Override
    public void ejecutar() {
        pedirNombreMascota();
        pedirTipoMascota();
        pedirEdadMascota();
        pedirNombreCliente();

        System.out.println(this);
    }
}