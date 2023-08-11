package group1.week3.day2.Assignments.StringAssignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args)
	
	{
		
		
		String input = "changeme";
		
		char[] charArray = input.toCharArray();
		
		for (int i =0; i<charArray.length;i++)
		{
			if (i%2 != 0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}
		String ChangedString = new String(charArray);
		System.out.println(ChangedString);
	}

}
