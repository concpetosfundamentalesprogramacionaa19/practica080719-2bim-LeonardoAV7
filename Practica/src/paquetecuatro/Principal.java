/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecuatro;

/**
 *
 * @author Leonardo Aguilar
 */
public class Principal {
    public static void main(String[] args) {
        int [] arreglo = {10, 20, 30, 1, 2, 3, 40, 4};
        
        int tamaño1 = TamañoArreglo.obtenerTamanioArreglo(arreglo,
                arreglo.length);
        int tamaño2 = TamañoArreglo.obtenerTamanioArreglo2(arreglo,
                arreglo.length);
        
        System.out.printf("Tamanio del arreglo 1: %d\nTamanio del arreglo 2:"
                + " %d\n", tamaño1, tamaño2);
        
        
    }
}
