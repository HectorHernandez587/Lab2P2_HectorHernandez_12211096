package lab2p2_hectorhernandez_12211096;


public class Jugador {
    String nombre;
    int victorias;
    int dinero;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.victorias = 0;
        this.dinero = 0;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

}
