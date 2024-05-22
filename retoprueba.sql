-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 22, 2024 at 06:44 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `retoprueba`
--

-- --------------------------------------------------------

--
-- Table structure for table `persona_lugar`
--

CREATE TABLE `persona_lugar` (
  `lugar_id` bigint(20) NOT NULL,
  `persona_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_lugar`
--

CREATE TABLE `tbl_lugar` (
  `id_lugar` bigint(20) NOT NULL,
  `departamento` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `pais` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_lugar`
--

INSERT INTO `tbl_lugar` (`id_lugar`, `departamento`, `nombre`, `pais`) VALUES
(1, 'Antioquia', 'Medellin', 'Colombia');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_persona`
--

CREATE TABLE `tbl_persona` (
  `edad` int(11) NOT NULL,
  `id_persona` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `ocupacion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_persona`
--

INSERT INTO `tbl_persona` (`edad`, `id_persona`, `nombre`, `ocupacion`) VALUES
(33, 1, 'Jesus Bendito', 'Dios');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `persona_lugar`
--
ALTER TABLE `persona_lugar`
  ADD KEY `FKgo7q7y8o8lyctp4iktj81s1n1` (`lugar_id`),
  ADD KEY `FKctcr76bcuhg9q5nq9m3yb2p2w` (`persona_id`);

--
-- Indexes for table `tbl_lugar`
--
ALTER TABLE `tbl_lugar`
  ADD PRIMARY KEY (`id_lugar`);

--
-- Indexes for table `tbl_persona`
--
ALTER TABLE `tbl_persona`
  ADD PRIMARY KEY (`id_persona`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_lugar`
--
ALTER TABLE `tbl_lugar`
  MODIFY `id_lugar` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_persona`
--
ALTER TABLE `tbl_persona`
  MODIFY `id_persona` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `persona_lugar`
--
ALTER TABLE `persona_lugar`
  ADD CONSTRAINT `FKctcr76bcuhg9q5nq9m3yb2p2w` FOREIGN KEY (`persona_id`) REFERENCES `tbl_persona` (`id_persona`),
  ADD CONSTRAINT `FKgo7q7y8o8lyctp4iktj81s1n1` FOREIGN KEY (`lugar_id`) REFERENCES `tbl_lugar` (`id_lugar`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
