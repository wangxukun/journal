/**
 * 
 */
package xk.journal.dao.factory;

import xk.journal.dao.UserDao;
import xk.journal.dao.proxy.UserDaoProxy;

/**
 * @author xukun
 *
 */
public class DAOFactory {
	public static UserDao getUserDaoInstance(){
		return new UserDaoProxy();
	} 
}
