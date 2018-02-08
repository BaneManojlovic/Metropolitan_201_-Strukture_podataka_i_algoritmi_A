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
public class Zadatak3 {
   //rekurzivna metoda koja proverava koliko puta se neko slovo pojavljuje u unetom stringu
   
	/** Metoda koja broji koliko ima nekih zadatih karaktera u unetom stringu */
	public static int brojanjeSamoglasnika(String str) {
		int count = 0;
		int index = str.length() - 1;
		return brojanjeSamoglasnika(str, index, count);
	}

	/** Pomocna metoda koja zapravo definise koji se to karakteri trebaju 
         * prepoznati i izbrojati. U nasem slucaju to su samoglasnici*/
	private static int brojanjeSamoglasnika(String str, int index, int count) {
		if (index < 0){ // Base case
			return count;
                }else if ((str.charAt(index))=='a'||(str.charAt(index))=='e'||(str.charAt(index))=='i'||(str.charAt(index))=='o'||(str.charAt(index))=='u') {
			return brojanjeSamoglasnika(str, index - 1, count + 1); // Recursive call
                }else{
			return brojanjeSamoglasnika(str, index - 1, count); // Recursive call
                }
	}
    
    public static void main(String[] args) {
       String tekst = "Dobro jutro";
       System.out.println("Resenje je: " + brojanjeSamoglasnika(tekst));
    }
}
