package xk.journal.service;

import java.sql.SQLException;

import xk.journal.domain.User;

public interface UserManagementService {

	void register(User user) throws Exception;
	boolean delete(String id) throws SQLException;

}