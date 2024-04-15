CREATE TABLE `users` (
	`login_id` SERIAL NOT NULL,
	`password` VARCHAR(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	PRIMARY KEY (`login_id`)
) ENGINE=InnoDB;