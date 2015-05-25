package xk.journal.web.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xk.journal.domain.User;
import xk.journal.exception.UserExistException;
import xk.journal.service.factory.ServiceFactory;
import xk.journal.utils.WebUtils;
import xk.journal.web.formBean.AddUser;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/servlet/AddUserServlet")
public class AddUserServlet extends HttpServlet {
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
		request.setCharacterEncoding("utf8");
		AddUser formBean = WebUtils.request2Bean(request, AddUser.class);
		User user = new User();
		WebUtils.copyBean(formBean, user);
		user.setGrade(user.getGrade()+1);
		user.setParentid(user.getId());
		user.setId(WebUtils.generateID());
		try {
			ServiceFactory.getUserManagementServiceInstance().register(user);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (UserExistException e) {
			e.printStackTrace();
		}
	}
}
