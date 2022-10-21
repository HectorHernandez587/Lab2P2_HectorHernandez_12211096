package lab2p2_hectorhernandez_12211096;


public class Bot {
    char nombre;
    int velocidad;
    
    String audiopostmortem;

    public Bot(char nombre) {
        this.nombre = nombre;
        this.velocidad = 0;
        this.audiopostmortem = "*Audio Post Mortem*";
    }

    @Override
    public String toString() {
        return "Bot{" + "nombre=" + nombre + '}';
    }
    

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getAudiopostmortem() {
        return audiopostmortem;
    }

    public void setAudiopostmortem(String audiopostmortem) {
        this.audiopostmortem = audiopostmortem;
    }

    

    
            
    
}
