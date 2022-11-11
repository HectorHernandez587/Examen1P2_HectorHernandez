package examen1p2_hectorhernandez;

/**
 *
 * @author Hector
 */
public class Movil_Agil extends Robot {
    private int capacidad;
    private int cant_llantas;
    private double velocidad_punta;

    public Movil_Agil() {
        super();
    }

    public Movil_Agil(int capacidad, int cant_llantas, double velocidad_punta, int id, int x, int y, boolean estado_carga, String fabricacion) {
        super(id, x, y, estado_carga, fabricacion);
        this.capacidad = capacidad;
        this.cant_llantas = cant_llantas;
        this.velocidad_punta = velocidad_punta;
    }

    public Movil_Agil(int cant_llantas, double velocidad_punta, int id, int x, int y, String fabricacion) {
        super(id, x, y, fabricacion);
        this.cant_llantas = cant_llantas;
        this.velocidad_punta = velocidad_punta;
    }
    

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCant_llantas() {
        return cant_llantas;
    }

    public void setCant_llantas(int cant_llantas) {
        this.cant_llantas = cant_llantas;
    }

    public double getVelocidad_punta() {
        return velocidad_punta;
    }

    public void setVelocidad_punta(double velocidad_punta) {
        this.velocidad_punta = velocidad_punta;
    }

    @Override
    public String toString() {
        return super.toString()+"Movil_Agil{" + "capacidad=" + capacidad + ", cant_llantas=" + cant_llantas + ", velocidad_punta=" + velocidad_punta + '}';
    }
    
    public int mov (int x1, int y1, int x2, int y2){
       
        return 0;
    }
    public void mnt(){
        
    }
    public void unmnt(){
        
    }
    public int rot (int degrees, char or){
        
        return 0;
    }
    
    
    
}
