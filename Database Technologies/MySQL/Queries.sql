alter table emp
	Add primary key(empno);

alter table dept
	Add primary key(deptno);


alter table salgrade
	 Add primary key(grade);


alter table emp
add constraint f12 foreign key(deptno) references dept(deptno);

alter table emp
	add netsal double(9,2) default 1000;

update emp
set sal  = sal + (sal + * 0.15) + ifnull(comm,0), job = ‘Manager’, mgr = 7777
where deptno = 10;


update emp
set sal = sum( sal + (sal * 0.15))
Where comm > 0; 

update emp
set sal  = sal+(sal* 0.15)+ifnull(comm,0), job = 'MANAGER', mgr = 7777
where deptno = 10;


insert into emp values(7062, 'REVATI', 'OPERATIONS',  8000,
           STR_TO_DATE('9-DEC-1999', '%d-%b-%Y'),  2500,    200, 40);

INSERT INTO EMP VALUES
             (8109, 'RAJAN', 'OPERATIONS',  8452,
             STR_TO_DATE('10-MAR-1999', '%d-%b-%Y'),  2500,    200, 40);


select *
    -> from emp
where sal between (select sal from emp where ename = 'rajan') and (select sal from emp where ename = 'Revati');


Q54. ---------------------------------------------------------------------
    create table salesman(
	sid int primary key,
	sname varchar(25),
	address varchar(25)	
);

create table category(
	cid int primary key,
	cname varchar(25),
	cdesc text	
);

create table product(
pid int primary key,
pname varchar(20),
price double(9,2),
qty int,
cid int,
sid int,
constraint foreign key fk_cid (cid) references category(cid),
constraint foreign key fk_sid (sid) references salesman(sid)
on delete set null 
on update cascade
);

insert into category values(1,'Chips','very crispy');

insert into category values(2,'Cold drink','cool cool');

insert into category values(3,'Snacks','Yummy Yummy');

insert into category values(4,'Energy Drink','Gives you wingsss');

insert into category values(5,'Juices','Refreshing');


insert into salesman values(101,'Alex','Nagpur');

insert into salesman values(102,'Ben','Goa');

insert into salesman values(103,'Roy','Pune');

insert into salesman values(104,'Jason','Mumbai');

insert into salesman values(105,'Andrew','Jaipur');


insert into product values(10,'Lays',20,50,1,101);

insert into product values(20,'Limca',30,100,2,102);

insert into product values(30,'Solid Masti',20,40,3,103);

insert into product values(40,'Red Bull',20,135,4,104);

insert into product values(50,'Orange',20,100,5,105);

Q55 --------------------------------------------------------------------------


create table faculty(
	fid int primary key,
	fname varchar(25),
	spskill1 varchar(25),
	spskill2 varchar(25)
	);
	
create table room(
	roomid int primary key,
	rname varchar(25),
	rloc varchar(20)
	);

create table courses(
	cid int primary key,
	cname varchar(25),
	rid int,
	fid int,
	constraint foreign key fk_rid (rid) references room(roomid),
	constraint foreign key fk_fid (fid) references faculty(fid)
	on delete set null 
	on update cascade
);


insert into faculty values (10,'kjzhcjhz','a','b');

insert into faculty values (12,'sdd','x','z');

insert into faculty values (13,'lksjk','a','x');

insert into faculty values (14,'ksdjlkj','a','b');


insert into room values (100,'jasmin','1st Floor');

insert into room values (101,'Rose','2nd Floor');

insert into room values (105,'Lotus','1st Floor');

insert into room values (103,'Mogra','1st Floor');


insert into courses values (121,'DBDA',100,10);

insert into courses(cid,cname,rid) values (131,'DAC',101);

insert into courses(cid,cname) values (141,'DITISS');

insert into courses values (151,'DIOT',105,12);

Q56 ----------------------------------------------------------------------------

create table salesman2(
	sid int primary key,
	sname varchar(25) not null,
	city varchar(25)
	);
	
create table category2(
	cid int primary key,
	cname varchar(25) not null unique,
	cdesc text
	);

