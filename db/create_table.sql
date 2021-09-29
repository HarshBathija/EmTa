create table student_detail (
    id INTEGER PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    employed_store VARCHAR(50),
    employer_name VARCHAR(50),
    schedule JSON
);

create table meal_info (
    m_id serial PRIMARY KEY,
    id INTEGER,
    meal_cost NUMERIC,
    meal_timestamp TIMESTAMP,
    meal_store VARCHAR(50),
    CONSTRAINT fk_meal
        FOREIGN KEY(id) 
	    REFERENCES student_detail(id)
);

create table clock_logs (
    c_id serial PRIMARY KEY,
    id INTEGER,
    clock_in TIMESTAMP,
    clock_out TIMESTAMP,
    total_hours NUMERIC,
    CONSTRAINT fk_clock
        FOREIGN KEY(id)
        REFERENCES student_detail(id)
);

create table admins (
    user_id VARCHAR(50) PRIMARY KEY,
    email_id VARCHAR(50),
    pass TEXT
);