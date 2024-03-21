Segue as quatro operações base de banco de dados:

# PRODUTO CARTESIANO (permite cruzamento entre dados de objetos):

    SELECT: Recupera dados de um banco
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

    WHERE: Filtra resultados com base em condição específica. Exemplo:

    SELECT *                                          SELECT *
    FROM PRODUCT, CATEGORY                        ou  FROM PRODUCT, CATEGORY
    WHERE                                             INNER JOIN CATEGORY apelido (cria um apelido p/ a classe)
        PRODUCT.ATRIBUTO1 = CATEGORY.ATRIBUTO2        ON PRODUCT.ATRIBUTO1 = apelido.ATRIBUTO2  

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

    INNER JOIN: outra alternativa para acrescentar valores

    - Adiciona uma restrição a partir de uma carcaterística, nesse exemplo, foi a partir de um terceiro atributo 
      onde está presente apenas naqueles que apresentam número ímpares:

    SELECT *
    FROM PRODUCT, CATEGORY
    INNER JOIN CATEGORY apelido 
    ON PRODUCT.ATRIBUTO1 = apelido.ATRIBUTO2  
    WHERE CATEGORY.NUMBER = "ímpares" // restrição em que é filtrado apenas valores ímpares do atributo 'number'

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

        FROM PRODUCT, CATEGORY
        INNER JOIN CATEGORY apelido 
        ON PRODUCT.ATRIBUTO1 = apelido.ATRIBUTO2  
        WHERE CATEGORY.ATRIBUTO3 = "ímpares"

        - Então se antes era projetado outros atributos (atributo2) da classe CATEGORY, só será projetado os dados referentes ao atributo NAME da classe. (e todos de PRODUCT nesse exemplo)

# RESUMINDO
        SELECT PRODUCT.*, CATEGORY.NAME         --> seleção da projeção dos dados
        FROM PRODUCT, CATEGORY                  --> produto cartesiano (cruzamento de dados)
        INNER JOIN CATEGORY apelido             --> filtro de dados a partir de valores em comum nos respectivos atributos
        ON PRODUCT.ATRIBUTO1 = apelido.ATRIBUTO2  
        WHERE CATEGORY.ATRIBUTO3 = "ímpares"    --> outro filtro a partir de um valor específico de um atributo no qual
                                                --> apenas mostra os objetos que contenham aquele valor naquele atributo 


    