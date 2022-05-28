package com.dxc.ConImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.dxc.DBConnection.Dbconnection;
import com.dxc.Entity.Vender;

public class VenderImpl {
	
	
	
	public void addVender(Vender vr) throws ClassNotFoundException, SQLException
	{
		

		Connection con=null;
		con=Dbconnection.connect();
	

	PreparedStatement ps=con.prepareStatement("insert into CargoVender values(?,?,?,?,?)");
	
	ps.setString(1,vr.getCvname());
	ps.setInt(2,vr.getCvenderId());
	ps.setString(3,vr.getCvbranch());
	ps.setString(4,vr.getBranchId());
	ps.setString(5,vr.getCvbranchLoc());
	
	
	
	ps.executeUpdate();
	ps.close();
	
	
	con.close();
	}

	public ResultSet ListOfVenders(String cVname, int cTNo, String bD, String fL, String cL) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con =Dbconnection.connect();
		Statement stmt=null;
		
		
		 stmt=con.createStatement(); 
		
		
		String query="select CargoVenderName,CargoVenderId,CargoVenderBranch,CargoVenderBranchId,CargoVenderLoc from cargovender";
		 
		 ResultSet rs=stmt.executeQuery(query); 
		 
		return rs;
	}

}
