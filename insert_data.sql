-- usuario
INSERT INTO `usuario` VALUES (2,'maria@gmail.com','Maria','Silva',NULL,'11111111','1234');
INSERT INTO `usuario` VALUES (3,'paulo@gmail.com','Paulo','Costa',NULL,'111111111','1234');

-- endereco
INSERT INTO `endereco` VALUES (1,'Rua','Conselheiro Lafayette','30','','Santa Paula','São Caetano do Sul','SP',9550000,2);
INSERT INTO `endereco` VALUES (2,'Avenida','Trinta e Um de Março','300','','Jardim Borborema','São Bernardo do Campo','SP',9660000,3);

-- exame

INSERT INTO `exame` VALUES (1,2,'Plaquetas','2018-10-30','./images/exame1.pdf');
INSERT INTO `exame` VALUES (2,2,'Hemograma Completo','2019-05-24','./images/exame2.pdf');

-- medico
INSERT INTO `medico` VALUES (1,'Paulo Silva');
INSERT INTO `medico` VALUES (2,'Maria Pereira');
INSERT INTO `medico` VALUES (3,'Sonia Maria Laureano');
INSERT INTO `medico` VALUES (4,'Valeria Ludovico');
INSERT INTO `medico` VALUES (5,'Cristina Claretis');
INSERT INTO `medico` VALUES (6,'Pedro Porto');

-- especialidade

INSERT INTO `especialidade` VALUES (1,'Acupuntura');
INSERT INTO `especialidade` VALUES (2,'Alergia e Imunologia');
INSERT INTO `especialidade` VALUES (3,'Anestesiologia');
INSERT INTO `especialidade` VALUES (4,'Angiologia');
INSERT INTO `especialidade` VALUES (5,'Cancerologia');
INSERT INTO `especialidade` VALUES (6,'Cardiologia');
INSERT INTO `especialidade` VALUES (7,'Cirurgia Cardiovascular');
INSERT INTO `especialidade` VALUES (8,'Cirurgia da Mão');
INSERT INTO `especialidade` VALUES (9,'Cirurgia Plástica');
INSERT INTO `especialidade` VALUES (10,'Clínica Médica');
INSERT INTO `especialidade` VALUES (11,'Geriatria');
INSERT INTO `especialidade` VALUES (12,'Ginecologia');
INSERT INTO `especialidade` VALUES (13,'Hematologia e Hemoterapia');
INSERT INTO `especialidade` VALUES (14,'Medicina Esportiva');
INSERT INTO `especialidade` VALUES (15,'Oftalmologia');
INSERT INTO `especialidade` VALUES (16,'Ortopedia e Traumatologia');
INSERT INTO `especialidade` VALUES (17,'Otorrinolaringologia');

-- unidadeatendimento

INSERT INTO `unidadeatendimento` VALUES (1,'UPA UTINGA','Avenida Utinga','150','Santo Andre','SP',976838);
INSERT INTO `unidadeatendimento` VALUES (2,'UPA Parque das Nacoes','Avenida Oratorio','150','Santo Andre','SP',976838);
INSERT INTO `unidadeatendimento` VALUES (3,'HOSPITAL MÁRIO COVAS','Avenida Pereira Barreto','150','Santo Andre','SP',976838);
INSERT INTO `unidadeatendimento` VALUES (4,'HOSPITAL DA MULHER','Avenida D. Pedro','470','Santo Andre','SP',976838);
INSERT INTO `unidadeatendimento` VALUES (5,'UBS VILA GUIOMAR','Rua Silveiras','73','Santo Andre','SP',976838);
INSERT INTO `unidadeatendimento` VALUES (6,'UBS PARANAPIACABA','Avenida Rodrigues Alves','29','Santo Andre','SP',976838);
INSERT INTO `unidadeatendimento` VALUES (7,'UBS CIDADE SANTO JORGE','Avenida Sapopemba','800','Santo Andre','SP',976838);
INSERT INTO `unidadeatendimento` VALUES (8,'UBS CAMPESTRE','Rua Simão Jorge','550','Santo André','SP',976838);

-- especialidadeatendimento

INSERT INTO `especialidadeatendimento` VALUES (1,1);
INSERT INTO `especialidadeatendimento` VALUES (2,1);
INSERT INTO `especialidadeatendimento` VALUES (3,1);
INSERT INTO `especialidadeatendimento` VALUES (2,2);
INSERT INTO `especialidadeatendimento` VALUES (3,2);
INSERT INTO `especialidadeatendimento` VALUES (1,3);
INSERT INTO `especialidadeatendimento` VALUES (13,3);
INSERT INTO `especialidadeatendimento` VALUES (15,3);
INSERT INTO `especialidadeatendimento` VALUES (16,3);
INSERT INTO `especialidadeatendimento` VALUES (17,3);
INSERT INTO `especialidadeatendimento` VALUES (2,4);
INSERT INTO `especialidadeatendimento` VALUES (13,4);
INSERT INTO `especialidadeatendimento` VALUES (1,5);
INSERT INTO `especialidadeatendimento` VALUES (2,5);
INSERT INTO `especialidadeatendimento` VALUES (1,6);
INSERT INTO `especialidadeatendimento` VALUES (4,6);
INSERT INTO `especialidadeatendimento` VALUES (13,6);
INSERT INTO `especialidadeatendimento` VALUES (14,6);
INSERT INTO `especialidadeatendimento` VALUES (5,7);
INSERT INTO `especialidadeatendimento` VALUES (6,7);
INSERT INTO `especialidadeatendimento` VALUES (11,7);
INSERT INTO `especialidadeatendimento` VALUES (12,7);
INSERT INTO `especialidadeatendimento` VALUES (7,8);
INSERT INTO `especialidadeatendimento` VALUES (8,8);
INSERT INTO `especialidadeatendimento` VALUES (9,8);
INSERT INTO `especialidadeatendimento` VALUES (10,8);


