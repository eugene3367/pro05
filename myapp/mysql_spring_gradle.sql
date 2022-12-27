-- 데이터베이스 생성
create database shop;
-- 데이터베이스 선택
use shop;

create table test(id varchar(20), pw varchar(20));

insert into test values('admin','1234');
insert into test values('keg','1111');

select * from test;

commit;

use shop;

create table board (
	id bigint not null auto_increment comment 'PK',
    title varchar(100) not null comment '제목',
    content text not null comment '내용',
    writer varchar(20) not null comment '작성자',
    hits int not null comment '조회 수',
    delete_yn enum('Y', 'N') not null comment '삭제 여부',
    created_date datetime not null comment '생성일',
    modified_date datetime comment '수정일',
    primary key (id)
) comment '게시판';

select * from board;

create table member (
	id long,
    email varchar(100),
    password varchar(200),
    created_date datetime,
    modified_date datetime
);

drop table member;

select * from member;