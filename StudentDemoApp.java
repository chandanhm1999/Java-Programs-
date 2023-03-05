package kodnestClass;

public class StudentDemoApp {
public static void main(String[] args) {
	StudentDemo s = new StudentDemo();
	System.out.println(s.id);
	System.out.println(s.name);
	System.out.println(s.gender);
	System.out.println(s.marks);
	s.eat();
	s.sleep();
	s.study();
}
}
