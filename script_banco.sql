USE api_bank;

SET character_set_client = utf8;
SET character_set_connection = utf8;
SET character_set_results = utf8;
SET collation_connection = utf8_general_ci;

CREATE TABLE cliente(id varchar(10),nome varchar(30),cpf varchar(40));

INSERT INTO cliente(id,nome,cpf) values("0","mario","234354354");
INSERT INTO cliente(id,nome,cpf) values("1","rodrigo","3555435");
INSERT INTO cliente(id,nome,cpf) values("2","carlos","3534534");
INSERT INTO cliente(id,nome,cpf) values("3","maria","345345");
INSERT INTO cliente(id,nome,cpf) values("4","tatiana","234424");