package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.StudentBean;
import Dao.StudentDao;

/**
 * Servlet implementation class StudentUpdateActionServlet
 */
public class StudentUpdateActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentUpdateActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    PrintWriter Out =response.getWriter();
        request.setCharacterEncoding("UTF-8");
        StudentBean user=new StudentBean();
        String sex = request.getParameter("Ssex");
        String name = request.getParameter("Sname");
        String psw = request.getParameter("Spsw");
        String num = request.getParameter("Sno");
        String depart = request.getParameter("Sdept");
        int id = Integer.parseInt(request.getParameter("Sid"));
        user.setSname(name);
        user.setSpsw(psw);
        user.setSno(num);
        user.setSid(id);
        user.setSbirth(request.getParameter("Sbirth"));
        user.setSsex(sex);
        user.setSzhuanye(request.getParameter("Szhuanye"));
        user.setSdept(depart);
        
        StudentDao udao=new StudentDao();
        if(udao.update(user))
        {
            Out.println("更新成功");
            response.sendRedirect("ShowStudentServlet?pagenum=1");
        }
        else{
            Out.println("更新失败");
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    doGet(request, response);
	}

}
