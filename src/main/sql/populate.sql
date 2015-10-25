-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 25, 2015 at 03:55 AM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `8_bit_rhyno`
--

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

CREATE TABLE IF NOT EXISTS `address` (
  `id` bigint(20) NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `address`
--

INSERT INTO `address` (`id`, `city`, `country`, `state`, `street`) VALUES
(1, 'FAIRFIELD', 'United States', 'IA', '1000 N 4TH ST MUM MR#184'),
(2, 'FAIRFIELD', 'United States', 'IA', '1000 N 4TH ST MUM MR 184'),
(3, 'FAIRFIELD', 'United States', 'IA', '1000 N 4TH ST MUM MR 184'),
(4, 'FAIRFIELD', 'United States', 'IA', '1000 N 4TH ST MUM MR#184');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `id` bigint(20) NOT NULL,
  `courseId` varchar(255) DEFAULT NULL,
  `entry` int(11) DEFAULT NULL,
  `minimumGrade` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `professor` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`id`, `courseId`, `entry`, `minimumGrade`, `name`, `professor`) VALUES
(1, '1', 1, 'A', 'Dave', 'sad'),
(2, '1', 4, 'A', 'nibasnet', 'sad'),
(3, 'CS472', 1, 'B', 'MPP', 'Mei Li'),
(4, 'cs555', 2, 'B', 'Algorithm', 'Corozza'),
(5, 'cs523', 4, 'C', 'Big Data', 'Khan'),
(6, 'Cs555', 3, 'B', 'WAA', 'Joe Bruen');

-- --------------------------------------------------------

--
-- Table structure for table `housing`
--

CREATE TABLE IF NOT EXISTS `housing` (
  `roomNo` int(11) NOT NULL,
  `buildingNo` int(11) NOT NULL,
  `kitchenKey` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `Id` bigint(20) NOT NULL,
  `dob` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `entry` int(11) DEFAULT NULL,
  `firstName` varchar(20) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `lastName` varchar(20) DEFAULT NULL,
  `phoneNumber` bigint(20) NOT NULL,
  `studentId` int(11) DEFAULT NULL,
  `studentImagePath` varchar(255) DEFAULT NULL,
  `dCLeft` int(11) DEFAULT NULL,
  `dCRequirement` int(11) DEFAULT NULL,
  `tMLeft` int(11) DEFAULT NULL,
  `tMRequirement` int(11) DEFAULT NULL,
  `address_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`Id`, `dob`, `email`, `entry`, `firstName`, `gender`, `lastName`, `phoneNumber`, `studentId`, `studentImagePath`, `dCLeft`, `dCRequirement`, `tMLeft`, `tMRequirement`, `address_id`) VALUES
(1, '1989-02-02 00:00:00', 'naam.nitesh@gmail.com', 4, 'Nitesh', 'm', 'Basnet', 0, 1, NULL, NULL, NULL, NULL, NULL, 1),
(3, '1989-02-02 00:00:00', 'naam.niteshlkj@gmail.com', 4, 'Nitesh', 'm', 'Basnet', 16412320187, 1234, NULL, NULL, NULL, NULL, NULL, 3),
(4, '1989-02-02 00:00:00', 'naam.nitesh@gmail.com', 1, 'Nitesh123', 'male', 'Basnet', 6412320187, 1, NULL, NULL, NULL, NULL, NULL, 4);

-- --------------------------------------------------------

--
-- Table structure for table `student_course`
--

CREATE TABLE IF NOT EXISTS `student_course` (
  `Student_ID` bigint(20) NOT NULL,
  `Course_ID` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `housing`
--
ALTER TABLE `housing`
  ADD PRIMARY KEY (`roomNo`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`Id`), ADD KEY `FK8FFE823B66A7F2C0` (`address_id`);

--
-- Indexes for table `student_course`
--
ALTER TABLE `student_course`
  ADD KEY `FK3E4F2ADF22587994` (`Course_ID`), ADD KEY `FK3E4F2ADFAD967960` (`Student_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `address`
--
ALTER TABLE `address`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `Id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `student`
--
ALTER TABLE `student`
ADD CONSTRAINT `FK8FFE823B66A7F2C0` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`);

--
-- Constraints for table `student_course`
--
ALTER TABLE `student_course`
ADD CONSTRAINT `FK3E4F2ADF22587994` FOREIGN KEY (`Course_ID`) REFERENCES `course` (`id`),
ADD CONSTRAINT `FK3E4F2ADFAD967960` FOREIGN KEY (`Student_ID`) REFERENCES `student` (`Id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
