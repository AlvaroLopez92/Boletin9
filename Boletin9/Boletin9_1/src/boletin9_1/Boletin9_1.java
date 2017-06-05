/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import java.lang.reflect.Array;
import javax.swing.JOptionPane;

/**
 *
 * @author alopezcobo
 */
public class Boletin9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            int []num=new int[10];
        for (int i=0;i<10;i++){
            
        Array.set(num, i,Integer.parseInt(JOptionPane.showInputDialog("introduce el "+(i+1)+" numero")));
        }
        CalculaNum calc=new CalculaNum();
        System.out.println((calc.calculaNum(num)));
    }
    
}
    

    

