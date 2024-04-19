# unisinos-lab2-semestre3-ads



### etapa 1
Na primeira etapa do Desafio do Laboratório II, você deve criar um programa que simule um labirinto. No nosso sistema, o labirinto será uma determinada estrutura composta por caracteres. No labirinto, posições com 'X' indicam que não é possível passar, enquanto posições com ' ' (espaço) indicam que é possível a passagem. O local de destino está marcado no labirinto com a letra 'D'.

O labirinto será um array bidimensional de caracteres. Para a criação do labirinto, seu programa deve ler um arquivo com extensão txt que contém os caracteres correspondentes ao labirinto. Após ler o arquivo, você deve passar seu conteúdo para um array bidimensional de caracteres. Desta forma, o local de entrada no labirinto sempre será a posição [0][0] do array.

Um exemplo de array bidimensional de caracteres que representaria um labirinto pode ser visto no código abaixo:

Descrição da imagem não disponível
Neste sentido, nesta etapa você deve:
• criar uma classe Labirinto, que possui como atributo a estrutura necessária para o armazenamento do labirinto;
• na classe Labirinto, crie um método chamado criaLabirinto, que recebe uma String filename, que corresponde a um arquivo que contém a estrutura do labirinto, conforme supracitado. Este método abre o arquivo filename para leitura e preenche o labirinto;
• ainda na classe Labirinto, você deve criar um método para andar no labirinto. Este método deve retornar verdadeiro, caso haja pelo menos uma saída para este labirinto, ou falso caso contrário. Entretanto, este método deve ser recursivo (com os métodos público e privado). Seu método público não recebe parâmetros e deve ser nomeado percorreLabirinto.



### etapa 2

Na segunda etapa, exercitaremos os métodos de Pesquisa e Ordenação, utilizando os métodos estudados para realizar uma ordenação de uma classe criada por você. Para este desafio, é imprescindível o entendimento da função da estabilidade de algoritmos de ordenação.

Crie uma classe Candidato, que possui um atributo nome (que armazena apenas o primeiro nome), um partido (String) e um inteiro chamado intencoesVotos que representa a quantidade de intenções de voto obtidas na pesquisa. Crie os métodos de acesso dos atributos e um construtor que recebe informações para inicializar todos os atributos. Crie, também, o método toString().


Crie uma classe chamada PrincipalCandidatos. Nesta classe, crie o método main. No main, crie um array de Candidato, com tamanho aleatório entre 1 e 100. Preencha este array com objetos do tipo Candidato com informações aleatórias (utilize sorteios para as informações). Obs.: é importante que exista a possibilidade de ter candidatos com o mesmo nome e também diferentes candidatos do mesmo partido.


Depois disso, imprima as informações dos candidatos criados. Entretanto, quando você imprimir as informações, a impressão deve sair ordenada pelo nome dos candidatos. Caso haja candidatos com o mesmo nome, estes candidatos de nome repetido devem aparecer ordenados também pela quantidade de intenções de voto. Caso estes candidatos de mesmo nome possuam a mesma quantidade de intenção de voto, eles devem estar ordenados por partido.
Para isso, você deve adaptar os métodos de ordenação estudados, de maneira que recebam um array de Candidato e ordenem este array de acordo com um determinado atributo da classe Candidato. Desta forma, você deve criar 3 métodos de ordenação: um que ordena o array pelo nome dos candidatos, um que ordena por intenção de votos (do maior número de votos para o menor) e outro que ordena o array pelo partido dos candidatos. A ordenação final será dada pela chamada dos métodos de ordenação na ordem correta.


Utilize EXCLUSIVAMENTE os métodos de ordenação Inserção Direta e Seleção Direta (com as alterações necessárias) para realizar a ordenação do array de Candidato. Assim sendo, os métodos devem receber um array de Candidato e ordenar este array por algum dos critérios. Os métodos de ordenação devem ser estáticos (para poderem ser chamados no main) e devem estar na classe PrincipalCandidatos. O nome dos métodos deve seguir o seguinte:
ordenaCandidatosPorNome
ordenaCandidatosPorVotos
ordenaCandidatosPorPartido


Na classe PrincipalCandidatos, crie um método estático chamado pesquisaBinariaCandidatos. Este método é uma versão do método de Pesquisa Binária visto em aula, que deve ser capaz de pesquisar um determinado Candidato pelo seu primeiro nome. O método deve receber um array unidimensional de Candidato e um nome de candidato a ser procurado. O método deve retornar a posição na qual aquele Candidato se encontra ou -1 caso não exista candidato com aquele nome no array (caso haja mais de um candidato com o mesmo nome, o método deve retornar o primeiro que for encontrado).


Depois disso, teste seu método com o array ordenado pelo seu método de ordenação do Exercício 2 e imprima as informações do Candidato que possui o nome que o usuário informar pelo teclado, utilizando o seu método pesquisaBinariaCandidatos.