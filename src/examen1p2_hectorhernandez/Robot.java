package examen1p2_hectorhernandez;

/**
 *
 * @author Hector
 */
public abstract class Robot implements Metodos_Movimiento {
    int id;
    int x;
    int y;
    boolean estado_carga;
    String fabricacion;

    public Robot() {
    }

    public Robot(int id, int x, int y, boolean estado_carga, String fabricacion) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.estado_carga = estado_carga;
        this.fabricacion = fabricacion;
    }

    public Robot(int id, int x, int y, String fabricacion) {
        this.id = id;
        this.x = x;
        this.y = y;
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
        if(x > 0 && x <= 8){
            this.x = x;
        } 
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y > 0 && y <= 8){
            this.y = y;
        } 
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