-- agendamarcacao

INSERT INTO `agendamarcacao` VALUES (1,1,1,1,'2019-12-20','14:10','livre');
INSERT INTO `agendamarcacao` VALUES (2,1,1,1,'2019-12-20','14:30','agendado');
INSERT INTO `agendamarcacao` VALUES (3,1,1,1,'2019-12-20','14:50','livre');
INSERT INTO `agendamarcacao` VALUES (4,1,1,2,'2019-12-21','14:50','agendado');
INSERT INTO `agendamarcacao` VALUES (5,1,1,2,'2019-10-21','14:50','realizada');
INSERT INTO `agendamarcacao` VALUES (6,2,1,6,'2019-12-01','11:10','livre');
INSERT INTO `agendamarcacao` VALUES (7,2,1,6,'2019-12-01','12:10','livre');
INSERT INTO `agendamarcacao` VALUES (8,2,2,5,'2019-10-02','15:10','realizada');
INSERT INTO `agendamarcacao` VALUES (9,2,2,5,'2019-12-02','14:10','livre');
INSERT INTO `agendamarcacao` VALUES (10,1,3,1,'2019-12-20','14:10','livre');
INSERT INTO `agendamarcacao` VALUES (11,1,3,6,'2019-12-21','11:10','livre');
INSERT INTO `agendamarcacao` VALUES (12,1,5,4,'2019-12-15','10:10','livre');
INSERT INTO `agendamarcacao` VALUES (13,1,5,4,'2019-12-15','10:30','livre');
INSERT INTO `agendamarcacao` VALUES (14,1,6,2,'2019-12-15','10:30','livre');
INSERT INTO `agendamarcacao` VALUES (15,2,4,5,'2019-12-02','15:10','livre');
INSERT INTO `agendamarcacao` VALUES (16,2,4,5,'2019-12-02','14:10','livre');
INSERT INTO `agendamarcacao` VALUES (17,2,5,1,'2019-12-02','15:10','livre');
INSERT INTO `agendamarcacao` VALUES (18,2,5,6,'2019-12-02','14:10','agendado');
INSERT INTO `agendamarcacao` VALUES (19,13,3,3,'2019-12-05','08:10','livre');
INSERT INTO `agendamarcacao` VALUES (20,13,3,3,'2019-12-05','12:10','livre');
INSERT INTO `agendamarcacao` VALUES (21,13,3,4,'2019-12-05','10:10','livre');

INSERT INTO `agendamarcacao` VALUES (22,1,1,2,'2019-12-20' ,'14:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (23,1,3,6,'2019-12-21' ,'14:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (24,1,5,1,'2019-12-18' ,'13:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (25,1,6,5,'2019-12-13' ,'15:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (26,2,1,4,'2019-12-22' ,'14:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (27,2,2,5,'2019-12-15' ,'08:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (28,2,4,3,'2019-12-21' ,'14:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (29,2,5,1,'2019-12-20' ,'09:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (30,3,1,1,'2019-12-20' ,'14:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (31,3,2,2,'2019-12-20' ,'14:25' ,'livre');
INSERT INTO `agendamarcacao` VALUES (32,4,6,2,'2019-12-20' ,'08:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (33,5,7,3,'2019-12-20' ,'14:25' ,'agendado');
INSERT INTO `agendamarcacao` VALUES (34,6,7,4,'2019-12-30' ,'08:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (35,7,8,3,'2019-12-07' ,'14:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (36,8,8,4,'2019-12-20' ,'10:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (37,9,8,5,'2019-12-22' ,'14:30' ,'livre');
INSERT INTO `agendamarcacao` VALUES (38,10,8,6,'2019-12-24' ,'14:25' ,'livre');
INSERT INTO `agendamarcacao` VALUES (39,11,7,1,'2019-12-27' ,'11:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (40,12,7,2,'2019-12-18' ,'14:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (41,13,3,3,'2019-12-20' ,'12:20' ,'livre');
INSERT INTO `agendamarcacao` VALUES (42,13,4,4,'2019-12-20' ,'14:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (43,13,6,5,'2019-12-20' ,'08:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (44,14,6,6,'2019-12-14' ,'12:20' ,'livre');
INSERT INTO `agendamarcacao` VALUES (45,15,3,1,'2019-12-14' ,'14:10' ,'livre');
INSERT INTO `agendamarcacao` VALUES (46,16,3,2,'2019-12-15' ,'14:25' ,'livre');
INSERT INTO `agendamarcacao` VALUES (47,17,3,3,'2019-12-20' ,'12:20' ,'livre');

-- useragenda

INSERT INTO `useragenda` VALUES (2,4,'agendada');
INSERT INTO `useragenda` VALUES (2,5,'consulta realizada');
INSERT INTO `useragenda` VALUES (3,18,'agendada');
INSERT INTO `useragenda` VALUES (3,33,'agendada');
INSERT INTO `useragenda` VALUES (3,8,'consulta realizada');