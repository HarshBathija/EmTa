package ncsu.se.backend.model;

public class DefaulterDetails {
    private int sid;
    private String name;
    private String dept;
    private String totalHours;
    private String defaulterReason;

    public String getDefaulterReason() {
        return defaulterReason;
    }

    public void setDefaulterReason(String defaulterReason) {
        this.defaulterReason = defaulterReason;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(String totalHours) {
        this.totalHours = totalHours;
    }

}
