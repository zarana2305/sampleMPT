package com.cg.dao.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



import com.cg.bean.controller.StudentBean;
import com.cg.dbutil.student.DBUtil;

public class StudentDaoImpl implements IStudentDao {
	static Connection conn=null;
	int row=0;
	int value=0;
	
	
	
	public int addDetails(StudentBean bean) {
	
	
		
		
		try{
			conn=DBUtil.getConnection();
			System.out.println(conn);
			PreparedStatement ps=conn.prepareStatement
					("insert into Student_score values(stud_id.nextval,?,?,?,?,?,?,?)");
			
			//ps.setString(1,bean.getCustid());
			ps.setString(1,bean.getStudentname());
			ps.setString(2,bean.getAge());
			ps.setString(3,bean.getState());
			ps.setString(4,bean.getGender());
			ps.setString(5,bean.getCentum());
			ps.setString(6,bean.getAttempts());
			ps.setString(7,bean.getTotalScores());
			 row=ps.executeUpdate();
			 
			 PreparedStatement ps1=conn.prepareStatement("select stud_id.currval from dual");
				ResultSet rs=ps1.executeQuery();
				while(rs.next())
				{
					value=rs.getInt(1);
				}
			 
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
		}
		return value;
		}
		
	
	
	
public ArrayList<StudentBean> retrieveDetails() 
{
		ArrayList<StudentBean> list=new ArrayList<StudentBean>();
		try{
			
		Connection conn=DBUtil.getConnection();
		String sql="select * from Student_score";
		
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			int Studentid=rs.getInt(1);
			String Studentname=rs.getString(2);
			String Age=rs.getString(3);
			String state=rs.getString(4);
			String gender=rs.getString(5);
			String centum=rs.getString(6);
			String attempts=rs.getString(7);
			String TotalScores=rs.getString(8);
list.add(new StudentBean(Studentid,Studentname,Age,state,gender,centum,attempts,TotalScores));
		}
	}
		catch(SQLException a){
		}
		return list;
		
		
	}

}