create table product2(
	pid int primary key,
	pname varchar(25) not null unique,
	qty int check(qty>0) default 20.00,
	price double (9,2),
	catid int,
	sid int,
	constraint foreign key fk_catid (catid) references category2(cid),
	constraint foreign key fk_sid (sid) references salesman2(sid)
	on delete set null 
	on update cascade
);


insert into category2 values(1,'Chips','Very Crunchy');

insert into category2 values(2,'Chocolate','Very Chocolaty');

insert into category2 values(3,'Snacks','Yummy');

insert into category2 values(4,'Cold Drinks','Thanda Thanda cool cool');


insert into salesman2 values(11,'Rahul','Pune');

insert into salesman2 values(12,'Kirti','Mumbai');

insert into salesman2 values(13,'Prasad','Nashik');

insert into salesman2 values(14,'Arnav','Amaravati');


insert into product2 values(123,'Lays',30,30.00,1,12);

insert into product2 values(111,'Pepsi',40,50.00,4,11);

insert into product2 values(134,'Nachos',50,50.00,1,12);

insert into product2 values(124,'Dairy Milk',40,60.00,2,14);

insert into product2 values(124,'Pringles',40,60.00,1,14);

ASSIGNMENT 3 --------------------------------------------------

create table vehicle(
	vid int primary key,
	vname varchar(20),
	price double(9,2),
	cdesc text
);

create table customer(
	custid int primary key,
	cname varchar(20),
	address varchar(20)
);

create table salesman3(
	sid int primary key,
	sname varchar(25),
	address varchar(20)	
);

create table cust_vehicle (
	custid int,
	vid int,
	primary key (custid, vid),
	sid int,
	buy_price int,
	constraint foreign key fk_custid (custid) references customer(custid),
	constraint foreign key fk_vid (vid) references vehicle(vid),
	constraint foreign key fk_sid (sid) references salesman3(sid)
    on delete set null 
    on update cascade	
);


insert into vehicle values(1,'Activa',80000, 'ksdkjjks');
insert into vehicle values(2,'Santro', 800000,'jhghgfjhj');
insert into vehicle values(3,'Motor bike',100000, 'hghgfghf');


insert into customer values(1,'Nilima', 'Pimpri');
insert into customer values(2,'Ganesh','Pune');
insert into customer values(3,'Pankaj', 'Mumbai');


insert into salesman3 values(10,'Rajesh', 'Mumbai');
insert into salesman3 values(11,'Seema','Pune');
insert into salesman3 values(13,'Rakhi', 'Pune');


insert into cust_vehicle values(1, 1,10, 75000);
insert into cust_vehicle values(1, 2, 10,790000);
insert into cust_vehicle values(2, 3,11, 80000);
insert into cust_vehicle values(3, 3,11, 75000);
insert into cust_vehicle values(3, 2,10, 800000);


Q14.

delimiter //
create procedure getMin(dno int)
begin
	 select deptno, min(sal)
	 from emp e
	 where e.deptno = dno
	 group by deptno;
end//

ASSIGNMENT 4 --------------------------------------------------

Q1. (delimiter ;)

delimiter //
create procedure insert_rec(peno int,pnm varchar(20),psal decimal(9,2),pjob
varchar(20),phiredate date)
begin
insert into emp(empno,ename,sal,job,hiredate) values(peno,pnm,psal,pjob,phiredate);
end//

call insert_rec(1111,'Sahil',10000,'CEO','2023-04-13');

Q2. 
delimiter //
create procedure delete_emp(peno int)
begin
delete from emp
where empno = peno;
end//

call delete_emp(1111);

Q3.

delimiter //
create procedure display_emp(esal double(9,2))
begin
select e.empno,e.ename,e.deptno,d.dname
from emp e, dept d
where e.sal > esal and e.deptno = d.deptno;
end//

call display_emp(2500);

Q.4 

delimiter //
create procedure disp_data(dno int)
begin
select min(sal), max(sal), avg(sal), count(*)
from emp 
where deptno = dno; 
end//

call disp_emp(20);

Q.5

delimiter //
create procedure disp_emp()
begin
select p.pid, p.pname, c.cid, c.cname, s.sname
from product p, category c, salesman s
where p.cid = c.cid and p.sid = s.sid;
end//

