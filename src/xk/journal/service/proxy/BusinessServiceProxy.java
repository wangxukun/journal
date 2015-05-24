package xk.journal.service.proxy;

import java.sql.SQLException;

import xk.journal.domain.User;
import xk.journal.domain.VUserAccountRelation;
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
	@Override
	public boolean userAccountRelation(String userid, String accountid){
		boolean flag = false;
		try{
			flag = this.service.userAccountRelation(userid, accountid); 
		}catch (SQLException e){
			e.printStackTrace();
		}
		return flag;
	}
	@Override
	public VUserAccountRelation getRelationInfo(String userid)
			throws SQLException {
		VUserAccountRelation relation = null;
		try{
			relation = this.service.getRelationInfo(userid);
		}catch (SQLException e){
			e.printStackTrace();
		}
		return relation;
	}

}
