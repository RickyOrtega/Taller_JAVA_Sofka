/*La Secretaría de Salud Municipal requiere de una aplicación que le permita
calcular el IMC (índice de masa corporal) y requiere los datos peso en
kilogramos y estatura en metros Para cada persona encuestada adicional
a los datos suministrados, debe mostrar el resultado para cada uno y establecer
en qué rango se encuentra (bajo peso, normal, sobrepeso y obeso).

Los datos los tom� de: http://tuendocrinologo.com/site/nutricion/calculadora.html*/

package Taller2;

import Principal.Ejercicio;
import Taller2.Otras_Clases.Rangos;

import java.io.Console;

import static java.lang.System.exit;

//Uso la Interface "Rangos" para poder usar los rangos de IMC, sin tener que escribirlos en el código del programa.
public class Ejercicio7 extends Ejercicio implements Rangos {

    private double peso;
    private double estatura;
    private double imc;

    public Ejercicio7(double peso, double estatura) {
        this.peso = peso;
        this.estatura = estatura;
        this.imc = calcularIMC();
    }

    private double calcularIMC(double peso, double estatura) {

        imc= peso/(estatura*estatura);

        return imc;
    }

    public Ejercicio7(){
        this.estatura = 0;
        this.peso = 0;
        this.imc = 0;
    }

    private double calcularIMC() {

        imc= peso/(estatura*estatura);

        return imc;
    }

    private String getClasificacion(){

        String clasificacion = "";

        if(imc >= RANGO_BAJO_PESO_MIN && imc <= RANGO_BAJO_PESO_MAX){
            clasificacion = RANGO_BAJO_PESO;
        }else if(imc >= RANGO_NORMAL_MIN && imc <= RANGO_NORMAL_MAX){
            clasificacion = RANGO_NORMAL;
        } else if(imc >= RANGO_SOBREPESO_MIN && imc <= RANGO_SOBREPESO_MAX){
            clasificacion = RANGO_SOBREPESO;
        } else if(imc >= RANGO_OBESO_I_MIN && imc <= RANGO_OBESO_I_MAX){
            clasificacion = RANGO_OBESO_I;
        } else if(imc >= RANGO_OBESO_II_MIN && imc <= RANGO_OBESO_II_MAX){
            clasificacion = RANGO_OBESO_II;
        } else if(imc >= RANGO_OBESO_III_MIN){
            clasificacion = RANGO_OBESO_III;
        }

        return clasificacion;
    }

    int control = 0;
    private void menu(){

        System.out.println(ANSI_RESET + "\nCalculadora de IMC\n");

        if(control == 0){
            try {
                System.out.print("Ingrese su peso en kilogramos: ");
                peso = sc.nextDouble();
                control = 1;
            } catch (Exception e) {
                System.out.println(ANSI_RED + "Error: " + ANSI_RESET + "El valor ingresado no es un número.");
                sc.next();
                menu();
            }
        }

        if(control == 1){
            try{
                System.out.print("Ingrese su estatura en metros: ");
                estatura = sc.nextDouble();
                control = 2;
            } catch (Exception e){
                System.out.println(ANSI_RED + "Error: " + ANSI_RESET + "La estatura debe ser un número.");
                sc.next();
                menu();
            }
        }

        System.out.println("Su IMC es: " + calcularIMC(peso, estatura));

        System.out.println("Su clasificación es: " + getClasificacion() + ANSI_RESET);

        exit(0);
    }

    @Override
    public void ejecutar() {
        menu();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getImc() {
        return imc;
    }
}
