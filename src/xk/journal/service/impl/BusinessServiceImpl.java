/**
 * 
 */
package xk.journal.service.impl;

import java.sql.SQLException;

import xk.journal.dao.factory.DAOFactory;
import xk.journal.domain.User;
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
}
