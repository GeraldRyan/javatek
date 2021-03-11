package employee_crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeApp {
	private ArrayList<Employee> emps;

	public ArrayList<Employee> getEmps() {
		return emps;
	}

	public void setEmps(ArrayList<Employee> emps) {
		this.emps = emps;
	}

	public boolean addEmp(Employee emp) {
		// check if emp exists in DB already.
		if (bEmployeeExists(emp.getId())) {
			System.out.println("Employee already exists in the database");
			return false;
		}
		if (emps.add(emp)) {
			System.out.println("Employee successfully added");
			return true;
		}
		return false;
	}

	protected boolean bEmployeeExists(int id) {
		List<Employee> l = emps.stream().filter(e -> e.getId() == id).collect(Collectors.toList());
		if (l.size() > 0) {
			return true;
		}
		return false;
	}

	public Employee getEmp(int id) {
		// return ee if exists
		if (!bEmployeeExists(id)) {
			System.out.printf("Employee %d does not exist in our records. PLease enter a different name or id\n", id);
			return null;
		}
		Employee e = emps.stream().filter(ee -> ee.getId() == id).findFirst().orElse(null);
		System.out.printf("%-10d | %-15s | %-20s | %-15.2f\n", e.getId(), e.getName(), e.getTitle(), e.getSalary());
		// return null if not

		return null;
	}

	public void updateEmp(Employee emp) {
		// check if ee exists in db
		// if so update
		// if not add
	}

	public void removeEmp(int i) {
		// remove emp from the database only if it exists
	}

	public void displayAllEmployees() {
		System.out.printf("%-10s | %-15s | %-20s | %-15s\n", "ID", "Name", "Title", "Salary");
		for (Employee e : emps) {

			System.out.printf("%-10d | %-15s | %-20s | %-15.2f\n", e.getId(), e.getName(), e.getTitle(), e.getSalary());
		}

	}
}
