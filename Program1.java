package com.NovemberBatch;

public class Program1 {
public static void main(String[] args) {
	for (int i=1; i<=3; i++) //rows
	{
		for (int k=1; k<=3; k++)
		{
			System.out.print("*");
		}
		for (int j = 1; j <= i; j++)
		{
			System.out.print("$");
		}
		System.out.println();
	}
}
}