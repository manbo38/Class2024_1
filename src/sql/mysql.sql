-- 데이터 베이스 목록
show datebases;

-- 테이블 목록
show tables;

-- 검색
select * from member;
select * from boardtest;
select * from customer;
select * from board;

-- 테이블 삭제
drop table customer;

-- 실습1.
create table customer(no int(4) auto_increment primary key,
					name varchar(20),
					email varchar(20),
					tel varchar(20),
					address varchar(20),
					reg_date timestamp);

insert into customer(name,email,tel,address,reg_date)
	values('카리나','karina@sm.com','1574-8883','서울시 광진구',sysdate());
	
-- 실습2.
-- primary key(기본키) : 반드시 중복되지 않는 값을 저장 해야한다는 의미
-- not null : null 값을 허용하지 않는다. -> 반드시 값을 입력 해야한다는 의미
	
create table board(no int auto_increment primary key,
				writer varchar(20) not null,
				passwd varchar(20) not null,
				subject varchar(100) not null,
				content varchar(1000) not null,
				reg_date timestamp );
				
insert into board(writer,passwd,subject,content,reg_date)
	values('홍은채','5678','소리질러봐나나나','가수맞냐이게',sysdate());
