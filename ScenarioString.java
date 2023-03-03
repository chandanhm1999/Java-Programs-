package kodnestClass;

import java.util.Scanner;

public class ScenarioString {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//creation of array!
	String arr[] = new String[5];
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter Name of Student"+i);
		arr[i]=scan.next();
	}
	System.out.println("Arrays Contents are");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
}
}
