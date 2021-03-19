package jpa.mainrunner;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		StudentService studentApp = new StudentService();
		CourseService courseApp = new CourseService();
//		ItemApp.connect();
		Student student;
		int id;
		/*
		 * 1. Add a student to the database 2. Access department from the database 3.
		 * Update an employee info in the database 4. Remove an employee from the
		 * database 5. Display all employee info 6. validate employee 7. Update employee
		 * salary 8. Quit
		 */

		int choice = 0;
		while (choice != 2) {
			menu();
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("\nEnter your email and password :: ");
				boolean bValid = studentApp.validateStudent(sc.nextLine(), sc.nextLine());
				if (bValid) {
					System.out.println("You're in");
					int chois = 0;
					while (chois != 2) {
						menu2();
						chois = sc.nextInt();
						sc.nextLine();
						switch (chois) {
						case 1:
							// Display all courses in Database
							System.out.println("\nEnter what course you want TO IMPLEMENT");
							break;
						case 2:
							System.out.println("Logging out");
							break;
						}
					}
				} else {
					System.out.println("Invalid password, try again");
				}
				break;
			case 99:
				System.out.println("Displaying all students");
				studentHeader();
				List<Student> studs = studentApp.getAllStudents();
				studs.forEach(System.out::println);
				break;
			case 2:
//				ItemApp.close();
				System.out.println("\nClosing the app...");
				break;
			}
		}
		sc.close();
	}

	public static void menu() {
		System.out.println("\n**Item DataBase App**");
		System.out.println("1. Log In");
		System.out.println("2. Quit");
//		System.out.println("3. Update an Department");
//		System.out.println("4. Remove a Department");
//		System.out.println("5. Display all Departments");
//		System.out.println("6. Validate an employeee");
//		System.out.println("7. Update EE Salary");
//		System.out.println("8. Quit");
	}

	public static void menu2() {
		System.out.println("\n**Item DataBase App**");
		System.out.println("1. Register for class");
		System.out.println("2. Log Out");
	}

	public static void classHeader() {
		System.out.format("\n%5s %20s %20s\n", "ID", "Class Name", "Instructor Name");
		System.out.println("-".repeat(51));
	}
	public static void studentHeader() {
		System.out.format("\n%5s %20s %20s %20s\n", "email", "Name", "courses", "password");
		System.out.println("-".repeat(81));
	}


	public static void registration() {

	}

}
