/**
 * 
 */
package xk.journal.dao.proxy;

import java.sql.SQLException;

import xk.journal.dao.UserDao;
import xk.journal.dao.impl.UserDaoImpl;
import xk.journal.domain.User;
import xk.journal.domain.VUserAccountRelation;
import xk.journal.utils.JdbcUtils;

/**
 * @author xukun
 *
 */
public class UserDaoProxy implements UserDao {
	private JdbcUtils jdbc;
	private UserDao dao;
	public UserDaoProxy(){
		this.jdbc = new JdbcUtils();
		this.dao = new UserDaoImpl(this.jdbc);
	}
	/* (non-Javadoc)
	 * @see xk.journal.dao.UserDao#add(xk.journal.domain.User)
	 */
	@Override
	public boolean add(User user) throws SQLException{
		// TODO Auto-generated method stub
		boolean flag = false;
		try{
			this.jdbc.getConnection();
			flag= this.dao.add(user);
		}catch(SQLException e){
			throw e;
		}finally{
			this.jdbc.releaseConnection();
		}
		return flag;
	}

	/* (non-Javadoc)
	 * @see xk.journal.dao.UserDao#delete(java.lang.String)
	 */
	@Override
	public boolean delete(String id){
		// TODO Auto-generated method stub
		boolean flag = false;
		try{
			this.jdbc.getConnection();
			flag = this.dao.delete(id);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			this.jdbc.releaseConnection();
		}
		return flag;
	}
	@Override
	public boolean find(String name){
		// TODO Auto-generated method stub
		boolean flag = false;
		try{
			this.jdbc.getConnection();
			flag = this.dao.find(name);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			this.jdbc.releaseConnection();
		}
		return flag;
	}
	@Override
	public User find(String name, String password){
		// TODO Auto-generated method stub
		User user = null;
		try{
			this.jdbc.getConnection();
			user = this.dao.find(name, password);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			this.jdbc.releaseConnection();
		}
		return user;
	}
	@Override
	public boolean insertRelationAccount(String userid, String accountid)
			throws SQLException {
		boolean flag = false;
		try{
			this.jdbc.getConnection();
			flag = this.dao.insertRelationAccount(userid, accountid);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			this.jdbc.releaseConnection();
		}
		return flag;
	}
	@Override
	public VUserAccountRelation getRelation(String userid) throws SQLException {
		VUserAccountRelation relation = null;
		try{
			this.jdbc.getConnection();
			relation = this.dao.getRelation(userid);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			this.jdbc.releaseConnection();
		}
		return relation;
	}
}
