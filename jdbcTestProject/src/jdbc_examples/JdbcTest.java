package jdbc_examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated constructor stub
		String url = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "root";
		
		Connection myConn = DriverManager.getConnection(url, user, password);
		System.out.println("Database is connected...!");
		String st = "SELECT lastName, firstName, officeCode from EMPLOYEES LIMIT 10";
		Statement stmt = myConn.createStatement();
		ResultSet rs = stmt.executeQuery(st);
		while(rs.next()) {
			System.out.println(rs.getString("lastName")+ ", " + rs.getString("firstName"));
		}
	
		
//		String st2 = "SELECT lastName, firstName, officeCode FROM EMPLOYEES WHERE officeCode = ?";
//		String st2 = "SELECT lastName, firstName, officeCode FROM EMPLOYEES WHERE officeCode in (?,?)";
		String st2 = "SELECT lastName, firstName, officeCode FROM EMPLOYEES WHERE officeCode in (?,?)" + " and firstName = ?";
		PreparedStatement pst = myConn.prepareStatement(st2);
		pst.setInt(1, 3);
		pst.setInt(2, 5);
		pst.setString(3, "Yoshimi");
		ResultSet rs2 = pst.executeQuery();
		System.out.println("-------");
		while(rs2.next()) {
			System.out.println(rs2.getString("lastName")+ ", " + rs2.getString("firstName"));
		}
		System.out.println("-------");
		// get customer number from the user
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a customer number");
		int custNo = sn.nextInt();
		sn.nextLine();
		
		
		// query the database to get the customer info and display
		String q1 = "SELECT customerNumber, customerName, phone, country, creditLimit from customers where customerNumber = ? ;";
		PreparedStatement q1preparedStatement = myConn.prepareStatement(q1);
		q1preparedStatement.setInt(1, custNo);
		ResultSet rsq1 = q1preparedStatement.executeQuery();
		while(rsq1.next()) {
			System.out.printf("%-5s | %-10s | %-10s | %-10s | %-10s" ,
					rsq1.getInt("customerNumber"),
					rsq1.getString(2),
					rsq1.getString(3),
					rsq1.getString(4),
					rsq1.getString(5));
		}		
		// customerNumber, customerName, phone, country, creditLimit (edited) 
	}

}
