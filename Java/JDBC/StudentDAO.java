package student.dao;

import java.sql.*;
import java.util.ArrayList;

import student.entity.StudentDTO;
import student.util.StudentException;

public class StudentDAO {

	public 	StudentDAO() throws StudentException{		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			throw new StudentException("Oracle Driver Registration Failure");
		}	
	}
	
	public void insertStudent(StudentDTO StudentDTO) throws StudentException{
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","1234");
			stmt = con.prepareStatement("Insert into Student values(?,?,?,?,?)");
			stmt.setInt(1, StudentDTO.getNo());
			stmt.setString(2, StudentDTO.getName());
			stmt.setString(3, StudentDTO.getDet());
			stmt.setString(4, StudentDTO.getAddr());
			stmt.setString(5, StudentDTO.getTel());
			
			int i = stmt.executeUpdate();
			System.out.println(i + " has been inserted.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new StudentException("Inserting a member failed.");
		} finally {
			try {
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
		
	}
	
	public ArrayList<StudentDTO> printAllStudents() throws StudentException {
		Connection con=null;
		PreparedStatement stmt=null;
		
		try {			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","1234");
			stmt = con.prepareStatement("Select * From Student");			
			ResultSet rs = stmt.executeQuery();
			ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
			while(rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				String det = rs.getString(3);
				String addr = rs.getString(4);
				String tel = rs.getString(5);
				StudentDTO s = new StudentDTO(no, name, det, addr, tel);
				list.add(s);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new StudentException("selecting a member failed.");
		} finally {
			try {
				if(stmt!=null) stmt.close();
				if(con !=null) con.close();
			} catch (SQLException e) {
				
			}
			
		}	
	}
}
