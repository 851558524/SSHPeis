create table tbl_itemtypes
(
       typeid number(10) primary key,
       typename varchar2(50) not null
);
create sequence seq_itemtypes_id;
create table tbl_peitems
(
       itemid number(10) primary key,
       itemname varchar2(50) not null,
       typeid number(10) references tbl_itemtypes(typeid),
       necessary number(1) ,
       ref varchar2(20),
       price number(10,2) not null,
       info varchar2(100)
);
create sequence seq_peitems_id;


insert into tbl_itemtypes values(seq_itemtypes_id.nextval,'内科检查');
insert into tbl_itemtypes values(seq_itemtypes_id.nextval,'血常规检查');
insert into tbl_itemtypes values(seq_itemtypes_id.nextval,'大脑检查');
select * from tbl_itemtypes;

insert into tbl_peitems values(seq_peitems_id.nextval,'身高',2,1,'140',50,'身高');
insert into tbl_peitems values(seq_peitems_id.nextval,'体重',3,1,'140',60,'体重');
insert into tbl_peitems values(seq_peitems_id.nextval,'血压',4,1,'140',70,'血压');
insert into tbl_peitems values(seq_peitems_id.nextval,'血压2',4,0,'140',70,'血压');
insert into tbl_peitems values(seq_peitems_id.nextval,'血压3',4,0,'140',70,'血压');
select * from tbl_peitems;

commit;
















