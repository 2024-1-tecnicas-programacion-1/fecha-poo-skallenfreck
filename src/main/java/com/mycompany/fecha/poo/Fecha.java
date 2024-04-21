package com.mycompany.fecha.poo;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * clase Fecha
 */

public class Fecha {

    private Integer dia = 0;
    private Integer mes = 0;
    private Integer ano = 0;

    private HashMap<Integer, String> letra = new HashMap<>();
    private LinkedList<Integer> mesUno = new LinkedList<>();
    private LinkedList<Integer> mesDos = new LinkedList<>();
    
    /**
     * Método constuctor para inicializar los atributos de la clase
     * @param dia dia leído por consola
     * @param mes mes leído por consola
     * @param ano año leído por consola
     *
     * Complejidad temporal: O(1) Tiempo constante
     */

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        letra.put(1, "Enero");
        letra.put(2, "Frebrero");
        letra.put(3, "Marzo");
        letra.put(4, "Abril");
        letra.put(5, "Mayo");
        letra.put(6, "Junio");
        letra.put(7, "Julio");
        letra.put(8, "Agosto");
        letra.put(9, "Septiembre");
        letra.put(10, "Octubre");
        letra.put(11, "Noviembre");
        letra.put(12, "Diciembre");
        
        mesUno.add(1);
        mesUno.add(3);
        mesUno.add(5);
        mesUno.add(7);
        mesUno.add(8);
        mesUno.add(10);
        mesUno.add(12);

        mesDos.add(4);
        mesDos.add(6);
        mesDos.add(9);
        mesDos.add(11);

    }

     /**
     * Método que imprime por consola las variables dia, mes y ano 
     * en el formato dia/mes/ano
     * @param dia
     * @param mes
     * @param ano
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    
    String fechaCorta() {
        return dia + "/" + mes + "/" + ano;
    }

     /**
     * Método que permite validar si los valores que fueron asignados a las
     * variables dias y mes corresponden a una fecha posible o real, sin tener 
     * en cuenta los años bisiestos
     * @param mes
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    
    boolean validarFecha() {
        if (mesUno.contains(mes) && dia < 32) {
            return true;
        }else if(mesDos.contains(mes)&&dia<31){
        return true;
        }
        return false;

    }

    /**
     * Método que permite imprimir la variable mes en formato alfabético e 
     * indicar si el mes leído existe
     * @param mes
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    
    String mesLetra() {
        if (letra.containsKey(mes)) {
            return letra.get(mes);
        } else {
            return "El mes escrito no existe";
        }
    }

     /**
     * Método que imprime por consola las variables dia, mes y ano 
     * en el formato dia "de" mes "de" ano, o en caso posible, si 
     * el mes no existe unicamente dia "de" ano
     * @param dia
     * @param mes
     * @param ano
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    
    String fechaLarga() {
        if (letra.containsKey(mes)) {
            return dia + " de " + letra.get(mes) + " de " + ano;
        } else {
            return dia + " de " + ano;
        }
    }
}
