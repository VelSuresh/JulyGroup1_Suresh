package group1.week1.day1.Assignments;

public class PrintFibbinocci {

	public static void main(String[] args) 
	
	{
	
		
		
        int firstNum=0;
		
		int secNum=1;
		
		int sum=0;
		
		for (int i = 0; i < 11; i++) 
		{
          
			sum =firstNum+secNum;
        	
        	 firstNum=secNum;
        	 
        	secNum =sum;
        	
        	System.out.println(sum);
			
		}
	}

}
