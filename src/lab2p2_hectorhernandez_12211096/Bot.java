package lab2p2_hectorhernandez_12211096;


public class Bot {
    String nombre;
    int velocidad;
    
    String audiopostmortem;

    public Bot(String nombre) {
        this.nombre = nombre;
        this.velocidad = 0;
        this.audiopostmortem = "*Audio Post Mortem*";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
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
