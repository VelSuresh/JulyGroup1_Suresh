package group1.week3.day2.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args)
	
	{
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};

		
		Set<Integer> emptySet = new TreeSet<Integer>();
		
		
		for (int i = 0; i < data.length; i++) 
		
		{
			
			emptySet.add(data[i]);
				
		}
		
		List<Integer> ConvertsetToList = new ArrayList<Integer>(emptySet);
		
		System.out.println("From set to list converted is "+ emptySet);
		
        
        
        int  j=ConvertsetToList.get(4);
        
        System.out.println("The Second Largest Number is "+ j);
        
		
//		
		
	}

}
