/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

/**
 *
 * @author alvar
 */
public class Series {
    
    public String serieFibonacci(int cont){
        String serie="";
         int fib1,fib2,i;
        
        System.out.println("Los " + cont + " primeros números son:");

        fib1=0;
        fib2=1;

        serie=""+fib1 + " ";
        for(i=2;i<=cont;i++){
             serie=serie+fib2 + " ";
             fib2 = fib1 + fib2;
             fib1 = fib2 - fib1;
        }
    
        return serie;
    }
    public String serieRestar(int cont){
        int i=0;
        String serie="";
        while(i<cont){
            i++;
            if(i%2==1){
                serie=serie+" - "+i;
            }else{
                serie=serie+" + "+i;
            }
        }
        return serie;
    }
    
    public String seriePares(int cont){
        int i=0;
        int numeros=0;
        String serie="2";
        while(i<cont){
            numeros++;
            if(numeros%2==0){
                i++;
                if(numeros>2){
                serie=serie+", "+numeros;
            }
            }
        }
        return serie;
    }
}