package kodnest15d;

import java.util.Scanner;

public class Memory15 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Array length");
	int arr[] =  new int[scan.nextInt()];
	System.out.println("Enter Array Contents");
	for (int i = 0; i <= arr.length-1; i++) {
		System.out.println("Enter an element");
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter 2 positions to swap the contents from 0 to"+(arr.length-1));
	int i1=scan.nextInt();
	int i2=scan.nextInt();
	
	System.out.println("Array before swaping");
	for (int i = 0; i <= arr.length-1; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	int help=arr[i1];
	arr[1]=arr[i1];
	arr[2]=help;
	System.out.println("Array After Swapping");
	for (int i = 0; i <= arr.length-1; i++) {
		System.out.print(arr[i]+" ");
	}
}
}
