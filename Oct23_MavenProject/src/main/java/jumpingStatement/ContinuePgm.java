package jumpingStatement;

public class ContinuePgm 
{

	public static void main(String[] args) 
	{
		// java continue statement is used to continue the loops. It continues the current flow of the program and skip the remaining code at the specified condition 
		for(int i=1;i<=10;i++)
		{
			if(i==5) 
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
