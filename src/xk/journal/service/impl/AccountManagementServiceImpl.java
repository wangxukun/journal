package xk.journal.service.impl;

import java.sql.SQLException;

import xk.journal.dao.factory.DAOFactory;
import xk.journal.domain.Account;
import xk.journal.exception.AccountExistException;
import xk.journal.service.AccountManagementService;

public class AccountManagementServiceImpl implements AccountManagementService {

	@Override
	public void create(Account account) throws SQLException,AccountExistException {
		boolean flag = false;
		flag = DAOFactory.getAccountDaoInstance().find(account.getParentid(), account.getName());
		if(flag){
			throw new AccountExistException();//发现要创建的账户已存在，则给web层抛一个编译时异常，提醒web层处理这个异常，给用户一个友好提示。
		}else{
			DAOFactory.getAccountDaoInstance().add(account);
		}
	}

}
