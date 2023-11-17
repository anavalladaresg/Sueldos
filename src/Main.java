public class Main {
    static Integer contador1750 = 0;
    static Integer contador1000 = 0;
    static Integer contadorMas1750 = 0;

    /**
     * Aumenta contador según rango del sueldo del trabajador
     *
     * @param args no recibe parámetros
     */

    public static void main(String[] args) {
        Trabajador auxTrabajador;
        do {
            auxTrabajador = Funciones.darAltaTrabajador();
            actualizarContadores(auxTrabajador);
        } while (auxTrabajador.getSueldo() != 0);
        mostrarContadores();
    }

    /**
     * Aumenta contadores según rango
     */
    public static void actualizarContadores(Trabajador trabajador) {
        if (Funciones.obtenerSueldo1750(trabajador.getSueldo())) {
            contador1750++;
        } else if (Funciones.obtenerSueldo1000(trabajador.getSueldo())) {
            contador1000++;
        } else {
            contadorMas1750++;
        }
    }

    public static void mostrarContadores() {
        System.out.println("Entre 1000-1750: " + contador1750 + "\nMenos de 1000: " + contador1000 + "\nMás de 1750: " + contadorMas1750);
    }
}
