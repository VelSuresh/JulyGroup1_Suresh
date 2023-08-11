package group1.week3.day2.Assignments;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		
		String name ="sureshbabu";
		
		char a[] =name.toCharArray();
		
		
		Set<Character> unique_character = new LinkedHashSet<Character>();
		
		//Set will not allow duplicates
		
		for (Character allLetters : a) 
		{
			unique_character.add(allLetters);
		}
		
		System.out.println(unique_character);
		
		
	}

}
