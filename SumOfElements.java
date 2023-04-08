package Kodnest2812arrayprb;

//Find the sum of all elements present in an array!

import java.util.Scanner;

public class SumOfElements {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int arr[] = new int[scan.nextInt()];
	System.out.println("Enter the elements");
	for (int i = 0; i <= arr.length-1; i++) {
		System.out.print("element"+i+" is: ");
		arr[i]=scan.nextInt();
	}
	System.out.println("array elements are");
	for (int i = 0; i <= arr.length-1; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
	int sum=0;
	
	for (int i = 0; i <= arr.length-1; i++) {
		sum=sum+arr[i];
	}
	System.out.println("sum of all elements"+ sum);
}
}
