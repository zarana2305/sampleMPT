package com.cg.servlet.student;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.controller.StudentBean;
import com.cg.dao.student.IStudentDao;
import com.cg.dao.student.StudentDaoImpl;



@WebServlet("*.obj")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentBean bean=new StudentBean();
		IStudentDao service=new StudentDaoImpl();
		String path=request.getServletPath();
		String target=null;
		HttpSession session=request.getSession();
		switch(path){
		
		case "/student.obj":
			
		String Studentname=request.getParameter("Studentname");
		String Age=request.getParameter("Age");
		String state=request.getParameter("state");
		String gender=request.getParameter("gender");
		String Centum=request.getParameter("centum");
		String attempts=request.getParameter("attempts");
		String TotalScores=request.getParameter("TotalScores");
		//bean.setCustid(custid);
		 	bean.setStudentname(Studentname);
			bean.setAge(Age);
			bean.setState(state);
			bean.setGender(gender);
			bean.setCentum(Centum);
			bean.setAttempts(attempts);
			bean.setTotalScores(TotalScores);
			int res=service.addDetails(bean);
			session.setAttribute("seqid",res);
			if(res==1){
			target="success.jsp";}
		 
		break;
		
		case "/retrieve.obj":
			ArrayList<StudentBean> list=service.retrieveDetails();
			session.setAttribute("retrieve",list);
			target="StudentScores.jsp";

		}
		
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request,response);
		
	}
	}


	
