/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tabla_matriz;

import java.util.Scanner;

/**
 *
 * @author JOHARCE
 */
public class Proyecto_Tabla_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        Listas list = new Listas();
        Menu entrada = new Menu();
        list.CargarMetalesAlcalinos();
        list.CargarAlcalinoterreos();
        list.CargarMetales();
        list.CargarOtrosMetales();
        list.CargarLantanidos();
        list.CargarActinidos();
        list.CargarMetaloides();
        list.CargarNoMetales();
        list.CargarHalogenos();
        list.CargarGases();
        Tabla.leertabla(list);
        entrada.menu();
       
    }

}