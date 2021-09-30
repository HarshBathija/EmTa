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