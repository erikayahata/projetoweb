create database saude;
use saude;

-- -----------------------------------------------------
-- Table `saude`.`especialidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `saude`.`especialidade` (
  `idespecialidade` INT(11) NOT NULL AUTO_INCREMENT,
  `especialidade` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idespecialidade`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `saude`.`medico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `saude`.`medico` (
  `idmedico` INT(11) NOT NULL,
  `nome` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idmedico`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `saude`.`unidadeatendimento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `saude`.`unidadeatendimento` (
  `idunidadeatendimento` INT(11) NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  `logradouro` VARCHAR(100) NOT NULL,
  `numero` VARCHAR(45) NOT NULL,
  `cidade` VARCHAR(100) NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  `cep` INT(11) NOT NULL,
  PRIMARY KEY (`idunidadeatendimento`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `saude`.`agendamarcacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `saude`.`agendamarcacao` (
  `idagenda` INT(11) NOT NULL,
  `idespecialidade` INT(11) NOT NULL,
  `idunidadeatendimento` INT(11) NOT NULL,
  `idmedico` INT(11) NULL DEFAULT NULL,
  `data` DATE NOT NULL,
  `horario` VARCHAR(45) NOT NULL,
  `status` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idagenda`),
  INDEX `fkespecialidade_idx` (`idespecialidade` ASC) VISIBLE,
  INDEX `fkunidade_idx` (`idunidadeatendimento` ASC) VISIBLE,
  INDEX `fkidmedico_idx` (`idmedico` ASC) VISIBLE,
  CONSTRAINT `fkespecialidade`
    FOREIGN KEY (`idespecialidade`)
    REFERENCES `saude`.`especialidade` (`idespecialidade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkidmedico`
    FOREIGN KEY (`idmedico`)
    REFERENCES `saude`.`medico` (`idmedico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkunidade`
    FOREIGN KEY (`idunidadeatendimento`)
    REFERENCES `saude`.`unidadeatendimento` (`idunidadeatendimento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `saude`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `saude`.`usuario` (
  `idusuario` INT(11) NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(50) NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  `sobrenome` VARCHAR(100) NOT NULL,
  `dt_nascimento` DATE NULL DEFAULT NULL,
  `cpf` VARCHAR(11) NOT NULL,
  `senha` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idusuario`),
  UNIQUE INDEX `email` (`email` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `saude`.`endereco`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `saude`.`endereco` (
  `idendereco` INT(11) NOT NULL AUTO_INCREMENT,
  `tipo` VARCHAR(45) NOT NULL,
  `logradouro` VARCHAR(100) NOT NULL,
  `numero` VARCHAR(10) NOT NULL,
  `complemento` VARCHAR(45) NULL DEFAULT NULL,
  `bairro` VARCHAR(45) NULL DEFAULT NULL,
  `cidade` VARCHAR(45) NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  `cep` INT(11) NOT NULL,
  `idusuario` INT(11) NOT NULL,
  PRIMARY KEY (`idendereco`),
  INDEX `idusuario_idx` (`idusuario` ASC) VISIBLE,
  CONSTRAINT `fk_endereco`
    FOREIGN KEY (`idusuario`)
    REFERENCES `saude`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `saude`.`especialidadeatendimento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `saude`.`especialidadeatendimento` (
  `idespecialidade` INT(11) NOT NULL,
  `idunidadeatendimento` INT(11) NOT NULL,
  PRIMARY KEY (`idespecialidade`, `idunidadeatendimento`),
  INDEX `fkespecaten_idx` (`idunidadeatendimento` ASC) VISIBLE,
  CONSTRAINT `fkaten`
    FOREIGN KEY (`idunidadeatendimento`)
    REFERENCES `saude`.`unidadeatendimento` (`idunidadeatendimento`),
  CONSTRAINT `fkespec`
    FOREIGN KEY (`idespecialidade`)
    REFERENCES `saude`.`especialidade` (`idespecialidade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `saude`.`exame`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `saude`.`exame` (
  `idexame` INT(11) NOT NULL AUTO_INCREMENT,
  `idusuario` INT(11) NOT NULL,
  `descricao` VARCHAR(60) NOT NULL,
  `data` DATE NULL DEFAULT NULL,
  `path` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idexame`),
  INDEX `fkuserexame` (`idusuario` ASC) VISIBLE,
  CONSTRAINT `fkuserexame`
    FOREIGN KEY (`idusuario`)
    REFERENCES `saude`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `saude`.`useragenda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `saude`.`useragenda` (
  `idusuario` INT(11) NOT NULL,
  `idagenda` INT(11) NOT NULL,
  `status` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idusuario`, `idagenda`, `status`),
  INDEX `fkagenda_idx` (`idagenda` ASC) VISIBLE,
  CONSTRAINT `fkagenda`
    FOREIGN KEY (`idagenda`)
    REFERENCES `saude`.`agendamarcacao` (`idagenda`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkusuario`
    FOREIGN KEY (`idusuario`)
    REFERENCES `saude`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


