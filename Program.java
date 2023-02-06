package DecArray30prbS;

import java.util.Scanner;

public class Program {
public static void main(String[] args) {
	int arr[] = {1,2,4,5,6};
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array");
	System.out.println("Enter the elements");
	for (int i = 0; i <= arr.length-1; i++) {
		System.out.print("element"+i+" is: ");
		arr[i]=scan.nextInt();
	}
	System.out.println("array elements are");
}
}
