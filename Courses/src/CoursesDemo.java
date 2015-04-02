public class CoursesDemo
{
	
	public static void main(String[] args)
	{
		CSC201 cs = new CSC201();
		MTH173 mt = new MTH173();
		
		System.out.println("-CSC201-\n ");
		cs.setTitle("Computer Science I");
		cs.setCoursen(201);
		cs.setDepartment("Science and Technology");
		cs.setDescription("Intro to Computer Science I.");
		cs.writeOutput();
		
		System.out.println("\n-MTH173-\n ");
		mt.setTitle("Calculus w/ Analytical Geometry I");
		mt.setCoursen(173);
		mt.setDepartment("Math");
		mt.setDescription("First Calculus Course");
		mt.writeOutput();
		
	}
}