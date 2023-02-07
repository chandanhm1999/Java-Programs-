package strings22P;

public class Strings22Ex1p {
public static void main(String[] args) {
	String s1 = new String("Sanjana");
	String s2 = new String("Sanjana");
	if(s1.equals(s2))
	{
		System.out.println("Strings are equals");
	}
	else
	{
		System.out.println("Strings are unequals");
	}
	if(s1.equalsIgnoreCase(s2))
	{
		System.out.println("Strings are Eqaul if case are Equal");
	}
	else
	{
		System.out.println("Strings are notEqaul if case are unEqual");
	}
}
}
