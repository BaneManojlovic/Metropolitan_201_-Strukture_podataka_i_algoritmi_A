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
public class Primer01Zadatak03 {
    
    public static void obrazac(double n){
        
           // System.out.println(Math.pow(2, n));
          for(int i=1; i<n; i++){
               // System.out.println(2*2);
                System.out.println(Math.pow(2, n));
                obrazac(n-1);           
           }
   
    }
    
    public static void main(String[] args) {
        int n=3;
        obrazac(n);
    }
}
