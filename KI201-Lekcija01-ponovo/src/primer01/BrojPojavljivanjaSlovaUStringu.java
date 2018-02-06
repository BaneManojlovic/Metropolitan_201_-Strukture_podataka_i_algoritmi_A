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
public class BrojPojavljivanjaSlovaUStringu {
    
    //rekurzivna metoda koja proverava koliko puta se neko slovo pojavljuje u unetom stringu
    public static int brojanjeSlova(String tekst, char slovo, int i) {
        if(i>=tekst.length()){
            return 0;
        }
        int brojac = tekst.charAt(i)== slovo ? 1 : 0;
        return brojac+brojanjeSlova(tekst, slovo, i+1);
    }
    
    public static void main(String[] args) {
       String tekst = "Dobro jutro";
       char slovo = 'o';
       int i=0;
       System.out.println("Resenje je: " + brojanjeSlova(tekst, slovo, i));
    }
}

/*
  //rekurzivna metoda koja proverava koliko puta se neko slovo pojavljuje u unetom stringu
    public static int brojanjeSlova(String tekst, char slovo) {

        int brojac=0;
        for(int i=0; i<tekst.length(); i++){
            if(tekst.charAt(i)==slovo){
                brojac++;
            }
        }
        return brojac;
    }

*/