package xk.journal.service;

import java.sql.SQLException;

import xk.journal.domain.User;
import xk.journal.exception.UserExistException;

public interface UserManagementService {

	void register(User user) throws SQLException,UserExistException;
	
	boolean delete(String id) throws SQLException;

}