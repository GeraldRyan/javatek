package jdbc_examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateV {
	static Connection con = null;
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Test";
		String user = "root";
		String password = "root";

		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connecting to database...");
			
			Statement stmt = con.createStatement();
			String sql = "UPDATE employee " 
					+ "SET salary = 95000 WHERE id = 223";

			int rowC = stmt.executeUpdate(sql);
			System.out.printf("%s row(s) updated successfully...\n", rowC);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con!=null) {
				try {
					System.out.println("Closing the connection...");
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
