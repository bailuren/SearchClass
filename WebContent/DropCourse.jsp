<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>确认退课</title>
<link rel="stylesheet" href="add.css" />
</head>
<body>
	<form action="DropLimit.jsp" method="post">
		<table border="3" align="center" cellspacing="0dp" cellpadding="30dp" align="center" bordercolor="purple">
			<thead>
				<tr>
					<th>课程号</th>
					<th>课程名</th>
				</tr>
			</thead>
			<tbody>
				<%request.setCharacterEncoding("utf-8");
				  String username=(String)session.getAttribute("name");
				  int Cno=Integer.parseInt(request.getParameter("Cno"));
				  String Cname=request.getParameter("Cname");
				%>
				<tr>
					<td colspan="5" align="center"><font size="5" color="red"><%=username %>确认退选该课程:</font></td>
				</tr>
				<tr>
					<td><%=Cno %></td>
					<td><%=Cname %></td>
					<!--<td><%=request.getParameter("Tno")%></td>
					<td><%=request.getParameter("Tname")%></td>
					<td><%=request.getParameter("Ccredit")%></td>  -->
					<%
						session.setAttribute("Cno", Cno);
					%>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="5" align="center">
						<input type="Submit" name="submit" value="确定"></input>
						<a href="SelectSuccess.jsp">取消</a>
					</td>
				</tr>
			</tfoot>
		</table>
	</form>	
</body>
</html>