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
public class Primer01Zadatak02 {
    
    public static void xMethod(int n){
        if(n > 0){
            System.out.println(n % 10);
            xMethod(n/10);
        }
    }

    
    public static void main(String[] args) {
        xMethod(1234567);
    }
}

//Odgovro: 
/* Ispisuje:
7 
6 
5 
4 
3 
2 
1
*/