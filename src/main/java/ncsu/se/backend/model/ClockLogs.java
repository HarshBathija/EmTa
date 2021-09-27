package ncsu.se.backend.model;

import java.sql.Timestamp;

public class ClockLogs {

    private int cid;
    private int sid;
    private Timestamp clock_in;
    private Timestamp clock_out;
    private int totalHours;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Timestamp getClock_in() {
        return clock_in;
    }

    public void setClock_in(Timestamp clock_in) {
        this.clock_in = clock_in;
    }

    public Timestamp getClock_out() {
        return clock_out;
    }

    public void setClock_out(Timestamp clock_out) {
        this.clock_out = clock_out;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public ClockLogs(int cid, int sid, Timestamp clock_in, Timestamp clock_out, int totalHours) {
        this.cid = cid;
        this.sid = sid;
        this.clock_in = clock_in;
        this.clock_out = clock_out;
        this.totalHours = totalHours;
    }

    public ClockLogs() {
    }

}
