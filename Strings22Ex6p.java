package strings22P;

public class Strings22Ex6p {
public static void main(String[] args) {
	String s1 = new String("Sachin");
	String s2 = new String("Sourav");
	if(s1.compareTo(s2)>0)
	{
		System.out.println("String 1 is greater");
	}
	else if(s1.compareTo(s2)<0)
	{
		System.out.println("String 2 is greater");
	}
	else
	{
		System.out.println("Both Strings are equal");
	}
}
}
