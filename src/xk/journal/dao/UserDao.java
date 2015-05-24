package xk.journal.dao;

import java.sql.SQLException;

import xk.journal.domain.User;
import xk.journal.domain.VUserAccountRelation;

public interface UserDao {

	boolean add(User user) throws SQLException;

	boolean delete(String id) throws SQLException;

	boolean find(String name) throws SQLException;
	
	User find(String name, String password) throws SQLException;
	
	boolean insertRelationAccount(String userid,String accountid) throws SQLException;
	
	VUserAccountRelation getRelation(String userid) throws SQLException;
}