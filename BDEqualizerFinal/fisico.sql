-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE usuario (
password VARCHAR(10),
dataNascimento VARCHAR(10),
email VARCHAR(255),
telefone VARCHAR(10),
cpf VARCHAR(14),
nomeCompleto VARCHAR(255),
username VARCHAR(10),
id VARCHAR(10) PRIMARY KEY
)

CREATE TABLE  usuario_empresa (
empresa_id VARCHAR(10),
usuario_id BIGINT(10),
id VARCHAR(10),
-- Erro: nome do campo duplicado nesta tabela!
id VARCHAR(10),
PRIMARY KEY(empresa_id,usuario_id),
FOREIGN KEY(id) REFERENCES usuario (id)
)

CREATE TABLE empresa (
id VARCHAR(10) PRIMARY KEY,
nome VARCHAR(14),
descricao VARCHAR(255),
departamento VARCHAR(255),
quantidadeDeFuncionarios INTEGER
)

ALTER TABLE  usuario_empresa ADD FOREIGN KEY(id) REFERENCES empresa (id)
