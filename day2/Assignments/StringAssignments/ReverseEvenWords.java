package group1.week3.day2.Assignments.StringAssignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseEvenWords {

	public static void main(String[] args) 
	
	{
		
		
		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
		 */
		
		
		String test ="I am a software tester";
		
		String[] empty = test.split(" ");
		
		char[] textArray = test.toCharArray();
		
		//Set<String> myWords = new LinkedHashSet<String>();
		
		for (int i = 0; i < empty.length; i++) {
	           
            if (i % 2 != 0) {
                
                char[] characters = empty[i].toCharArray();
            
                for (int j = characters.length - 1; j >= 0; j--) {
                    System.out.print(characters[j]);
                }
                System.out.print(" ");
            } else {
                System.out.print(empty[i] + " ");
            }
		
	}

}
}
