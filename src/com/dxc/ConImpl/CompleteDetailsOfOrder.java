package com.dxc.ConImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.DBConnection.Dbconnection;

/**
 * Servlet implementation class CompleteDetailsOfOrder
 */
@WebServlet("/CompleteDetailsOfOrder")
public class CompleteDetailsOfOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		   PrintWriter out=response.getWriter();

		   int ConTrackingNo=Integer.parseInt(request.getParameter("Contrackingno"));
		   
		   try
			{
				Connection con =Dbconnection.connect();
				Statement stmt=null;
				
				
				 stmt=con.createStatement(); 
				
				  /*String query="select CargoVenderName,CargoVenderId,CargoVenderBranch,CargoVenderBranchId,CargoVenderLoc from cargovender";
				 */
				  
				 @SuppressWarnings("unused")
				
					/*
					 * String query=
					 * "select consignment.ConsignmentNo,consignment.ConTrackingNo,consignment.CargoVenderName,consignment.Bookingdate,consignment.FromLoc,consignment.CurrentLoc,consignment.DestLoc,cargovender.CargoVenderId,cargovender.CargoVenderBranch,cargovender.CargoVenderBranchId,cargovender.CargoVenderLoc,cargovender.CargoVenderLoc from consignment,cargovender where ConTrackingNo= ''"
					 * +ConTrackingNo+"'";
					 */
				 
					/*
					 * String
					 * query="select consignment.ConsignmentNo,consignment.ConTrackingNo,consignment.CargoVenderName,consignment.BookingDate,consignment.FromLoc,consignment.CurrentLoc,consignment.DestLoc,cargovender.CargoVenderId,cargovender.CargoVenderBranch,cargovender.CargoVenderBranchId,cargovender.CargoVenderLoc from consignment,cargovender where consignment.CargoVenderName=cargovender.CargoVenderName "
					 * ;
					 */ 
				 
				 String query="select ConsignmentNo,ConTrackingNo,CargoVenderName,BookingDate,FromLoc,CurrentLoc,DestLoc from consignment where ConTrackingNo='"+ConTrackingNo+"'";
				 
				
					
					 
					 
					
				ResultSet rs=stmt.executeQuery(query);
				
				
				
				
				/*consignment.CargoVenderName=cargovender.CargovenderName*/
				 while(rs.next())
				 {
						

					 int CNo=rs.getInt("ConsignmentNo");

					 int CTNo=rs.getInt("ConTrackingNo");
					 
					 String CVname=rs.getString("CargoVenderName");
					 
					 String BD=rs.getString("BookingDate");
					 
					 String FL=rs.getString("FromLoc");
							 

					 String CL=rs.getString("CurrentLoc");
					 
					 String DL=rs.getString("DestLoc");			 
					 
						/*
						 * String CVID=rs.getString("cargovender.CargovenderId");
						 * 
						 * 
						 * String CVB=rs.getString("cargovender.CargovenderBranch");
						 * 
						 * 
						 * String CVBID=rs.getString("cargovender.CargovenderBranchId");
						 * 
						 * String CVLoc=rs.getString("cargovender.CargovenderLoc");
						 */ 
					


					
					/* String CL=rs.getString("CargovenderLoc"); */
					
					/*
					 * Vender vr=new Vender(CVname, CTNo, BD, FL, CL);
					 */
					

					  out.println("Consignment_No "+CNo);

					  out.println("Consignment_Tracking_No "+CTNo);
					
					  out.println("Cargo_Vendor_Name: "+CVname);
					  

					  out.println("Order_Booking_Date: "+BD);
					  


					  out.println("Consignment_From_Location : "+FL);
					  
					  
					  out.println("Consignment_Current_Loc "+CL);
					  
					  out.println("Consignment_Destination_Location: "+DL);
					  
						/*
						 * out.println("Cargo_Vendor_ID: "+CVID);
						 * 
						 * out.println("Cargo_Vendor_Branch: "+CVB);
						 * 
						 * out.println("Cargo_Vendor_Branch_Id: "+CVBID);
						 * 
						 * out.println("Cargo_Vendor_Location "+CVLoc);
						 */
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
						/* out.println("Cargo_Vender_Loc :"+CL); */
					  
				out.println("<!---------------------------------------------------------!>");	 
					

			      System.out.println("Consignment_No "+CNo);

				  System.out.println("Consignment_Tracking_No "+CTNo);
				 
				  System.out.println("Cargo_Vendor_Name: "+CVname);
				  

				  System.out.println("Order_Booking_Date: "+BD);

				  System.out.println("Consignment_From_Location : "+FL);
				  
				  System.out.println("Consignment_Current_Loc "+CL);
				  
				  System.out.println("Consignment_Destination_Location: "+DL);
					/*
					 * System.out.println("Cargo_Vendor_ID: "+CVID);
					 * 
					 * System.out.println("Cargo_Vendor_Branch: "+CVB);
					 * 
					 * System.out.println("Cargo_Vendor_Branch_Id: "+CVBID);
					 * 
					 * System.out.println("Cargo_Vendor_Location "+CVLoc);
					 */
				
		System.out.println("<!---------------------------------------------------------------!>");	
		 String Vname=rs.getString("CargoVenderName");
		 String query1="select CargoVenderId,CargoVenderBranch,CargoVenderBranchId,CargoVenderLoc from cargovender where CargoVenderName='"+Vname+"'";
		 ResultSet rscv=stmt.executeQuery(query1);

		
		while(rscv.next())
		{


			
			  String CVID=rscv.getString("CargoVenderId");
			  
			  
			  String CVB=rscv.getString("CargoVenderBranch");
			  
			  
			  String CVBID=rscv.getString("CargoVenderBranchId");
			  
			  String CVLoc=rscv.getString("CargoVenderLoc");
			  
			  out.println("Cargo_Vendor_ID: "+CVID);
			  
			  out.println("Cargo_Vendor_Branch: "+CVB);
			  
			  out.println("Cargo_Vendor_Branch_Id: "+CVBID);
			  
			  out.println("Cargo_Vendor_Location "+CVLoc);
			 
			
			  System.out.println("Cargo_Vendor_ID: "+CVID);
			  
			  System.out.println("Cargo_Vendor_Branch: "+CVB);
			  
			  System.out.println("Cargo_Vendor_Branch_Id: "+CVBID);
			  
			  System.out.println("Cargo_Vendor_Location "+CVLoc);
			 
		
System.out.println("<!---------------------------------------------------------------!>");
		}
		
		
		
				 }
				 
			}catch(Exception e)
				 {
						/*
						 * System.out.println(e); out.println(e);
						 */
				 }
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
