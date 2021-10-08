create sequence hibernate_sequence start 1 increment 1;
create table goal (id int8 not null, creation_date date, dead_line date, is_done boolean not null, modification_date date, name varchar(255), priority int4, primary key (id));
create table goal_tags (goal_id int8 not null, tags varchar(255));
alter table if exists goal_tags add constraint goal_tag_fk foreign key (goal_id) references goal;