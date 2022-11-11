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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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
    
    
    
    
}
