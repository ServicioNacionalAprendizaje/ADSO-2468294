-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema spa
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema spa
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `spa` DEFAULT CHARACTER SET utf8 ;
USE `spa` ;

-- -----------------------------------------------------
-- Table `spa`.`personas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spa`.`personas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `tipo_documento` ENUM('CC', 'TI', 'CE', 'DNI', 'PP') NOT NULL,
  `documento` VARCHAR(12) NOT NULL,
  `primer_nombre` VARCHAR(45) NOT NULL,
  `segundo_nombre` VARCHAR(45) NULL,
  `primer_apellido` VARCHAR(45) NOT NULL,
  `segundo_apellido` VARCHAR(45) NULL,
  `edad` TINYINT NOT NULL,
  `genero` ENUM('0', '1') NOT NULL,
  `correo` VARCHAR(45) NULL,
  `telefono` INT NULL,
  `direcion` VARCHAR(45) NULL,
  `estado` ENUM('0', '1') NOT NULL,
  `usuario_creacion_id` INT NOT NULL,
  `usuario_modificacion_id` INT NULL,
  `fecha_creacion` TIMESTAMP NOT NULL,
  `fecha_modificacion` TIMESTAMP NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spa`.`roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spa`.`roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(10) NOT NULL,
  `descripcion` VARCHAR(50) NOT NULL,
  `estado` ENUM('0', '1') NOT NULL,
  `usuario_creacion_id` INT NOT NULL,
  `usuario_modificacion_id` INT NULL,
  `fecha_creacion` TIMESTAMP NOT NULL,
  `fecha_modificacion` TIMESTAMP NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spa`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spa`.`usuarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NOT NULL,
  `contrasenia` VARCHAR(45) NOT NULL,
  `estado` ENUM('0', '1') NOT NULL,
  `usuario_creacion_id` INT NOT NULL,
  `usuario_modificacion_id` INT NULL,
  `fecha_creacion` TIMESTAMP NOT NULL,
  `fecha_modificacion` TIMESTAMP NULL,
  `persona_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_usuarios_personas`
    FOREIGN KEY (`persona_id`)
    REFERENCES `spa`.`personas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spa`.`usuario_roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spa`.`usuario_roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `estado` ENUM('0', '1') NOT NULL,
  `usuario_creacion_id` INT NOT NULL,
  `usuario_modificacion_id` INT NULL,
  `fecha_creacion` TIMESTAMP NOT NULL,
  `fecha_modificacion` TIMESTAMP NULL,
  `rol_id` INT NOT NULL,
  `usuario_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_usuario_roles_roles1`
    FOREIGN KEY (`rol_id`)
    REFERENCES `spa`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario_roles_usuarios1`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `spa`.`usuarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spa`.`modulos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spa`.`modulos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  `estado` ENUM('0', '1') NOT NULL,
  `usuario_creacion_id` INT NOT NULL,
  `usuario_modificacion_id` INT NULL,
  `fecha_creacion` TIMESTAMP NOT NULL,
  `fecha_modificacion` TIMESTAMP NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spa`.`vistas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spa`.`vistas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ruta` VARCHAR(150) NULL,
  `etiqueta` VARCHAR(100) NULL,
  `estado` ENUM('0', '1') NOT NULL,
  `usuario_creacion_id` INT NOT NULL,
  `usuario_modificacion_id` INT NULL,
  `fecha_creacion` TIMESTAMP NOT NULL,
  `fecha_modificacion` TIMESTAMP NULL,
  `modulo_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_vistas_modulos1`
    FOREIGN KEY (`modulo_id`)
    REFERENCES `spa`.`modulos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spa`.`vistas_roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spa`.`vistas_roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `estado` ENUM('0', '1') NOT NULL,
  `usuario_creacion_id` INT NOT NULL,
  `usuario_modificacion_id` INT NULL,
  `fecha_creacion` TIMESTAMP NOT NULL,
  `fecha_modificacion` TIMESTAMP NULL,
  `rol_id` INT NOT NULL,
  `vista_id` INT NOT NULL,
  PRIMARY KEY (`id`),  
  CONSTRAINT `fk_vistas_roles_roles1`
    FOREIGN KEY (`rol_id`)
    REFERENCES `spa`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_vistas_roles_vistas1`
    FOREIGN KEY (`vista_id`)
    REFERENCES `spa`.`vistas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
