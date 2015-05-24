package xk.journal.service;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import xk.journal.service.factory.ServiceFactory;

public class TestBusinessService {
	String userid;
	String accountid;
	@Before
	public void setUp(){
		userid = "2aa68698-7883-4de7-b851-8581f480d6bc";
		accountid = "6c5cdd35-1fd5-4d4c-9dd6-fea881962e35";
	}
	@Test
	public void testUserAccountRelation() throws Exception{
		boolean flag = false;
		flag = ServiceFactory.getBusinessServiceInstance().userAccountRelation(userid, accountid);
		Assert.assertEquals("主键约束，不能插入", flag, true);
	}
}
