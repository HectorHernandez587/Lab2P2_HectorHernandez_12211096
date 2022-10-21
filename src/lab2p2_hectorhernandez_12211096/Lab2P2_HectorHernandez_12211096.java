package lab2p2_hectorhernandez_12211096;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2P2_HectorHernandez_12211096 {

    static Random r = new Random();
    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {

        boolean bandera = true;
        ArrayList lista1 = new ArrayList();
        ArrayList lista2 = new ArrayList();
        while (bandera == true) {
            System.out.println("\n Roblox Corporation");
            System.out.println("-----MENU-----");
            System.out.println("1) Agregar Jugador ");
            System.out.println("2) Agregar Bot ");
            System.out.println("3) Agregar Item al Jugador ");
            System.out.println("4) Jugar ");
            System.out.println("5) Salir ");
            System.out.print("Ingrese la opcion que desee: ");
            int opcion = lea.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el nombre del jugador: ");
                    String nombre = lea.next();
                    Jugador j = new Jugador(nombre);
                    
                    if (lista1.contains(nombre)) {
                        System.out.println("Ese nombre ya existe");
                    } else {
                        lista1.add(j);
                    }
                    
                    System.out.println("Lista de Jugadores: \n" + lista1);
                }
                break;
                case 2: {
                    
                    System.out.println("Ingrese el nombre del bot: ");
                    String nombrebot = lea.next();
                    Bot b = new Bot(nombrebot);
                    if (lista2.contains(nombrebot)) {
                        System.out.println("Ese nombre ya existe");
                    } else {
                        lista2.add(b);
                    }
                    System.out.println("Lista de Jugadores: \n" + lista2);
                }
                break;
                case 3: {

                }
                break;
                case 4: {
                    Object[][] matriz = new Object[30][30];
                    System.out.println("Tablero de Juego: ");
                    Imprimir(Lectura());

                }
                break;
                case 5: {
                    bandera = false;
                }
                break;
                default: {
                    System.out.println("La opcion que escogiste no existe");
                }

            }//Fin Switch
        }//Fin While
    }//Fin Main

    public static Object[][] Lectura() {
        Object[][] llena = new Object[30][30];

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                llena[i][j] = " ";
            }
        }

        for (int i = 0; i < 300; i++) {
            int x = r.nextInt(29);
            int y = r.nextInt(29);
            llena[x][y] = "X";
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
    
}//Fin Public Class
