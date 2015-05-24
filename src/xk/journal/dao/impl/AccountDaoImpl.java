package xk.journal.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import xk.journal.dao.AccountDao;
import xk.journal.domain.Account;
import xk.journal.utils.JdbcUtils;

public class AccountDaoImpl implements AccountDao {
	private JdbcUtils jdbc;
	
	public AccountDaoImpl(JdbcUtils jdbc){
		this.jdbc = jdbc;
	}
	@Override
	public boolean add(Account account) throws SQLException {
		boolean flag = false;
		String sql = "insert into account(id,parentid,name,grade) values(?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(account.getId());
		params.add(account.getParentid());
		params.add(account.getName());
		params.add(account.getGrade());
		flag = this.jdbc.updateByPreparedStatement(sql, params);
		return flag;
	}
	@Override
	public boolean find(String parentid, String name) throws SQLException {
		boolean flag = false;
		Map<String,Object> map;
		String sql = "select id from account where parentid=? and name=?";
		List<Object> params = new ArrayList<Object>();
		params.add(parentid);
		params.add(name);
		map = this.jdbc.findSingleByPreparedStatement(sql, params);
		if(!map.isEmpty()){
			flag = true;
		}
		return flag;
	}

}
