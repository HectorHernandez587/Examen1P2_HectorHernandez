package examen1p2_hectorhernandez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Examen1P2_HectorHernandez {
    static Scanner lea = new Scanner (System.in);
    static Random r = new Random();
    
    ArrayList <Robot> lista = new ArrayList();

    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean bandera = true;
        while (bandera == true){
            System.out.println("=========== MENU ===========");
            System.out.println("1) Crear Robot");
            System.out.println("2) Listar Robot");
            System.out.println("3) Simular Automáticamente");
            System.out.println("4) Actuar Manualmente");
            System.out.println("5) Salir");
            System.out.println("============================");
            System.out.print("Ingrese la opcion que desea: ");
            int opcionMenu = lea.nextInt();
            
            switch(opcionMenu) {
                case 1: {
                    
                }
                break;
                case 2: {
                    
                }
                break;
                case 3: {
                    Object[][] matriz = new Object[8][8];
                    System.out.println("===== MAPA =====");
                    Imprimir(Lectura());
                    
                }
                break;
                case 4: {
                    
                }
                break;
                case 5: {
                    System.out.println("Has salido del programa!");
                    bandera = false;
                }
                break;
                default: {
                    System.out.println("La opcion que ingresaste no existe man");
                }
                break;
            }//Fin switch 1
        }//Fin While 1
        
    }//Fin main
    
    public static Object[][] Lectura() {
        Object[][] llena = new Object[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                llena[i][j] = " ";
            }
        }
        for (int i = 0; i < 20; i++) {
            int x = r.nextInt(7);
            int y = r.nextInt(7);
            llena[x][y] = "X";
        }
        for (int i = 0; i < 10; i++) {
            int x = r.nextInt(7);
            int y = r.nextInt(7);
            llena[x][y] = "C";
        }
        return llena;
    }

    public static void Imprimir(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]" + " ");
            }
            System.out.println();
        }
    }
    
}//Fin class
