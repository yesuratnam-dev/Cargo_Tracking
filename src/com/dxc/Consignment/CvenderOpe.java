package com.dxc.Consignment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.ConImpl.VenderImpl;
import com.dxc.Entity.Vender;

/**
 * Servlet implementation class CvenderOpe
 */
@WebServlet("/CvenderOpe")
public class CvenderOpe extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String Cvname=request.getParameter("Cvname");
		
		int CID=Integer.parseInt(request.getParameter("Cvenderid"));
		
		String CBranch=request.getParameter("Cvbranch");
		
		String Cbid=request.getParameter("branchid");
		
		String CBLoc=request.getParameter("CVBranchLoc");
		
		
		VenderImpl imp=new VenderImpl();
		
		Vender vr=new Vender(Cvname,CID,CBranch,Cbid,CBLoc);
		
		try {
			imp.addVender(vr);
		}catch(Exception e)
		{
			
		}
	
		
		
		RequestDispatcher rd=request.getRequestDispatcher("ConsignmentDataAdded.jsp");
		rd.forward(request,response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
