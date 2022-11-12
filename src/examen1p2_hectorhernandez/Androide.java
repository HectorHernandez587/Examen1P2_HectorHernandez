package examen1p2_hectorhernandez;

/**
 *
 * @author Hector
 */
public class Androide extends Robot {
    private int capacidad;
    private double altura;
    private double peso;

    public Androide() {
        super();
    }

    public Androide(int capacidad, double altura, double peso, int id, int x, int y, boolean estado_carga, String fabricacion) {
        super(id, x, y, estado_carga, fabricacion);
        this.capacidad = capacidad;
        this.altura = altura;
        this.peso = peso;
    }

    public Androide(double altura, double peso, int id, int x, int y, String fabricacion) {
        super(id, x, y, fabricacion);
        this.altura = altura;
        this.peso = peso;
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad > 0 && capacidad <= 2) {
            this.capacidad = capacidad;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString()+"Androide{" + "capacidad=" + capacidad + ", altura=" + altura + ", peso=" + peso + '}';
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
