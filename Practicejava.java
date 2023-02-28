package kodnestClass;

import java.util.Scanner;

public class Practicejava {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double arr[] = new double[5];
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter the heights");
		arr[i] = scan.nextDouble()+1;
	}
	System.out.println("Array contents are");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]+" ");
	}
}
}