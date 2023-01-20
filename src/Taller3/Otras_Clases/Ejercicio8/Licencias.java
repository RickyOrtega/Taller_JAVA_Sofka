//A1: Motos de bajo cilindraje.
//A2: Motos de alto cilindraje.
//B1: Autos particulares.
//B2: Camiones y buses de uso particular.
//B3: Vehículos articulados particulares.
//C1: Autos pequeños de servicio público.
//C2: Autos grandes de servicio público.
//C3: Vehículos articulados de servicio público.

package Taller3.Otras_Clases.Ejercicio8;

public class Licencias {
    private static Licencia[] licencias = new Licencia[8];
    private static int cantidadLicencias = 0;

    private static Licencia A1 = new Licencia("A1", "Licencia para motocicletas de hasta 125 cc");
    private static Licencia A2 = new Licencia("A2", "Licencia para motocicletas de más de 125 cc");
    private static Licencia B1 = new Licencia("B1", "Licencia para automóviles particulares");
    private static Licencia B2 = new Licencia("B2", "Licencia para camiones y buses de uso particular");
    private static Licencia B3 = new Licencia("B3", "Licencia para vehículos articulados particulares");
    private static Licencia C1 = new Licencia("C1", "Licencia para automóviles pequeños de servicio público");
    private static Licencia C2 = new Licencia("C2", "Licencia para automóviles grandes de servicio público");
    private static Licencia C3 = new Licencia("C3", "Licencia para vehículos articulados de servicio público");

    public static void agregarLicencia(Licencia licencia) {
        if (cantidadLicencias < 8) {
            licencias[cantidadLicencias] = licencia;
            cantidadLicencias++;
        }
    }

    public static void consultarLicencias() {
        if(cantidadLicencias > 0) {
            for (int i = 0; i < cantidadLicencias; i++) {
                System.out.println(licencias[i].getTipo() + " - " + licencias[i].getDescripcion());
            }
        } else {
            System.out.println("No hay licencias registradas");
        }
    }

    public static Licencia getLicencia(String tipo) {
        for (int i = 0; i < cantidadLicencias; i++) {
            if (licencias[i].getTipo().equals(tipo)) {
                return licencias[i];
            }
        }
        return null;
    }

    public static Licencia getA1() {
        return A1;
    }

    public static Licencia getA2() {
        return A2;
    }

    public static Licencia getB1() {
        return B1;
    }

    public static Licencia getB2() {
        return B2;
    }

    public static Licencia getB3() {
        return B3;
    }

    public static Licencia getC1() {
        return C1;
    }

    public static Licencia getC2() {
        return C2;
    }

    public static Licencia getC3() {
        return C3;
    }
}