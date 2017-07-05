package AInterfaces;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class sqlConnection {
	Connection conn = null;

	public static Connection c() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager
					.getConnection("jdbc:sqlite:C:\\Users\\sathv\\workspace\\EmployeeData.sqlite");
			// JOptionPane.showMessageDialog(null, "Connected");
			return conn;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}

	}

	public static Connection ud() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sathv\\workspace\\UserData.sqlite");
			// JOptionPane.showMessageDialog(null, "Connected");
			return conn;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}

	}

	public static Connection sqlExpress() {
		Connection conn = null;
		try {
			String url = "jdbc:sqlserver://localhost:62761;databaseName=calibur";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, "sa", "Saibaba");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}

	public static Connection sqlExpressUserData() {
		Connection conn = null;
		try {
			String url = "jdbc:sqlserver://localhost:62761;databaseName=UserCourseCompletion";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, "sa", "Saibaba");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}

}
