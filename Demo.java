package com.demo;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Press The Number");
		int n = scan.nextInt();
		if (n==1) {
			System.out.println("You have pressed The key-1");
		}
		else {
			System.out.println("You have not pressed The key-1");
		}
	}
}
