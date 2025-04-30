-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 30, 2024 at 11:47 PM
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
-- Database: `OnlineTestSystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `Questions`
--

CREATE TABLE `Questions` (
  `question_id` int(11) NOT NULL,
  `test_id` int(11) NOT NULL,
  `question_text` text NOT NULL,
  `Option1` text NOT NULL,
  `Option2` text NOT NULL,
  `Option3` text NOT NULL,
  `Option4` text NOT NULL,
  `correct_answer` text NOT NULL,
  `marks` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Questions`
--

INSERT INTO `Questions` (`question_id`, `test_id`, `question_text`, `Option1`, `Option2`, `Option3`, `Option4`, `correct_answer`, `marks`) VALUES
(24, 14, '9460DBE30B3B81C6DDD39050690014F9CF9E498F98A9132ED6652D27BF14C7A925CDCF60309D19B02758ADE36B2F1007', 'BCA0CBE206F3A64E5E432362805713B7', '08CE1A24A0A44C228D1629CD2D39EE3E157EC7930D3DEA62BA236F278C0407A2', '68DA856608ECAC752F76D98258F4D275', 'A1150D42687E496CFB1867BEF959702E4024FE4DD02275005C2DC9557BD0C69B', 'C', 1),
(25, 14, 'A6B910A06F41C764CFEBAECB68E45D4738EF270621CC89C36AC85C95255EFBE7BF384EF5444E97E96F9F8D83543605F2', '4941DC4E7632755AB95E3EF3083B1016', '905A27B182D5C38BE72A28ED5D5BD3FE', '2028AE013A94B0AE20C3AAD5611E0810', '5063F673A23B45B346E3689BAD77CFE8', 'B', 2),
(26, 15, '67E7FE7A0252C5B74901F61ECACD180B', '2B1D34927C24596B9C88FDC35FECD925', 'FDC20A8EB26952CCF5BF61090C09CCBC', '3C263B9D817FD437E7D43E5A864AF959', 'C43E0FD35B07CC46433FCE7E176211FF', 'C', 5),
(27, 16, '7FCA9F56E0EBF0E346F119CF289AA90E', '2028AE013A94B0AE20C3AAD5611E0810', '82D026148144E8E685E1635D107EE88B', 'C6B00FC37EA3B72C96FAE4B282AA2C36', 'BC46391023613E2A2EB0725D9EFA3289', 'C', 2),
(28, 18, '833F7329AABB2513B8C8F056655BFF1D', 'FDC20A8EB26952CCF5BF61090C09CCBC', 'B55094FCF93B492A17CF44CB5F382B70', '2B1D34927C24596B9C88FDC35FECD925', 'C43E0FD35B07CC46433FCE7E176211FF', 'A', 5),
(29, 19, '833F7329AABB2513B8C8F056655BFF1D', '56C522EA6303ADA914540C51EB85121F', 'FDC20A8EB26952CCF5BF61090C09CCBC', 'B55094FCF93B492A17CF44CB5F382B70', '2B1D34927C24596B9C88FDC35FECD925', 'B', 2),
(30, 20, 'B7B91717D7066682258943F7156CB40E', '56C522EA6303ADA914540C51EB85121F', 'FDC20A8EB26952CCF5BF61090C09CCBC', 'B55094FCF93B492A17CF44CB5F382B70', '7B9A346AB26F47E3D8A97E86381E7256', 'C', 2);

-- --------------------------------------------------------

--
-- Table structure for table `Responses`
--

