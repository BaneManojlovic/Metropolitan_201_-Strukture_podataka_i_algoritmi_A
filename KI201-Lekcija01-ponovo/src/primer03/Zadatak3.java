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
public class Zadatak3 {
    //rekurzivna metoda koja prebrojava broj cifara u unetom broju
    public static int prebrojavanje(String brojTekst, int brojac){
        int character = ' ';
        if(brojTekst.length()==0)
            return 0;
        else
            return 1+prebrojavanje(brojTekst.substring(1), character);
    }
    //
    public static boolean provera(int rez){
        if(rez%2==0){
            return true;
        }else{
            return false;
        }
    }
   
    public static void main(String[] args) {
        int broj = 1234567;
        String brojTekst;
        brojTekst = String.valueOf(broj);
        int brojac=0;
        int rez = prebrojavanje(brojTekst, brojac);
        System.out.println("Rezultat je: " + rez + ",\ntj. Da li je broj cifara paran?: " + provera(rez));       
    }
}
