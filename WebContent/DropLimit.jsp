<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>按学分选课</title>
</head>
<body>
	<% request.setCharacterEncoding("UTF-8");%>
	<%
		String Sno=(String)session.getAttribute("number");
		String Sname=(String)session.getAttribute("name");
		int Cno=(Integer)session.getAttribute("Cno");
	%>
	<%
		try{
		//加载驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		//建立连接
		Connection conn=null;
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/keshe?useSSL=false&serverTimezone=GMT&characterEncoding=UTF-8&useUnicode=true","root","yp5211314");
		PreparedStatement ps=null;
		//操作数据
		String sql="delete from sc where Sname=? and Cno =?";
		ps=conn.prepareStatement(sql);
		ps.setString(1,Sname);
		ps.setInt(2,Cno);
			if (ps.executeUpdate() > 0) {
				out.print("退课成功");
			} else {
				out.print("退课失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>

</body>
</html>