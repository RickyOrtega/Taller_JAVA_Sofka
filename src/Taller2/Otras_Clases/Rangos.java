package Taller2.Otras_Clases;

import Principal.Coloreable;

public interface Rangos extends Coloreable {
    //Constantes para los rangos
    String RANGO_BAJO_PESO = ANSI_YELLOW + "Bajo peso";
    String RANGO_NORMAL = ANSI_GREEN + "Normal";
    String RANGO_SOBREPESO = ANSI_YELLOW + "Sobrepeso";
    String RANGO_OBESO_I = ANSI_RED + "Obesidad grado I";
    String RANGO_OBESO_II = ANSI_RED + "Obesidad grado II";
    String RANGO_OBESO_III = ANSI_RED + "Obesidad grado III";

    //Constantes para los valores de los rangos
    double RANGO_BAJO_PESO_MIN = 0;
    double RANGO_BAJO_PESO_MAX = 18.4;
    double RANGO_NORMAL_MIN = 18.5;
    double RANGO_NORMAL_MAX = 24.9;
    double RANGO_SOBREPESO_MIN = 25;
    double RANGO_SOBREPESO_MAX = 29.9;
    double RANGO_OBESO_I_MIN = 30;
    double RANGO_OBESO_I_MAX = 34.9;
    double RANGO_OBESO_II_MIN = 35;
    double RANGO_OBESO_II_MAX = 39.9;
    double RANGO_OBESO_III_MIN = 40;
}