call disp_emp();

Q.6

delimiter //
create procedure disp_vehicle(pname varchar (20))
begin
	select vname, price, cname, c.address, sname "Salesman Name"
	from vehicle v, customer c, salesman3 s, cust_vehicle cv
	where cname = pname and v.vid = cv.vid and s.sid = cv.sid and c.custid = cv.custid;
end//

call disp_vehicle('Pankaj');

Q.7

delimiter //
create procedure display_emp_info()
begin
    declare avg_salary decimal(9,2);
    
    select avg(sal) into avg_salary from emp group by deptno limit 1;
    
    if avg_salary is null then
        select 'emp table is empty';
    else
        select empno, ename, job, sal, 
               case 
                   when sal > avg_salary then 'greater' 
                   when sal < avg_salary then 'lesser' 
                   else 'equal' 
               end as status, deptno 
        from emp;
    end if;
end //

Q.8

delimiter //
create procedure update_sal(exp int)
begin
	if exp <= 35 then
	update emp set sal = sal;
	elseif exp <= 38 then
	update emp set sal = sal + (0.2*sal); 
	else 
	update emp set sal = sal + (0.25*sal);
	end if;
end//

Q.9 

create table emp_allowance(
empno int,
ename varchar(20),
hiredate date,
experience int,
allowance decimal(9,2));


delimiter //
create function cal_exp(hrdate date) returns int
begin
	declare experience int;
	select floor(datediff(curdate(),hrdate)/365)
	into experience
	from emp
	where hiredate = hrdate;
    return experience;
end//

delimiter //
create procedure Cal_all(empnum int)
BEGIN
  DECLARE pempno,years_of_exp INT;
  DECLARE pname varchar(20);
  DECLARE phiredate date;
  DECLARE add_allowance double(9,2);
  select empno,ename,hiredate,cal_exp(hiredate), 3000 * cal_exp(hiredate)
  into pempno,pname,phiredate,years_of_exp,add_allowance
  from emp
  where empno = empnum;
  insert into emp_allowance values(pempno,pname,phiredate,years_of_exp,add_allowance);
end//

Q10

SET GLOBAL log_bin_trust_function_creators = 1;
delimiter //

create function costtocompany(salary double, hdate date) returns double(9,2)
begin
declare sal double(9,2);
declare netsal, costtocompany, spallow double(9,2);
declare exp int;
select salary, salary + salary*0.15 + salary * 0.20 + salary * 0.08, timestampdiff(year,hdate,curdate()), case
when exp < 1 then salary
when exp < 2 then salary * 0.10
when exp < 4 then salary * 0.20
else salary * 0.30
end
into sal, netsal, exp, spallow;
select netsal + spallow into costtocompany;
return costtocompany;
end//

Q2.1


create table emp_back(
empno int,
ename varchar(20),
oldsal decimal(9,2),
newsal decimal(9,2)
);

delimiter //
create trigger Emp_back after update on emp
For each row
begin
	 insert into emp_back(empno, ename, oldsal, newsal)
	 values (old.empno, old.ename, old.sal, new.sal);
end//


Q2.2

create table empaudit(
empno int,
ename varchar(20),
username varchar(20),
chdate date,
action varchar(20)
);

delimiter //
create trigger empaudit1 after insert on emp
For each row
begin
	 insert into empaudit(empno, ename, username, chdate, action)
	 values (new.empno, new.ename, user(), curdate(), 'Insert');
end//

delimiter //
create trigger empaudit2 after delete on emp
For each row
begin
	 insert into empaudit(empno, ename, username, chdate, action)
	 values (old.empno, old.ename, user(), curdate(), 'Delete');
end//


Q2.3

create table vehicle_history(
vno int,
vname varchar(20),
oldprice double(9,2),
newprice double(9,2),
chdate date,
username varchar(20)
);
	
delimiter //
create trigger veh_his after update on vehicle
For each row
begin
	 insert into vehicle_history (vno, vname, oldprice, newprice, chdate, username)
	 values (old.vid, old.vname, old.price, new.price, curdate(), user());
end//	