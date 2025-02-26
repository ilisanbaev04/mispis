package University;

public class AdministrativeEmployee extends Employee {

	/**
	 * 
	 * @param ssNo
	 * @param name
	 * @param email
	 */
	public AdministrativeEmployee(int ssNo, String name, String email) {
		this.ssNo = ssNo;
		this.name = name;
		this.email = email;
	}

	public String editEmail(String email) {
		this.email = email;
		return email;
	}
}