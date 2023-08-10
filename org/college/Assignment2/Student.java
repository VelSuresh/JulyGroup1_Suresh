package group1.week3.day1.Assignments.org.college.Assignment2;

public class Student extends Department


{

	public void studentName()
	{
		System.out.println(" StudentName is : TamilSelvan");
	}
	
	public void studentDept() 
	
	{
		System.out.println("StudentDept is : Agriculture" );
	}
	
	public void studentId()
	{
		System.out.println("StudentId is : 101");
	}
	
	public static void main(String[] args)
	
	{
		Student s = new Student();
		
		s.CollegeCode();
		s.CollegeName();
		s.CollegeRank();
		s.deptName();
		s.studentDept();
		s.studentId();
		s.studentName();
	}

}
