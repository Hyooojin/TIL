
/* Drop Tables */

DROP TABLE tb_account CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE seq_account;




/* Create Sequences */

CREATE SEQUENCE seq_account;



/* Create Tables */

CREATE TABLE tb_account
(
	id number NOT NULL,
	firstName varchar2(20) NOT NULL,
	lastName varchar2(20) NOT NULL,
	emailAddress varchar2(20),
	PRIMARY KEY (id)
);

select * from tb_account;



