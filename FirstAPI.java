package Methods28;

import java.util.Scanner;

public class FirstAPI {
	void add()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 2 numbers for addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c = a+b;
		System.out.println("Addition result is"+" " + c);
	}
	int sub()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 2 numbers for Subtraction");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c = a-b;
		return c;
	}
	void mul(int a, int b)
	{
		int c = a*b;
		System.out.println("Multiplication result is"+ " " + c);
	}
	int div(int num1, int num2)
	{
		int c = num1/num2;
		return c;
	}
}
