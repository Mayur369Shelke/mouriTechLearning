use moritech;

show tables;

desc employee;

-- creating a new table to write subquery example

CREATE TABLE Library(  
  BookNumber int NOT NULL,  
  BookCode varchar(15) NOT NULL,  
  BookIssue int NOT NULL,  
  CostEach decimal(10, 2) NOT NULL,  
  PRIMARY KEY(BookNumber, BookCode)  
);  

-- INSERT the data in the above tables
insert into library values (200100,2100,0,250.89);

insert into library values (200101,2101,1,350.89),
						   (200102,2102,0,250.89),
                           (200103,2103,1,450.89),
                           (200104,2104,0,250.89),
                           (200105,2105,0,550.89),
                           (200106,2106,1,250.89),
							(200107,2107,1,250.89);

CREATE TABLE Bookorder(  
  BookNumber int NOT NULL,  
  orderDate date NOT NULL,  
  shippedDate date DEFAULT NULL,  
  Status varchar(50),  
  PRIMARY KEY(BookNumber)  
); 

-- insert the values in the above table
insert into Bookorder values(200101,'2021-10-20','2021-10-21','done');
insert into Bookorder values(200102,'2021-10-20','2021-10-21','In Progress'),
							(200103,'2021-12-30',null,'In Progress'),
                            (200104,'2021-12-29','2022-10-02','done'),
                            (200105,'2022-01-01','2021-10-21','In Progress'),
                            (200106,'2021-10-20','2021-10-21','done'),
                            (200107,'2021-10-20','2021-10-21','done'),
                            (200108,'2021-10-20','2021-10-21','done'),
                            (200109,'2021-10-20','2021-10-21','done'),
                            (200110,'2021-10-20','2021-10-21','done');


-- Using IN and NOT In Operators in WHERE Clause
--  Write a subquery to get list of shipped date and status of books 
		-- that are available in library

SELECT * FROM bookorder WHERE booknumber IN(
	SELECT booknumber FROM library
);

SELECT * FROM bookorder WHERE booknumber NOT IN(
	SELECT booknumber FROM library
);

-- Writing sub queries using comparision operators
 SELECT * FROM bookorder WHERE booknumber = ANY(
	SELECT booknumber FROM library
);
-- Exists subquery should contain any reference column
-- it must be a correlated subquery

-- Exists subquery is used to test whether a sub-query returns at 
      -- least one row or a qualifying row exists 

 SELECT * FROM bookorder bo WHERE  Exists (
	SELECT * from library lb where bo.booknumber = lb.booknumber
);

 SELECT * FROM bookorder bo WHERE  NOT Exists (
	SELECT * from library lb where bo.booknumber = lb.booknumber
);



