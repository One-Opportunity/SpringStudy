create table memo(
	id NUMBER PRIMARY KEY,
	name VARCHAR2(25),
	memo VARCHAR2(255)
);
drop table memo;
select * from memo;
insert into memo values(sq_memo_idx.nextval, '홍길동', '반갑습니다');
SELECT * FROM memo where id=1;
		SELECT * FROM memo
		ORDER BY sq_memo_idx.nextval;
delete from memo where name='홍길동';

create sequence sq_memo_idx
	start with 1
	increment by 1
	nomaxvalue
	nocache;