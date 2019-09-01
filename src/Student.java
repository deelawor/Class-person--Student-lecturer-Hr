/**
 * 
 */

/**
 * @author DELL
 *
 */
public class Student extends Person {
	//Defining additional attributes
	private String sid;
	private String course;
	private String responsibleParty;

	/**
	 * Default constructor
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nid
	 * @param name
	 * @param height
	 * @param weight
	 */
	public Student(String nid, String name, double height, double weight, String sid, String course, String responsibleParty) {
		super(nid, name, height, weight);
		// TODO Auto-generated constructor stub
		this.sid = sid;
		this.course = course;
		this.responsibleParty = responsibleParty;
	}

	/**
	 * @return the sid
	 */
	public String getSid() {
		return sid;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}

	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}

	/**
	 * @return the responsibleParty
	 */
	public String getResponsibleParty() {
		return responsibleParty;
	}

	/**
	 * @param responsibleParty the responsibleParty to set
	 */
	public void setResponsibleParty(String responsibleParty) {
		this.responsibleParty = responsibleParty;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Student info: " + "\n"+ "Nid: " + super.getNid() + " .Name: "+ super.getName() +
				" .Height: " + super.getHeight() +" .Weight: " 
				+ super.getWeight() + " .Student ID: " + this.getSid() + " .Course: " +
				this.getCourse() + " .Responsible Party: " + this.getResponsibleParty() ) ;
	}

	@Override
	public double calculateSalary(double hoursWork, double rate) {
		// TODO Auto-generated method stub
		return 0.0;
	}

}
