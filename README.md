Skrypt SQL do stworzenia odpowiedniej tabeli:

CREATE TABLE IF NOT EXISTS `visix`.`warehouse` (
 `id` INT NOT NULL AUTO_INCREMENT ,
 `name` VARCHAR(50) NOT NULL ,
 `count` DECIMAL NOT NULL CHECK(`count`>0) ,
 PRIMARY KEY (`id`)) ENGINE = InnoDB


CHECK działa od wersji MySQL 8.0.16

Przy wcześniejszych wersjach piszemy trigera.



