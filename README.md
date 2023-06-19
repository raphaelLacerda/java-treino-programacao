# Exercício CaminhoArquivo - BUG e REFACTORING

O código da classe CaminhoArquivo está bugado! O desenvolvedor fez testes na classe CaminhoArquivoTest. 
Sabe-se que esses testes estão corretos e especificam como deve ser o comportamento da classe.

## O que fazer?

O seu trabalho será dividido em três partes:

* Consertar o bug no código e fazer o teste passar (comentar a anotação @Disable)
* Refatorar o código. Técnicas como análise de complexidade ciclomática, duplicação de código, 
clean code e LOC serão utilizadas para avaliação;
* Adicionar um caso de teste para o cenário no qual o ID não é informado

> Atenção, a assinatura do método deve ser mantida, assim como os testes da classe CaminhoArquivoTest


# Exercício Teste de Unidade e Mock

Neste exercício vamos focar em testes de unidade, mocks e refatoração

## Descrição do problema 1

A classe Banco é responsável por manter as contas dos clientes. Porém, os usuários estão reclamando lentidão quando tentam buscar por uma conta de um cliente específico.

Você como desenvolvedor deve:

* Fazer os testes de unidade da classe banco para os métodos
  - adicionarConta
  - pesquisarContaDoCliente
  - listarContasAltaRenda
* Refatorar o método pesquisarContaDoCliente para resolver os problemas de lentidão

## Descrição do problema 2

A classe SistemaBancario é responsável por registrar os bancos junto ao Bacen. Bacen é um Gateway que faz chamadas ao WebService do Bacen.
É necessário testar a classe SistemaBancario unitariamente, logo precisamos de uma solução para isolar a classe Bacen.


Para isolar a classe Bacen você deve implementá-la de três maneiras diferentes
* usando um Fake
* usando um Stub


Os seguintes cenário deve ser testado:

* Caso o cadastro do banco no Bacen tenha sido feito com sucesso, ele retorna o número de registro do Banco


Agora, usando um mock com Mockito e definindo os comportamentos da classe Bacen para o caso de sucesso e o de falha, além do cenário de sucesso, implemente o cenário abaixo.

* Caso o cadastro do banco no Bacen tenha dado algum problema, a exceção BancoNaoCadastradoException do tipo RuntimeException deve ser retornada. Use o assertThrows para isso.





# Exercício CRUD - nova funcionalidade com testes
Este exercício tem o objetivo de identificar habilidades relacionadas a requisições HTTP, arquitetura REST, uso de API's para persistência de dados

## Instruções para o seu código

Para rodar local basta executar

```
docker-compose up --build
```

Acessar http://localhost:8080/api/ola

Para parar o container

```
docker-compose down
```

### pacote DOMAIN.model
A sua classe de domain Auno deve ser:

* Criar aluno com id (auto gerado), nome (not null) e email;
* Usar anotações do JPA para fazer o mapeamento

### pacote DOMAIN.repository
A sua classe de repository AlunoRepository deve ser:

* estender a interface JpaRepository
> https://docs.spring.io/spring-data/data-jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html

### pacote APPLICATION.controller
A sua classe de controller AlunoController deve ser:

* Ter o método find, list, save, update e delete.
* find deve buscar por um aluno específico recebendo o ID no path param - GET
  * retornar 200 como status code
* list deve listar todos os alunos - GET
  * retornar 200 como status code
* save deve salvar um novo aluno - POST
  * retornar 201 como status code
* put deve atualizar todos os atributos de um aluno recebendo o ID no path param - PUT
  * retornar 200 como status code
* delete deve remover um aluno - DELETE
  * retornar 200 como status code

> Atenção no método FIND, caso não exista um aluno o valor retornado deve ser 404. Já no mesmo LIST, deve retornar uma colleção vazia com o status code 200.


## Instruções para o testes

### pacote application.controller

Criar uma classe de testes AlunoControllerTest e fazer os testes de API (e2e). 
* Teste apenas o cenário de POST de Aluno
* Use a classe HelloControllerTest como modelo.

> dica, utiliza o método .body(BodyInserters.fromValue()) para fazer o parser do objeto para Json
> 
> https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/reactive/function/client/WebClient.RequestBodySpec.html#body(java.lang.Object,java.lang.Class)
> 
> https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/reactive/function/BodyInserters.html#fromValue(T)
>



# Sugestões

Implementar os meus casos com JavaScript

* Jasmine, Karma, Mocha

Implementar os meus casos com Python

* pytest

