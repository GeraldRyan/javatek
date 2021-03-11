package employee_crud;

public class Employee {
	private int id;
	private String name;
	private String title;
	private double salary;
	

	public Employee(int id, String name, String title, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.salary = salary;
	}
	
	public Employee(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}



}
