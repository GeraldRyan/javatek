package file_examples;

public class Course {
	String code, name, instructor;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public Course(String code, String name, String instructor) {
		super();
		this.code = code;
		this.name = name;
		this.instructor = instructor;
	}


}
