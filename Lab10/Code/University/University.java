package University;

public class University {

	public String name;
	public List<Faculty> faculties;

	public University(String name) {
		this.name = name;
		this.faculties = new ArrayList<>();
	}

	public void addFaculty(Faculty faculty) {
		faculties.add(faculty);
	}

	public void deleteFaculty(Faculty faculty) {
		faculties.remove(faculty);
	}

}