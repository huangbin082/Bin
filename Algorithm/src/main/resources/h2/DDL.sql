CREATE TABLE Course
(
    cId       INTEGER PRIMARY KEY,
    gradeName VARCHAR(100)
);
CREATE TABLE Student
(
    sId         INTEGER PRIMARY KEY,
    studentName VARCHAR(100),
    gradeId     INTEGER
);
CREATE TABLE Grade
(
    gId       INTEGER PRIMARY KEY,
    gradeName VARCHAR(100)
);