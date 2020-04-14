<<<<<<< HEAD
# managementportaltest

test
=======
<h1 align="center">
    <img alt="Management Portal" title="MP" src="img-git_mp.svg" width="50px" />
     Management Portal - Sistema de Gestão de Colaboradores

  <a href="#tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#executando">Executando o Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#contribuição">Contribuição</a>&nbsp;&nbsp;&nbsp;
  
</h1>

## Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- [Java EE](https://www.oracle.com/java/technologies/java-ee-glance.html)
- [Spring](https://spring.io/)
- [Database H2](https://www.h2database.com/html/main.html)
- [Bootstrap](https://getbootstrap.com/)
- [JBoss Forge](https://forge.jboss.org/)
- [Apache Tomcat](http://tomcat.apache.org/)

## 💻 Projeto

O Management Portal é um sistema que visa realizar o gerenciamento de projetos agil entre colaboradores de uma organização.


Requisitos Não Funcionais:
-	Projeto com Back-end Java Web com SpringMVC
-	Projeto com Front-end JavaServer Pages (JSP) e Boostrap
-	Projeto com DB H2 run-time

Requisitos Funcionais:
-	Cadastro de usuários
-	Cadastro de departamento
-	Cadastro de projetos
-	Relação projeto X gestor
-	Página inicial listagem com paginação
-	Não excluir registros com relacionamentos anteriores


Construção:

- Apos a descompactação iniciando o Jboos Forge: `C:\Users\Razor\Downloads\forge\bin>forge`;
- Criando o projeto: `[bin]$ project-new --named managementportal`;
- Movendo o projeto para o eclipse workspace: `C:\Users\Razor\Downloads\forge\bin>robocopy C:\Users\Razor\Downloads\forge\bin\managementportal C:\Users\Razor\eclipse-workspac
e\managementportal /MIR`;


## Executando





## Contribuição

- Primeiro faça um fork desse repositório;
- Crie uma branch com a sua feature: `git checkout -b minhafeature`;
- Faça commit das suas alterações: `git commit -m 'feat: Nova feature'`;
- Faça push para a sua branch: `git push origin minhafeature`.

Depois que o merge da sua pull request for feito, você pode deletar a sua branch.
>>>>>>> branch 'master' of https://github.com/jeffersonjazzs/managementportal.git
