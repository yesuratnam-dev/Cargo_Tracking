package com.dxc.Consignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.ConImpl.ConsignmentImpl;
import com.dxc.Entity.Order;

/**
 * Servlet implementation class Consignment_Servlet
 */
@WebServlet("/Consignment_Servlet")
public class Consignment_Servlet extends HttpServlet {
	
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();

		int ConsignmentNo=Integer.parseInt(request.getParameter("Consignmentno"));
		
		int ConTrackingNo=Integer.parseInt(request.getParameter("Contrackingno"));

		String Cvname=request.getParameter("Cvname");		
		
	    String BookingDate=request.getParameter("Bookingdate");
		 
		String FromLoc=request.getParameter("Fromloc");

		/* String CurrentLoc=request.getParameter("Currentloc"); */
		String CurrentLoc="Not Yet Dispatched";
		
		String DestLoc=request.getParameter("Destloc");
		
	ConsignmentImpl imp=new ConsignmentImpl();
		
		Order or=new Order(ConsignmentNo, ConTrackingNo, Cvname, BookingDate, FromLoc, CurrentLoc, DestLoc);
		
		try {
			imp.addConsignment(or);

			RequestDispatcher rd=request.getRequestDispatcher("ConsignmentDataAdded.jsp");
			rd.forward(request,response);
		}catch(Exception e)
		{
			
		}
		
		  
		 
/*		Statement stmt=null;
		
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cargotracking","root","Rat.mid-90");
			if(c==null)
			{
				System.out.println("Connection failed inside MainClass");
			}
			else if(c!=null)
			{
				System.out.println("Connected to database");
				
			}	
			


			
			 * }catch(Exception e) { System.out.println(e);
			 * out.println("Error Occured while performing the query"); out.println(e); }
			 
		try {
			con=Dbconnection.connect();
			
			
			
			stmt=con.createStatement();
			stmt.executeUpdate("insert into consignment values('"+ConsignmentNo+"','"+ConTrackingNo+"','"+Cvname+"','"+BookingDate+"','"+FromLoc+"','"+CurrentLoc+"','"+DestLoc+"')");
			
			
			stmt.close();
			con.close();
	
			RequestDispatcher rd=request.getRequestDispatcher("ConsignmentDataAdded.jsp");
			rd.forward(request,response);
	
			
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	
	}*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
