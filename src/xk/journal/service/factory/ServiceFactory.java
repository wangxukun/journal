package xk.journal.service.factory;

import xk.journal.service.BusinessService;
import xk.journal.service.UserManagementService;
import xk.journal.service.proxy.BusinessServiceProxy;
import xk.journal.service.proxy.UserManagementServiceProxy;

public class ServiceFactory {
	public static UserManagementService getUserManagementServiceInstance(){
		return new UserManagementServiceProxy();
	}
	public static BusinessService getBusinessServiceInstance(){
		return new BusinessServiceProxy();
	}
}
