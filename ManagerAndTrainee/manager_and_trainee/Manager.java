package manager_and_trainee;

public class Manager extends Employee {

	public Manager(long Id, String Name, String address, long phone) {
		super(Id, Name, address, phone);
	}
	
	public Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		this.basicSalary = salary;
	}

	public double calculateTransportAllowance(){
		return this.basicSalary*.15;
	}


}
