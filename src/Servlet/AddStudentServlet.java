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
 * Servlet implementation class AddStudentServlet
 */
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");
        StudentDao udao=new StudentDao();
        StudentBean user=new StudentBean();
        String sex = request.getParameter("Ssex");
        String name = request.getParameter("Sname");
        String psw = request.getParameter("Spsw");
        String num = request.getParameter("Sno");
        String depart = request.getParameter("Sdept");
        user.setSname(name);
        user.setSpsw(psw);
        user.setSno(num);
        user.setSsex(sex);
        user.setSbirth(request.getParameter("Sbirth"));
        user.setSzhuanye(request.getParameter("Szhuanye"));
        user.setSdept(depart);
        if (udao.insertUser(user)){
            response.sendRedirect("ShowStudentServlet?pagenum=1");
        }
        //response.getWriter().append("Served at: ").append(request.getContextPath());
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    doGet(request, response);
	}

}
