# Atividade-Roteiro-1---DAC

* **Saber identificar as características de uma image e container Docker.**<br>
R: As imagens são templates que precisam ser baixados para usar um container docker que vai instanciar essa imagem, o container vai utilizar a imagem como um template da mesma, como por exemplo um banco de dados como o postgres ou o SO linux Ubuntu.

* **Possuir um overview sobre os principais comandos e customizações.**<br>
R: <br>
`docker info:` nós utilizamos esse comando para verificarmos as informações do nosso Docker Host <br>
`docker version:` Com o version nós conseguimos ver a versão do nosso Client <br>
`docker images:` Nós utilizamos ele para listarmos as imagens que nós temos no nosso hos <br>
`docker search (parametro):` Para que possamos procurar uma imagem, nós podemos utilizar o comando com o parâmetro nome Ex.: ubuntu, dotnetcore, node … <br>
`docker pull (parametro):`é necessário utilizar esse comando para baixar a imagem para utilizarmos na nossa aplicação <br>
`docker ps -a:` teremos uma list de todos os nossos containers no host <br>
`docker stats (id ou apelido do container):`Para que possamos ter informações sobre um container  <br>
`docker rmi (nome da imagem):`Para deletar uma imagem se utiliza esse comando <br>
Entre outros comandos que existem, esses são muito utilizados.<br>

* **Propor estratégias para manutenção de um sistema fazendo uso de containers.**<br>
R: Como o container é um ambiente isolado e de fácil portabilidade é lógico notar que a manutenção de um sistema utilizando conatiners seja de grande eficácia por ser isolado e pela portabilidade de utilizar em outros ambientes sem comprometer nada.

* **Principais vantagens do uso de containers.** <br>
R: O uso de containers tem muito a favorecer o desenvolvimento de aplicações, é uma ferramenta que isola um ambiente e com isso não vai ter nenhuma interferência de algo exterior, também traz uma escalabilidade nos sistemas. Além de uma portabilidade que pode fazer com que seja utilizado facilmente em outros ambientes, o fato de cada aplicação poder ter um ambieente isolado se torna uma forma de segurança, se um for atacado, os outros não estarão comprometidos e levando em conta também o isolamento de falhas, que não estará em todo o sistema. 

* **Execute e explique a execução dos seguintes comandos:**<br><br>
a. docker container run tomcat: O comando docker run vai criar um container com uma imagem, e o TomCat é usado para construir e executar aplicativos de forma a não comprometer a estabilidade do servidor.<br><br>
b. docker container ls: esse comando faz a listagem dos containers.<br><br>
c. docker image ls: esse comando faz a listagem das imagens.

* **Dificuldades enfrentadas e como está o projeto:**<br><br>
R: Nunca tinha utilizado um framework em java, e percebi que o Spring facilita muito a vida de um Programador java, 
fiz uma aplicação com um bacno de dados que ja vem no pacote java, banco de daods local chamado H2, para fazer a sua
conexão utilizamos o arquivo `application.properties`
<br><br>`spring.datasource.url=jdbc:h2:mem:testdb`<br>
`spring.datasource.username=sa`<br>
`spring.datasource.password= `<br><br>
R: Assim como ele ja é pré-configurado no mesmo arquivo.
para acessar o banco com a aplicação rodando você pode colocar a url `localhost:8080/h2-console` e então colocar a url e user acima!
No arquivo `import.sql`, temos exemplos da aplicação em sql que assim que for restartado a aplicação ela irá executar e colocar no banco.<br><br>
`Atividade-Roteiro-1---DAC/src/main/java/com/kaueDAC/UserDept/controllers/UserController.java`<br>
R: Neste arquivo temos o controller que pode ser utilizado no Postman e Insomnia para inserir, buscar e buscar pelo o id um usuário
com as url `localhost:8080/users` `localhost:8080/users/id` e `localhost:8080/users` com método POST.<br><br>
R:Os modelos de departamento e de Usuários está no arquivo entities.
na web para demonstrar o usuários inseridos basta a url `localhost:8080/users`.
