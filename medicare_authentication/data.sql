create schema if not exists `medicare_authentication`;

use `medicare_authentication`;

insert into medicare_authentication.user(us_id,us_first_name,us_last_name,us_contact_no,us_role) values(1,"chitti","agnihotri","7979797979","agent");
insert into medicare_authentication.user(us_id,us_first_name,us_last_name,us_contact_no,us_role) values(2,"Akki","Faiza","7979797979","Patinet");
insert into medicare_authentication.user(us_id,us_first_name,us_last_name,us_contact_no,us_role) values(3,"Apaku","Guntoor","7979797979","Doctor");
insert into medicare_authentication.user(us_id,us_first_name,us_last_name,us_contact_no,us_role) values(4,"naveeen","vizag","7979797979","admin");

select * from medicare_authentication.user;

INSERT INTO medicare_authentication.user VALUES(5,'Chitransh','Srivastava','pwd','chitti','dsds','dsdsdsdsd');

INSERT INTO medicare_authentication.role VALUES(1,'ROLE_ADMIN');
INSERT INTO medicare_authentication.role VALUES(2,'ROLE_USER');
INSERT INTO medicare_authentication.role VALUES(3,'ROLE_DOCTOR');
INSERT INTO medicare_authentication.role VALUES(4,'ROLE_AGENT');

INSERT INTO medicare_authentication.user_role VALUES(1,1);
INSERT INTO medicare_authentication.user_role VALUES(2,2);
INSERT INTO medicare_authentication.user_role VALUES(3,1);
INSERT INTO medicare_authentication.user_role VALUES(4,2);

drop table truyum_db.role;

select * from medicare_authentication.user;


select * from truyum_db.cart_item;
select * from truyum_db.cart;

insert into cart values();


insert into truyum_db.cart values(2,50,9); 
insert into truyum_db.cart_item values(4,3,2,3);

desc truyum_db.cart_item ;
desc truyum_db.cart;

select * from medicare_authentication.user_role;

