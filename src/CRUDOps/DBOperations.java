package CRUDOps;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import AInterfaces.sqlConnection;

public class DBOperations {
	Connection conn = null;

	public DBOperations() {

		conn = sqlConnection.sqlExpress();
	}

	public PersonInfo getPersonDetails(int id) {

		PreparedStatement pst = null;
		PersonInfo person = null;

		try {

			conn = sqlConnection.sqlExpress();

			String query = "SELECT  [Name] ,[DOB] ,[Gender]  ,[State]  FROM [calibur].[dbo].[PersonDetails] where SSID = ?";

			pst = conn.prepareStatement(query);
			pst.setInt(1, id);

			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				person = new PersonInfo();
				person.setSsid(id);
				person.setName(rs.getString(1));
				person.setDob(rs.getDate(2));
				person.setGender(rs.getString(3));
				person.setState(rs.getString(4));

			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return person;
	}

	public ArrayList<PersonInfo> getPersonDetails() {

		PreparedStatement pst = null;
		PersonInfo person = null;

		ArrayList<PersonInfo> persons = null;

		try {
			persons = new ArrayList<PersonInfo>();
			conn = sqlConnection.sqlExpress();

			String query = "SELECT  [Name] ,[SSID],[DOB] ,[Gender]  ,[State]  FROM [calibur].[dbo].[PersonDetails] ";

			pst = conn.prepareStatement(query);
			

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				person = new PersonInfo();
				
				person.setName(rs.getString(1));
				person.setSsid(rs.getInt(2));
				person.setDob(rs.getDate(3));
				person.setGender(rs.getString(4));
				person.setState(rs.getString(5));
				
				persons.add(person);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return persons;
	}
	
	public ResultSet getPersonDetailsAsResultSet() {

		PreparedStatement pst = null;
		
		ResultSet rs = null;

		try {
			conn = sqlConnection.sqlExpress();

			String query = "SELECT  [Name] ,[SSID],[DOB] ,[Gender]  ,[State]  FROM [calibur].[dbo].[PersonDetails] ";

			pst = conn.prepareStatement(query);
			

			rs = pst.executeQuery();

			

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} 

		return rs;
	}

	
	public void insertRecord(PersonInfo person) {
		PreparedStatement pst1 = null;
		try {

			conn = sqlConnection.sqlExpress();
			String query1 = "insert into PersonDetails (Name,DOB,SSID,Gender,State) values (?, ?, ?, ?, ?)";
			pst1 = conn.prepareStatement(query1);

			pst1.setString(1, person.getName());
			pst1.setDate(2, new java.sql.Date(person.getDob().getTime()));
			pst1.setInt(3, person.getSsid());
			pst1.setString(4, person.getGender());
			pst1.setString(5, person.getState());
			pst1.execute();

			JOptionPane.showMessageDialog(null, "Success!");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);

		} finally {
			try {
				pst1.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void updatePersonInfo(PersonInfo person) {
		PreparedStatement update = null;

		try {
			int cSSID = person.getSsid();

			conn = sqlConnection.sqlExpress();
			update = conn.prepareStatement(
					"UPDATE PersonDetails SET Name = ?, DOB = ?,  Gender = ?, State = ? WHERE SSID = " + cSSID);

			update.setString(1, person.getName());
			update.setDate(2, new java.sql.Date(person.getDob().getTime()));

			update.setString(3, person.getGender());
			update.setString(4, person.getState());

			update.executeUpdate();
			JOptionPane.showMessageDialog(null, "Saved!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);

		} finally {
			try {
				update.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public void deletePerson(int id){
		
		PreparedStatement update = null;
	
		try {
			conn = sqlConnection.sqlExpress();
			
			String sql = "delete from PersonDetails where SSID= " + id;
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.execute();
			
			JOptionPane.showMessageDialog(null, "Deleted!");
		} catch (Exception a) {
			JOptionPane.showMessageDialog(null, a);
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public boolean isRecordExists(int id) {

		boolean exists = false;
		PreparedStatement pst = null;

		try {

			conn = sqlConnection.sqlExpress();

			String query = "select count(*) from PersonDetails where SSID = ?";

			pst = conn.prepareStatement(query);
			pst.setInt(1, id);

			ResultSet rs = pst.executeQuery();
			int count = 0;

			if (rs.next()) {
				count = rs.getInt(1);
			}

			if (count > 0) {
				exists = true;
			}

			if (exists == true) {
				JOptionPane.showMessageDialog(null, "ERROR: This record already exists");
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return exists;
	}
}
