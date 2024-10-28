package oct24;

public class StringEqualignore 
{

	public static void main(String[] args) 
	{
		String s1="Welcome";
		String s2="Welcome";
		String s3="welcome";
		String s4="Hello";
		System.out.println(s1.equalsIgnoreCase(s2));//compare the content only
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.equalsIgnoreCase(s4));

	}

}
