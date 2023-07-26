package group1.week1.day2.Assignments;

import java.util.Arrays;

public class FindSecondLargest


{

	public static void main(String[] args) 
	
	{
		
		
        int nums[] = {2,3,4,5,7,7,5,9,8,8,3};
		
		int length =nums.length;
		
		
		
		Arrays.sort(nums);	
		
		
		System.out.print("The number of elements in an array are : ");
		
		for( int i=0; i<length-1;i++)
			
		{
			System.out.println(nums[i]);
			
			
		}
			
			System.out.println("The Second largest element in given array is : "+nums[length-2]);
		
		
	}

	}


