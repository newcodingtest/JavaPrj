--bookinfo 테이블을 생성하시오

create table bookinfo(
num number primary key,
book_code varchar(20),
book_title varchar(100),
book_author varchar(50),
book_pub varchar(30),
book_price number,
book_date date
);

--시퀀스 생성
--create sequence 시퀀스이름 start with 시작값 increment by 증가값
create sequence book_num start with 1 increment by 1;

--시퀀스 삭제
--drop sequenc 시퀀스 이름
--drop sequence book_num;
--코드규칙 A001 ~

insert into BOOKINFO values(book_num.nextval, 'A001','나미야 잡화점의 기적','히가시노 게이고','일본',13320,sysdate);

select * from bookinfo;