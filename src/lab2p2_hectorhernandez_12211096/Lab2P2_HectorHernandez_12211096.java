package lab2p2_hectorhernandez_12211096;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2P2_HectorHernandez_12211096 {

    static Random r = new Random();
    static Scanner lea = new Scanner(System.in);
    static ArrayList <Jugador> listaj = new ArrayList();
    static ArrayList <Bot> listab = new ArrayList();
    static ArrayList <Item> listai = new ArrayList();

    public static void main(String[] args) {

        boolean bandera = true;
        
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
            
            //Jugadores Predeterminados
            listaj.add(new Jugador('a'));
            listaj.add(new Jugador('b'));
            listaj.add(new Jugador('c'));
            listaj.add(new Jugador('d'));
            
            //Bot Predeterminados
            listab.add(new Bot('Q'));
            listab.add(new Bot('W'));
            

            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el nombre del jugador: ");
                    char nombre = lea.next().charAt(0);
                    Jugador j = new Jugador(nombre);
                    boolean centinela = true;
                    for (Jugador jugador : listaj) {
                        if (jugador.getNombre() == nombre) {
                            centinela = false;
                        }
                    }
                    if (centinela == true) {
                        listaj.add(j);
                        System.out.println("Jugador Agregado con exito");
                    } else {
                        System.out.println("Ese nombre ya existe, ingrese otro diferente");
                    }
                    System.out.println("Lista de Jugadores: \n" + listaj);

                }
                break;
                case 2: {
                    System.out.println("Ingrese el nombre del bot: ");
                    char nombrebot = lea.next().charAt(0);
                    Bot b = new Bot(nombrebot);
                    boolean vuelta = true;
                    for (Bot bot : listab) {
                        if (bot.getNombre() == nombrebot) {
                            vuelta = false;
                        }
                    }
                    if (vuelta == true) {
                        listab.add(b);
                        System.out.println("Bot Agregado con exito");
                    } else {
                        System.out.println("Ese nombre ya existe, ingrese otro diferente");
                    }
                }
                break;
                case 3: {
                    System.out.println("Items Disponibles y sus Precios: ");
                    System.out.println("1) Cola: 60");
                    System.out.println("2) Acelerador: 30");
                    System.out.println("3) Mina: 45");
                    System.out.println("4) Iluminador: 45");
                    System.out.println("5) Detector: 30");
                    System.out.println("Ingrese el nombre del Item: ");
                    String item = lea.next();
                    Item i = new Item(item);
                    
                    System.out.println("Lista de Items: \n" + listab);

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
        int contador = 0;
        for (int i = 0; i < 12; i++) {
            int x = r.nextInt(29);
            int y = r.nextInt(29);
            if (contador < listaj.size()) {
                llena[x][y] = listaj.get(contador).getNombre();
                contador++;
            }
        }
        int contador2 = 0;
        for (int i = 0; i < 12; i++) {
            int x = r.nextInt(29);
            int y = r.nextInt(29);
            if (contador2 < listab.size()) {
                llena[x][y] = listab.get(contador2).getNombre();
                contador2++;
            }
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
