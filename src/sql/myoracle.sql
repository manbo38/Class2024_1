-- 테이블 목록
select * from tab;

-- purge recyclebin;

-- 시퀀스 목록
select * from seq;

select * from member01;
select * from customer;
select * from board;
delete from customer;


-- 실습1. 회원관리
-- 기본키(primary key)
-- : 반드시 중복되지 않은 값을 저장해야 된다.
create table customer(
	no  number(4) primary key,
	name varchar2(20),
	email varchar2(20),
	tel varchar2(20));
	
-- address와 reg_date 컬럼 추가	
alter table customer add(address varchar2(50));
alter table customer add(reg_date timestamp);


-- 시퀀스 생성 : 번호(no)를 1부터 1씩 자동으로 증가 시켜서 처리해주는 역할
create sequence customer_no_seq
start with 1
increment by 1;

-- 시퀀스 다음값 구해오기
select customer_no_seq.nextval from dual;

-- 실습2. 게시판
create table board(
		no number primary key,
		writer varchar2(20) not null,
		passwd varchar2(20) not null,
		subject varchar2(20) not null,
		content varchar2(1000) not null,
		reg_date timestamp);
		
create sequence board_seq
start with 1
increment by 1;
