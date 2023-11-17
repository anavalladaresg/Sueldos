import java.util.Scanner;

/**
 * Funciones utilizadas en la clase Main
 * @author Ana Valladares
 * @version v1.0
 */

public class Funciones {
    /**
     * Comprueba si el sueldo está entre 1000 y 1750
     *
     * @param sueldo del trabajador
     * @return si está dentro del rango
     */
    public static Boolean obtenerSueldo1750(Double sueldo) {
        if (sueldo > 1000 && sueldo < 1750) {
            return true;
        }
        return false;
    }

    /**
     * Comprueba si el sueldo es menor que mil
     *
     * @param sueldo del trabajador
     * @return si es menor que 1000
     */
    public static Boolean obtenerSueldo1000(Double sueldo) {
        if (sueldo > 0 && sueldo < 1000) {
            return true;
        }
        return false;
    }

    public static Trabajador darAltaTrabajador() {
        Trabajador trabajador1 = new Trabajador();
        //trabajador1.setNombre("Pepe");
        //trabajador1.setSueldo(1200d);

        Scanner sc = new Scanner(System.in);
        trabajador1.setNombre(sc.nextLine());
        trabajador1.setSueldo(sc.nextDouble());

        return trabajador1;
    }
}
