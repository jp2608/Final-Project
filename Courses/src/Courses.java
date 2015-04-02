public class Courses 
{
	private String title;
	private String description;
	private String department;
	
	public Courses()
	{
		title = "no course title yet";	
		description = "no description yet";
		department = "no department yet";
	}
	
	public Courses(String initialTitle, String intialDescription, String initialDepartment)
	{
		title = initialTitle;
		description = intialDescription;
		department = initialDepartment;
	}
	
	public void setTitle(String newTitle){
		title = newTitle;
	}
	public void setDescription(String newDescription) 
	{
		description = newDescription;
	}
	public void setDepartment(String newDepartment)
{
		department = newDepartment;
	}
	
	public String getTitle() 
	{
		return title;
	}
	public String getDescription() 
	{
		return description;
	}
	public String getDepartment() 
	{
		return department;
	}
	
	public void writeOutput() 
	{
		System.out.println("Course Title: " + title);
		System.out.println("Course Description: " + description);
		System.out.println("Course Department: " + department);
	}

}