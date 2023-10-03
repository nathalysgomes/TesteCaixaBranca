# TesteCaixaBranca
## Descrição
Repositório criado para realizar teste de caixa branca, no código sugerido pelo professor. Deve ser respondido as seguintes perguntas:
## Erros de código:
A documentação foi descrita no código?
O código possuí apenas dois comentários: de início de instrução de SQL e fim da class. O ideal seria que o código tivesse a explicação sobre seus métodos e variáveis.

As variáveis e constantes possuem boa nomeclatura?
Não, o ideal seria iniciar todas com letra maiúscula.

Existem legibilidade e organização no código?
Os problemas de legibilidade e organização encontrados no código são: falta de indentação nos blocos de código e falta de espaços em certos operadores.

Todos os nullpointers foram tratados?
Não, o código não trata corretamente essas exceções, é necessário acrescentar tratamento de exceções apropriados para evitar erros inesperados, como de falha de banco de dados por exemplo.

A arquitetura utilizada foi devidamente respeitada?
Não, ele não segue boas práticas de separações, o ideal seria otilizar MVC ou DAO para facilitar a manutenção do código quando necessário.

As conexões utilizadas foram fechadas?
Não, o ideal seria utlizar um "try-with-resources" nas declarações, para garantir que sejam fechadas corretamente.
## Grafo de fluxo:
<img src="/assets/nbproject/grafo-fluxo.jpg">

## Cálculo de complexidade:
## Sequências:


