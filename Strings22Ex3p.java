package strings22P;

public class Strings22Ex3p {
public static void main(String[] args) {
	String s1 = "Rama";
	String s2 = "Sita";
	String s3 = "Rama"+"Sita";
	String s4 = "Rama"+"Sita";
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
