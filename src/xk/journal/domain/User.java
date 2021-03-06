/**
 * 
 */
package xk.journal.domain;

/**
 * @author xukun
 *
 */
public class User {
	private String id;
	private String parentid;
	private String name;
	private String password;
	private int grade;
	private String organization;
	private String email;
	private String phone;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setParentid(String parentid){
		this.parentid = parentid;
	}
	public String getParentid(){
		return parentid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
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
	@Override
	public String toString() {
		return "User [id=" + id + ", parentid=" + parentid + ", name=" + name
				+ ", password=" + password + ", grade=" + grade
				+ ", organization=" + organization + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
}
