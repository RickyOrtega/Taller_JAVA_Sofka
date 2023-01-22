package Principal;

import java.util.InputMismatchException;

public class Menu extends Ejercicio {

    private void menu() {
        int taller = 0;
        int ejercicio = 0;

        System.out.println("Vamos a mostrar los talleres:");
        System.out.println("1. Taller de Secuenciales.");
        System.out.println("2. Taller de Condicionales.");
        System.out.println("3. Taller de Ciclos.");
        System.out.println("4. Taller de Arreglos.");
        System.out.print("Ingrese el número del taller que desea ver: ");

        try {
            taller = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("El número del taller debe ser un número entero");
            sc.next();
            menu();
        }

        switch (taller) {
            case 1:
                System.out.println("Vamos a mostrar los ejercicios del taller de secuenciales:");
                System.out.println("1. Ejercicio 1.");
                System.out.println("2. Ejercicio 2.");
                System.out.println("3. Ejercicio 3.");
                System.out.println("4. Ejercicio 4.");
                System.out.println("5. Ejercicio 5.");
                System.out.println("6. Ejercicio 6.");
                System.out.println("7. Ejercicio 7.");
                System.out.println("8. Ejercicio 8.");
                System.out.println("9. Ejercicio 9.");
                System.out.println("10. Ejercicio 10.");
                System.out.print("Ingrese el número del ejercicio que desea ver: ");

                try {
                    ejercicio = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("El número del ejercicio debe ser un número entero");
                    sc.next();
                    menu();
                }

                switch (ejercicio) {
                    case 1:
                        Taller1.Ejercicio1 t1ejercicio1 = new Taller1.Ejercicio1();
                        t1ejercicio1.ejecutar();
                        break;
                    case 2:
                        Taller1.Ejercicio2 t1ejercicio2 = new Taller1.Ejercicio2();
                        t1ejercicio2.ejecutar();
                        break;
                    case 3:
                        Taller1.Ejercicio3 t1ejercicio3 = new Taller1.Ejercicio3();
                        t1ejercicio3.ejecutar();
                        break;
                    case 4:
                        Taller1.Ejercicio4 t1ejercicio4 = new Taller1.Ejercicio4();
                        t1ejercicio4.ejecutar();
                        break;
                    case 5:
                        Taller1.Ejercicio5 t1ejercicio5 = new Taller1.Ejercicio5();
                        t1ejercicio5.ejecutar();
                        break;
                    default:
                        System.out.println("El número del ejercicio no es válido");

                }
                break;
            case 2:
                System.out.println("Vamos a mostrar los ejercicios del taller de condicionales:");
                System.out.println("1. Ejercicio 1.");
                System.out.println("2. Ejercicio 2.");
                System.out.println("3. Ejercicio 3.");
                System.out.println("4. Ejercicio 4.");
                System.out.println("5. Ejercicio 5.");
                System.out.println("6. Ejercicio 6.");
                System.out.println("7. Ejercicio 7.");
                System.out.println("8. Ejercicio 8.");
                System.out.println("9. Ejercicio 9.");
                System.out.println("10. Ejercicio 10.");
                System.out.print("Ingrese el número del ejercicio que desea ver: ");

                try {
                    ejercicio = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("El número del ejercicio debe ser un número entero");
                    sc.next();
                    menu();
                }

                switch (ejercicio) {
                    case 1:
                        Taller2.Ejercicio1 t2ejercicio1 = new Taller2.Ejercicio1();
                        t2ejercicio1.ejecutar();
                        break;
                    case 2:
                        Taller2.Ejercicio2 t2ejercicio2 = new Taller2.Ejercicio2();
                        t2ejercicio2.ejecutar();
                        break;
                    case 3:
                        Taller2.Ejercicio3 t2ejercicio3 = new Taller2.Ejercicio3();
                        t2ejercicio3.ejecutar();
                        break;
                    case 4:
                        Taller2.Ejercicio4 t2ejercicio4 = new Taller2.Ejercicio4();
                        t2ejercicio4.ejecutar();
                        break;
                    case 5:
                        Taller2.Ejercicio5 t2ejercicio5 = new Taller2.Ejercicio5();
                        t2ejercicio5.ejecutar();
                        break;
                    case 6:
                        Taller2.Ejercicio6 t2ejercicio6 = new Taller2.Ejercicio6();
                        t2ejercicio6.ejecutar();
                        break;
                    case 7:
                        Taller2.Ejercicio7 t2ejercicio7 = new Taller2.Ejercicio7();
                        t2ejercicio7.ejecutar();
                        break;

                    case 8:
                        Taller2.Ejercicio8 t2ejercicio8 = new Taller2.Ejercicio8();
                        t2ejercicio8.ejecutar();
                        break;

                    case 9:
                        Taller2.Ejercicio9 t2ejercicio9 = new Taller2.Ejercicio9();
                        t2ejercicio9.ejecutar();
                        break;

                    case 10:
                        Taller2.Ejercicio10 t2ejercicio10 = new Taller2.Ejercicio10();
                        t2ejercicio10.ejecutar();
                        break;
                    default:
                        System.out.println("El número del ejercicio no es válido");

                }
                break;

            case 3:
                System.out.println("Vamos a mostrar los ejercicios del taller de ciclos:");
                System.out.println("1. Ejercicio 1.");
                System.out.println("2. Ejercicio 2.");
                System.out.println("3. Ejercicio 3.");
                System.out.println("4. Ejercicio 4.");
                System.out.println("5. Ejercicio 5.");
                System.out.println("6. Ejercicio 6.");
                System.out.println("7. Ejercicio 7.");
                System.out.println("8. Ejercicio 8.");
                System.out.print("Ingrese el número del ejercicio que desea ver: ");

                try {
                    ejercicio = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("El número del ejercicio debe ser un número entero");
                    sc.next();
                    menu();
                }

                switch (ejercicio) {
                    case 1:
                        Taller3.Ejercicio1 t3ejercicio1 = new Taller3.Ejercicio1();
                        t3ejercicio1.ejecutar();
                        break;
                    case 2:
                        Taller3.Ejercicio2 t3ejercicio2 = new Taller3.Ejercicio2();
                        t3ejercicio2.ejecutar();
                        break;
                    case 3:
                        Taller3.Ejercicio3 t3ejercicio3 = new Taller3.Ejercicio3();
                        t3ejercicio3.ejecutar();
                        break;
                    case 4:
                        Taller3.Ejercicio4 t3ejercicio4 = new Taller3.Ejercicio4();
                        t3ejercicio4.ejecutar();
                        break;
                    case 5:
                        Taller3.Ejercicio5 t3ejercicio5 = new Taller3.Ejercicio5();
                        t3ejercicio5.ejecutar();
                        break;
                    case 6:
                        Taller3.Ejercicio6 t3ejercicio6 = new Taller3.Ejercicio6();
                        t3ejercicio6.ejecutar();
                        break;
                    case 7:
                        Taller3.Ejercicio7 t3ejercicio7 = new Taller3.Ejercicio7();
                        t3ejercicio7.ejecutar();
                        break;
                    case 8:
                        Taller3.Ejercicio8 t3ejercicio8 = new Taller3.Ejercicio8();
                        t3ejercicio8.ejecutar();
                        break;
                    default:
                        System.out.println("El número del ejercicio no es válido");

                }
                break;
            case 4:
                System.out.println("Vamos a mostrar los ejercicios del taller de arreglos:");
                System.out.println("1. Ejercicio 1.");
                System.out.println("2. Ejercicio 2.");
                System.out.println("3. Ejercicio 3.");
                System.out.println("4. Ejercicio 4.");
                System.out.println("5. Ejercicio 5.");
                System.out.print("Ingrese el número del ejercicio que desea ver: ");

                try {
                    ejercicio = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("El número del ejercicio debe ser un número entero");
                    sc.next();
                    menu();
                }

                switch (ejercicio) {
                    case 1:
                        Taller4.Ejercicio1 t4ejercicio1 = new Taller4.Ejercicio1();
                        t4ejercicio1.ejecutar();
                        break;
                    case 2:
                        Taller4.Ejercicio2 t4ejercicio2 = new Taller4.Ejercicio2();
                        t4ejercicio2.ejecutar();
                        break;
                    case 3:
                        Taller4.Ejercicio3 t4ejercicio3 = new Taller4.Ejercicio3();
                        t4ejercicio3.ejecutar();
                        break;
                    case 4:
                        Taller4.Ejercicio4 t4ejercicio4 = new Taller4.Ejercicio4();
                        t4ejercicio4.ejecutar();
                        break;
                    case 5:
                        Taller4.Ejercicio5 t4ejercicio5 = new Taller4.Ejercicio5();
                        t4ejercicio5.ejecutar();
                        break;
                    default:
                        System.out.println("El número del ejercicio no es válido");
                }
                break;
        }
    }

    @Override
    public void ejecutar() {
        menu();
    }
}