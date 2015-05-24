package xk.journal.service;

import java.sql.SQLException;

import xk.journal.domain.User;
import xk.journal.domain.VUserAccountRelation;

public interface BusinessService {

	User login(String name, String password) throws SQLException;
	/**
	 * 用户与账户关联
	 * @param userid
	 * @param accountid
	 * @return
	 * @throws SQLException
	 */
	boolean userAccountRelation(String userid,String accountid) throws SQLException;
	
	VUserAccountRelation getRelationInfo(String userid) throws SQLException;

}