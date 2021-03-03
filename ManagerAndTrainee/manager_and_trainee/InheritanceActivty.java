package manager_and_trainee;

public class InheritanceActivty {

	public InheritanceActivty() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager peter_man = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		System.out.println("Peter Makes " + peter_man.calculateSalary());
		Trainee jack_t = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000); 
		System.out.println("Jack Makes only " + jack_t.calculateSalary());
		System.out.println(jack_t.calculateTransportAllowance());
		System.out.println(peter_man.calculateTransportAllowance());
	}
}
