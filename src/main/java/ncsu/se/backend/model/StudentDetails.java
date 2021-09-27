package ncsu.se.backend.model;

public class StudentDetails {

	private int id;
	private String first_name;
	private String last_name;
	private String employed_store;
	private String employer_name;
	private String schedule;

	public int getId() {
		return id;
	}

	public StudentDetails(int id, String first_name, String last_name, String employed_store, String employer_name,
			String schedule) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.employed_store = employed_store;
		this.employer_name = employer_name;
		this.schedule = schedule;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public StudentDetails() {
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmployed_store() {
		return employed_store;
	}

	public void setEmployed_store(String employed_store) {
		this.employed_store = employed_store;
	}

	public String getEmployer_name() {
		return employer_name;
	}

	public void setEmployer_name(String employer_name) {
		this.employer_name = employer_name;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

}
