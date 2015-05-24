/**
 * 
 */
package xk.journal.dao;

import java.sql.SQLException;

import xk.journal.domain.Account;

/**
 * @author xukun
 *
 */
public interface AccountDao {
	
	boolean add(Account account) throws SQLException;
	
	boolean find(String parentid,String name) throws SQLException;
}
