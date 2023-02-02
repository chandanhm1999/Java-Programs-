package ujan18;

public class Employee {
	int id;
	String name;
	static int count =0;
	public static void main(String[] args) {
		Employee c1 = new Employee();
		System.out.println(c1.count);
		Employee c2 = new Employee();
		System.out.println(c2.count);
		Employee c3 = new Employee();
		System.out.println(c3.count);
		
	}
	static void count()
	{
		count++;
	}
}
