Sistema de Cadastro de Funcionários - CRUD

Primeiro crud sozinho sem seguir vídeos ou tutorial da internet

Tecnologias utilizadas:

Spring boot
Html5 + Thymeleaf
MySQL

Desenvolvi esse sistema da seguinte forma:

Separei as classes por pacotes (Entities, Controllers, Repositories, Services).

No pacote de entidade implementei a classe Funcionario, e fiz o mapeamento JPA,
para criar uma tabela no banco de dados.

Em seguida criei a interface FuncionarioRepositorio extendendo o JPARepository,
para usar os métodos que utilizei para realizar o crud.

Após isso criei a interface FuncionarioService, e implementei os métodos
findAll()
Save()
getById()
deleteByI()

Em seguida criei uma classe FuncionarioServiceImpl, implementando a interface FuncionarioService,
e assim implemntar os métodos que irei utilizar no controller.

Enfim criei a classe de FuncionarioController para implementar os métodos que vão ser
resposáveis para mandar e receber as requisições do front.

No front, usei um modelo Html5, com bootstrap e para interagir com o back 
usei o Thymeleaf.


