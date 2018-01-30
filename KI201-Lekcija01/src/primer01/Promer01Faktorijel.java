/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer01;

import java.util.Scanner;

/**
 *
 * @author manojlovic
 */
public class Promer01Faktorijel {
    
    static Scanner sc = new Scanner(System.in);
    
   //rekurzivna funkcija koja poziva samu sebe. Ovo je direktna rekurzija.
    public static int faktorijel(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorijel(n - 1);
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Unesite neki broj n:");
        n = sc.nextInt();       
        System.out.println("Faktorijel broja n iznosi: " + faktorijel(n));      
    }
}
