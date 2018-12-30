create table STUDENT_ENTRY
(
	STUDENT_ID integer not null,
	STUDENT_NAME varchar(255),
	DEPARTMENT varchar(255),
	PASSING_YEAR int,
	primary key (STUDENT_ID)
);

select * from dashboard.STUDENT_ENTRY;

INSERT INTO dashboard.STUDENT_ENTRY
VALUES(001, 'Muthu Selvam', 'COMPUTER SCIENCE','2011');

INSERT INTO dashboard.STUDENT_ENTRY
VALUES(002, 'Hemalatha Mylraj', 'COMPUTER SCIENCE','2012');

INSERT INTO dashboard.STUDENT_ENTRY
VALUES(003, 'Sherin Lal', 'COMPUTER SCIENCE','2009');

INSERT INTO dashboard.STUDENT_ENTRY
VALUES(004, 'jhon', 'COMPUTER SCIENCE','2001');