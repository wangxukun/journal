/**
 * 
 */
package xk.journal.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import xk.journal.dao.UserDao;
import xk.journal.domain.User;
import xk.journal.utils.JdbcUtils;

/**
 * @author xukun
 *
 */
public class UserDaoImpl implements UserDao {
	private JdbcUtils jdbc;
	public UserDaoImpl(JdbcUtils jdbc){
		this.jdbc = jdbc;
	}
	/* (non-Javadoc)
	 * @see xk.journal.dao.impl.UserDao#add(xk.journal.domain.User)
	 */
	@Override
	public boolean add(User user) throws SQLException{
		boolean flag = false;
		String sql = "insert into user(id,name,password,grade) values(?,?,MD5(?),?)";
		List<Object> params = new ArrayList<Object>();
		params.add(user.getId());
		params.add(user.getName());
		params.add(user.getPassword());
		params.add(user.getGrade());
		flag = this.jdbc.updateByPreparedStatement(sql, params);
		return flag;
	}
	
	/* (non-Javadoc)
	 * @see xk.journal.dao.impl.UserDao#delete(java.lang.String)
	 */
	@Override
	public boolean delete(String id) throws SQLException{
		boolean flag = false;
		List<Object> params = new ArrayList<Object>();
		String sql = "delete from user where id=?";
		params.add(id);
		flag = this.jdbc.updateByPreparedStatement(sql, params);
		return flag;
	}
	@Override
	public boolean find(String name) throws SQLException {
		boolean flag = false;
		String sql = "select id from user where name=?";
		List<Object> params = new ArrayList<Object>();
		params.add(name);
		Map<String, Object> map =this.jdbc.findSingleByPreparedStatement(sql, params);
		if(!map.isEmpty()){
			flag = true;
		}
		return flag;
	}
	@Override
	public User find(String name, String password) throws SQLException {
		User user = null;
		String sql = "select id,name,password,grade from user where name=? and password=MD5(?)";
		List<Object> params = new ArrayList<Object>();
		params.add(name);
		params.add(password);
		Map<String, Object> map =this.jdbc.findSingleByPreparedStatement(sql, params);
		if(!map.isEmpty()){
			user = new User();
			user.setId(map.get("id").toString());
			user.setName(map.get("name").toString());
			user.setPassword(map.get("password").toString());
			user.setGrade(Integer.parseInt(map.get("grade").toString()));
		}
		return user;
	}
}
