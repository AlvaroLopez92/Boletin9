/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author alvar
 */
public class Boletin9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Series series=new Series();
        System.out.println(series.serieFibonacci(Integer.parseInt(JOptionPane.showInputDialog("Introduce los números de Fibonacci"))));
        
        System.out.println(series.seriePares(Integer.parseInt(JOptionPane.showInputDialog("Introduce los números pares para mostrar"))));
        
        System.out.println(series.serieRestar(Integer.parseInt(JOptionPane.showInputDialog("Introduce los números a visualizar"))));
        
        
    }
    
}