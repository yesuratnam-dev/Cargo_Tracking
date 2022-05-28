package com.dxc.Consignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.ConImpl.ConsignmentImpl;
import com.dxc.ConImpl.SearchProduct;
import com.dxc.DBConnection.Dbconnection;
import com.dxc.Entity.Order;

/**
 * Servlet implementation class ProductDetails
 */
@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		
		


		

		/*
		 * try {
		 * 
		 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection
		 * c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cargotracking",
		 * "root","Rat.mid-90"); if(c==null) {
		 * System.out.println("Connection failed inside MainClass"); } else if(c!=null)
		 * { System.out.println("Connected to database");
		 * 
		 * }
		 * 
		 * @SuppressWarnings("unused") Connection con=null;
		 */
			 

			try {
				Connection con = Dbconnection.connect();
			
			Statement stmt = null;
			
			
			  
			
			
			
			 int ConTrackingNo = Integer.parseInt(request.getParameter("Contrackingno"));

			
			  stmt=con.createStatement();
			  String query="select ConsignmentNo,ConTrackingNo,CargoVenderName,BookingDate,FromLoc,CurrentLoc,DestLoc from consignment where ConTrackingNo='"
			  +ConTrackingNo+"'";
			  
			  ResultSet rs=stmt.executeQuery(query);
			  /*	
			  request.setAttribute("Search",rs);
				
				RequestDispatcher dispatcher=request.getRequestDispatcher("SearchProductResult.jsp");
			
				dispatcher.forward(request,response);
			con.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch blocks
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/		  
			  
			 
//Carefull
			
			  while(rs.next()) { 
			  
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
			  
			  out.println("Destination_Location: "+DL); }
			 

			con.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			

			/*
			 * } catch (Exception e) { out.println(e); }
			 */

		/*
		 * Consignment Con=new Consignment();
		 * 
		 * try { Con.DbConnection(); } catch (ClassNotFoundException | SQLException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); }
		 */

		
		/*
		 * int CTNo = Integer.parseInt(request.getParameter("Contrackingno"));
		 */

			/*
			 * SearchProduct imp=new SearchProduct(); try { ArrayList<Order>
			 * cn=imp.SearchCon(CTNo); } catch (ClassNotFoundException e1) { // TODO
			 * Auto-generated catch block e1.printStackTrace(); } catch (SQLException e1) {
			 * // TODO Auto-generated catch block e1.printStackTrace(); }
			 * 
			 * 
			 * try { imp.SearchCon(CTNo); }catch(Exception e) {
			 * 
			 * }
			 */
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
