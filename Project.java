package com.project;

import java.util.Scanner;

public class Project {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter any number between 1-4");
	int n = scan.nextInt();
	if (n==1) {
		System.out.println("You have entered-1");
	}
	else if (n==2) {
		System.out.println("You have entered-2");
	}
	else if (n==3) {
		System.out.println("You have entered-3");
	}
	else if (n==4) {
		System.out.println("You have entered-4");
	}
	else {
		System.out.println("idiot....See the msg correctly");
	}
	
}
}
