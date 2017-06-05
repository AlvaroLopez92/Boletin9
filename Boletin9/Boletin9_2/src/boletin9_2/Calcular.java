/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author alvar
 */
public class Calcular {
    
    public String calcular(){
        double multiplicacion=1;
        int sumar=0;
        
        for(int i=10;i<=90;i++){
            sumar=sumar+i;
            multiplicacion=multiplicacion*i;
        }
        return "La suma es "+sumar+"\nEl producto es "+multiplicacion;
    }
}
