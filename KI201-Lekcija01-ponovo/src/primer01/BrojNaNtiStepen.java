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
public class BrojNaNtiStepen {
    
    //rekurzivna metoda koja vraca X na N
    public static double stepenovanje(int x, int n){
        if(n == 0){
            return 1;
        }else{
            return x*stepenovanje(x, n-1);
        }
    }
    
    public static void main(String[] args) {
        int x=2, n=3;
        System.out.println("Resenje je: " + stepenovanje(x, n));
    }
}
