/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domacizadatak;

/**
 *
 * @author Branislav
 */
public class Zadatak2 {
    
    //rekurzivan metoda koja ispisuje uneti broj u obrnutom redosledu
    public static int ispisBroja(int broj){
        if(broj < 10){
            return broj;
        }else{
            System.out.print(broj%10);
            
            return ispisBroja(broj/10);
        }
        
    }
    
    public static void main(String[] args) {
        int broj = 123456;
        System.out.println(ispisBroja(broj));
    }
}
