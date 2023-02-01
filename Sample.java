package dec16;

import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of Array");
	int array[]= new int[scan.nextInt()];
	for (int i = 0; i <= array.length-1; i++) {
		System.out.println("Enter the Element");
		array[i] = scan.nextInt()+10;
	}
	int []copyarray = new int[array.length];
	int j=copyarray.length-1;
	for (int i = 0; i <= array.length-1; i++) {
		copyarray[j] = array[i]-1;
		j--;
	}
	
	System.out.println("Array contents are");
	for (int i = 0; i <= array.length-1; i++) {
		System.out.print(array[i]+" ");
	}
	
	
	for (int i = 0; i <= copyarray.length-1; i++) {
		System.out.println("Enter the Element");
		copyarray[j] = scan.nextInt();
	}
	System.out.println("CopyArray Contents are");
	for (int i = 0; i <= copyarray.length-1; i++) {
		System.out.print(copyarray[i]+" ");
	}
}
}
