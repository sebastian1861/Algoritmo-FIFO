
package simulador.fifo;

public class Proceso {

    public enum Estado {
        NUEVO, ESPERA, EJECUCION, TERMINADO, RECHAZADO
    }

    private static int contador = 1;

    private int id;
    private int tamano;
    private int tiempo;
    private Estado estado;

    public Proceso() {
        this.id = contador++;

        // Tamaño aleatorio (10 - 500 MB)
        this.tamano = (int)(Math.random() * 491) + 10;

        // Tiempo entre 10 y 35 en múltiplos de 5
        int[] tiempos = {10, 15, 20, 25, 30, 35};
        this.tiempo = tiempos[(int)(Math.random() * tiempos.length)];

        this.estado = Estado.NUEVO;
    }

    public int getId() { return id; }
    public int getTamano() { return tamano; }
    public int getTiempo() { return tiempo; }
    public Estado getEstado() { return estado; }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public static void reset() {
        contador = 1;
    }
}