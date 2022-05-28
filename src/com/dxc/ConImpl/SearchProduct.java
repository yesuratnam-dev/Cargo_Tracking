package com.dxc.ConImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dxc.DBConnection.Dbconnection;
import com.dxc.Entity.Order;

public class SearchProduct {

	
	

	 

	public ArrayList<Order> SearchCon(int CTNo) throws ClassNotFoundException, SQLException
	{
		Connection con =Dbconnection.connect();
		System.out.println("Connected");

		String Query="select * from consignment Where ConTrackingNo=?";
		PreparedStatement ps=con.prepareStatement(Query);
		ps.setInt(2,CTNo);	
		ResultSet rs=ps.executeQuery();	
		
	while(rs.next())
	{
		
		System.out.println("ConsignmentNo"+rs.getInt(1)+"ConTrackingNo:"+rs.getInt(2)+"CargoVenderName"+rs.getNString(3)+"BookingDate"+rs.getNString(4));
				
	}
		
		
	
			con.close();
			return (ArrayList<Order>) rs;
}
	
}
