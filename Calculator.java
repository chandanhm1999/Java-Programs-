package Methods28;

import java.util.Scanner;

public class Calculator {
	Scanner scan = new Scanner(System.in);
	int add(int num1, int num2)
	{
		int c = num1+num2;
		return c;
	}
	int sub(int num1, int num2)
	{
		int c = num1-num2;
		return c;
	}
	int mul(int num1, int num2)
	{
		int c = num1*num2;
		return c;
	}
	int div(int num1, int num2)
	{
		int c = num1/num2;
		return c;
	}
}
