package xk.journal.service.proxy;

import java.sql.SQLException;

import xk.journal.domain.Account;
import xk.journal.exception.AccountExistException;
import xk.journal.service.AccountManagementService;
import xk.journal.service.impl.AccountManagementServiceImpl;

public class AccountManagementServiceProxy implements AccountManagementService {
	private AccountManagementService service;
	public AccountManagementServiceProxy(){
		this.service = new AccountManagementServiceImpl();
	}
	@Override
	public void create(Account account) throws SQLException,
			AccountExistException {
		try{
			this.service.create(account);
		}catch(AccountExistException e){
			throw e;
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
