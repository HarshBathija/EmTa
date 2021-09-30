create table student_detail (
    id INTEGER PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    employed_store VARCHAR(50),
    employer_name VARCHAR(50),
    schedule JSON
);