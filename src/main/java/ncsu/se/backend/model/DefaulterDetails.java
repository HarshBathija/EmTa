package ncsu.se.backend.model;

public class DefaulterDetails {
    private int sid;
    private String name;
    private String dept;
    private String employee_store;
    private String employee_head;

    public String getEmployee_store() {
        return employee_store;
    }

    public void setEmployee_store(String employee_store) {
        this.employee_store = employee_store;
    }

    public String getEmployee_head() {
        return employee_head;
    }

    public void setEmployee_head(String employee_head) {
        this.employee_head = employee_head;
    }

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


}
