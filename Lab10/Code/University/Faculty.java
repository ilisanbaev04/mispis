package University;

public class Faculty {

	public String name;
	public Employee dean;
	public List<Institute> Institutes;

	/**
	 * 
	 * @param name
	 * @param dean
	 */
	public Faculty(String name, Employee dean) {
		this.name = name;
		this.dean = dean;
		this.Institutes = new ArrayList<>();
	}

	/**
	 * 
	 * @param institute
	 */
	public void AddInstitute(Institute institute) {
		this.Institutes.add(institute);
	}

	public void DeleteInstitute(Institute institute) {
		this.Institutes.remove(institute);
	}

}