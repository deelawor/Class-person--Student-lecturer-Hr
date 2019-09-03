# Class-person--Student-lecturer-Hr
public abstract class Person {
	/*Defining our attributes*/
	private String nid;
	private String name;
	private double height;
	private double weight;
	static int count = 0;
      
	
	/* default constructor*/
	public Person() {
		super();
		
		
	}
	/**
	 * 4 overloaded constructor
	 * @param nid
	 * @param name
	 * @param height
	 * @param weight
	 */
	public Person(String nid, String name, double height, double weight) {
		super();
		this.nid = nid;
		this.name = name;
		this.height = height;
		this.weight = weight;
		count++;
		
	}
	
	/**
	 * Getters and Setters in pairs
	 * @return the nid
	 */
	public String getNid() {
		return nid;
	}
	/**
	 * @param nid the nid to set
	 */
	public void setNid(String nid) {
		this.nid = nid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * 
	 * @return BMI
	 */
	public double calculateBmi() {
		return (this.weight / (Math.pow(height/100, 2)));
	}
	/**
	 * Compare if two person are the same
	 * @param p is the person whom we are comparing
	 * @return true if both person have the same nid
	 */
	public boolean equals(Person p) {
		if (this.nid.equalsIgnoreCase(p.nid)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public abstract String toString();
	
    /**
     * calculate salary of a person hours worked * rate
     * @param hoursWork
     * @param rate
     * @return salary of person
     */
	public abstract double calculateSalary(double hoursWork, double rate);
	
	public static void totalobj() {
	  System.out.print(count);
	}
	  
}

public class Hr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object student and lecturer.
		Student jSmith = new Student ("J1209950078563", "John Smith", 173, 67, "JBDA000", "Big Data Analyis", "John Donald");
		Lecturer max = new Lecturer ("M2905940078985", "Max Thomson", 189, 76, "Maths", "PML", 750, 1.5);
		Lecturer ally = new Lecturer ("A0408940089976", "Ally Mohammad", 177, 87, "Science", "Pml", 750, 3.0);

		Person[] obj = new Person[3];
		obj[0] = jSmith;
		obj[1] = max;
		obj[2] = ally;


		max.setAcademia("CTI");

		System.out.println((max.getNid()).equals(jSmith.getNid()));

		System.out.println(jSmith.calculateBmi());
		System.out.println("Name of student "+ jSmith.getName() + " has a salary of : " +jSmith.calculateSalary(0, 0) );
		System.out.println(jSmith.toString());

		System.out.println("About lecturer: ");
		System.out.println(max.toString());
		System.out.println(max.calculateSalary(750, 1.5));
		System.out.println(max.calculateBmi());

		for (int i=0; i<3; i++)
		  System.out.println(obj[i]);

		 Person.totalobj();


	}

}
