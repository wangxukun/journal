package xk.journal.domain;

public class UserAccountRelation {
	private String userid;
	private String accountid;
	
	public void setUserid(String userid){
		this.userid = userid;
	}
	public String getUserid(){
		return userid;
	}
	public String getAccountid() {
		return accountid;
	}
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}
	@Override
	public String toString() {
		return "UserAccountRelation [userid=" + userid + ", accountid="
				+ accountid + "]";
	}
}
