package manager_and_trainee;

public class Trainee extends Employee {

	public Trainee(long Id, String Name, String address, long phone) {
		super(Id, Name, address, phone);
	}
	
	public Trainee(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		this.basicSalary = salary;
	}



}
