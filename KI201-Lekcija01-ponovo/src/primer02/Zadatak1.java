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
public class Zadatak1 {
    
    //rekurzivna metoda koja poredi da li su dva uneta stringa jednaka
    public static boolean poredjenje(char[] tekstNiz1, char[] tekstNiz2, int indeks) {
        //provera da li su dva chara jednaka po duzini
        if (tekstNiz1.length != tekstNiz2.length) {
            return false;
        }
        if (indeks == tekstNiz1.length - 1) {
            return tekstNiz1[indeks] == tekstNiz2[indeks];
        }
        //ako su 2 elementa u nizu jendaki, onda se poziva rekurzivno ista metoda
        //poredjenje za SLEDECA DVA ELEMENTA U NIZU, da njih poredi, zato ide ++indeks a ne indeks++
        if (tekstNiz1[indeks] == tekstNiz2[indeks]) {
            return poredjenje(tekstNiz1, tekstNiz2, ++indeks);
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
       String tekst1 = "Dobro jutro";
       String tekst2 = "Dobro jutro";
       //PRVO ODMAH PRETVORIMO STRINGOVE U NIZOVE KARAKTERA
       char[] niz1 = tekst1.toCharArray();
       char[] niz2 = tekst2.toCharArray();
       int indeks=0;
       System.out.println("Resenje: " + poredjenje(niz1, niz2, indeks));
       
    }
}
