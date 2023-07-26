package group1.week1.day2.Assignments;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args)
	
	{
		
int arr[] = {1,4,3,2,6,7};
		
		int length =arr.length;
		
		Arrays.sort(arr);	
		
		System.out.println(" Missing elements in an array are below");
		
		for( int i=0;i<length;i++)
		{
			
			
			
			
			if(arr[i]!=i+1)
				
			{
				
				
				 
				System.out.println(i+1);
				
				break;
				
			}
			
			
		}
		
	}
		
		

	}


