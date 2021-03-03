/**
 * 
 */
package manager_and_trainee;


public class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
	public Employee(long Id, String Name, String address, long phone){
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
	public double calculateSalary() {
		return basicSalary + (basicSalary * specialAllowance/100) + (basicSalary* hra/100);
	}
	
	public double calculateTransportAllowance(){
		return this.basicSalary*.1;
	}
}


