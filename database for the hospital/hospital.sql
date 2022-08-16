-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 25, 2021 at 11:20 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `name` varchar(45) NOT NULL,
  `number` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `time` varchar(45) NOT NULL,
  `message` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`name`, `number`, `email`, `time`, `message`) VALUES
('Mithina Dulan', '12334', 'mithinadulan@gmail.com', '9-11', 'Hello World..!!'),
('mithina dulan', '077654579', 'mithinajayamanna@gmail.com', '09-11 am', 'huvuv'),
('Maduka Neranga', '1548794565', 'madukanerangapro@gmail.com', '09-11 am', 'huhu'),
('maduka', '7874547878', 'madukanerangapro@gmail.com', '06-09 pm', 'ghghgh'),
('Maduka Neranga', '0714567456', 'madukanerangapro@gmail.com', '03-06 pm', 'tgrtgrgrg'),
('Maduka Neranga', '0714567456', 'madukanerangapro@gmail.com', '03-06 pm', 'tgrtgrgrg'),
('Mithina Dulan', '12334', 'mithinadulan@gmail.com', '9-11', 'Hello World..!!'),
('mithina dulan', '077654579', 'mithinajayamanna@gmail.com', '09-11 am', 'huvuv'),
('Maduka Neranga', '1548794565', 'madukanerangapro@gmail.com', '09-11 am', 'huhu'),
('maduka', '7874547878', 'madukanerangapro@gmail.com', '06-09 pm', 'ghghgh'),
('Maduka Neranga', '0714567456', 'madukanerangapro@gmail.com', '03-06 pm', 'tgrtgrgrg'),
('Maduka Neranga', '0714567456', 'madukanerangapro@gmail.com', '03-06 pm', 'tgrtgrgrg'),
('Mithina Dulan', '12334', 'mithinadulan@gmail.com', '9-11', 'Hello World..!!'),
('mithina dulan', '077654579', 'mithinajayamanna@gmail.com', '09-11 am', 'huvuv'),
('Maduka Neranga', '1548794565', 'madukanerangapro@gmail.com', '09-11 am', 'huhu'),
('maduka', '7874547878', 'madukanerangapro@gmail.com', '06-09 pm', 'ghghgh'),
('Maduka Neranga', '0714567456', 'madukanerangapro@gmail.com', '03-06 pm', 'tgrtgrgrg'),
('Maduka Neranga', '0714567456', 'madukanerangapro@gmail.com', '03-06 pm', 'tgrtgrgrg'),
('Mithina Dulan', '12334', 'mithinadulan@gmail.com', '9-11', 'Hello World..!!'),
('mithina dulan', '077654579', 'mithinajayamanna@gmail.com', '09-11 am', 'huvuv'),
('Maduka Neranga', '1548794565', 'madukanerangapro@gmail.com', '09-11 am', 'huhu'),
('maduka', '7874547878', 'madukanerangapro@gmail.com', '06-09 pm', 'ghghgh'),
('Maduka Neranga', '0714567456', 'madukanerangapro@gmail.com', '03-06 pm', 'tgrtgrgrg'),
('Maduka Neranga', '0714567456', 'madukanerangapro@gmail.com', '03-06 pm', 'tgrtgrgrg');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `username` varchar(50) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`username`, `password`) VALUES
('Admin12', 'user12');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`name`, `email`, `password`) VALUES
('', '', ''),
('sahan', 'jayamannamithina@gmail.com', 'asdf'),
('Maduka', 'madukanerangapro@gmail.com', 'asd'),
('mithina', 'mithinajayamanna@gmail.com', 'asd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
