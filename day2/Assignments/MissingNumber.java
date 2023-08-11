package group1.week3.day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5,6,7,9,10,9,1,3};
		
		
       Set<Integer> RemoveDuplicate = new LinkedHashSet<Integer>();
       
       for (int i = 0; i < array.length; i++) 
       
       {
    	   
    	   
		RemoveDuplicate.add(array[i]);
		
		
	}
		
		
		
		System.out.println("Removed duplicate & actual elements are  : "+RemoveDuplicate);
		
		//Clarification in this line
		Integer[] uniqueArray = RemoveDuplicate.toArray(new Integer[RemoveDuplicate.size()]);
		
		
		
		for (int i=0; i<uniqueArray.length;i++)
		{
			
			if (uniqueArray[i] != i+1)
			{
				
				System.out.println("The missing number is "+i);
			}
			
			i++;
		}
		
		
		
	}

}
