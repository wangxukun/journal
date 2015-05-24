/**
 * 
 */
package xk.journal.service.impl;

import java.sql.SQLException;

import xk.journal.dao.factory.DAOFactory;
import xk.journal.domain.User;
import xk.journal.domain.VUserAccountRelation;
import xk.journal.service.BusinessService;

/**
 * @author xukun
 *
 */
public class BusinessServiceImpl implements BusinessService {
	/* (non-Javadoc)
	 * @see xk.journal.service.impl.BusinessService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public User login(String name,String password) throws SQLException{
		User user = null;
		user = DAOFactory.getUserDaoInstance().find(name, password);
		return user;
	}

	@Override
	public boolean userAccountRelation(String userid, String accountid)
			throws SQLException {
		boolean flag = false;
		flag = DAOFactory.getUserDaoInstance().insertRelationAccount(userid, accountid);
		return flag;
	}

	@Override
	public VUserAccountRelation getRelationInfo(String userid) throws SQLException {
		VUserAccountRelation relation = null;
		relation = DAOFactory.getUserDaoInstance().getRelation(userid);
		return relation;
	}
}
