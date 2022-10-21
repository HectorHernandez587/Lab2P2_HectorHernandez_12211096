package lab2p2_hectorhernandez_12211096;


public class Item {
    String nombre;
    int precio;

    public Item(String nombre) {
        this.nombre = nombre;
        this.precio = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
