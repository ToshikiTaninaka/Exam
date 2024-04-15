CREATE TABLE `tests` (
	`STUDENT_NO` VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`SUBJECT_CD` CHAR(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`SCHOOL_CD` CHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`NO` INT(10) NOT NULL,
	`POINT` INT(10) DEFAULT NULL,
	`CLASS_NUM` VARCHAR(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
	PRIMARY KEY (`STUDENT_NO`,`SUBJECT_CD`,`SCHOOL_CD`,`NO`)
) ENGINE=InnoDB;