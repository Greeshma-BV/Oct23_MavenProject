package oct29_Polymorphism;

public class BabyDogPMSM extends DogPMSM
{
	public void barking()
	{
		System.out.println("baby dog barking");
	}

	public static void main(String[] args) 
	{
		BabyDogPMSM bd=new BabyDogPMSM();
		bd.barking();

	}

}
