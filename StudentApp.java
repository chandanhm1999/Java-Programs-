package ujanpro;

public class StudentApp {
public static void main(String[] args) {
	Student res = Student.getStudentInstance();
	res.eat();
	res.sleep();
	res.study();
	System.out.println(res);
}
}
