package practice;

public class Display {
	public static void main(String[]args) {
		System.out.println("Main method of display!");
		Test t=new Test();
		t.display();
	}
}

class Test{
	void display() {
	System.out.println("display method of Test class");	
	}
}