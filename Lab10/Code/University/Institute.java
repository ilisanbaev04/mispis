package University;

import java.util.ArrayList;
import java.util.List;

public class Institute {

	private Employee dean;
	private String name;
	private String address;
	private List<ResearchAssociate> employees; // Renamed to avoid confusion with class name

	/**
	 * @param name
	 * @param address
	 */
	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
		this.employees = new ArrayList<>();
	}

	/**
	 * @param employee
	 */
	public void manageEmployee(ResearchAssociate employee) {
		if (employee != null) {
			employees.add(employee);
		} else {
			System.out.println("Cannot add a null employee.");
		}
	}

	public Employee getDean() {
		return dean;
	}

	public void setDean(Employee dean) {
		this.dean = dean;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public List<ResearchAssociate> getEmployees() {
		return employees;
	}
}