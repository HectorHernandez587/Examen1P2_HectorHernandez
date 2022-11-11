package examen1p2_hectorhernandez;

/**
 *
 * @author Hector
 */
public class Mano_Robotica extends Robot {
    private int capacidad;
    private int num_servomotores;

    public Mano_Robotica() {
        super();
    }

    public Mano_Robotica(int capacidad, int num_servomotores, int id, int x, int y, boolean estado_carga, String fabricacion) {
        super(id, x, y, estado_carga, fabricacion);
        this.capacidad = capacidad;
        this.num_servomotores = num_servomotores;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNum_servomotores() {
        return num_servomotores;
    }

    public void setNum_servomotores(int num_servomotores) {
        this.num_servomotores = num_servomotores;
    }

    @Override
    public String toString() {
        return "Mano_Robotica{" + "capacidad=" + capacidad + ", num_servomotores=" + num_servomotores + '}';
    }
    
    
    
    
}
