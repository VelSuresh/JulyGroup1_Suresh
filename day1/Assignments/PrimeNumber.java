package group1.week1.day1.Assignments;

public class PrimeNumber {

	public static void main(String[] args) 
	
	{
		
		int num =13;
		
		int count =0;
		
		for (int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		
		if(count==2)
		{
			System.out.println("Its a prime Number");
		}
		else
		{
			System.out.println("its not a Prime Number");
		}
		
		
		
	}

}
