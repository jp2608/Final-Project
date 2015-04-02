public class CSC201 extends Courses
{
	private int courses;
	
	public int getCoursen()
	{
		return courses;
	}
	
	public void setCoursen(int newCourses) 
	{
		courses = newCourses;
	}
	
	public void writeOutput() 
	{
		System.out.println("Course Title: " + getTitle());
		System.out.println("Course Number: " + courses);
		System.out.println("Course Department: " + getDepartment());
		System.out.println("Course Description: " + getDescription());

	}
	
}