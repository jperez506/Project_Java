/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tabla_matriz;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JOHARCE
 */
public class Menu extends Tabla {

    Listas list = new Listas();

    public void menu() {
        int op = 0;
        boolean bandera = true;
        boolean bandera2 = true;
        Scanner sa = new Scanner(System.in);
        do {
            while (bandera) {
                try {

                    System.out.println(" Seleccione la reaccion que quiere: \n"
                            + "1 Óxido Metálico" + "\n"
                            + "2 Óxido No Metálico" + "\n"
                            + "3 Hidruros Metálicos" + "\n"
                            + "4 Hidrácidos" + "\n"
                            + "5 Hidróxidos \n"
                            + "6 Reacción aleatoria \n"
                    );

                    int n = sa.nextInt();
                    if (n < 1) {
                        System.out.println("El valor introducido es inconrrecto");
                    }
                    if (n > 6) {
                        System.out.println("El valor introducido es inconrrecto");
                    }
                    switch (n) {
                        case 1:
                            System.out.println("Digite número Elemento");
                            int elemento1 = sa.nextInt();
                            System.out.println("Digite la valencia");
                            int valencia2 = sa.nextInt();
                            Tipos.OxidoMetalico(elemento1, valencia2, list);
                            break;
                        case 2:
                            System.out.println("Digite el numero elemento");
                            int elemento = sa.nextInt();
                            System.out.println("Digite la valencia");
                            int valencia1 = sa.nextInt();
                            Tipos.OxidoNOMetalico(elemento, valencia1, list);
                            break;
                        case 3:
                            System.out.println("Digite el numero elemento");
                            int elemento2 = sa.nextInt();
                            System.out.println("Digite la valencia");
                            int valencia3 = sa.nextInt();
                            Tipos.HidruroMetalico(elemento2, valencia3, list);
                            break;

                        case 4:
                            System.out.println("Digite el numero elemento");
                            int elemento4 = sa.nextInt();
                            System.
                                    out.println("Digite la valencia");
                            int valencia4 = sa.nextInt();
                            Tipos.Hidracidos(elemento4, valencia4, list);
                            break;
                        case 5:
                            System.out.println("Digite el numero elemento");
                            int elemento5 = sa.nextInt();
                            System.out.println("Digite la valencia");
                            int valencia5 = sa.nextInt();
                            Tipos.Hidroxidos(elemento5, valencia5, list);
                            break;
                        case 6:
                            
                            int elemento6 = (int) (Math.random() * 118) + 1;
                            
                            int valencia6 = (int) (Math.random() * 3) + 1;
                            
                            Tipos.Hidroxidos(elemento6, valencia6, list);
                            break;
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("No es un número");
                    bandera = false;
                    menu();

                }

            }
        } while (op != 10);

    }
}
