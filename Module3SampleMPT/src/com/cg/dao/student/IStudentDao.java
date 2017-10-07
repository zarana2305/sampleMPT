package com.cg.dao.student;

import java.util.ArrayList;

import com.cg.bean.controller.StudentBean;

public interface IStudentDao {

	ArrayList<StudentBean> retrieveDetails();

	int addDetails(StudentBean bean);

}
