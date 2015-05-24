package xk.journal.service.proxy;


import java.sql.SQLException;

import xk.journal.domain.User;
import xk.journal.exception.UserExistException;
import xk.journal.service.UserManagementService;
import xk.journal.service.impl.UserManagementServiceImpl;

public class UserManagementServiceProxy implements UserManagementService {
	private UserManagementService service;
	public UserManagementServiceProxy(){
		this.service = new UserManagementServiceImpl();
	}
	@Override
	public void register(User user) throws SQLException,UserExistException{
			try {
				this.service.register(user);
			} catch (UserExistException e) {
				throw e;
			} catch(SQLException e){
				e.printStackTrace();
			}
	}
	@Override
	public boolean delete(String id){
		boolean flag = false;
		try {
			flag = this.service.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
}
