package Methods28;

import java.util.Scanner;

public class CalculatorAPIApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator api = new Calculator();
		//calling add
		System.out.println("Enter a 2 numbers for addition");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int res = api.add(num1, num2);
		System.out.println("addition result is" + " " + res);
		
		//calling sub
		System.out.println("Enter a 2 numbers for subtraction");
		num1=scan.nextInt();
		num2=scan.nextInt();
		res = api.sub(num1, num2);
		System.out.println("subtration result is" + " " + res);
		
		//calling mul
		System.out.println("Enter a 2 numbers for multiplication");
		num1=scan.nextInt();
		num2=scan.nextInt();
		res = api.mul(num1, num2);
		System.out.println("multiplication result is" + " " + res);
		
		//calling div
		System.out.println("Enter a 2 numbers for division");
		num1=scan.nextInt();
		num2=scan.nextInt();
		res = api.div(num1, num2);
		System.out.println("division result is" + " " + res);
	}
}
