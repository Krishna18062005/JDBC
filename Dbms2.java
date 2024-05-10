package Conection;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbms2 {

	public static void main(String[] args) {
		try {
		String url="jdbc:mysql://localhost:3306/cb2232";
		String name="root";
		String password="mysql@123";
		Connection con = DriverManager.getConnection(url,name,password); 
		Statement st=con.createStatement();
		//st.executeUpdate("create table Krishmatrix(name varchar(20),rollno int)");
		//st.executeUpdate("insert into krishmatrix values('akal',06)");
		//st.executeUpdate("Delete from krishmatrix where rollno=3");
		ResultSet result=st.executeQuery("Select * from krishmatrix");
		
		while(result.next()) {
			System.out.println(result.getString(1)+ " " + result.getInt(2));
		}
		

		//st.executeUpdate("");
//		System.out.println("Connected");
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}

	}

}
