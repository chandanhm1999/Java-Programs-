package kodnest15d;

import java.util.Scanner;

public class Memory {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 numbers to swap");
	int a = scan.nextInt();
	int b = scan.nextInt();
	System.out.println("Elements before swapping a="+a + "b= "+b);
	
	int help=a;
	a=b;
	b=help;
	
	System.out.println("Elements after swapping a="+a+ "b= "+b);
}
}