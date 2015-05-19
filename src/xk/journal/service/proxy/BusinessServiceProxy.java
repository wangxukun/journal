package xk.journal.service.proxy;

import java.sql.SQLException;

import xk.journal.domain.User;
import xk.journal.service.BusinessService;
import xk.journal.service.impl.BusinessServiceImpl;

public class BusinessServiceProxy implements BusinessService {
	private BusinessService service;
	public BusinessServiceProxy(){
		this.service = new BusinessServiceImpl();
	}
	@Override
	public User login(String name, String password) {
		// TODO Auto-generated method stub
		User user = null;
		try {
			user = this.service.login(name, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
