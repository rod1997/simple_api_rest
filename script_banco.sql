USE api_bank;

SET character_set_client = utf8;
SET character_set_connection = utf8;
SET character_set_results = utf8;
SET collation_connection = utf8_general_ci;

CREATE TABLE empresa(

    id int(10) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nome varchar(30),
    cnpj varchar(40)
);

CREATE TABLE funcionario(

    id int(10) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    id_empresa int(10) NOT NULL,
    nome varchar(30),
    cpf varchar(40)
);

CREATE TABLE horario_ponto(

    id int(10) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    id_funcionario int(10) NOT NULL,
    data_hora_batida varchar(50)
);


INSERT INTO empresa(nome,cnpj) values("empresa 1 test","54545.54.54/454");
INSERT INTO empresa(nome,cnpj) values("empresa 2 test","4548.54.45/5454");
INSERT INTO empresa(nome,cnpj) values("empresa 3 test","4548.54.45/5454");

INSERT INTO funcionario(id_empresa,nome,cpf) values(1,"mario","424.34.234.23");
INSERT INTO funcionario(id_empresa,nome,cpf) values(2,"sergio","423.423.4234.23");
INSERT INTO funcionario(id_empresa,nome,cpf) values(3,"roberta","543.454.5345.34");

INSERT INTO horario_ponto(id_funcionario,data_hora_batida) values(1,"2020-05-05 08:00:00");
INSERT INTO horario_ponto(id_funcionario,data_hora_batida) values(2,"2020-05-05 08:00:00");
INSERT INTO horario_ponto(id_funcionario,data_hora_batida) values(3,"2020-05-05 08:00:00");
