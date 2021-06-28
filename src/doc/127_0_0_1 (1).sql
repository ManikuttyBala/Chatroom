-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 28, 2021 at 04:31 AM
-- Server version: 8.0.18
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `chatrumdb`
--
CREATE DATABASE IF NOT EXISTS `chatrumdb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE `chatrumdb`;

-- --------------------------------------------------------

--
-- Table structure for table `adminlogintb`
--

DROP TABLE IF EXISTS `adminlogintb`;
CREATE TABLE IF NOT EXISTS `adminlogintb` (
  `adminid` int(10) NOT NULL AUTO_INCREMENT,
  `AdminName` varchar(50) NOT NULL,
  `Pass` varchar(50) NOT NULL,
  PRIMARY KEY (`adminid`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `adminlogintb`
--

INSERT INTO `adminlogintb` (`adminid`, `AdminName`, `Pass`) VALUES
(1, 'Bindu', 'Pass'),
(2, 'Admin1', 'Admin1');

-- --------------------------------------------------------

--
-- Table structure for table `groupchattb`
--

DROP TABLE IF EXISTS `groupchattb`;
CREATE TABLE IF NOT EXISTS `groupchattb` (
  `msgid` int(11) NOT NULL AUTO_INCREMENT,
  `sendername` varchar(50) NOT NULL,
  `msg` varchar(1000) NOT NULL,
  `doc` varchar(500) NOT NULL,
  PRIMARY KEY (`msgid`)
) ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `groupchattb`
--

INSERT INTO `groupchattb` (`msgid`, `sendername`, `msg`, `doc`) VALUES
(1, 'Bindu', 'hai', ''),
(2, 'Bindu', 'hw r u', ''),
(3, 'Bindu', 'i am bindu', ''),
(4, 'Bindu', 'hello', ''),
(5, 'Bindu', 'Who r u', ''),
(6, 'Bindu', 'i am new', ''),
(7, 'Bindu', 'can u hlp', ''),
(8, 'admin1', 'hello', ''),
(9, 'admin1', 'iam admin', ''),
(10, 'admin1', 'hw r u', ''),
(11, 'Aravi', 'hai bindu', ''),
(12, 'Aravi', 'welcome to our company', ''),
(13, 'anna', 'hai bindu', ''),
(15, 'Bindu', 'I am Glad to b in u r team', ''),
(16, 'Bindu', 'Test', ''),
(17, 'Aravi', '123', ''),
(18, 'Aravi', '', ''),
(19, 'Bindu', 'a', ''),
(20, 'Bindu', '', ''),
(21, 'Bindu', '1', ''),
(22, 'Bindu', 'asd', ''),
(23, 'Aravi', '', 'javax.swing.JLabel[,10,300,290x14,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=8388608,maximumSize=,minimumSize=,preferredSize=,defaultIcon=,disabledIcon=,horizontalAlignment=LEADING,horizontalTextPosition=TRAILING,iconTextGap=4,labelFor=,text=C:UsersUSERDocuments20a58859-d9d7-442b-b3db-3e5313b9a9ee.png,verticalAlignment=CENTER,verticalTextPosition=CENTER]'),
(24, 'Bindu', '', 'javax.swing.JLabel[,10,300,290x14,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=8388608,maximumSize=,minimumSize=,preferredSize=,defaultIcon=,disabledIcon=,horizontalAlignment=LEADING,horizontalTextPosition=TRAILING,iconTextGap=4,labelFor=,text=C:UsersUSERDocuments20a58859-d9d7-442b-b3db-3e5313b9a9ee.png,verticalAlignment=CENTER,verticalTextPosition=CENTER]'),
(25, 'Aravi', '', 'C:UsersUSERDocuments1595654790267.png'),
(26, 'Aravi', '', 'C:UsersUSERDocumentsIMG-20190813-WA0030.jpg'),
(27, 'Bindu', '', 'C:UsersUSERDocuments1595654790267.png'),
(28, 'Aravi', 'hello', '');

-- --------------------------------------------------------

--
-- Table structure for table `indchat`
--

DROP TABLE IF EXISTS `indchat`;
CREATE TABLE IF NOT EXISTS `indchat` (
  `msgid` int(11) NOT NULL AUTO_INCREMENT,
  `sender` varchar(50) NOT NULL,
  `receiver` varchar(50) NOT NULL,
  `msg` varchar(1000) NOT NULL,
  `documents` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`msgid`)
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `indchat`
--

INSERT INTO `indchat` (`msgid`, `sender`, `receiver`, `msg`, `documents`) VALUES
(1, 'Bindu', 'anu', 'hai', ''),
(2, 'Bindu', 'anu', 'Hello', ''),
(3, 'anu', 'Bindu', 'hai', ''),
(4, 'Bindu', 'anu', 'hw r u\n', ''),
(5, 'anu', 'Bindu', 'fine thank you\nand you', ''),
(6, 'Aravi', 'Bindu', 'hai', ''),
(7, 'Aravi', 'anu', '', 'C:UsersUSERDocuments1595654790267.png'),
(8, 'Aravi', 'Admin1', 'hai', ''),
(9, 'Aravi', 'anu', '', 'C:UsersUSERDocuments308085.PDF'),
(10, 'Aravi', 'Anna', 'q', ''),
(11, 'Bindu', 'Aravi', 'hai', ''),
(12, 'anu', 'Aravi', 'hai', ''),
(13, 'anu', 'Aravi', 'hello', ''),
(14, 'Aravi', 'anu', 'test', ''),
(15, 'Aravi', 'anu', '', 'C:UsersUSERDocuments308085.PDF'),
(16, 'anu', 'Bindu', '', 'C:UsersUSERDocuments308085.PDF'),
(17, 'Bindu', 'Admin1', '', 'C:UsersUSERDocuments20a58859-d9d7-442b-b3db-3e5313b9a9ee.png'),
(18, 'Bindu', 'Admin1', 'hai', ''),
(19, 'Bindu', 'Anna', 'hello', ''),
(20, 'Bindu', 'Aravi', '', 'C:UsersUSERDocuments20a58859-d9d7-442b-b3db-3e5313b9a9ee.png'),
(21, 'Aravi', 'anu', '', 'C:UsersUSERDocuments1595654790267.png'),
(22, 'Aravi', 'anu', 'hello\n', '');

-- --------------------------------------------------------

--
-- Table structure for table `usertb`
--

DROP TABLE IF EXISTS `usertb`;
CREATE TABLE IF NOT EXISTS `usertb` (
  `Userid` int(10) NOT NULL AUTO_INCREMENT,
  `Username` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Userpass` varchar(50) NOT NULL,
  PRIMARY KEY (`Userid`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `usertb`
--

INSERT INTO `usertb` (`Userid`, `Username`, `Email`, `Userpass`) VALUES
(1, 'Bindu', 'bindu@abc.com', 'Pass'),
(2, 'anu', 'anu@abc.com', 'Anu1'),
(3, 'Aravi', 'ak@abc.com', '123'),
(4, 'Anna', 'anna@abc.com', '123'),
(6, 'Admin1', 'Admin1@abc.com', 'Admin1');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
