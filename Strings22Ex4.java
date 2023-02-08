package strings22P;

public class Strings22Ex4 {
public static void main(String[] args) {
	String s1 = "Rama";
	String s2 = "Sita";
	String s3 = s1+s2;
	String s4 = s1+s2;
	if(s3==s4)
	{
		System.out.println("Reference are equals");
	}
	else
	{
		System.out.println("Referance are unequals");
	}
	if(s3.equals(s4))
	{
		System.out.println("Strings are equals");
	}
	else
	{
		System.out.println("Strings are unequals");
	}
}
}
