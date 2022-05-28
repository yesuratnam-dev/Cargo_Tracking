package com.dxc.Consignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.DBConnection.Dbconnection;

/**
 * Servlet implementation class CurrentLocServlet
 */
@SuppressWarnings("unused")
@WebServlet("/CurrentLocServlet")
public class CurrentLocServlet extends HttpServlet {
	
	
	
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			
			
	   
	   
	   
	   
	   
	   PrintWriter out=response.getWriter();
	   

	   int ConTrackingNo=Integer.parseInt(request.getParameter("Contrackingno"));
	   
	   String CurrentLoc=request.getParameter("Currentloc");
   
   
	   try
		{
			/*
			 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection
			 * c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cargotracking",
			 * "root","Rat.mid-90"); if(c==null) {
			 * System.out.println("Connection failed inside MainClass"); } else if(c!=null)
			 * { System.out.println("Connected to database");
			 * 
			 * } Connection con=null;
			 * 
			 * */
		   
		   Connection con=Dbconnection.connect();
		   
		   	Statement stmt=null;
			
			
			 stmt=con.createStatement(); 
			 String query="update consignment set CurrentLoc='"+CurrentLoc+"' where ConTrackingNo="+ConTrackingNo;
				
			
			 	/*
				 * stmt.executeUpdate("insert into consignment values('"+ConTrackingNo+"','"+
				 * CurrentLoc+"')");
				 */
			 
			int i= stmt.executeUpdate(query); 
			if(i!=0)
			{
				System.out.println(i);
			}
			/*
			 * String
			 * sql="Update consignment set ConTrackinNo=? ,CurrentLoc=? whereConTrackingNo="
			 * +ConTrackingNo;
			 * 
			 * stmt=c.prepareStatement(sql);
			 * 
			 * ((PreparedStatement) stmt).setLong(1,ConTrackingNo);
			 * 
			 * ((PreparedStatement) stmt).setString(5,CurrentLoc);
			 * 
			 * stmt.executeLargeUpdate(sql);
			 * 
			 */
			
			
			if(con!=null)
			{
			con.close();
			}

			RequestDispatcher rd=request.getRequestDispatcher("ConsignmentDataAdded.jsp");
			rd.forward(request,response);

		}catch(Exception e)
		{ 
			System.out.println(e);
			out.println("Error Occured while performing the query");
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
