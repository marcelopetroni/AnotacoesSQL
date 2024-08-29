### CREATE TABLE:

// Criar uma tabela funcionário com chave primária sendo o CodFun

CREATE TABLE Funcionario {
   CodFun INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
   Nome VARCHAR(40) NOT NULL,
   Depto CHAR(2),
   Funcao CHAR(20),
   Salario DECIMAL(10,2)
}

## INNER JOIN

// Junção de duas tabelas em uma terceira com os dados das duas