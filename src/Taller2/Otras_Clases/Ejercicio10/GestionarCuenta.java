package Taller2.Otras_Clases.Ejercicio10;

public class GestionarCuenta {

    public static void ingresar(CuentaBancaria cuenta, double cantidad) {
        if (cantidad > 0) {
            cuenta.setCantidad(cuenta.getCantidad() + cantidad);
        } else {
            System.out.println("No se puede ingresar una cantidad negativa");
        }
    }

    public static void retirar(CuentaBancaria cuenta, double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= cuenta.getCantidad()) {
                cuenta.setCantidad(cuenta.getCantidad() - cantidad);
            } else {
                System.out.println("No se puede retirar una cantidad mayor a la que tiene en la cuenta");
            }
        } else {
            System.out.println("No se puede retirar una cantidad negativa");
        }
    }

    public static void consultar(CuentaBancaria cuenta) {
        System.out.println("El titular de la cuenta es: " + cuenta.getTitular());
        System.out.println("La cantidad en la cuenta es: " + cuenta.getCantidad());
    }
}
