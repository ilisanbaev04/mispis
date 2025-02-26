package University;

public abstract class Employee {

	public int ssNo;
	public String name;
	public String email;
	public int counter;

	/**
	 *
	 * @param ssNo
	 * @param name
	 * @param email
	 */
	public Employee(int ssNo, String name, String email) {
		this.ssNo = ssNo;
		this.name = name;
		this.email = email;
		this.counter = 0;
	}

}