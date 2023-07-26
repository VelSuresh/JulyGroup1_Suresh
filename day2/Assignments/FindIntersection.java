package group1.week1.day2.Assignments;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args)
	
	{
		
        int a[] = {3,2,11,4,6,7};
        
        int b[] = {1,2,8,4,9,7};
		
		int length =a.length;
		
		int length_2=b.length;
		
		Arrays.sort(a);	
		
		Arrays.sort(b);
		
		System.out.println("Common Elements in 2 arrays are below");
		
		for( int i=0;i<length;i++)
		{
			
			//System.out.println(nums[i]);
			
			for( int j=0;j<length_2;j++)
			{
				
				//System.out.println(nums[j]);
				
			if(a[i]==b[j])
			{
				 
				
				
				System.out.println(a[i]);
			}
			
			
		}
		
	}

	}
}
