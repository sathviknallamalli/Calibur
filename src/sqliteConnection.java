import java.sql.*;
import javax.swing.*;

public class sqliteConnection {
	Connection conn = null;

	public static Connection c() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sathv\\workspace\\EmployeeData.sqlite");
			//JOptionPane.showMessageDialog(null, "Connected");
			return conn;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}

	}

}
