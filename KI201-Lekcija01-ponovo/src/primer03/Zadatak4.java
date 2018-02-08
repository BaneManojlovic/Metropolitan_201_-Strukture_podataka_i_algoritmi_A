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
public class Zadatak4 {
	/* Method sums the digits in an integer */
	public static int sumDigits(long n) {
		return sumDigits(n, 0);
	}
	/* Helper overloaded method */
	private static int sumDigits(long n, int sum) {
		if (n == 0) // Base case
			return sum;
		else // Recursive call
			return sumDigits(n / 10, sum + (int)(n % 10));
	}       
        /** Main method */
	public static void main(String[] args) {
		long n = 123456;
		System.out.println("The sum of " + n + " = " + sumDigits(n));
	}
}
