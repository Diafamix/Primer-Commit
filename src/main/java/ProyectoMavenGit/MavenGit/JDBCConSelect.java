package ProyectoMavenGit.MavenGit;

import java.sql.*;

class JDBCConSelect {
	public static void main(String args[]) {
		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "Oracle.123");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select name,population from city where name = 'Madrid' ");
			while (rs.next())
				System.out
						.println(rs.getString(1) + "  " + rs.getString(2));
			con.close();
	} catch (SQLException e) {
			System.out.println(e);
		}
	}
}