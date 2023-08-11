package group1.week3.day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args)
	
	{
String grouptext = "We learn java basics as part of java sessions in java week1";
		
		String[] empty = grouptext.split(" ");
		Set<String> myUniqueSet = new LinkedHashSet<String>();
		
		for (String words : empty)
		{
//			System.out.println(words);
			myUniqueSet.add(words);
		}
		
		System.out.println(myUniqueSet);
		
	}

}
