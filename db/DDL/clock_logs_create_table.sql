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