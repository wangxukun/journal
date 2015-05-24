/**
 * 
 */
package xk.journal.service;

import java.sql.SQLException;

import xk.journal.domain.Account;
import xk.journal.exception.AccountExistException;

/**
 * @author xukun
 *
 */
public interface AccountManagementService {
	/**
	 * 创建账户
	 * @param account
	 * @throws SQLException
	 * @throws AccountExistException 
	 */
	void create(Account account) throws SQLException, AccountExistException;
}
