/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer02;

/**
 *
 * @author manojlovic
 */
public class Zadatak5 {
    
    //rekurzivna metoda koja proverava da li se neki zadati karakter nalazi u stringu
    private static boolean count(String str, char a, int i) {
        if (str.charAt(i) == a) {
            return true;
        } else if (str.charAt(i) != a) {
            return false;
        } else {
            return count(str, a, ++i);
        }
    }
    
    public static void main(String[] args) {
        String tekst="Proba";
        char slovo='b';
        int i=0;
        System.out.println("Rezultat je: " + count(tekst, slovo, i));
    }
}
