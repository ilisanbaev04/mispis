package University;

public String fieldOfStudy;

public ResearchAssociate(int ssNo, String name, String email, String fieldOfStudy) {
		super(ssNo, name, email);
		this.fieldOfStudy = fieldOfStudy;
		}

public String getFieldOfStudy() {
		return fieldOfStudy;
		}

public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
		}

public void editFieldOfStudy(String newFieldOfStudy) {
		this.fieldOfStudy = newFieldOfStudy;
		}

@Override
public void editEmail(String newEmail) {
		setEmail(newEmail);
		}
}