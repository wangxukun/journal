package xk.journal.dao;

import java.sql.SQLException;

import xk.journal.domain.User;

public interface UserDao {

	boolean add(User user) throws SQLException;

	boolean delete(String id) throws SQLException;

	boolean find(String name) throws SQLException;
	
	User find(String name, String password) throws SQLException;
}