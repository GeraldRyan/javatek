package main;

import java.sql.SQLException;
import java.util.Scanner;

import entity.Item;
import service.ItemService;

public class MainApp {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		ItemService ItemApp = new ItemService();
//		ItemApp.connect();
		Item Item;
		int id;
		/*
		 * 1. Add an Item to the database 2. Access department from the database 3.
		 * Update an employee info in the database 4. Remove an employee from the
		 * database 5. Display all employee info 6. validate employee 7. Update employee
		 * salary 8. Quit
		 */

		int choice = 0;
		while (choice != 8) {
			menu();
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("\nEnter the Item ID, name and price");
				Item new_Item = new Item(Integer.parseInt(sc.nextLine()), sc.nextLine(),
						Double.parseDouble(sc.nextLine()));
				ItemApp.addItemService(new_Item);
				break;
//			case 2:
//				System.out.println("Enter the Department ID");
//				id = Integer.parseInt(sc.nextLine());
//				d = app.getDepartment(id);
//				if (d != null) {
//					header();
//					System.out.println(d);
//				}
//				break;
//			case 3:
//				System.out.println("\nEnter the Department ID, Name and state to be updated");
//				d = new Department(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()); 
//				app.updateDepartmentService(d);
//				break;
//			case 4:
//				System.out.println("Enter the Department ID to be removed");
//				id = Integer.parseInt(sc.nextLine());
//				app.removeDepartmentService(id);
//				break;
//			case 5:
//				header();
//				app.getAllDeptsService().forEach(System.out::println);
//				break;
//			case 6:
//				System.out.println("\nEnter the Employee ID, Name, and Title to be validated");
//				boolean valid = app.validateEmpService(Integer.parseInt(sc.nextLine()),
//						sc.nextLine(), sc.nextLine());
//				if (valid) {
//					System.out.println("The employee is validated");
//				} else {
//					System.out.println("Invalid employee");
//				}
//				break;
//			case 7:
//				System.out.println("\nEnter employee id of employee to update");
//				int eid = sc.nextInt();
//				System.out.println("\nEnter New Salary");
//				double salary = sc.nextDouble();
////				e = app.getEmpService(id);
////				e.setSalary(salary);
//				app.updateEmployeeSalaryService(eid, salary);
//				System.out.println("\nSalary updated");						
//				break;
			case 8:
//				ItemApp.close();
				System.out.println("\nClosing the app...");
				break;
			}
		}
		sc.close();
	}

	public static void menu() {
		System.out.println("\n**Item DataBase App**");
		System.out.println("1. Add an Item");
//		System.out.println("2. Access a Department");
//		System.out.println("3. Update an Department");
//		System.out.println("4. Remove a Department");
//		System.out.println("5. Display all Departments");
//		System.out.println("6. Validate an employeee");
//		System.out.println("7. Update EE Salary");
		System.out.println("8. Quit");
	}

	public static void header() {
		System.out.format("\n%3s %15s %20s\n", "ID", "name", "price");
		System.out.println("-".repeat(51));
	}

}
