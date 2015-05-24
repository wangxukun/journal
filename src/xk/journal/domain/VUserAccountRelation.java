/**
 * 
 */
package xk.journal.domain;

/**
 * @author xukun
 * 对应用户所关联账户视图
 */
public class VUserAccountRelation {
	private String userid;
	private String userparentid;
	private String username;
	private String password;
	private int usergrade;
	private String organization;
	private String email;
	private String phone;
	private String accountid;
	private String accountparentid;
	private String accountname;
	private int accountgrade;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserparentid() {
		return userparentid;
	}
	public void setUserparentid(String userparentid) {
		this.userparentid = userparentid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUsergrade() {
		return usergrade;
	}
	public void setUsergrade(int usergrade) {
		this.usergrade = usergrade;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAccountid() {
		return accountid;
	}
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}
	public String getAccountparentid() {
		return accountparentid;
	}
	public void setAccountparentid(String accountparentid) {
		this.accountparentid = accountparentid;
	}
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public int getAccountgrade() {
		return accountgrade;
	}
	public void setAccountgrade(int accountgrade) {
		this.accountgrade = accountgrade;
	}
	@Override
	public String toString() {
		return "VUserAccountRelation [userid=" + userid + ", userparentid="
				+ userparentid + ", username=" + username + ", password="
				+ password + ", usergrade=" + usergrade + ", organization="
				+ organization + ", email=" + email + ", phone=" + phone
				+ ", accountid=" + accountid + ", accountparentid="
				+ accountparentid + ", accountname=" + accountname
				+ ", accountgrade=" + accountgrade + "]";
	}
}
