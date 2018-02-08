/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer03;

/**
 *
 * @author manojlovic
 */
public class Zadatak2 {
    
    //rekurzivna metoda koja uneti broj ispisuje u obrnutom redosledu
    public static void ispis(int n){
        if(n > 0){
            System.out.println(n % 10);
            ispis(n/10);
        }
    }

    
    public static void main(String[] args) {
        int broj = 123456;
        ispis(broj);
    }
}
