--bookinfo ���̺��� �����Ͻÿ�

create table bookinfo(
num number primary key,
book_code varchar(20),
book_title varchar(100),
book_author varchar(50),
book_pub varchar(30),
book_price number,
book_date date
);

--������ ����
--create sequence �������̸� start with ���۰� increment by ������
create sequence book_num start with 1 increment by 1;

--������ ����
--drop sequenc ������ �̸�
--drop sequence book_num;
--�ڵ��Ģ A001 ~

insert into BOOKINFO values(book_num.nextval, 'A001','���̾� ��ȭ���� ����','�����ó� ���̰�','�Ϻ�',13320,sysdate);

select * from bookinfo;