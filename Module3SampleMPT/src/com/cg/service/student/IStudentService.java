package com.cg.service.student;

import java.util.ArrayList;
import com.cg.bean.controller.StudentBean;

public interface IStudentService {

	public int addDetails(StudentBean bean);
	
	ArrayList<StudentBean> retrieveDetails();
	
}
