<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList,com.cg.bean.controller.StudentBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%ArrayList<StudentBean> list=(ArrayList<StudentBean>)session.getAttribute("retrieve");
out.print("<table>");
for(StudentBean m:list)
{
	out.print("<tr><td>"+m.getStudentid()+"</td>");
	out.println("<td>"+m.getStudentname()+"</td>");
	out.println("<td>"+m.getAge()+"</td>");
	out.println("<td>"+m.getState()+"</td>");
	out.println("<td>"+m.getCentum()+"</td>");
	out.println("<td>"+m.getAttempts()+"</td>");
	out.println("<td>"+m.getTotalScores()+"</td></tr>");
}
out.print("</table>");
%>
<a href="NewStudent.jsp">add details</a>

</body>
</html>