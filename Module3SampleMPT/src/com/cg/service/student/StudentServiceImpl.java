package com.cg.service.student;

import java.util.ArrayList;
import com.cg.bean.controller.StudentBean;
import com.cg.dao.student.IStudentDao;
import com.cg.dao.student.StudentDaoImpl;
public class StudentServiceImpl {


	IStudentDao dao=new StudentDaoImpl();
	public int addDetails(StudentBean bean){
		return dao.addDetails(bean);
	}
	
	public ArrayList<StudentBean> retrieveDetails(){
	return dao.retrieveDetails();
	}
	
	
}
