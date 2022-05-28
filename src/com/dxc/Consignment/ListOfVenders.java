package com.dxc.Consignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.ConImpl.VenderImpl;
import com.dxc.DBConnection.Dbconnection;
import com.dxc.Entity.Vender;

/**
 * Servlet implementation class ListOfVenders
 */
@WebServlet("/ListOfVenders")
public class ListOfVenders extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListOfVenders() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		

		   PrintWriter out=response.getWriter();

		   String ConTrackingNo=request.getParameter("Contrackingno");
		   
		   try
			{
				Connection con =Dbconnection.connect();
				Statement stmt=null;
				
				
				 stmt=con.createStatement(); 
				
				  String query="select CargoVenderName,CargoVenderId,CargoVenderBranch,CargoVenderBranchId,CargoVenderLoc from cargovender";
				 
				 ResultSet rs=stmt.executeQuery(query); 
				 @SuppressWarnings("unused")
				String i=ConTrackingNo;
				
				
				 
				 while(rs.next())
				 {
						/* out.println(rs); */
					 
					 
					 int CTNo=rs.getInt("CargoVenderId");
					 
					String CVname=rs.getString("CargoVenderName");
					 
					String BD=rs.getString("CargovenderBranch");
					 
					String FL=rs.getString("CargovenderBranchId");
					
					String CL=rs.getString("CargovenderLoc");
					
			
					Vender vr=new Vender(CVname, CTNo, BD, FL, CL);
					
					  out.println("Cargo_Vendor_Name: "+CVname);
					  
					  out.println("Cargo_Vender_Id: "+CTNo);
					  
					  
					  out.println("Cargo_Vender_Branch: "+BD);
					  
					  out.println("Cargo_Vender_Branch_Id : "+FL);
					  
					  out.println("Cargo_Vender_Loc :"+CL);
					  
				out.println("<!---------------------------------------------------------!>");	 
					
					
					  System.out.println("Cargo_Vendor_Name: "+CVname);
					  
					  System.out.println("Cargo_Vender_Id: "+CTNo);
					  
					  
					  System.out.println("Cargo_Vender_Branch: "+BD);
					  
					  System.out.println("Cargo_Vender_Branch_Id : "+FL);
					  
					  System.out.println("Cargo_Vender_Loc :"+CL);
		System.out.println("<!---------------------------------------------------------------!>");			 
		/*
		 * 
		 * VenderImpl imp=new VenderImpl();
		 * 
		 * ResultSet vnr= imp.ListOfVenders(CVname, CTNo, BD, FL, CL);
		 * 
		 * 
		 * 
		 * request.setAttribute("list", vnr);
		 * 
		 * RequestDispatcher rd=request.getRequestDispatcher("HomePage.jsp");
		 * 
		 * rd.forward(request,response);
		 * 
		 */
				
				 }
				rs.close();
				 con.close();
				 
			}catch(Exception e)
		   {
				out.println(e);
		   }

	}
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
