package group1.week3.day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) 
	
	{
		String text = "PayPal India";
		char[] textArray = text.toCharArray();
		Set<Character> charText = new LinkedHashSet<Character>();
		Set<Character> dupcharText = new LinkedHashSet<Character>();
		
		
		 for (Character character : textArray) 
		 {
			 if(!charText.add(character))
			 {
				 dupcharText.add(character);
			 }
		}
		
		
		System.out.println("The unique chracters are: " +charText);
		System.out.println("The duplicate chracters are: "+dupcharText);

	}

}
