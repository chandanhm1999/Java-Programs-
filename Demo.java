package kodnest15d;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Array length to create 1-D  Array");
	Person1 []arr = new Person1[scan.nextInt()];
	for (int i = 0; i <= arr.length-1; i++) {
		arr[i] = new Person1();
	}
	for (int i = 0; i <= arr.length-1; i++) {
		System.out.println("Enter name for Person"+i);
		arr[i].name = scan.next();
		System.out.println("Enter age for Person"+i);
		arr[i].age = scan.nextInt();
		System.out.println("Enter gender for Person"+i);
		arr[i].gender = scan.next();
		System.out.println("Enter phoneno for Person"+i);
		arr[i].phone = scan.nextInt();
		System.out.println("Enter address for Person"+i);
		arr[i].address = scan.next();
	}
	System.out.println("Array Contents are");
	for (int i = 0; i <= arr.length-1; i++) {
		System.out.print(arr[i].name + " " + arr[i].age + " " + arr[i].gender + " " +arr[i].phone + " " + arr[i].address + " " + "|");
	}
}
}