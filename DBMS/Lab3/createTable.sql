// Creation of table worker

CREATE TABLE `worker` (
    ->   `WORKER_ID` INT NOT NULL AUTO_INCREMENT,
    ->   `FIRST_NAME` VARCHAR(75) NULL,
    ->   `LAST_NAME` VARCHAR(75) NULL,
    ->   `SALARY` INT NULL,
    ->   `JOINING_DATE` DATETIME NULL,
    ->   `DEPARTMENT` VARCHAR(45) NULL,
    ->   PRIMARY KEY (`WORKER_ID`));
