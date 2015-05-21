package xk.journal.service;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import xk.journal.domain.User;
import xk.journal.exception.UserExistException;
import xk.journal.service.factory.ServiceFactory;
import xk.journal.utils.WebUtils;

public class TestUserManagementService {
	User user;
	@Before
	public void setUp(){
		user = new User();
		user.setId(WebUtils.generateID());
		user.setParentid(null);
		user.setName("孙八");
		user.setPassword("123456");
		user.setGrade(1);
	}
	@Test(expected=UserExistException.class)
	public void testRegister() throws Exception{
		ServiceFactory.getUserManagementServiceInstance().register(user);
	}
	@Test
	public void testDelete() throws SQLException{
		ServiceFactory.getUserManagementServiceInstance().delete("800968d2-ef50-4059-b4be-5b02df10252b");
	}
}
