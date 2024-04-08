# LINGUAGEM SQL

Diferença entre tabela e esquema: tabela é uma organização de dados em linhas e colunas e o esquema é a manipulação deles, no caso tabelas, indíces, procedimentos, etc.

SQL DIVIDIDO EM:

DDL (DATA DEFINITION LANGUAGE)
- Usado para definir a estrutura e características de um banco.
- Comandos usados: CREATE TABLE, ALTER TABLE, DROP TABLE, etc.

DML (DATA MANIPULATION LANGUAGE)
- Usado para CRUD, criação, deleção, atualização de dados de um banco.
- Comandos usados: INSERT, UPDATE e DELETE (o SELECT é usado para recolher dados)

DCL (DATA CONTROL LANGUAGE)
- Controla acesso aos objetos de um banco, gerenciar permissões, etc.
- Fazem cadastro de usuários e determinam seu nível de privilégio para os objetos do banco.
- Comandos utilizados:  GRANT e REVOKE.

# TIPOS DE DADOS:
- CHAR(n): um ou mais caracteres que formam uma string, no lugar do 'n' definido o nº FIXO da string.

- VARCHAR(n): um ou mais caracteres que formam uma string, porém o valor de 'n' é VARIÁVEL, ideal para strings com valores flexíveis.

- INTEGER: inteiro

- DECIMAL(n, m): número de tamanho variável onde 'n' é o nº total de dígitos e 'm' nº total de CASAS DECIMAIS após a vírgula.

- BIT(n): sequência de n bits.

- TIME: hora de tamanho fixo.

- DATE: data de tamanho fixo. 

# CRIAÇÃO DE TABELA: 
- 'CREATE table nomeEscolhido' para criar tabela, em seguida:
-  Dentro de parênteses os atributos ( nomeVariavel tipo(tamanho)) e separado por vírgulas se for adicionado mais   algum.

EXEMPLO:
create table funcionario
(nome char(30),  // "NOT NULL" após parentêses para estabelecer atributo como obrigatório e evitar valores nulos.
rg decimal(9),
salario decimal(10,2) // CHECK(salario>350) verifica valores inválidos, tentar inserir dados fora da condição estabelecida, ocorre um erro e não é inserido
endereco varchar(30)
sexo char(1) // "CHECK( sexo in (‘M’, ‘F’) )" para restringir a valores específicos,
cidade varchar(10) // "DEFAULT 'São Paulo’" para definir valores DEFAULT e evitar nulos também)

# DDL
- Create: Permite criar objetos
- Create Domain: declara um nome de domínio para ser usado como tipo, veja:

CREATE DOMAIN nome as CHAR(4)
CREATE DOMAIN nome2 as INTEGER // Cria o tipo nome2
CHECK (nome2 > 0 AND nome2 < 21) // Verifica condição para o tipo

CREATE TABLE FUNCIONARIO ( 
    atributo tipo(tamanho)
)

Alterando valores:
ALTER TABLE FUNCIONARIO
ALTER atributo SET DEFAULT 'valorInicial' // Define valor inicial para aquele atributo

- Deletando colunas:
ALTER TABLE FUNCIONARIO
DROP endereco CASCADE // apaga coluna e suas dependências de outras tabelas (cuidado)

ALTER TABLE FUNCIONARIO
DROP endereco RESTRICT // apaga coluna se não tiver dependências de outra tabela
Obs: DROP permite apagar esquemas, tabelas, colunas, etc.

- Atualização:
ALTER TABLE FUNCIONARIO
ALTER A1 to A2

# DML
INSERT: insere tuplas em uma relação
INSERT INTO FUNCIONARIO(ident, nome, sobrenome, numero) // é opcional especificar o tipo
VALUES('1164', 'Jorge', 'Vila Verde', '1')

UPDATE: Modifica valores de uma tupla em uma relação
UPDATE FUNCIONARIO
SET localizacao ='Minas Gerais', numero = '5'
WHERE numero = '1' // condição que indica a tupla a ser alterada (para o novo valor definido no set)

DELETE: Remove tuplas de uma relação
DELETE FROM FUNCIONARIO
WHERE campo = 'valor' // deleta valores a patir de condições específicadas, nesse caso apaga campos que tenham o 'valor' inseridos.