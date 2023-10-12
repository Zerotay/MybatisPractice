create table member(
	id bigint not null auto_increment primary key,
	user_id varchar(50) not null unique,
    user_pass varchar(255) not null,
    user_name varchar(50),
    join_date datetime default now()
);

select *
from member;

