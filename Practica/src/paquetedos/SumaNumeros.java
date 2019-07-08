/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

/**
 *
 * @author Leonardo Aguilar
 */
public class SumaNumeros {
    
    public static int obtenerSumaDos(int v){
        if(v <= 0){
            return 0;
        }else{
            return v + obtenerSumaDos(v-1);
        }
    }
    
    public static int obtenerSumaUno(int v){
        int suma = 0;
        for(int i = 1; i <= v; i++){
            suma = suma + i;
        }
        return suma;
    }
    
}
