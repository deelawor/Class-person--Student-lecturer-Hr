/**
 * 
 */

/**
 * @author DELL
 *
 */
public class Hr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object student and lecturer.
		Student jSmith = new Student ("J1209950078563", "John Smith", 173, 67, "JBDA000", "Big Data Analyis", "John Donald");
		Lecturer max = new Lecturer ("M2905940078985", "Max Thomson", 189, 76, "Maths", "PML", 750, 1.5);
		
		System.out.println(jSmith.calculateBmi());
		System.out.println("Name of student "+ jSmith.getName() + " has a salary of : " +jSmith.calculateSalary(0, 0) );
		System.out.println(jSmith.toString());
        
		System.out.println("About lecturer: ");
		System.out.println(max.toString());
		System.out.println(max.calculateSalary(750, 1.5));
		System.out.println(max.calculateBmi());
	}

}
