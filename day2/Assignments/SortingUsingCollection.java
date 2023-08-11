package group1.week3.day2.Assignments;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args)
	
	
	{
		String[] stringArray = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		int lengthOfstringArray = stringArray.length;
		
		Arrays.sort(stringArray);
		
		
		 for (String string : stringArray)
			 
		 {
			
			System.out.println(string);
			
			
		 }
		
		

		

	}

}
