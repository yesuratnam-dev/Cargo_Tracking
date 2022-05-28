package com.dxc.ConImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dxc.DBConnection.Dbconnection;

public class ListOfVenders {
	
	
	public void list() throws ClassNotFoundException, SQLException
	{
	Connection con=Dbconnection.connect();
	
	
	Statement s=con.createStatement();
	ResultSet res=s.executeQuery("select distinct * from cargovender");

	while (res.next())
	{
		System.out.println(res.getString("CargoVenderName")+""+res.getInt("cargoVenderId"));
	}
	
	
	}
}
