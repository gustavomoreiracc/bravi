# Implementação do teste para a empresa Bravi 
Para que este projeto seja executado:

- JAVA JDK 8 
- STS

1. Suportes balanceados

Escreva uma função que receba uma string de colchetes como entrada e determine se a
ordem dos colchetes é válida. Um colchete é considerado qualquer um dos seguintes
caracteres: (, ), {, }, [ ou ].
Dizemos que uma sequência de colchetes é válida se as seguintes condições forem
atendidas:
● Não contém colchetes sem correspondência.
● O subconjunto de colchetes dentro dos limites de um par de colchetes correspondente
também é um par de colchetes correspondente.
Exemplos:
● (){}[] é válido
● [{()}](){} é válido
● []{() não é válido
● [{)] não é válido

## PARA executar 
BraviApiApplication.java linha 15 descomentar e execute o metodo main como `Java Application`.



2. Lista de Contatos
Crie uma API REST que armazenará as pessoas e seus contatos. Uma pessoa pode ter
vários contatos, como telefone, e-mail ou whatsapp. A API deve permitir criar, atualizar,
obter e excluir tanto as pessoas quanto os contatos.

## Uso PESSOA com Postman

### Listar:

### add:
{
    "nome": "gustavo"
}
### alterar:
{
    "id":"1"
    "nome": "gustavo"
}

### Excluir:

## Implantação


