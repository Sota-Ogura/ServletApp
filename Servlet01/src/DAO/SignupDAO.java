package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignupDAO {

	public void execte(String id, String pass) {
		Connection con = null;

		try {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection(
					"jdbc:h2:tcp://localhost/~/test","sa","pass");
			String sql = "insert into ACCOUNT values(?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);

		    pstmt.executeUpdate();
		}catch (Exception e){
			System.out.print(e);
		}finally {
			try {
				if(con != null)	con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return;
	}
}