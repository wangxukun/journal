/**
 * 
 */
package xk.journal.service.impl;

import java.sql.SQLException;

import xk.journal.dao.factory.DAOFactory;
import xk.journal.domain.User;
import xk.journal.exception.UserExistException;
import xk.journal.service.UserManagementService;

/**
 * @author xukun
 *
 */
public class UserManagementServiceImpl implements UserManagementService {
	/* (non-Javadoc)
	 * @see xk.journal.service.impl.UserManagementService#register(xk.journal.domain.User)
	 */
	@Override
	public void register(User user) throws SQLException,UserExistException{
		boolean flag = false;
		flag = DAOFactory.getUserDaoInstance().find(user.getName());
		if(flag){
			throw new UserExistException();//发现要注册的用户已存在，则给web层抛一个编译时异常，提醒web层处理这个异常，给用户一个友好提示。
		}else{
			DAOFactory.getUserDaoInstance().add(user);
		}
	}
}
