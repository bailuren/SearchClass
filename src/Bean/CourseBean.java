package Bean;

public class CourseBean {
    private int Cno;//课程编号
    private String Cname;//课程名称
    private int Tno; //任课老师编号
    private String Tname;//任课老师姓名
    private int Ccredit;//课程学分
    
    public int getCno() {
        return Cno;
    }
    public void setCno(int Cno) {
        this.Cno = Cno;
    }
    public String getCname() {
        return Cname;
    }
    public void setCname(String Cname) {
        this.Cname = Cname;
    }
    public int getTno() {
        return Tno;
    }
    public void setTno(int Tno) {
        this.Tno = Tno;
    }
    public String getTname() {
        return Tname;
    }
    public void setTname(String Tname) {
        this.Tname = Tname;
    }
    public int getCcredit() {
        return Ccredit;
    }
    public void setCcredit(int Ccredit) {
        this.Ccredit = Ccredit;
    }
    
}
