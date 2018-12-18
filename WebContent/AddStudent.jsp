<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
    <head>
        <title>添加学生信息</title>
        <meta charset = "utf-8"/>
        <link rel="stylesheet" href="css/add.css" />
        <script type="text/javascript" src = "js/jquery.js"></script>
		<script type="text/javascript" src = "js/xuanze.js"></script>
    </head>
    <body> 
        <div id = "body-box"> 
            <div id = "body-info">  
                <ul>
                <form action="AddStudentServlet">
                    <li class = "info-list">
                        <span>学生学号</span>
                        <span>
                            <input type="text" name = "Sno"  />
                        </span>
                    </li>
                    <li class = "info-list">
                        <span>学生姓名</span>
                        <span>
                            <input type="text" name = "Sname" />
                        </span>
                    </li>
                    <li class = "info-list">
                        <span>学生密码</span>
                        <span>
                            <input type="password" name = "Spsw" />
                        </span>
                    </li>
                    <li class = "info-list">
                        <span>学生性别</span>
                        <span>
                            <label><input type="radio" name = "Ssex" value = "男" checked = "checked"/>男</label>
                            <label><input type="radio" name = "Ssex" value = "女" />女</label>
                        </span>
                    </li>
                    <li class = "info-list">
                        <span>出生年月</span>
                        <span>
                            <!-- <input type="text" name = "Sbirth" maxlength = "10"/> -->
                            <input type="date" name="Sbirth"/>
                        </span>
                    </li>
                    <li class = "info-list"> 
                        <span>所属院系</span>
                        <span>
                            <!--<input type="text" name = "Sdept"/>-->
                            <select name = "Sdept" id="SD">
                            	<option>请选择学院</option>
                            </select>
                        </span>
                    </li>
                    <li class = "info-list"> 
                        <span>所属专业</span>
                        <span>
                            <select name = "Szhuanye" id="SZ">
                            	<option>请选择专业</option>
                            </select>
                        </span>
                    </li>
                    <li class = "info-list"> 
                        <span> 
                            <input type="submit" name = "submit" value = "添加提交"/>
                        </span>
                    </li>
                </form>
                </ul>
            </div>
        </div>
    </body>
</html>