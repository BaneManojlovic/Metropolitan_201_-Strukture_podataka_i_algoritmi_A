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
public class Zadatak4 {
      /** Metoda koja broji koliko ima nekih zadatih karaktera u unetom stringu
      * i pri tmoe jos i pretvara uneti string u niz karaktera, kako bi lakse 
      * prolazila metoda kroz njega */
	public static int poredjenje(String broj) {
                char[] niz = broj.toCharArray();
		int count = 0;
		int index = niz.length - 1;
		return poredjenje(niz, index, count);
	}
   /** Pomocna metoda koja zapravo definise koji se to karakteri trebaju 
         * prepoznati i izbrojati. U nasem slucaju to su neparni brojevi.*/
	private static int poredjenje(char[] niz, int index, int count) {
		if (index < 0){ // Base case
			return count;
                }else if ((niz[index])%2!=0) {
			return poredjenje(niz, index - 1, count + 1); // Recursive call
                }else{
			return poredjenje(niz, index - 1, count); // Recursive call
                }
	}
    
    
    public static void main(String[] args) {
        String broj = "12345677";
        System.out.println("Resenje je: " + poredjenje(broj));
    }
}
