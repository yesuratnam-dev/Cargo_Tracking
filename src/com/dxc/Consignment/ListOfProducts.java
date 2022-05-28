package com.dxc.Consignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.DBConnection.Dbconnection;

/**
 * Servlet implementation class ListOfProducts
 */
@WebServlet("/ListOfProducts")
public class ListOfProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		   PrintWriter out=response.getWriter();

		   String ConTrackingNo=request.getParameter("Contrackingno");
		   
		   try
			{
				/*
				 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection
				 * c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cargotracking",
				 * "root","Rat.mid-90"); if(c==null) {
				 * System.out.println("Connection failed inside MainClass"); } else if(c!=null)
				 * { System.out.println("Connected to database");
				 * 
				 * }
				 */
				@SuppressWarnings("unused")
				
				/* Dbconnection db=new Dbconnection(); */
				
				Connection con =Dbconnection.connect();
				Statement stmt=null;
				
				
				 stmt=con.createStatement(); 
				
				  String query="select ConsignmentNo,ConTrackingNo,CargoVenderName,BookingDate,FromLoc,CurrentLoc,DestLoc from consignment";
				 
				 ResultSet rs=stmt.executeQuery(query); 
				 @SuppressWarnings("unused")
				String i=ConTrackingNo;
				
				
				 
				 while(rs.next())
				 {
						/* out.println(rs); */
					 
					 int ConNo=rs.getInt("ConsignmentNo");
					 
					 int CTNo=rs.getInt("ConTrackingNo");
					 
					String CVname=rs.getString("CargoVenderName");
					 
					String BD=rs.getString("BookingDate");
					 
					String FL=rs.getString("FromLoc");
					
					String CL=rs.getString("CurrentLoc");
					
					String DL=rs.getString("DestLoc");
					
					out.println("ConsignmentNo: "+ConNo);
					
					out.println("Consingment_Tracking_No: "+CTNo);
					
					out.println("Cargo_Vendor_Name: "+CVname);
					
					out.println("BookingDate: "+BD);
					
					out.println("From_Location : "+FL);
					
					out.println("Current_Location: "+CL);
					
					out.println("Destination_Location: "+DL);
				 }
				rs.close();
				 con.close();
				 
			}catch(Exception e)
		   {
				out.println(e);
		   }
		

	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
