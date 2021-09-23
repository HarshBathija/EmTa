package ncsu.se.backend.model;

public class StudentDetails {
	
	private int sid;
	private String sname;
	private String dept;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public StudentDetails(int sid, String sname, String dept) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.dept = dept;
	}
	public StudentDetails() {
		super();
	}
	
	

}
