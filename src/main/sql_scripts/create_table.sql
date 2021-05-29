CREATE TABLE `user` (
  `user_id` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `middle_name` varchar(255) NOT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_no` varchar(255) NOT NULL,
  `pan_no` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`)
);