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
public class Zadatak1 {
       //rekurzivni metod koji porverava da li je rec palindrom
    public static boolean provera(String rec){
        if(rec.length()<=1){
            return true;
        }else if(rec.charAt(0)!=rec.charAt(rec.length()-1)){
            return false;
        }else{
            return provera(rec.substring(1, rec.length()-1));
        }
    }
    
    public static void main(String[] args) {
        String rec = "ana";
        System.out.println("Resenje je: " + provera(rec));
    }
}
