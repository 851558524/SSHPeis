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


insert into tbl_itemtypes values(seq_itemtypes_id.nextval,'�ڿƼ��');
insert into tbl_itemtypes values(seq_itemtypes_id.nextval,'Ѫ������');
insert into tbl_itemtypes values(seq_itemtypes_id.nextval,'���Լ��');
select * from tbl_itemtypes;

insert into tbl_peitems values(seq_peitems_id.nextval,'����',2,1,'140',50,'����');
insert into tbl_peitems values(seq_peitems_id.nextval,'����',3,1,'140',60,'����');
insert into tbl_peitems values(seq_peitems_id.nextval,'Ѫѹ',4,1,'140',70,'Ѫѹ');
insert into tbl_peitems values(seq_peitems_id.nextval,'Ѫѹ2',4,0,'140',70,'Ѫѹ');
insert into tbl_peitems values(seq_peitems_id.nextval,'Ѫѹ3',4,0,'140',70,'Ѫѹ');
select * from tbl_peitems;

commit;















