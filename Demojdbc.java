package jdbcDemo;

import java.sql.*;
public class Demojdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/logindata";
		String uname="root";
		String pass="Give your root password here";
		String query = "select * from userdetails1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st =con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			
		String name = rs.getString("uname");
		String password=rs.getString("pass");
		System.out.println(name+" "+password);
		}
		st.close();
		con.close();
	}

}
