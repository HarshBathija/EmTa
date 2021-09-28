package ncsu.se.backend.model;

import java.sql.Timestamp;

public class MealRecords {

    public MealRecords( int sid, int meal_cost, String meal_store) {
		super();
		this.sid = sid;
		this.meal_cost = meal_cost;
		this.meal_store = meal_store;
	}

	private int mid;
    private int sid;
    private int meal_cost;
    private Timestamp meal_timestamp;
    private String meal_store;

    public Timestamp getMeal_timestamp() {
        return meal_timestamp;
    }

    public void setMeal_timestamp(Timestamp meal_timestamp) {
        this.meal_timestamp = meal_timestamp;
    }

    public String getMeal_store() {
        return meal_store;
    }

    public void setMeal_store(String meal_store) {
        this.meal_store = meal_store;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getMeal_cost() {
        return meal_cost;
    }

    public void setMeal_cost(int meal_cost) {
        this.meal_cost = meal_cost;
    }

}
