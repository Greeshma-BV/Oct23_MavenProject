package oct29_Polymorphism;

public class MethodOverloadingPgm 
{
	public int calculate(int a, int b)
	{
		int c= a+b;
		return c;
	}
	public int calculate(int d, int e, int g)
	{
		int f= d+e+g;
		return f;
	}
	public static void main(String[] args) 
	{
		MethodOverloadingPgm mg=new MethodOverloadingPgm();
		System.out.println(mg.calculate(10,20,30));
		System.out.println(mg.calculate(10,20));
	}

}
