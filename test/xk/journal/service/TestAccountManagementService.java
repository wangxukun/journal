package xk.journal.service;


import org.junit.Before;
import org.junit.Test;

import xk.journal.domain.Account;
import xk.journal.exception.AccountExistException;
import xk.journal.service.factory.ServiceFactory;
import xk.journal.utils.WebUtils;

public class TestAccountManagementService {
	Account account;
	@Before
	public void setUp(){
		account = new Account();
		account.setId(WebUtils.generateID());
		account.setName("陆良县");
		account.setParentid("");
		account.setGrade(1);
	}
	@Test(expected=AccountExistException.class)
	public void testUserAccountRelation() throws Exception{
		ServiceFactory.getAccountManagementServiceInstance().create(account);
	}
}
