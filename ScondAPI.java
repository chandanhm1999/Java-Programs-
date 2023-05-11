package DecArray29;

import java.util.Scanner;

public class ScondAPI {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n = scan.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter the elements of Array");
	for (int i = 0; i <= arr.length-1; i++) {
		arr[i]=scan.nextInt();
	}
}
}
