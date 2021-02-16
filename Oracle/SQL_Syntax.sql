
Select * from memberTBL; -- fetch(read) the whole data from "MEMBERTBL" table.

Insert into memberTBL(memberID, membername, memberaddress)VALUES ('Yil', '이영인', '미국 캘리포니아'); --Insert the data with the corresponding values into the table.

Update producttbl set amount = 100 where productname = '컴퓨터'; -- update productTBL where productName is "컴퓨터" to be set with 100 quantities.

Delete from producttbl where productname = '컴퓨터'; -- delete a productName "컴퓨터" from productTBL.

Create Table "my testTBL" (id NUMBER(3)); --Create a table

Drop Table "my testTBL"; --Delete a table 