CREATE TABLE `Responses` (
  `response_id` int(11) NOT NULL,
  `student_test_id` int(11) NOT NULL,
  `question_id` int(11) NOT NULL,
  `answer` text NOT NULL,
  `marks_obtained` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Responses`
--

INSERT INTO `Responses` (`response_id`, `student_test_id`, `question_id`, `answer`, `marks_obtained`) VALUES
(61, 2, 24, 'C', 1),
(62, 3, 24, 'B', 0),
(63, 3, 25, 'B', 0),
(64, 2, 25, 'B', 0),
(65, 2, 25, 'B', 2),
(66, 2, 24, 'C', 1),
(67, 2, 25, 'B', 2),
(68, 2, 26, 'B', 0),
(69, 2, 27, 'C', 2);

-- --------------------------------------------------------

--
-- Table structure for table `Results`
--

CREATE TABLE `Results` (
  `result_id` int(11) NOT NULL,
  `test_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `total_marks` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Student_Test`
--

CREATE TABLE `Student_Test` (
  `student_test_id` int(11) NOT NULL,
  `test_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `Total_marks` int(11) NOT NULL DEFAULT 0,
  `join_time` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Student_Test`
--

INSERT INTO `Student_Test` (`student_test_id`, `test_id`, `student_id`, `Total_marks`, `join_time`) VALUES
(22, 14, 3, 0, '2024-12-31 01:50:22'),
(23, 14, 2, 1, '2024-12-31 01:49:03'),
(24, 14, 2, 3, '2024-12-31 02:14:33'),
(25, 15, 2, 0, '2024-12-31 03:25:10'),
(26, 16, 2, 2, '2024-12-31 04:06:11');

-- --------------------------------------------------------

--
-- Table structure for table `Tests`
--

CREATE TABLE `Tests` (
  `test_id` int(11) NOT NULL,
  `teacher_id` int(11) NOT NULL,
  `course_title` varchar(100) NOT NULL,
  `test_type` varchar(50) NOT NULL,
  `start_time` datetime NOT NULL,
  `end_time` datetime NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Tests`
--

INSERT INTO `Tests` (`test_id`, `teacher_id`, `course_title`, `test_type`, `start_time`, `end_time`, `password`) VALUES
(14, 1, 'Cyber Security', 'CT1', '2024-12-31 01:45:35', '2024-12-31 02:45:35', '1234'),
(15, 1, ' Math', 'KSA1', '2024-12-31 03:23:40', '2024-12-31 03:53:40', '1234'),
(16, 1, 'Math', 'CT2', '2024-12-31 03:57:50', '2024-12-31 04:27:50', '1234'),
(17, 1, 'Math', 'KSA3', '2024-12-31 04:01:45', '2024-12-31 04:31:45', '123'),
(18, 1, 'Math', 'Ksa1', '2024-12-31 04:04:45', '2024-12-31 04:44:45', '1234'),
(19, 1, 'Math', 'CT3', '2024-12-31 04:19:28', '2024-12-31 04:49:28', '1234'),
(20, 1, 'Math', 'CT2', '2024-12-31 04:24:57', '2024-12-31 04:54:57', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `Users`
--

CREATE TABLE `Users` (
  `user_id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(100) NOT NULL,
  `role` enum('teacher','student') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Users`
--

INSERT INTO `Users` (`user_id`, `username`, `password`, `email`, `role`) VALUES
(1, 'teacher1', 'A14099FEBAF593A1F5357DE044BBCBA7', 'teacher1@example.com', 'teacher'),
(2, 'noyon', 'FD620AD5D2F683D32E7F47152C15CBE0', 'student1@example.com', 'student'),
(3, 'rakib', '0B371C1292FB56372B4D2CD5881E0821', 'student2@example.com', 'student');

-- --------------------------------------------------------

--
-- Table structure for table `Window_Switch_Logs`
--

CREATE TABLE `Window_Switch_Logs` (
  `log_id` int(11) NOT NULL,
  `student_test_id` int(11) NOT NULL,
  `switch_time` datetime NOT NULL,
  `return_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Questions`
--
ALTER TABLE `Questions`
  ADD PRIMARY KEY (`question_id`);

--
-- Indexes for table `Responses`
--
ALTER TABLE `Responses`
  ADD PRIMARY KEY (`response_id`);

--
-- Indexes for table `Results`
--
ALTER TABLE `Results`
  ADD PRIMARY KEY (`result_id`);

--
-- Indexes for table `Student_Test`
--
ALTER TABLE `Student_Test`
  ADD PRIMARY KEY (`student_test_id`);

--
-- Indexes for table `Tests`
--
ALTER TABLE `Tests`
  ADD PRIMARY KEY (`test_id`);

--
-- Indexes for table `Users`
--
ALTER TABLE `Users`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `Window_Switch_Logs`
--
ALTER TABLE `Window_Switch_Logs`
  ADD PRIMARY KEY (`log_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Questions`
--
ALTER TABLE `Questions`
  MODIFY `question_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `Responses`
--
ALTER TABLE `Responses`
  MODIFY `response_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;

--
-- AUTO_INCREMENT for table `Results`
--
ALTER TABLE `Results`
  MODIFY `result_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Student_Test`
--
ALTER TABLE `Student_Test`
  MODIFY `student_test_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `Tests`
--
ALTER TABLE `Tests`
  MODIFY `test_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `Users`
--
ALTER TABLE `Users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `Window_Switch_Logs`
--
ALTER TABLE `Window_Switch_Logs`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
