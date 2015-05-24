package xk.journal.domain;

public class Account {
	private String id;
	private String parentid;
	private String name;
	private int grade;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getParentid() {
		return parentid;
	}
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", parentid=" + parentid + ", name="
				+ name + ", grade=" + grade + "]";
	}
	
}
