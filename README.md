## Anotações SQL

![Capturar](https://github.com/marcelopetroni/AnotacoesSQL/assets/105806830/c7f8240e-1d6b-41f0-bc46-2e0a523705ec)
![sql](https://github.com/marcelopetroni/AnotacoesSQL/assets/105806830/f7a0a6dd-fe14-4214-9058-6032c3d810dd)

- União (Union): Une dados de duas tabelas independente de uma condição específica. <br/>
  <br/>
  SELECT coluna1, coluna2<br/>
  FROM tabela1<br/>
  UNION<br/>
  SELECT coluna1, coluna2<br/>
  FROM tabela2;<br/>
  <br/>
- Intersecção: Filtra linhas correspondentes por alguma condição em duas tabelas.<br/>
- Diferença: Filtra a exceção, uma valor não específicado na condição.<br/>
- Produto cartesiano: Multiplica o número de linhas em uma tabela resultante.<br/>
- Seleção (Where): Produz um subconjunto que satisfaz uma condição.<br/>
<br/>
  SELECT coluna1, coluna2<br/>
  FROM tabela<br/>
  WHERE condição;<br/>
<br/>
- Projeção (Select): Especifica linhas ou colunas para operações seguintes.<br/>
<br/>
  SELECT coluna1, coluna2<br/>
  FROM tabela;<br/>
<br/>
- Junção (Join): Une dados de duas tabelas com base em um critério específico.<br/>
<br/>
  SELECT coluna1, coluna2<br/>
  FROM tabela1<br/>
  JOIN tabela2 ON tabela1.coluna = tabela2.coluna; // une linhas com valores correspondentes das respectivas colunas da tabela 1 e 2.<br/>

