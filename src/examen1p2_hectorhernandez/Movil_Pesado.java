package examen1p2_hectorhernandez;

/**
 *
 * @author Hector
 */
public class Movil_Pesado extends Robot {
    private int capacidad;
    private double peso;

    public Movil_Pesado() {
        super();
    }

    public Movil_Pesado(int capacidad, double peso, int id, int x, int y, boolean estado_carga, String fabricacion) {
        super(id, x, y, estado_carga, fabricacion);
        this.capacidad = capacidad;
        this.peso = peso;
    }

    public Movil_Pesado(double peso, int id, int x, int y, String fabricacion) {
        super(id, x, y, fabricacion);
        this.peso = peso;
    }
    
    

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString()+"Movil_Pesado{" + "capacidad=" + capacidad + ", peso=" + peso + '}';
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
