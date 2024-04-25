# Forma simples e fácil de usar Postgree SQL

- 1º passo: Crie um server com senha.
Botão direito do mouse -> Servers -> Create -> Server 
(Definir 'nome' em general e 'localhost' em connection se já não estiver preenchido)

## DATABASE
- Aqui se encontra todos os bancos de dados criados por mim. Toda vez que criar um novo, deve ser criado por lá.
- 2º passo: Em 'Databases' aperte o botão direito do mouse, em seguida: Create -> Database.
- Ao fazer isso, você está criando um novo banco que contém um esquema com suas tables.

#### Criando Database
- Em 'General' defina um nome para o banco
- Em 'Definition' você pode escolher 'template1' em templates
- Em 'Tablespace' você selecione 'pg_default'

# Inserindo SQL no banco de dados criado
- Vá no banco criado em 'Databases' -> Botão direito no 'BancoX' -> 'Query Tool...'
- Será aberto nova aba Query para uso de SQL para todo o banco selecionado.

- Manipule dados à vontade, crie tabelas, etc e se quiser verificar dados, vá em:
"BancoX" -> "Schemas" -> "public" -> "tables" (aqui estará todas as tabelas e seus atributos)

- OBS: Você pode visualizar os dados também usando SELECT lá na Query geral do banco, tanto como, na própria table
que deseja acessar os dados ao apertar o botão direito do mouse nela -> 'View/Edit Data' (mostra os dados dela)