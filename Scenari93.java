package kodnestClass;

import java.util.Scanner;

public class Scenari93 {
	public static void main(String[] args) {
		int [][]arr = new int [3][3];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i <= arr.length-1; i++)
		{
			for (int j = 0; j <=arr[i].length-1; j++) 
			{
				System.out.println("Enter age of class"+i+"Student"+j);
				arr[i][j]= scan.nextInt();
			}
		}
		System.out.println("Arrays Contents are");
		for (int i = 0; i <= arr.length-1; i++) 
		{
			for(int j = 0; j<=arr[i].length-1; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
