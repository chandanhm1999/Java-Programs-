package kodnest15d;

import java.util.Scanner;

public class Demo15 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Array length to create 1-D student Array");
	Student1 []arr = new Student1[scan.nextInt()];
	for (int i = 0; i <= arr.length-1; i++) {
		arr[i] = new Student1();
	}
	for (int i = 0; i <= arr.length-1; i++) {
		System.out.println("Enter id for Student"+i);
		arr[i].id = scan.nextInt();
		System.out.println("Enter name for Student"+i);
		arr[i].name = scan.next();
		System.out.println("Enter marks for Student"+i);
		arr[i].marks = scan.nextInt();
	}
	System.out.println("Array Contents are");
	for (int i = 0; i <= arr.length-1; i++) {
		System.out.print(arr[i].id + " " + arr[i].name + " " +arr[i].marks + "|");
	}
}
}
