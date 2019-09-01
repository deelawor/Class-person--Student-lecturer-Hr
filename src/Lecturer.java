/**
 * 
 */

/**
 * @author DELL
 *
 */
public class Lecturer extends Person {
              
	//defines attributes
	private String speciality ; 
	private String academia; 
	private double hoursWork;
	private double rate;
	/**
	 * 
	 */
	public Lecturer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nid
	 * @param name
	 * @param height
	 * @param weight
	 */
	public Lecturer(String nid, String name, double height, double weight, String speciality, String academia, double hoursWork, double rate) {
		super(nid, name, height, weight);
		// TODO Auto-generated constructor stub
		this.speciality= speciality ;
		this.academia = academia ; 
		this.hoursWork = hoursWork;
		this.rate = rate;
	}

	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @return the accademia
	 */
	public String getAcademia() {
		return academia;
	}

	/**
	 * @return the hoursWork
	 */
	public double getHoursWork() {
		return hoursWork;
	}

	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	/**
	 * @param accademia the accademia to set
	 */
	public void setAcademia(String accademia) {
		this.academia = accademia;
	}

	/**
	 * @param hoursWork the hoursWork to set
	 */
	public void setHoursWork(double hoursWork) {
		this.hoursWork = hoursWork;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (" National identity :" + super.getNid() + " .Name : "+ super.getName() + " .Height : " + super.getHeight() +" .Weight : " 
				+ super.getWeight() + " specialised in : " + this.getSpeciality() + " at "+ this.getAcademia()+ ".");
	}

	@Override
	public double calculateSalary(double hoursWork, double rate) {
		// TODO Auto-generated method stub
	      return (this.hoursWork * this.rate);
	}

}
