
--=======================personalinfo=========================================================

DROP TABLE IF EXISTS 'personalinfo';
CREATE TABLE 'personalinfo' (
  'id' int(11) NOT NULL,
  'name' varchar(45) DEFAULT NULL,
  'phone' varchar(45) DEFAULT NULL,
  'cnic' varchar(45) DEFAULT NULL,
  'emrgnc_name' varchar(45) DEFAULT NULL,
  'emrgnc_phone' varchar(45) DEFAULT NULL,
  'address' varchar(45) DEFAULT NULL,
  'dob' varchar(45) DEFAULT NULL,
  'email' varchar(45) DEFAULT NULL,
  'emp_pic' longblob,
  'post' varchar(45) DEFAULT NULL,
  'salary' double DEFAULT NULL,
  'timing' varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
)

INSERT INTO 'personalinfo' VALUES (2,'hamza ','232323','21212','zain','2232','lahore','6 / Jul / Year','hamxayaxin@gmail.com',null,'Manager',100000,'Day / Month / Year');

--=======================dailywork=========================================================

DROP TABLE IF EXISTS 'dailywork';
CREATE TABLE `dailywork` (
  'sr' int(11) NOT NULL,
  'attndnc' varchar(45) DEFAULT NULL,
  'work' varchar(45) DEFAULT NULL,
  'assignTime' varchar(45) DEFAULT NULL,
  'assignStatus' varchar(45) DEFAULT NULL,
  PRIMARY KEY ('sr'),
  CONSTRAINT 'sr' FOREIGN KEY ('sr') REFERENCES 'personalinfo' ('id') ON DELETE NO ACTION ON UPDATE NO ACTION
)

INSERT INTO 'dailywork' VALUES (2,'zain','xsankl','Tue Jan 17 10:17:45 PST 2017','Not Available'),(3,'presenT','ghr n jana','Wed Jan 18 22:34:36 PST 2017','Not Available');

--=======================login=========================================================

DROP TABLE IF EXISTS 'login';
CREATE TABLE `login` (
  'srno' int(11) NOT NULL,
  'id' varchar(45) DEFAULT NULL,
  'pass' varchar(45) DEFAULT NULL,
  'question' varchar(45) DEFAULT NULL,
  'answer' varchar(45) DEFAULT NULL,
  'name' varchar(45) DEFAULT NULL,
  'status' varchar(45) DEFAULT NULL,
  'date_time' varchar(45) DEFAULT NULL,
  PRIMARY KEY (`srno`)
)

INSERT INTO 'login' VALUES (1,'hamza','6789','What is your dream?','Being a successfull Programmer','Hamza Yasin','Admin','Wed Jan 18 21:08:40 PST 2017');

--=======================salaryslip=========================================================

DROP TABLE IF EXISTS 'salaryslip';
CREATE TABLE 'salaryslip' (
  'sr' int(11) NOT NULL,
  'name' varchar(45) DEFAULT NULL,
  'post' varchar(45) DEFAULT NULL,
  'month' varchar(45) DEFAULT NULL,
  'days' int(11) DEFAULT NULL,
  'advance' double DEFAULT NULL,
  'deduction' double DEFAULT NULL,
  'net_salary' double DEFAULT NULL,
  'date' varchar(45) DEFAULT NULL,
  'gross_salary' double DEFAULT NULL,
)

INSERT INTO 'salaryslip' VALUES (2,'hamza ','designer','Jan',1,2,2,21222,'Tue Jan 17 11:28:15 PST 2017',21218),(2,'hamza ','designer','Jan',8,2,2,21222,'Tue Jan 17 11:29:08 PST 2017',21218),(3,'zain','Manager','Jan',4,21,32,100000,'Tue Jan 17 11:30:16 PST 2017',99947),(3,'zain','Manager','Jun',8,10,10,100000,'Tue Jan 17 11:32:16 PST 2017',99980),(3,'zain','Manager','Jan',1,3,3,100000,'Tue Jan 17 11:33:52 PST 2017',99994),(3,'zain','Manager','Jan',1,3,3,100000,'Tue Jan 17 11:34:13 PST 2017',99994),(3,'zain','Manager','Jan',1,3,3,100000,'Tue Jan 17 11:34:38 PST 2017',99994),(3,'zain','Manager','Jan',1,3,3,100000,'Tue Jan 17 11:34:40 PST 2017',99994),(3,'zain','Manager','Jan',1,3,3,100000,'Tue Jan 17 11:34:43 PST 2017',99994),(3,'zain','Manager','Jan',1,3,3,100000,'Tue Jan 17 11:34:46 PST 2017',99994),(3,'zain','Manager','Jan',1,3,3,100000,'Tue Jan 17 11:34:52 PST 2017',99994),(2,'hamza ','designer','Jan',1,100,105,21222,'Wed Jan 18 22:35:22 PST 2017',21017),(2,'hamza ','designer','Jan',30,100,105,21222,'Wed Jan 18 22:35:58 PST 2017',21017),(2,'hamza ','designer','Jan',1,1,1,21222,'Wed Jan 18 23:11:43 PST 2017',21220);

--=======================uploadwork=========================================================

DROP TABLE IF EXISTS 'uploadwork';
CREATE TABLE 'uploadwork' (
  'id' int(11) NOT NULL,
  'description' varchar(45) DEFAULT NULL,
  'upload_date' varchar(45) DEFAULT NULL,
  'developer_name' varchar(45) DEFAULT NULL,
  'designer_name' varchar(45) DEFAULT NULL,
  'game_link' varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
)


