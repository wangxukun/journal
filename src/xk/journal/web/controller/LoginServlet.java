package xk.journal.web.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xk.journal.domain.FeedbackInformation;
import xk.journal.domain.User;
import xk.journal.service.factory.ServiceFactory;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(description = "处理登录请求", urlPatterns = { "/servlet/LoginServlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		User user = null;
		try {
			user = ServiceFactory.getBusinessServiceInstance().login(name, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(user!=null){
			if(user.getGrade()==1){
				request.getRequestDispatcher("/WEB-INF/jspPages/county.jsp").forward(request, response);
			}else if(user.getGrade()==2){
				request.getRequestDispatcher("/WEB-INF/jspPages/town.jsp").forward(request, response);
			}
		}else{
			FeedbackInformation feedback = new FeedbackInformation("登录失败","用户名或密码错误","/servlet/Default");
			request.setAttribute("feedback", feedback);
			request.getRequestDispatcher("/WEB-INF/jspPages/feedback.jsp").forward(request, response);
		}
	}

}
