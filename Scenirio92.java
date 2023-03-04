package kodnestClass;

import java.util.Scanner;

public class Scenirio92 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//creation of array!
	String arr[] = new String[8];
	for (int i = 0; i < arr.length-1; i++) {
		System.out.println("Enter ssn of Employee"+i);
		arr[i]=scan.nextLine();
	}
	System.out.println("Arrays Contents are");
	for (int i = 0; i < arr.length-1; i++) {
		System.out.print(arr[i]+" ");
	}
}
}
