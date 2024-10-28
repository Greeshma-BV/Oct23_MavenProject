package oct24;

public class StringEqual 
{

	public static void main(String[] args) 
	{
		String s1="Welcome";
		String s2="Welcome";
		String s3="welcome";
		String s4="Hello";
		System.out.println(s1.equals(s2));//compare the content and also case sensitive
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
	}

}
