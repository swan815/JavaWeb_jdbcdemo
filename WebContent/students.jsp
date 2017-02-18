<%@page import="com.lsy.javaweb.mvc.Student"%>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Student> stus = (List)request.getAttribute("students");
	
		%>
		
		<table border="1" cellpadding="10" cellspacing="0" >
			<tr>
				<th>Id</th>
				<th>Major</th>
				<th>Enter_Date</th>
				<th>Study_year</th>
				<th>Study_type</th>
				<th>Delete</th>
			</tr>
		<%
			for(Student student:stus){
				%>
					<tr>
						<td><%=student.getId() %></td>
						<td><%=student.getMajor() %></td>
						<td><%=student.getEnterDate() %></td>
						<td><%=student.getStudyYear() %></td>
						<td><%=student.getStudyType() %></td>
						<td><a href="deleteStudentServlet?Id=<%=student.getId()%>">Delete</a></td>
					</tr>
					<%
					} 
					%>
					</table>

</body>
</html>