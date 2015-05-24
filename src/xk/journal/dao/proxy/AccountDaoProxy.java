package xk.journal.dao.proxy;

import java.sql.SQLException;

import xk.journal.dao.AccountDao;
import xk.journal.dao.impl.AccountDaoImpl;
import xk.journal.domain.Account;
import xk.journal.utils.JdbcUtils;

public class AccountDaoProxy implements AccountDao {
	private AccountDao dao;
	private JdbcUtils jdbc;
	public AccountDaoProxy(){
		this.jdbc = new JdbcUtils();
		this.dao = new AccountDaoImpl(this.jdbc);
	}
	@Override
	public boolean add(Account account){
		boolean flag = false;
		try{
			this.jdbc.getConnection();
			flag = this.dao.add(account);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			this.jdbc.releaseConnection();
		}
		return flag;
	}
	@Override
	public boolean find(String parentid, String name){
		boolean flag = false;
		try{
			this.jdbc.getConnection();
			flag = this.dao.find(parentid, name);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			this.jdbc.releaseConnection();
		}
		return flag;
	}

}
