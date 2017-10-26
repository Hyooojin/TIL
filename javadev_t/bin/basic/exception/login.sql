
/* Drop Tables */

DROP TABLE t_mem CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE t_mem
(
	user_id varchar2(30) NOT NULL,
	user_pw varchar2(128) NOT NULL,
	user_name varchar2(30) NOT NULL,
	PRIMARY KEY (user_id)
);



