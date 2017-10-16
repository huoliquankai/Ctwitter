package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.User;
import server.Server;

/**
 * Servlet implementation class Lservlet
 */
@WebServlet("/Lservlet")
public class Lservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Server s=new Server();
	List<User>list=new ArrayList<User>();      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String ra=request.getParameter("xra");		
		if(ra!=null) {
			if(ra.equals("all")) {
				request.getRequestDispatcher("mainshow.jsp").forward(request, response);
				return;	
			}else if(ra.equals("a")) {
				String username=request.getParameter("userId");
				String userpwd= request.getParameter("passWord");						
				list=s.getalluser();
				boolean flag=true;								 
				for (User u : list) {
					if(u.getUsermail().equals(username)&&u.getUserpwd().equals(userpwd)) {
						HttpSession session=request.getSession();
						String userpet=u.getUserpet();
						session.setAttribute("upet", userpet);
						if(request.getParameter("checkbox")!=null) {
							String idlog=request.getParameter("checkbox");
							if(idlog.equals("on")) {
							System.out.println("xra"+idlog);
							Cookie cookname=new Cookie("username",username);
							cookname.setMaxAge(60 * 60 * 24 * 3);
							Cookie cookpwd=new Cookie("userpwd",userpwd);
							cookpwd.setMaxAge(60 * 60 * 24 * 3);
							response.addCookie(cookname);
							response.addCookie(cookpwd); 
							}	
						}	
						flag=false;
						response.sendRedirect("mainshow.jsp");
						return;																									
					}else if(u.getUsernumber().equals(username)&&u.getUserpwd().equals(userpwd)) {
						HttpSession session=request.getSession();
						String userpet=u.getUserpet();
						session.setAttribute("upet", userpet);
						if(request.getParameter("checkbox")!=null) {
							String idlog=request.getParameter("checkbox");
							if(idlog.equals("on")) {
							System.out.println("xra"+idlog);
							Cookie cookname=new Cookie("username",username);
							cookname.setMaxAge(60 * 60 * 24 * 3);
							Cookie cookpwd=new Cookie("userpwd",userpwd);
							cookpwd.setMaxAge(60 * 60 * 24 * 3);
							response.addCookie(cookname);
							response.addCookie(cookpwd); 
							}	
						}											
					    flag=false;
						response.sendRedirect("mainshow.jsp");
						return;
					 
						
					}
				}
				if(flag) {
					String pint="用户名或密码输入错误";
					request.setAttribute("pint", pint);
				
					request.getRequestDispatcher("Login.jsp").forward(request, response);
					return;
				}
				
			}			
		}
	}

}
