package oct28th_Inheritance;

public class Tiger extends Animal
{
	public void species()
	{
		System.out.println("Panthera tigris");
	}
	public static void main(String[] args) 
	{
		Tiger tr=new Tiger();
		tr.eating();
		tr.species();
		Cat ct=new Cat();
		ct.family();
	}

}
