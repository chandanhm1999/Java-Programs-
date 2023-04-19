import java.util.Scanner;
package demo;

public class Calculator {
public static void main (String[]args)
{
	Scanner scan = new Scanner (System.in);
	System.out.println("Press The Number");
	int a = scan.nextInt();
	if (a==1) {
		System.out.println("You have pressed-1");
	}
	System.out.println("You have not pressed-1");
}
}