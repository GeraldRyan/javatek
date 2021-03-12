package jdbc_examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated constructor stub
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "root";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connecting to the database...");
			Statement stmt = con.createStatement();
			String sql = "USE classicmodels; CREATE TABLE Employee (id INT, name varchar(50), " + "title VARCHAR(50), SALARY (DECIMAL)";
			stmt.executeUpdate(sql);
		}

		catch (SQLException e) {
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
