-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema hotelmgt
--

CREATE DATABASE IF NOT EXISTS hotelmgt;
USE hotelmgt;

--
-- Definition of table `billing`
--

DROP TABLE IF EXISTS `billing`;
CREATE TABLE `billing` (
  `BillNo` varchar(45) NOT NULL,
  `BillEntryDate` varchar(45) NOT NULL,
  `BookingNo` varchar(45) NOT NULL,
  `DepartureDate` date NOT NULL,
  `BillingDays` int(10) unsigned NOT NULL,
  `TotalRoomRent` int(10) unsigned NOT NULL,
  `ServiceCharge` int(10) unsigned NOT NULL,
  `GrossBillAmount` int(10) unsigned NOT NULL,
  `ServiceTax` int(10) unsigned NOT NULL,
  `DiscountAllowed` int(10) unsigned NOT NULL,
  `NetBillAmount` int(10) unsigned NOT NULL,
  `BillingMode` varchar(45) NOT NULL,
  `CardNumber` varchar(45) NOT NULL,
  `AmountRecived` int(10) unsigned NOT NULL,
  `OutstandingAmount` int(10) unsigned NOT NULL COMMENT '(if any)',
  PRIMARY KEY  (`BillNo`),
  KEY `FK_Billing_1` (`BookingNo`),
  CONSTRAINT `FK_Billing_1` FOREIGN KEY (`BookingNo`) REFERENCES `booking` (`BookingNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `billing`
--

/*!40000 ALTER TABLE `billing` DISABLE KEYS */;
INSERT INTO `billing` (`BillNo`,`BillEntryDate`,`BookingNo`,`DepartureDate`,`BillingDays`,`TotalRoomRent`,`ServiceCharge`,`GrossBillAmount`,`ServiceTax`,`DiscountAllowed`,`NetBillAmount`,`BillingMode`,`CardNumber`,`AmountRecived`,`OutstandingAmount`) VALUES 
 ('BNo001','2017-01-01','B001','2017-01-01',1,5000,100,5100,600,0,5610,'By Cash','NULL',5610,0),
 ('BNo002','2017-01-04','B006','2017-01-15',5,7500,800,8300,830,0,9130,'By Cash','NULL',9130,0);
/*!40000 ALTER TABLE `billing` ENABLE KEYS */;


--
-- Definition of trigger `billing_BUPD`
--

DROP TRIGGER /*!50030 IF EXISTS */ `billing_BUPD`;

DELIMITER $$

CREATE DEFINER = `root`@`localhost` TRIGGER `billing_BUPD` BEFORE UPDATE ON `billing` FOR EACH ROW BEGIN
INSERT INTO billingHistory
values(old.BillNo, old.BillEntryDate, old.BookingNo, old.DepartureDate, 
old.BillingDays, old.TotalRoomRent, old.ServiceCharge,
old.GrossBillAmount, old.ServiceTax, old.DiscountAllowed, 
old.NetBillAmount, old.BillingMode, old.CardNumber, 
old.AmountRecived, old.OutstandingAmount);

END $$

DELIMITER ;

--
-- Definition of table `billinghistory`
--

DROP TABLE IF EXISTS `billinghistory`;
CREATE TABLE `billinghistory` (
  `BillNo` varchar(45) NOT NULL,
  `BillEntryDate` varchar(45) NOT NULL,
  `BookingNo` varchar(45) NOT NULL,
  `DepartureDate` date NOT NULL,
  `BillingDays` int(10) unsigned NOT NULL,
  `TotalRoomRent` int(10) unsigned NOT NULL,
  `ServiceCharge` int(10) unsigned NOT NULL,
  `GrossBillAmount` int(10) unsigned NOT NULL,
  `ServiceTax` int(10) unsigned NOT NULL,
  `DiscountAllowed` int(10) unsigned NOT NULL,
  `NetBillAmount` int(10) unsigned NOT NULL,
  `BillingMode` varchar(45) NOT NULL,
  `CardNumber` varchar(45) NOT NULL,
  `AmountRecived` int(10) unsigned NOT NULL,
  `OutstandingAmount` int(10) unsigned NOT NULL COMMENT '(if any)',
  PRIMARY KEY  (`BillNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `billinghistory`
--

/*!40000 ALTER TABLE `billinghistory` DISABLE KEYS */;
INSERT INTO `billinghistory` (`BillNo`,`BillEntryDate`,`BookingNo`,`DepartureDate`,`BillingDays`,`TotalRoomRent`,`ServiceCharge`,`GrossBillAmount`,`ServiceTax`,`DiscountAllowed`,`NetBillAmount`,`BillingMode`,`CardNumber`,`AmountRecived`,`OutstandingAmount`) VALUES 
 ('BNo001','2017-01-01','B001','2017-01-01',1,5000,100,5100,600,0,5610,'By Cash','NULL',5610,0),
 ('BNo002','2017-01-04','B006','2017-01-15',5,7500,500,8000,800,0,8800,'By Cash','NULL',5000,3800);
/*!40000 ALTER TABLE `billinghistory` ENABLE KEYS */;


--
-- Definition of table `booking`
--

DROP TABLE IF EXISTS `booking`;
CREATE TABLE `booking` (
  `BookingNo` varchar(45) NOT NULL,
  `CCode` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `RoomNo` int(10) unsigned NOT NULL,
  `BookingDate` varchar(45) NOT NULL,
  `DateOfArival` date NOT NULL,
  `DateOfDeparture` varchar(45) NOT NULL,
  `BookingForDays` varchar(45) NOT NULL,
  `NoOfPerson` int(10) unsigned NOT NULL,
  `Relationship` varchar(45) NOT NULL,
  `CheckedStatus` varchar(45) default NULL,
  PRIMARY KEY  (`BookingNo`),
  KEY `FK_Booking_1` (`CCode`),
  KEY `FK_booking_2` (`RoomNo`),
  CONSTRAINT `FK_Booking_1` FOREIGN KEY (`CCode`) REFERENCES `customer` (`CCode`),
  CONSTRAINT `FK_booking_2` FOREIGN KEY (`RoomNo`) REFERENCES `rooms` (`RoomNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` (`BookingNo`,`CCode`,`Name`,`RoomNo`,`BookingDate`,`DateOfArival`,`DateOfDeparture`,`BookingForDays`,`NoOfPerson`,`Relationship`,`CheckedStatus`) VALUES 
 ('B001','C001','',102,'','2016-12-12','','',2,'sdfsdf','Checked Out'),
 ('B002','C003','',101,'','2016-12-11','','',2,'AA',NULL),
 ('B003','C004','',101,'','2016-02-12','','',2,'F',NULL),
 ('B004','C001','',101,'2016-12-27','2016-12-30','','',2,'frnd',NULL),
 ('B005','c001','',101,'2016-12-28','2016-12-28','2016-12-28','1',1,'n','Checked In'),
 ('B006','C004','Shohidul Islam Hridoy',101,'2017-01-04','2017-01-10','2017-01-15','5',2,'n','Checked Out');
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;


--
-- Definition of table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `CCode` varchar(45) NOT NULL,
  `FirstName` varchar(45) NOT NULL,
  `LastName` varchar(45) NOT NULL,
  `Sex` varchar(45) NOT NULL,
  `Age` int(10) unsigned NOT NULL,
  `MaritialStatus` varchar(45) NOT NULL,
  `Nationality` varchar(45) NOT NULL,
  `Country` varchar(45) NOT NULL,
  `PassportNo` varchar(45) NOT NULL,
  `VisaNo` varchar(45) NOT NULL,
  `RAddress` varchar(45) NOT NULL COMMENT 'Residential address',
  `OAddress` varchar(45) default NULL COMMENT 'Official addess',
  `PhoneNo` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Status` varchar(45) NOT NULL,
  `DataEntryDate` varchar(45) NOT NULL,
  PRIMARY KEY  (`CCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`CCode`,`FirstName`,`LastName`,`Sex`,`Age`,`MaritialStatus`,`Nationality`,`Country`,`PassportNo`,`VisaNo`,`RAddress`,`OAddress`,`PhoneNo`,`Email`,`Status`,`DataEntryDate`) VALUES 
 ('C001','s','a','d',12,'g','g','h','fd','dd','sd','sf','df','df','dfd',''),
 ('C002','asd','asdasd','Male',213,'Married','Bangladeshi','zz','sdgf','sdf','sdfsd','sdf','34','xd','New',''),
 ('C003','s','a','Male',1,'Married','Bangladeshi','bd','23','wwe23','dfdf','','323','dd','New',''),
 ('C004','Shohidul Islam','Hridoy','Male',26,'Unmarried','Bangladeshi','Bangladesh','b6664','ere654','Jurain','','343435','gsdgdfg','New',''),
 ('C005','abc','cd','Male',23,'Unmarried','Bangladeshi','Bangladeshi','234dws','wer24','asdfa','','234','sdf','New','2016-12-27');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;


--
-- Definition of table `rooms`
--

DROP TABLE IF EXISTS `rooms`;
CREATE TABLE `rooms` (
  `RoomNo` int(10) unsigned NOT NULL,
  `RoomType` varchar(45) NOT NULL,
  `RoomRent` int(10) unsigned NOT NULL,
  `Status` varchar(45) NOT NULL,
  `BookedBy` varchar(45) default NULL,
  PRIMARY KEY  (`RoomNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rooms`
--

/*!40000 ALTER TABLE `rooms` DISABLE KEYS */;
INSERT INTO `rooms` (`RoomNo`,`RoomType`,`RoomRent`,`Status`,`BookedBy`) VALUES 
 (101,'Deluxe',1500,'NotAvailable','B006'),
 (102,'Deluxe',1500,'NotAvailable','b005'),
 (103,'Deluxe',1500,'Available',NULL),
 (104,'Deluxe',1500,'Available',NULL),
 (105,'Deluxe',1500,'Available',NULL),
 (106,'Deluxe',1500,'Available',NULL),
 (107,'Deluxe',1500,'Available',NULL),
 (108,'Deluxe',1500,'Available',NULL),
 (109,'Deluxe',1500,'Available',NULL),
 (110,'Deluxe',1500,'Available',NULL),
 (111,'Super Deluxe',2000,'Available',NULL),
 (112,'Super Deluxe',2000,'Available',NULL),
 (113,'Super Deluxe',2000,'Available',NULL),
 (114,'Super Deluxe',2000,'Available',NULL),
 (115,'Super Deluxe',2000,'Available',''),
 (116,'Super Deluxe',2000,'Available',NULL),
 (117,'Super Deluxe',2000,'Available',NULL),
 (118,'Super Deluxe',2000,'Available',NULL),
 (119,'Super Deluxe',2000,'Available',NULL),
 (120,'Super Deluxe',2000,'Available',NULL),
 (121,'Deluxe',1500,'Available',NULL),
 (122,'Deluxe',1500,'Available',NULL),
 (123,'Deluxe',1500,'Available',NULL),
 (124,'Deluxe',1500,'Available',NULL),
 (125,'Deluxe',1500,'Available',NULL),
 (126,'Deluxe',1500,'Available',NULL),
 (127,'Deluxe',1500,'Available',NULL),
 (128,'Deluxe',1500,'Available',NULL),
 (129,'Deluxe',1500,'Available',NULL),
 (130,'Deluxe',1500,'Available',NULL);
/*!40000 ALTER TABLE `rooms` ENABLE KEYS */;


--
-- Definition of table `service`
--

DROP TABLE IF EXISTS `service`;
CREATE TABLE `service` (
  `ID` int(11) NOT NULL auto_increment,
  `Breakfast` varchar(45) default NULL,
  `Lunch` varchar(45) default NULL,
  `Dinner` varchar(45) default NULL,
  `Laundary` varchar(45) default NULL,
  `Telephone` varchar(45) default NULL,
  `Gym` varchar(45) default NULL,
  `SwimmingPool` varchar(45) default NULL,
  `TotalServiceCharge` int(11) NOT NULL,
  `BookingNo` varchar(45) NOT NULL,
  `ServiceDate` varchar(45) default NULL,
  PRIMARY KEY  (`ID`),
  KEY `fk_service_1_idx` (`BookingNo`),
  CONSTRAINT `fk_service_1` FOREIGN KEY (`BookingNo`) REFERENCES `booking` (`BookingNo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `service`
--

/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` (`ID`,`Breakfast`,`Lunch`,`Dinner`,`Laundary`,`Telephone`,`Gym`,`SwimmingPool`,`TotalServiceCharge`,`BookingNo`,`ServiceDate`) VALUES 
 (35,'0','0','0','0','100','200','200',500,'B006','2017-01-01'),
 (38,'50','60','60','0','0','0','0',170,'B006','2017-01-04'),
 (39,'40','25','0','0','0','0','0',65,'B006','2017-01-04'),
 (40,'30','35','0','0','0','0','0',65,'B006','2017-01-04');
/*!40000 ALTER TABLE `service` ENABLE KEYS */;


--
-- Definition of table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `UserName` varchar(10) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY  (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`UserName`,`Password`) VALUES 
 ('a','123'),
 ('admin','123');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
