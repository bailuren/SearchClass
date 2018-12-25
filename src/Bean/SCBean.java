package Bean;

public class SCBean {
	private int id;
	private String Sno;//学生编号
	private String Sname;//学生姓名
	private String Cno;//课程编号
	private String Cname;//课程姓名
	private String Grade;//学生对应这门课的成绩
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSno() {
		return Sno;
	}
	public void setSno(String sno) {
		Sno = sno;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getCno() {
		return Cno;
	}
	public void setCno(String cno) {
		Cno = cno;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
}
