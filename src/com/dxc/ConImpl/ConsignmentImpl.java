package com.dxc.ConImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.dxc.DBConnection.Dbconnection;
import com.dxc.Entity.Order;

public class ConsignmentImpl
{
	
	public void addConsignment(Order or) throws ClassNotFoundException, SQLException
	{
		

		Connection con=null;
		con=Dbconnection.connect();
	

	PreparedStatement ps=con.prepareStatement("insert into consignment values(?,?,?,?,?,?,?)");
	ps.setInt(1,or.getConsignmentNO());
	ps.setInt(2,or.getConTrackingNo());
	ps.setString(3,or.getCVName());
	ps.setString(4,or.getBookingDate());
	ps.setString(5,or.getFromLoc());
	
	ps.setString(6,"Not Yet Dispatched");
	
	ps.setString(7,or.getDestLoc());
	
	
	ps.executeUpdate();
	ps.close();
	
	
	con.close();

	
	}

	
}
