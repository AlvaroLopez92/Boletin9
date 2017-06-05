/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author alopezcobo
 */
public class Boletin9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero=1;
        TablaMultiplicar tab=new TablaMultiplicar();
        while(numero!=0){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero para ver su tabla de multiplicar"));
            if(numero!=0){
                System.out.println(tab.tablaMul(numero));
            }
        }
    }
    
}