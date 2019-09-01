/**
 * 
 */

/**
 * @author DELL
 *
 */
public abstract class Person {
	/*Defining our attributes*/
	private String nid;
	private String name;
	private double height;
	private double weight;
	
	
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
	
	
	
	
	
	
	
	

}
