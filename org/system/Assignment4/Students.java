package group1.week3.day1.Assignments.org.system.Assignment4;

public class Students 

{

	public  int getStudentInfo(int id)
	{
		
		
		System.out.println("Id_Value is "+id);
		
		return id;
		
		
	}
	
	public String getStudentInfo (String name)
	{
		
		
		System.out.println("Student name is"+name);
		
		return name;
		
	}
	
	
	
	public  void getStudentInfo(String email,int phoneNumber)
	{
		
		
		System.out.println("Email & PhoneNumber is"+email +phoneNumber);
		
		
	}
	
	
	public static void main(String[] args) 
	
	{
		
		
		Students stud =new Students();
		
		stud.getStudentInfo(456);
		stud.getStudentInfo("suresh");
		stud.getStudentInfo("velusuresh18@gmail.com", 98765432);
		
		

	}

}
