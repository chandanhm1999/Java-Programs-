package com.progarm3;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number between 1-4");
		int n = scan.nextInt();
		switch (n)
		{
		case 1:
			System.out.println("You have entered-1");
			break;
		case 2:
			System.out.println("You have entered-2");
			break;
		case 3:
			System.out.println("You have entered-3");
			break;
		case 4:
			System.out.println("You have entered-4");
			break;
		default:
			System.out.println("idiot....See the msg correctly");
		}
}
}
