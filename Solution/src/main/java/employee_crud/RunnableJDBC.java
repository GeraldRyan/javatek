package employee_crud;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class RunnableJDBC {

	public static void main(String[] args) throws SQLException {
		EmployeeAppJDBC appInstance = new EmployeeAppJDBC();
		Employee e1 = new Employee(101, "Young", "Intern", 50000);
		Employee e2 = new Employee(223, "Elijah", "Senior Manager", 85000);
		Employee e3 = new Employee(150, "Jean", "CEO", 300000);

//		ArrayList<Employee> initialData = new ArrayList<Employee>();
//		initialData.add(e1);
//		initialData.add(e2);
//		initialData.add(e3);
//
//		appInstance.setEmps(initialData);
//		System.out.println(appInstance.getEmps());

		/**
		 * 1. Add an employee to the db 2. Access an employee 3. Update an employee 4.
		 * Remove an employee from the database 5. Display all employee info 6. Quit
		 */
		Scanner reader = new Scanner(System.in);

		Integer choice = 0;
		appInstance.connect();
		while (choice != 6) {
			menu();
			choice = reader.nextInt();
			switch (choice) {
			case 1:
				// Check if employee already exists
				// TODO Implement me
//				
//				if (appInstance.bEmployeeExists(id)) {
//					System.out.println("Employee already exists. Please confirm your data or try with a different id");
//					break;
//				}
				
				System.out.print("\nEnter the new employee's name:\n");
				String name = reader.next();
				System.out.print("\nEnter the employee's title:\n");
				String title = reader.next();
				System.out.print("\nEnter the employee's salary:\n");
				double salary = reader.nextDouble();
//				Employee employee = new Employee(id, name, title, salary);
				appInstance.addEmp(name, title, salary);
				break;
			case 2:
				System.out.println("Enter the name or id of the employee to access");
				String s = reader.next();
				reader.nextLine();
//				try {
//					Integer.parseInt(s);
//					appInstance.getEmp(Integer.parseInt(s));
//				}
//				catch (NumberFormatException nfe){
//					appInstance.getEmp(s);
//				}

				break;
			case 3:
				System.out.println("Enter the name or id of the employee to update");
//				appInstance.displayAllEmployees();
				reader.nextLine();
				break;
			case 4:
				System.out.println("Enter the name of the employee to remove");
				reader.nextLine();
				String emp_name = reader.nextLine();

				break;
			case 5:
				System.out.println("Displaying all employees");
				try {
					appInstance.displayAllEmployees();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 6:
				appInstance.disconnect();
				break;
			}
		}
		reader.close();
	}

	public static void menu() {
		System.out.println("Choose an action:");
		System.out.println("1. Add an employee to the database");
		System.out.println("2. Access an employee's information");
		System.out.println("3. Update an employee's details");
		System.out.println("4. Remove an employee from the database");
		System.out.println("5. Display all employee info");
		System.out.println("6. Quit");
	}
}
