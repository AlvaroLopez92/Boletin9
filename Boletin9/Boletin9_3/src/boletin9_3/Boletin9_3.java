/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author alopezcobo
 */
public class Boletin9_3 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        CalculaDigitos CalculaDigitos =new CalculaDigitos();
           boolean pos=false;
           int base=0,altura=0;
           while(pos!=true){
               base=Integer.parseInt(JOptionPane.showInputDialog("Introduce una base "));
               altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce una altura "));
               if(base>0&&altura>0){
                   pos=true;
               }
                }
           System.out.println("El area es "+CalculaDigitos.calcularArea(base, altura));
    }
}