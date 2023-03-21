package Methods28;

import java.util.Scanner;

public class FirstAPICalculator {
public static void main(String[] args) {
	FirstAPI api = new FirstAPI();
	//calling add
	
	api.add();
	
	//calling sub
	int res1 = api.sub();
	System.out.println("Subtration result is" +" "+res1);
	
	//calling multiplication
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a 2 numbers for Multiplication");
	int a=scan.nextInt();
	int b=scan.nextInt();
	api.mul(a, b);
	
	//calling div
	System.out.println("Enter a 2 numbers for division");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	int res2 = api.div(num1, num2);
	System.out.println("Division result is" + " " + res2);
}
}
