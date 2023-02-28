package kodnestClass;

import java.util.Scanner;

public class ScanerioDoubleheight {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double arr[] = new double[5];
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter Height of Student"+i);
		arr[i]=scan.nextDouble()+1;
	}
	System.out.println("Arrays Contents are");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
}
}
