package jan9program;

public class Demo1 {
public static void main(String[] args) {
	Demo d = new Demo();
	d.a = 200;
	d.b = 400.0f;
	d.c = "Ramu";
	System.out.println(d.a);
	System.out.println(d.b);
	System.out.println(d.c);
	d.display(100f);
}
}
