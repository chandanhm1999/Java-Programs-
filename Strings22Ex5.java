package strings22P;

public class Strings22Ex5 {
public static void main(String[] args) {
	String s1 = "Rama";
	String s2 = s1;
	if(s1==s2)
	{
		System.out.println("Reference are equals");
	}
	else
	{
		System.out.println("Referance are unequals");
	}
	if(s1.equals(s2))
	{
		System.out.println("Strings are equals");
	}
	else
	{
		System.out.println("Strings are unequals");
	}
}
}
