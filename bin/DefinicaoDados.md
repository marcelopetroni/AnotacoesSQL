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

TIPOS DE DADOS:
CHAR(n): um ou mais caracteres que formam uma string, no lugar do 'n' definido o nº FIXO da string.
VARCHAR(n): um ou mais caracteres que formam uma string, porém o valor de 'n' é VARIÁVEL, ideal para strings com valores flexíveis.