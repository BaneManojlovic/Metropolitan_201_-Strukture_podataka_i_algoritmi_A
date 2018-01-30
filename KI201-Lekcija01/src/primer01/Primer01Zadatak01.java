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
public class Primer01Zadatak01 {
    
    public static int sMethod(int n){
        if(n==1){
            return 1;
        }else{
            return n * sMethod(n - 1);    
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Suma: " + sMethod(5));
    }
}

//Odgovor: Kao rezultat vraca 120
