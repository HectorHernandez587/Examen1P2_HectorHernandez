package examen1p2_hectorhernandez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Examen1P2_HectorHernandez {

    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Robot> lista = new ArrayList();
        boolean bandera = true;
        while (bandera == true) {
            System.out.println("=========== MENU ===========");
            System.out.println("1) Crear Robot");
            System.out.println("2) Listar Robot");
            System.out.println("3) Simular Automáticamente");
            System.out.println("4) Actuar Manualmente");
            System.out.println("5) Salir");
            System.out.println("============================");
            System.out.print("Ingrese la opcion que desea: ");
            int opcionMenu = lea.nextInt();

            switch (opcionMenu) {
                case 1: {
                    Robot e = new Robot();
                    int pos = lista.size() - 1;

                    System.out.print("Ingrese el ID del Robot: ");
                    int id = lea.nextInt();
                    ((Robot) lista.get(pos)).setId(id);

                    System.out.print("Ingrese la posicion en X: ");
                    int x = lea.nextInt();
                    ((Robot) lista.get(pos)).setX(x);

                    System.out.print("Ingrese la posicion en Y: ");
                    int y = lea.nextInt();
                    ((Robot) lista.get(pos)).setY(y);

                    System.out.print("Ingrese el año de fabricación: ");
                    String fabricacion = lea.nextLine();
                    ((Robot) lista.get(pos)).setFabricacion(fabricacion);

                    boolean centinela = true;
                    while (centinela == true) {
                        System.out.println("===== Tipos de Robot =====");
                        System.out.println("1) Androides");
                        System.out.println("2) Manos Robóticas");
                        System.out.println("3) Móviles Ágiles");
                        System.out.println("4) Móviles Pesados");
                        System.out.println("5) Salir");
                        System.out.print("Ingrese el tipo de robot que desea: ");
                        int tp = lea.nextInt();

                        switch (tp) {
                            case 1: {
                                System.out.println("===== Androide =====");
                                System.out.print("Ingrese la altura: ");
                                double altura = lea.nextDouble();
                                ((Androide) lista.get(pos)).setAltura(altura);
                                System.out.print("Ingrese el peso: ");
                                double peso = lea.nextDouble();
                                ((Androide) lista.get(pos)).setPeso(peso);
                            }
                            break;
                            case 2: {
                                System.out.println("===== Manos Robóticas =====");
                                System.out.print("Ingrese el numero de Servo Motores: ");
                                int num_servomotores = lea.nextInt();
                                ((Mano_Robotica) lista.get(pos)).setNum_servomotores(num_servomotores);
                            }
                            break;
                            case 3: {
                                System.out.println("===== Móviles Ágiles =====");
                                System.out.print("Ingrese la cantidad de llantas: ");
                                int cant_llantas = lea.nextInt();
                                ((Movil_Agil) lista.get(pos)).setCant_llantas(cant_llantas);

                                System.out.print("Ingrese la velocidad punta: ");
                                double velocidad_punta = lea.nextDouble();
                                ((Movil_Agil) lista.get(pos)).setVelocidad_punta(velocidad_punta);
                            }
                            break;
                            case 4: {
                                System.out.println("===== Móviles Pesados =====");
                                System.out.print("Ingrese el peso: ");
                                double peso = lea.nextDouble();
                                ((Movil_Pesado) lista.get(pos)).setPeso(peso);
                            }
                            break;
                            case 5: {
                                centinela = false;
                            }
                            break;
                            default: {
                                System.out.println("La opcion que ingresaste no existe");
                            }
                        }//Fin Switch 2
                    }//Fin while 2
                }
                break;
                case 2: {

                }
                break;
                case 3: {
                    Object[][] matriz = new Object[8][8];
                    System.out.println("===== MAPA =====");
                    Imprimir(Lectura());
                    System.out.println("================");
                }
                break;
                case 4: {
                    Object[][] matriz = new Object[8][8];
                    System.out.println("===== MAPA =====");
                    Imprimir(Lectura());
                    System.out.println("================");
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
        for (int i = 0; i < 15; i++) {
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
