/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer01;

/**
 *
 * @author manojlovic
 */
public class FibonacijevNizRekurzija {
    
    //metoda koja izracunava fibonacijev broj na zadatom indeksu
    public static int fibonaci(int n){
        if(n == 0){
            return 0;
        }else if(n ==1){
            return 1;
        }else{
            return fibonaci(n-1)+fibonaci(n-2);
        }
    }
    
    public static void main(String[] args) {
        int n=7;
        System.out.println("Rezultat je: " + fibonaci(n));
    }
}
