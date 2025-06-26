CREATE TABLE TODO(
    idx number(3) primary key,
    content VARCHAR2(50),
    password VARCHAR2(20),
    status number(1) default 0,
    post_date date default sysdate
);

CREATE SEQUENCE todo_seq
    start with 1
    increment by 1
    nocache
    nocycle;
    
select * from todo;

drop table todo;

CREATE TABLE userinfo(
    idx number(3) primary key,
    userId VARCHAR2(20),
    userPw VARCHAR2(50)
);

CREATE SEQUENCE user_seq
    start with 1
    increment by 1
    nocache
    nocycle;
    
select * from userinfo;

drop table userinfo;