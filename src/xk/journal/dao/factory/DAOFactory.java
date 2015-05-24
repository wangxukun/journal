/**
 * 
 */
package xk.journal.dao.factory;

import xk.journal.dao.AccountDao;
import xk.journal.dao.UserDao;
import xk.journal.dao.proxy.AccountDaoProxy;
import xk.journal.dao.proxy.UserDaoProxy;

/**
 * @author xukun
 *
 */
public class DAOFactory {
	public static UserDao getUserDaoInstance(){
		return new UserDaoProxy();
	}
	
	public static AccountDao getAccountDaoInstance(){
		return new AccountDaoProxy();
	}
}
