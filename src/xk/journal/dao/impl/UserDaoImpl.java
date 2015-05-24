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
import xk.journal.domain.VUserAccountRelation;
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
		String sql = "insert into user(id,parentid,name,password,grade,organization,email,phone) values(?,?,?,MD5(?),?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(user.getId());
		params.add(user.getParentid());
		params.add(user.getName());
		params.add(user.getPassword());
		params.add(user.getGrade());
		params.add(user.getOrganization());
		params.add(user.getEmail());
		params.add(user.getPhone());
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
		String sql = "select id,parentid,name,password,grade,organization,email,phone from user where name=? and password=MD5(?)";
		List<Object> params = new ArrayList<Object>();
		params.add(name);
		params.add(password);
		Map<String, Object> map =this.jdbc.findSingleByPreparedStatement(sql, params);
		if(!map.isEmpty()){
			user = new User();
			user.setId(map.get("id").toString());
			user.setParentid(map.get("parentid").toString());
			user.setName(map.get("name").toString());
			user.setPassword(map.get("password").toString());
			user.setGrade(Integer.parseInt(map.get("grade").toString()));
			user.setOrganization(map.get("organization").toString());
			user.setEmail(map.get("email").toString());
			user.setPhone(map.get("phone").toString());
		}
		return user;
	}
	@Override
	public boolean insertRelationAccount(String userid, String accountid)
			throws SQLException {
		boolean flag = false;
		String sql = "insert into user_account_relation(userid,accountid) values(?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(userid);
		params.add(accountid);
		flag = this.jdbc.updateByPreparedStatement(sql, params);
		return flag;
	}
	@Override
	public VUserAccountRelation getRelation(String userid) throws SQLException {
		VUserAccountRelation relation = null;
		String sql = "select userid,userparentid,username,password,usergrade,organization,email,phone,accountid,accountparentid,accountname,accountgrade from v_user_account_relation where userid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(userid);
		Map<String,Object> map = this.jdbc.findSingleByPreparedStatement(sql, params);
		if(!map.isEmpty()){
			relation = new VUserAccountRelation();
			relation.setUserid(map.get("userid").toString());
			relation.setUserparentid(map.get("userparentid").toString());
			relation.setUsername(map.get("username").toString());
			relation.setPassword(map.get("password").toString());
			relation.setUsergrade(Integer.parseInt(map.get("usergrade").toString()));
			relation.setOrganization(map.get("organization").toString());
			relation.setEmail(map.get("email").toString());
			relation.setPhone(map.get("phone").toString());
			relation.setAccountid(map.get("accountid").toString());
			relation.setAccountparentid(map.get("accountparentid").toString());
			relation.setAccountname(map.get("accountname").toString());
			relation.setAccountgrade(Integer.parseInt(map.get("accountgrade").toString()));
		}
		return relation;
	}
}
