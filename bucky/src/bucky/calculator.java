
package bucky;

import java.util.Scanner;


public class calculator {
	public static void main(String arg[]){
		Scanner bucky = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter First Num: ");
		fnum = bucky.nextDouble();
		System.out.println("Enter second num: ");
		snum = bucky.nextDouble();
		answer = fnum + snum;
		System.out.println();
		
	}
}
