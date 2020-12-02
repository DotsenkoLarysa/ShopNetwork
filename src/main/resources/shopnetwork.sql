CREATE SCHEMA IF NOT EXISTS `shopnetwork` DEFAULT CHARACTER SET utf8;
USE `shopnetwork`;

CREATE TABLE IF NOT EXISTS `mycosts`.`shop`
(
    `idshop`   INT         NOT NULL AUTO_INCREMENT,
    `nameshop` VARCHAR(45) NOT NULL,
    `typeshop` VARCHAR(45) NOT NULL,
    `city`     VARCHAR(45),
    PRIMARY KEY (`idshop`)
)
    ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `mycosts`.`department`
(
    `id_department`   INT         NOT NULL AUTO_INCREMENT,
    `name_department` VARCHAR(45) NOT NULL,
    `type_department` VARCHAR(45) NOT NULL,
    shopId            INT         NOT NULL,
    PRIMARY KEY (`id_department`),
    INDEX `idshop_idx` (`shopId` ASC),
    CONSTRAINT `idshop`
        FOREIGN KEY (`shopId`)
            REFERENCES `shopnetwork`.`shop` (`idshop`)
            ON DELETE CASCADE
            ON UPDATE CASCADE
)
    ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `shopnetwork`.`seller`
(
    `idseller`     INT         NOT NULL AUTO_INCREMENT,
    `firstname`    VARCHAR(50) NOT NULL,
    `lastname`     VARCHAR(50) NOT NULL,
    `birthday`     VARCHAR(45) NOT NULL,
    `salary`       FLOAT,
    `departmentId` INT         NOT NULL,
    PRIMARY KEY (`idseller`),
    INDEX `id_department_idx` (`departmentId` ASC),
    CONSTRAINT `id_department`
        FOREIGN KEY (`departmentId`)
            REFERENCES `shopnetwork`.`department` (`id_department`)
            ON DELETE CASCADE
            ON UPDATE CASCADE
)
    ENGINE = InnoDB;