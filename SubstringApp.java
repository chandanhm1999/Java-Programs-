package test17;

import java.util.Scanner;

public class SubstringApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the AcceptString");
	//creation of array!
	String arr[] = new String[5];
	for (int i = 0; i < arr.length-1; i++) {
		System.out.println("Enter user"+i);
		arr[i]=scan.next();
	}
	System.out.println("Arrays Contents are");
	for (int i = 0; i < arr.length-1; i++) {
		System.out.print(arr[i]+" ");
	}
}
}
