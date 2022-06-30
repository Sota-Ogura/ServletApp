package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class u_login_DAO {
	public String execute(String _id) {
		Connection con = null;
		String id = _id;
		String check = "null";

		try {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection(
					"jdbc:h2:tcp://localhost/~/test","sa","pass");
			String sql = "select pass from users where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);

			ResultSet rs = pstmt.executeQuery();
			rs.next();
			check = rs.getString("pass");

		}catch (Exception e){
			System.out.print(e);
		}finally {
			try {
				if(con != null)	con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return check;
	}

}
