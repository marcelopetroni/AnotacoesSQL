Segue as quatro operações base de banco de dados:

# PRODUTO CARTESIANO (permite cruzamento entre dados de objetos):

    SELECT: Recupera dados de um banco, especifica linhas/colunas.
    FROM: Indica de qual tabela ou tabelas você deseja selecionar os dados.

    SELECT * (busca e projeta todos os dados)
    FROM PRODUCT (tabela 1), CATEGORY (tabela 2)

    - Você pode selecionar colunas específicas também:
    SELECT collum1, collum2
    FROM PRODUCT

    - O mesmo que um plano cartesiano, faz x com y, uma distributiva para que cada atributo tenha ligação ao outro.

         ex: pense numa sequencia de objetos do tipo product com o atributo1 e o mesmo para category com atributo2:
            EX ANTES:   
                    p1.atributo1 = 1;    cat1.atributo2 = 2;
                    p2.atributo1 = 2;    cat2.atributo2 = 3;
                    p3.atributo1 = 3;

            EX DEPOIS:
                    p1.atributo1 = 1;    cat1.atributo2 = 2;
                    p1.atributo1 = 1;    cat1.atributo2 = 3;
                    p2.atributo1 = 2;    cat1.atributo2 = 2;
                    p2.atributo1 = 2;    cat2.atributo2 = 3;
                    p3.atributo1 = 3;    cat1.atributo2 = 2;
                    p3.atributo1 = 3;    cat2.atributo2 = 3;

# JUNÇÃO

    WHERE: Filtra resultados com base em condição específica. 
    INNER JOIN: Também filtra, mas usado para unir linhas com valores correspondentes das respectivas colunas da tabela 1 e 2.

    DIFERENÇA ENTRE ELES: Where é mais utilizado para restringir um resultado com base em uma condição e inner join é mais legível para combinar/unir linhas de duas tabelas.

    OBS IMPORTANTE: Ao utilizar inner join, só deve ser específicado uma tabela após o FROM, o SELECT ainda é usado para especificar os dados de todas as tabelas, mas o inner join fica responsável por espcificar a tabela2

    SELECT *
    FROM tabela1
    INNER JOIN tabela2
    ON tabela1.collum1 = tabela2.collum1;

###   UTILIZAÇÃO INNER JOIN:

    SELECT *                                          SELECT *
    FROM PRODUCT, CATEGORY                        ou  FROM PRODUCT
    WHERE                                             INNER JOIN CATEGORY
        PRODUCT.ATRIBUTO1 = CATEGORY.ATRIBUTO2        ON PRODUCT.ATRIBUTO1 = CATEGORY.ATRIBUTO2  

        (ao fazer isso, você filtra a tabela para que permaneça apenas os dados em comum de cada objeto)
        EX ANTES: a mesma tabela com o cruzamento formado anteriormente na junção de dados:

            p1.atributo1 = 1;    cat1.atributo2 = 2;
            p1.atributo1 = 1;    cat1.atributo2 = 3;
            p2.atributo1 = 2;    cat1.atributo2 = 2; (match de dados)
            p2.atributo1 = 2;    cat2.atributo2 = 3;
            p3.atributo1 = 3;    cat1.atributo2 = 2;
            p3.atributo1 = 3;    cat2.atributo2 = 3; (match de dados)

    - Ao fazer a operação de junção, a organização de dados ficará assim (a tabela final):

        p2.atributo1 = 2;    cat1.atributo2 = 2;
        p3.atributo1 = 3;    cat2.atributo2 = 3;
    
    (combina colunas de duas ou mais tabelas com base em uma coluna comum entre elas)

# RESTRINÇÃO

    - Adiciona uma restrição a partir de uma característica, nesse exemplo, teve uma junção de linhas entre duas tabelas e desse conjunto de linhas se tem um filtro presente apenas naqueles que apresentam número ímpares:

    SELECT *
    FROM PRODUCT
    INNER JOIN CATEGORY
    ON PRODUCT.atributo1 = CATEGORY.atributo2  
    WHERE CATEGORY.atributo1 % 2 != 0 // restrição em que é filtrado apenas valores ímpares do atributo 'number'

    1º passo: Seleciona todos os dados das tabelas onde PRODUCT é referenciado no FROM e CATEGORY no INNER JOIN 
    2º passo: Filtra linhas correspondentes pelo INNER JOIN nas respectivas tabelas em que tenham o mesmo valor
    3º passo: Esses dados de mesmo valor são restringidos àqueles que são ímpares pela condição do WHERE

    - Ou seja: 3 = 2,  5 = 5,  1 = 4,  2 = 2,  3 = 3  ====> 5 = 5,  2 = 2,  3 = 3 ====> 5 = 5,  3 = 3

    (não pode usar a expressão "WHERE" tanto para a junção e a restrição ao mesmo tempo,
    nesse caso, utilizei "INNER JOIN ../ON .." para a junção e "WHERE" para a restrinção)

    - EX ANTES: tabela apenas com a junção de dados:

        p2.atributo1 = 2;    cat1.atributo2 = 2;
        p3.atributo1 = 3;    cat2.atributo2 = 3;

    - EX DEPOIS: tabela depois de acrescentar a restrinção:

        p3.atributo1 = 3;    cat2.atributo2 = 3;

        (numa possível organização de dados, apenas aqueles com número 1, 3, 5, etc estaria com a tag "ímpares")
        (Aqui é visto tanto a junção os objetos de classes diferentes como a restrinção atribuída para filtrar)

# PROJEÇÃO
    - Para ser exibido apenas dados específicos que você deseja, precisa mudar a expressão "SELECT":

        SELECT PRODUCT.*, CATEGORY.NAME (O que eu disse aqui? "projete todos os dados (atributos) da classe PRODUCT e apenas os dados do atributo "NAME" da classe CATEGORY)

        FROM PRODUCT
        INNER JOIN CATEGORY 
        ON PRODUCT.ATRIBUTO1 = CATEGORY.ATRIBUTO2  
        WHERE CATEGORY.ATRIBUTO1 % 2 != 0

        - Então se antes era projetado outros atributos (atributo2) da classe CATEGORY, só será projetado os dados referentes ao atributo NAME da classe. (e todos de PRODUCT nesse exemplo)

# RESUMINDO
        SELECT PRODUCT.*, CATEGORY.NAME         --> seleção da projeção dos dados
        FROM PRODUCT                             --> referência da tabela
        INNER JOIN CATEGORY                      --> filtro de dados a partir de valores em comum nos respectivos 
        ON PRODUCT.ATRIBUTO1 = CATEGORY.ATRIBUTO2  
        WHERE CATEGORY.ATRIBUTO3 = "ímpares"    --> outro filtro de restrição a partir de um valor específico de um 
                                                    atributo 
                                                --> apenas mostra as junções que apresentam essa restrinção


    