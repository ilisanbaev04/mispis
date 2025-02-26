package University;

public class Project {

	public String name;
	public Date start;
	public Date end;

	/**
	 * 
	 * @param name
	 * @param start
	 * @param end
	 */
	public Project(String name, Date start, Date end) {
		this.name = name;
		this.start = start;
		this.end = end;
	}

	/**
	 * 
	 * @param String
	 */
	public String toString() {
		return "name: " + name + "start: " + start + "end: " + end;
	}

}