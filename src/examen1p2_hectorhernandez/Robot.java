package examen1p2_hectorhernandez;

/**
 *
 * @author Hector
 */
public class Robot {
    private int id;
    private int x;
    private int y;
    private boolean estado_carga;
    private String fabricacion;

    public Robot() {
    }

    public Robot(int id, int x, int y, boolean estado_carga, String fabricacion) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.estado_carga = estado_carga;
        this.fabricacion = fabricacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isEstado_carga() {
        return estado_carga;
    }

    public void setEstado_carga(boolean estado_carga) {
        this.estado_carga = estado_carga;
    }

    public String getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(String fabricacion) {
        this.fabricacion = fabricacion;
    }

    @Override
    public String toString() {
        return "Robot{" + "id=" + id + ", x=" + x + ", y=" + y + ", estado_carga=" + estado_carga + ", fabricacion=" + fabricacion + '}';
    }
    
    
}
