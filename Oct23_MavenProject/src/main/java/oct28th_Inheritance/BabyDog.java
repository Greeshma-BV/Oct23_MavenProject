package oct28th_Inheritance;

public class BabyDog extends Dog
{
	public void barking()
	{
		System.out.println("animal property");
	}

	public static void main(String[] args) 
	{
		BabyDog bd=new BabyDog();
		bd.eat();
		bd.barking();
	}

}
