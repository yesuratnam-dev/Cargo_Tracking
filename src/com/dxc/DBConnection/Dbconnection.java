package com.dxc.DBConnection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {

	
public static java.sql.Connection connect() throws SQLException, ClassNotFoundException 
{	
	final String dbdriver="com.mysql.cj.jdbc.Driver";
	
	final String url="jdbc:mysql://localhost:3306/cargotracking";
	
	final String user="root";

	final String password="Rat.mid-90";
	
	
	Class.forName(dbdriver);

	java.sql.Connection con=DriverManager.getConnection(url,user,password);
	if(con!=null)
	{
		System.out.println("Connected In DBConnection");
	}

	return con;

}  

}
