package xk.journal.service;

import java.sql.SQLException;

import xk.journal.domain.User;

public interface BusinessService {

	User login(String name, String password) throws SQLException;

}