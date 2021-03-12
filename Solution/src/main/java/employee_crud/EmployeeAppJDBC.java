package employee_crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeAppJDBC {
	Connection con = null;
	int id = 101;
	private ArrayList<Employee> emps;

	public ArrayList<Employee> getEmps() {
		return emps;
	}

	public EmployeeAppJDBC() {

		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "root";

		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connecting to the database..");
			System.out.println("Populating Database..");
			Statement stmt = con.createStatement();
			String createTableQ = "create table EMPLOYEES (id int, name varchar(20), title varchar(100), salary double); ";
			String insertQuery = "INSERT INTO EMPLOYEES VALUES (101, 'Eren Jaeger', 'Shingeki no Kyojin', 100000); ";
			stmt.addBatch("use test;");
			stmt.addBatch("Drop table if exists employees;");
			stmt.addBatch(createTableQ);
			stmt.addBatch(insertQuery);
			stmt.addBatch(
					"INSERT INTO EMPLOYEES VALUES (102, 'Mikasa Ackerman', 'boyguard', 20000); ");
			stmt.addBatch(
					"INSERT INTO EMPLOYEES VALUES (103, 'Kenny Ackerman', 'outlaw', 5000000);");
			stmt.executeBatch();
			id = id + 3;
			stmt.execute("select * from EMPLOYEES LIMIT 5");
			ResultSet rs = stmt.getResultSet();

			while (rs.next()) {
				System.out.println(rs.getString("id") + " | " + rs.getString("name") + " | "
						+ rs.getString("title") + " | " + rs.getDouble("salary"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void connect() {

		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "root";
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection established with database");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		try {
			con.close();
			System.out.println("Connection to the database closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//
//	public void setEmps(ArrayList<Employee> emps) {
//		this.emps = emps;
//	}
//
	public void addEmp(String name, String title, Double salary) throws SQLException {
		// check if emp exists in DB already.
		// create a statement
		// execute statement
		Statement stmt = con.createStatement();
		stmt.execute("use test");
		String insertStr = "insert into employees values (?, ?, ?, ?);";
		PreparedStatement pst = con.prepareStatement(insertStr);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, title);
		pst.setDouble(4, salary);
		pst.execute();
		id++;
		System.out.println("Employee added successfully");
		stmt.execute("select * from employees;");
		ResultSet rs = stmt.getResultSet();
//		while (rs.next()) {
//			System.out.println(rs.getString(1));
//		}

	}

//	protected boolean bEmployeeExists(int id) {
//		List<Employee> l = emps.stream().filter(e -> e.getId() == id).collect(Collectors.toList());
//		if (l.size() > 0) {
//			return true;
//		}
//		return false;
//	}
//
//	public Employee getEmp(int id) {
//		// return ee if exists
//		if (!bEmployeeExists(id)) {
//			System.out.printf("Employee %d does not exist in our records. PLease enter a different name or id\n", id);
//			return null;
//		}
//		Employee e = emps.stream().filter(ee -> ee.getId() == id).findFirst().orElse(null);
//		System.out.printf("%-10d | %-15s | %-20s | %-15.2f\n", e.getId(), e.getName(), e.getTitle(), e.getSalary());
//		// return null if not
//
//		return null;
//	}
//
//	public void getEmp(String s) {
//		System.out.println(s);
//		Employee e = emps.stream().filter(ee -> ee.getName().matches(s)).findFirst().orElse(null);
//		System.out.printf("%-10d | %-15s | %-20s | %-15.2f\n", e.getId(), e.getName(), e.getTitle(), e.getSalary());
//	}
//
//	public void updateEmp(Employee emp) {
//		// check if ee exists in db
//		// if so update
//		// if not add
//	}
//
//	public void removeEmp(int i) {
//		// remove emp from the database only if it exists
//	}
//
	public void displayAllEmployees() throws SQLException {

		Statement stmt = con.createStatement();
		stmt.execute("use test;");
		stmt.execute("select * from EMPLOYEES LIMIT 5");
		ResultSet rs = stmt.getResultSet();
		System.out.printf("%-10s | %-15s | %-20s | %-15s\n", "ID", "Name", "Title",
				"Salary\n");
		while (rs.next()) {
			System.out.println(rs.getString("id") + " | " + rs.getString("name") + " | "
					+ rs.getString("title") + " | " + rs.getDouble("salary"));
		}
	}

	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "root";

		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connecting to the database..");
			Statement stmt = con.createStatement();
			String createTableQ = "create table EMPLOYEES (id int, name varchar(20), title varchar(100), salary double); ";
			String insertQuery = "INSERT INTO EMPLOYEES VALUES (101, 'Eren Jaeger', 'Shingeki no Kyojin', 100000); ";
			stmt.addBatch("use test;");
			stmt.addBatch("Drop table if exists employees;");
			stmt.addBatch(createTableQ);
			stmt.addBatch(insertQuery);
			stmt.addBatch(
					"INSERT INTO EMPLOYEES VALUES (102, 'Mikasa Ackerman', 'boyguard', 20000); ");
			stmt.addBatch(
					"INSERT INTO EMPLOYEES VALUES (103, 'Kenny Ackerman', 'outlaw', 5000000);");
			stmt.executeBatch();
			stmt.execute("select * from EMPLOYEES LIMIT 5");
			ResultSet rs = stmt.getResultSet();

			while (rs.next()) {
				System.out.println(rs.getString("id") + " | " + rs.getString("name") + " | "
						+ rs.getString("title") + " | " + rs.getDouble("salary"));
			}
			// bIsWorking == true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
