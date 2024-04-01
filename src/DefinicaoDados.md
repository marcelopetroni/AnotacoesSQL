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