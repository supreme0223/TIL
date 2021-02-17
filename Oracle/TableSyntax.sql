Select * from memberTBL;

Select * from productTBL;

Select Sysdate from Dual;
Select To_Char (Sysdate, 'YYYY/MM/DD HH:MM:SS') "Today" From Dual; -- fuction for today
Select To_Date ('20201231235959', 'YYYYMMDDHH24MISS') "Date Format" From Dual;

Create Table Test (idNum number(5));
insert into Test (idNum) values(1);
insert into Test (idNum) values('1'); --number in a single quotation can be interpreted to numerical value as well, but it's not recommended.
insert into Test (idNum) values('10');
insert into Test (idNum) values(20);
Select * from Test;
Drop Table test;

Drop Table userTBL Cascade Constraints;
Drop Table buyTBL Cascade Constraints;

Create table userTBL
( userID Char(8),
 userName NVARChar2(10) not null,
 birthYear Number(4) default -1 not null, -- set up the default value with -1. 
 addr NChar(2) default '서울' not null,
 mobile1 Char(3) null, -- you don't need to specify 'null' because it's originally set up to null. 
 mobile2 Char(8) null,
 height Number(3) default 170 null,
 mDate Date null
 --Constraint PK_userTBL_userID primary key (userID)
 );
 Alter table userTBL add constraint PK_userTBL_userID primary key (userID); -- add constraint that set primary key to userID
 
 
 Create Table buyTBL
 (idNum Number(8) primary Key,
 userID Char(8) not null,
 prodName NChar(6) not null,
 groupName Nchar(4) null,
 price Number(8) null,
 amount Number(3) not null
 --Constraint FK_userTBL_buyTBL Foreign Key(userID) references userTBL(userID)
 );
 alter table buytbl
 add constraint FK_userTBL_buyTBL 
 FOREIGN KEY (userID) 
 references usertbl(userId)
 On delete cascade;
 
 Create Sequence idSEQ; --id is automatically increasing. the method for only Oracle.
 
 insert into userTBL values('LSG','이승기',default, default,'011','11111111',default,'2008-8-8');
 insert into userTBL values('KBS','김범수',1979,'경남','011',null, 173,'2012-4-4');
 insert into userTBL values('KKH','김경호',1971,'전남','019','',177,'2007-7-7');
 insert into userTBL values('KKH2','김경호2',1971,'전남','019',' ',177,'2007-7-7');
 insert into userTBL (userID, userName) Values('KAY', '김아영');
 insert into userTBL (userID, userName, birthyear) Values('HGD', '홍길동', 1980);
 Select * from userTBL;
 
 insert into buyTBL values(idSEQ.NEXTVAL, 'KBS', '운동화',NULL, 30,2);
 insert into buyTBL values(idSEQ.NEXTVAL, 'KBS', '노트북','전자', 1000,1);
 insert into buyTBL values(idSEQ.NEXTVAL, 'JYP', '모니터','전자', 200,1);
 Select * from buyTBL;
 
 select * from user_constraints where table_name='USERTBL' and constraint_type='P';
 
 Create Table prodTBL
 (  prodCode Char(3) Not null,
    prodID Char(4) Not null,
    prodDate Date Not Null,
    prodCur Char(10) Null
 );
 Alter table prodTBL add constraint PK_prodTBL_proCode_prodID
 Primary Key (prodCode, prodID);
 
 select * from user_constraints where table_name='PRODTBL' and constraint_type='P'; --supposed to be capitalized in this case.