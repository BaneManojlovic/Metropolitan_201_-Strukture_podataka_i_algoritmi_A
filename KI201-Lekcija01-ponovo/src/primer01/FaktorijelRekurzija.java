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
public class FaktorijelRekurzija {
    
    //metoda za izracunavanje faktorijela upotrebom rekurzije
    public static int faktorijel(int n){
        if(n == 0){
            return 1;
        }else{
            return n*faktorijel(n-1);
        }
    }
    
    public static void main(String[] args) {
        int n=4;
        System.out.println("Rezultat: " + faktorijel(n));
    }
}
