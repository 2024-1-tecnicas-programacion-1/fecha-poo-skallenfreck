package com.mycompany.fecha.poo;

import java.util.Scanner;

/**
 * clase Principal
 */

public class Principal {
    
     /**
     * Método inicial que es ejecutado
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor diligencie el dia");
        Integer dia = sc.nextInt();
        System.out.println("Por favor diligencie el mes");
        Integer mes = sc.nextInt();
        System.out.println("Por favor diligencie el año");
        Integer ano = sc.nextInt();
        
        Fecha fecha = new Fecha(dia, mes, ano);
        System.out.println(fecha.fechaCorta());
        System.out.println(fecha.validarFecha());
        System.out.println(fecha.mesLetra());
        System.out.println(fecha.fechaLarga());
    
    }
}
