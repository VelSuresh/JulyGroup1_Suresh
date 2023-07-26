package group1.week1.day2.Assignments;

import java.util.Arrays;

public class PrintDupicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int nums[] = {2,5,7,7,5,9,8,8,2,3};
		
		int length =nums.length;
		
		Arrays.sort(nums);	
		
		System.out.println(" Duplicate elements in an array are below");
		
		for( int i=0;i<length;i++)
		{
			
			//System.out.println(nums[i]);
			
			for( int j=i+1;j<length;j++)
			{
				
				//System.out.println(nums[j]);
				
			if(nums[i]==nums[j])
			{
				 
				
				
				System.out.println(nums[i]);
			}
			
			
		}
		
	}
	}

}
