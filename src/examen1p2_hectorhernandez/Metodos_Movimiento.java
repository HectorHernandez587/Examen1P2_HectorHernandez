package examen1p2_hectorhernandez;

/**
 *
 * @author Hector
 */
public interface Metodos_Movimiento {
    public int [] mov (Object [][] matriz,int x1, int y1, int x2, int y2);
    public void mnt(Object [][] matriz, int x, int y);
    public void unmnt(Object [][] matriz, int x, int y);
    public int rot (int degrees, char or);
}
