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

    public Mano_Robotica(int num_servomotores, int id, int x, int y, String fabricacion) {
        super(id, x, y, fabricacion);
        this.num_servomotores = num_servomotores;
    }
    

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad == 1) {
            this.capacidad = capacidad;
        }
        
    }

    public int getNum_servomotores() {
        return num_servomotores;
    }

    public void setNum_servomotores(int num_servomotores) {
        this.num_servomotores = num_servomotores;
    }

    @Override
    public String toString() {
        return super.toString()+"Mano_Robotica{" + "capacidad=" + capacidad + ", num_servomotores=" + num_servomotores + '}';
    }
    
    public int[] mov(Object[][] matriz, int x1, int y1, int x2, int y2) {
        int[] pos = new int[2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[x2][y2] == "X") {

                } else if (matriz[x2][y2] == " " || matriz[x2][y2] == "C") {
                    x1 = x2;
                    y1 = y2;
                    pos[0] = x1;
                    pos[1] = y2;
                }
            }
        }
        return pos;
    }
    public void mnt(){
        
    }
    public void unmnt(){
        
    }
    public int rot (int degrees, char or){
        
        return 0;
    }
    
    
    
}
