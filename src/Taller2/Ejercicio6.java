/*El taller de motos "El Maquinista" recibe motocicletas de alto cilindraje
para realizar las respectivas revisiones y requiere una aplicación que le
permita registrar los servicios generados a sus clientes.

Para cada motocicleta se debe tener registro del ingreso al taller y las
observaciones por parte del cliente. También debe existir registro de salida
del taller con las novedades y otra de arreglos hechos por el mecánico en caso
de que se requiera inventariar cambios repuestos en la motocicleta al entregarla.*/

package Taller2;

import Principal.Ejercicio;
import Taller2.Otras_Clases.Arreglo;
import Taller2.Otras_Clases.Motocicleta;

import java.util.ArrayList;

public class Ejercicio6 extends Ejercicio {

    private ArrayList<Motocicleta> motos = new ArrayList<>();

    private void menu(){
        System.out.println("Taller de motos " + ANSI_CYAN + "El Maquinista");
        System.out.println(ANSI_RESET + "1. Registrar entrada");
        System.out.println("2. Registrar salida");
        System.out.println("3. Registro arreglos");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");

        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                registrarMoto();
                break;
            case 2:
                registroSalida();
                break;
            case 3:
                registroArreglos();
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    public ArrayList<Motocicleta> getMotos() {
        return motos;
    }

    public void setMotos(ArrayList<Motocicleta> motos) {
        this.motos = motos;
    }

    public void agnadirMoto(Motocicleta moto){
        motos.add(moto);
    }

    public void mostrarMotosCorto(){
        for (int i = 0; i < motos.size(); i++) {
            System.out.println("Moto " + (i+1) + ": " + motos.get(i).getPlaca());
        }
    }

    public void mostrarMotoDetallada(int i){

        int idMoto = i-1;

        System.out.println("Placa: " + motos.get(idMoto).getPlaca());
        System.out.println("Marca: " + motos.get(idMoto).getMarca());
        System.out.println("Modelo: " + motos.get(idMoto).getModelo());
        System.out.println("Cilindraje: " + motos.get(idMoto).getCilindraje());
        System.out.println("Color: " + motos.get(idMoto).getColor());

        if(motos.get(idMoto).getTrabajos().isEmpty()){
            System.out.println("No hay trabajos registrados");
        }else{
            for(int j=0; j<motos.get(idMoto).getTrabajos().size(); j++){
                System.out.println("Trabajo " + (j+1) + ": " + motos.get(idMoto).getTrabajos().get(j).getTrabajo());
                System.out.println("Empleado: " + motos.get(idMoto).getTrabajos().get(j).getEmpleado());
                System.out.println("Fecha: " + motos.get(idMoto).getTrabajos().get(j).getFecha());
                System.out.println("Observaciones: " + motos.get(idMoto).getTrabajos().get(j).getObservaciones());
                System.out.println("Repuestos: " + motos.get(idMoto).getTrabajos().get(j).getRepuesto());
            }
        }
    }

    public void registrarMoto(){

        try{
            int tamagnoActual = motos.size();

            System.out.println("Ingrese los datos de la motocicleta");
            System.out.print("Placa: ");
            String placa = sc.next();
            System.out.print("Marca: ");
            String marca = sc.next();
            System.out.print("Modelo: ");
            String modelo = sc.next();
            System.out.print("Cilindraje: ");
            String cilindraje = sc.next();
            System.out.print("Color: ");
            String color = sc.next();

            Motocicleta moto = new Motocicleta(placa, marca, modelo, cilindraje, color);
            motos.add(moto);

            if(motos.size() > tamagnoActual){
                System.out.println("Moto registrada con éxito");
            }else{
                System.out.println("No se pudo registrar la moto");
            }

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            sc.next();
        }finally {
            System.out.println("--------------------------------");
            menu();
        }
    }

    public void registroSalida(){
        System.out.println(ANSI_CYAN + "Registro de salida" + ANSI_RESET);

        if(motos.isEmpty()){
            System.out.println(ANSI_RESET + "No hay motos registradas");
        }else{
            System.out.println("Seleccione la moto a la que se le va a registrar la salida");
            mostrarMotosCorto();
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            System.out.println("Ingrese las observaciones del cliente");
            String observaciones = sc.nextLine();

            //Se supone que solo debería haber una observación por trabajo, así que la última posición referencia al trabajo actual, por tanto, se agrega la observación a ese trabajo
            if(motos.get(opcion-1).getTrabajos().isEmpty()){
                System.out.println("No hay trabajos registrados");
            }else{
                System.out.println("Observaciones: " + observaciones);
                motos.get(opcion-1).getTrabajos().get(motos.get(opcion-1).getTrabajos().size()-1).setObservaciones(observaciones);
            }
        }
    }

    public void registroArreglos(){

        String trabajo = "";
        String empleado = "";
        String fecha = "";
        String repuesto = "";
        String costo = "";
        String observaciones = "";
        if(motos.isEmpty()){
            System.out.println(ANSI_RESET + "No hay motos registradas");
        }else{
            System.out.println("Seleccione la moto a la que se le va a registrar el arreglo");
            mostrarMotosCorto();
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            try{
                System.out.print("Ingrese el trabajo realizado:");
                trabajo = sc.next();
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
                sc.next();
            } finally {
                System.out.println("--------------------------------");
            }

            try{
                System.out.print("Ingrese el empleado que realizó el trabajo");
                empleado = sc.next();
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
                sc.next();
            } finally {
                System.out.println("--------------------------------");
            }

            try{
                System.out.print("Ingrese la fecha en la que se realizó el trabajo");
                fecha = sc.next();
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
                sc.next();
            } finally {
                System.out.println("--------------------------------");
            }

            try {
                System.out.print("Ingrese el repuesto utilizado");
                repuesto = sc.next();
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
                sc.next();
            } finally {
                System.out.println("--------------------------------");
            }

            try{
                System.out.print("Ingrese el costo total del trabajo");
                costo = sc.next();
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
                sc.next();
            } finally {
                System.out.println("--------------------------------");
            }

            try{
                System.out.print("Ingrese las observaciones del cliente");
                observaciones = sc.next();

                motos.get(opcion-1).agregarTrabajo(new Arreglo(empleado, trabajo, repuesto, costo, fecha, observaciones));
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
                sc.next();
            } finally {
                System.out.println("--------------------------------");
            }
        }
    }

    @Override
    public void ejecutar() {
        menu();
    }
}
