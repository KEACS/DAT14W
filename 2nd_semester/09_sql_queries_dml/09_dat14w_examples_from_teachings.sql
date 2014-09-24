-- Simple SELECTS
SELECT * FROM Branch; 
SELECT branchNo, street, city, postcode FROM Branch; 

-- DISTINCT
SELECT DISTINCT propertyNo FROM Viewing;

-- CALCULATED FILEDS
SELECT 
	staffNo, fName, lName, salary/12 AS monthlysalary 
FROM 
	Staff; 

-- WHERE
SELECT * FROM Staff WHERE salary BETWEEN 9000 AND 14000;

-- LIKE % _
SELECT * FROM PropertyForRent WHERE street LIKE '%H______';

-- NULL
SELECT * FROM Viewing WHERE comment IS NOT NULL;

-- SORTING
SELECT * FROM Staff ORDER BY position ASC;

-- Hotel (hotelNo, hotelName, city)
-- Room (roomNo, hotelNo, type, price)
-- Booking (hotelNo, guestNo, dateFrom, dateTo, roomNo)
-- Guest (guestNo, guestName, guestAddress)

-- List full details of all hotels.
SELECT * FROM Hotel;

-- List full details of all hotels in London.
SELECT * FROM Hotel WHERE city = 'London';

-- List the names and addresses of all guests living in London, 
-- alphabetically ordered by name.

SELECT guestName, guestAddress FROM Guest 
WHERE guestAddress LIKE '%London%' ORDER BY guestName;

-- List all double or family rooms with a price 
-- below £40.00 per night, in ascending order of price.
SELECT type, price FROM Room WHERE price < 40 ORDER BY price ASC;

-- List the bookings for which no dateTo has been specified.
SELECT * From Booking WHERE dateTo IS NULL;
-- AGGREGATE FUNTIONS
-- SUM(), COUNT(), MAX(), MIN(), AVG()

SELECT COUNT(*) AS numbersOfproperty FROM PropertyForRent;

SELECT COUNT(*) AS Managers, SUM(salary) AS SUMSALARY 
FROM Staff
WHERE position = 'Manager';

SELECT MIN(salary), MAX(salary), AVG(salary)
FROM Staff;

-- GROUPING
SELECT branchNo, COUNT(staffNo) AS STAFF
FROM Staff
GROUP BY branchNo;

-- HAVING
SELECT branchNo, COUNT(staffNo) AS STAFF
FROM Staff
GROUP BY branchNo
HAVING STAFF < 2;



SELECT position, COUNT(*), AVG(salary) AS avgSalary
FROM Staff
GROUP BY position
ORDER BY avgSalary DESC

-- INSERT
INSERT INTO Branch VALUES('B0010', 'Danmarksgade 6', 'Kbh', '2100');
INSERT INTO Branch (branchNo, city, postcode)
VALUES('B0010', 'Kbh', '2100');

-- UPDATE
UPDATE Branch SET street = 'xxxxxxxx', postcode = '1600'
WHERE branchNo = 'B0010';


-- DELETE
DELETE FROM Branch
WHERE branchNo = 'B007';


