package group1.week3.day2.Assignments.StringAssignments;

public class Palindrome {

	public static void main(String[] args) 
	
	/*
	 * Pseudo Code
	
	 * a) Declare A String value as"madam"
	 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */
	
	{
		String name = "madam";
		String replaceAll = name.toLowerCase().replaceAll("[^a-zA-Z0-9:]", "");
		String replaceAll2 = replaceAll.replaceAll(":", "");
		char[] charArray = replaceAll2.toCharArray();
		System.out.println(replaceAll2);
		String rev = "";

		for (int i = charArray.length - 1; i >= 0; i--) {
			rev = rev + charArray[i];
			if (replaceAll2.equalsIgnoreCase
					(rev)) {
				System.out.println("It's a Palindrome");

			} else {
				System.out.println("It's not a Palindrome");
			}

		}

	}

}
