package oct28th_Inheritance;

public class Fruit extends Flower
{
	public void fruitname()
	{
		System.out.println("Mango Fruit");
	}
	public static void main(String[] args) 
	{
		Fruit ft=new Fruit();
		ft.treename();
		ft.flowername();
		ft.fruitname();
		}

}
