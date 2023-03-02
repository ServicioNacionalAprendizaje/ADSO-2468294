-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema ev_tienda_2
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ev_tienda_2
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ev_tienda_2` DEFAULT CHARACTER SET utf8 ;
USE `ev_tienda_2` ;

-- -----------------------------------------------------
-- Table `ev_tienda_2`.`marcas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ev_tienda_2`.`marcas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(50) NOT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `estado` BIT(1) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ev_tienda_2`.`categorias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ev_tienda_2`.`categorias` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(50) NOT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `estado` BIT(1) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ev_tienda_2`.`productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ev_tienda_2`.`productos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50) NOT NULL,
  `estado` BIT(1) NOT NULL,
  `marca_id` INT NOT NULL,
  `categoria_id` INT NOT NULL,
  PRIMARY KEY (`id`),  
  CONSTRAINT `fk_productos_marcas1`
    FOREIGN KEY (`marca_id`)
    REFERENCES `ev_tienda_2`.`marcas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_productos_categorias1`
    FOREIGN KEY (`categoria_id`)
    REFERENCES `ev_tienda_2`.`categorias` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ev_tienda_2`.`inventarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ev_tienda_2`.`inventarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `valor` DOUBLE NOT NULL,
  `cantidad` INT NOT NULL,
  `estado` BIT(1) NOT NULL,
  `producto_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_inventarios_productos`
    FOREIGN KEY (`producto_id`)
    REFERENCES `ev_tienda_2`.`productos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ev_tienda_2`.`personas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ev_tienda_2`.`personas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `tipo_documento` ENUM('CC', 'TI', 'CE', 'DNI') NOT NULL,
  `identificacion` VARCHAR(12) NOT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `apellido` VARCHAR(50) NOT NULL,
  `genero` BIT(1) NOT NULL,
  `correo` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ev_tienda_2`.`roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ev_tienda_2`.`roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(50) NOT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `estado` BIT(1) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ev_tienda_2`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ev_tienda_2`.`usuarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(50) NOT NULL,
  `contrasenia` VARCHAR(50) NOT NULL,
  `estado` BIT(1) NOT NULL,
  `persona_id` INT NOT NULL,
  `rol_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_usuarios_personas1`
    FOREIGN KEY (`persona_id`)
    REFERENCES `ev_tienda_2`.`personas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuarios_roles1`
    FOREIGN KEY (`rol_id`)
    REFERENCES `ev_tienda_2`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ev_tienda_2`.`facturas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ev_tienda_2`.`facturas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(50) NOT NULL,
  `valor_total` DOUBLE NOT NULL,
  `fecha` TIMESTAMP NOT NULL,
  `estado` BIT(1) NOT NULL,
  `cliente_id` INT NOT NULL,
  `vendedor_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_facturas_usuarios1`
    FOREIGN KEY (`cliente_id`)
    REFERENCES `ev_tienda_2`.`usuarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_facturas_usuarios2`
    FOREIGN KEY (`vendedor_id`)
    REFERENCES `ev_tienda_2`.`usuarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ev_tienda_2`.`facturas_productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ev_tienda_2`.`facturas_productos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cantidad` INT NULL,
  `valor_total` DOUBLE NULL,
  `factura_id` INT NOT NULL,
  `producto_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_facturas_productos_facturas1`
    FOREIGN KEY (`factura_id`)
    REFERENCES `ev_tienda_2`.`facturas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_facturas_productos_productos1`
    FOREIGN KEY (`producto_id`)
    REFERENCES `ev_tienda_2`.`productos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
