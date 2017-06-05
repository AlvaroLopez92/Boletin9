/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

/**
 *
 * @author alvar
 */
public class TablaMultiplicar {
    
    public String tablaMul(int numero){
        String tabla="";
        for(int i=1;i<=10;i++){
            tabla=tabla+"\n"+numero+" * "+i+" = "+(numero*i);
        }
        return tabla;
    }
}