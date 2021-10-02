USE api_bank;

SET character_set_client = utf8;
SET character_set_connection = utf8;
SET character_set_results = utf8;
SET collation_connection = utf8_general_ci;

CREATE TABLE empresa(

    id int(10) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nome varchar(30),
    cnpj varchar(40),
    excluido datetime
);

CREATE TABLE funcionario(

    id int(10) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    id_empresa int(10) NOT NULL,
    nome varchar(30),
    cpf varchar(40),
    excluido datetime
);

CREATE TABLE horario_ponto(

    id int(10) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    id_funcionario int(10) NOT NULL,
    data_hora_batida datetime,
    excluido datetime
);


INSERT INTO empresa(nome,cnpj) values("ffff 1 test","54545.54.54/454");
INSERT INTO empresa(nome,cnpj) values("ffff 2 test","4548.54.45/5454");
INSERT INTO empresa(nome,cnpj) values("empresaf 3 test","4548.54.45/5454");

INSERT INTO funcionario(id_empresa,nome,cpf) values(1,"mariof","424.34.234.23");
INSERT INTO funcionario(id_empresa,nome,cpf) values(2,"sergiof","423.423.4234.23");
INSERT INTO funcionario(id_empresa,nome,cpf) values(3,"robertaf","543.454.5345.34");

INSERT INTO horario_ponto(id_funcionario,data_hora_batida) values(1,"2020-05-05f 08:00:00");
INSERT INTO horario_ponto(id_funcionario,data_hora_batida) values(2,"2020-05-05f 08:00:00");
INSERT INTO horario_ponto(id_funcionario,data_hora_batida) values(3,"2020-05-05f 08:00:00");
