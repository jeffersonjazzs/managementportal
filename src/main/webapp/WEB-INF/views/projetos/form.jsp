<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>Management Project</title>
    </head>
<body>

<form:form action="/managementportal/projetos" method="POST" commandName="projeto">
       <div>
        <label>Nome</label>
        <input type="text" name="nome" />
         <form:errors path="nome" />
    </div>
    <div>
        <label>Descrição</label>
        <input type="text" name="descricao" />
    </div>
    <div>
        <label>Prioridade</label>
        <input type="text" name="prioridade" />
    </div>
    <div>
        <label>Proprietario</label>
        <input type="text" name="proprietario" />
        <form:errors path="proprietario" />
    </div>
    <div>
        <label>Gestor</label>
        <input type="text" name="gestor" />
        <form:errors path="gestor" />
    </div>
    <div>
        <label>Aprovado</label>
        <input type="text" name="aprovado" />
    </div>
    <div>
        <label>Custo</label>
        <input type="text" name="custo" />
    </div>
    <div>
        <label>Data de inicio</label>
        <input type="text" name="datainicio" />
    </div>
    <div>
        <label>Data do termino</label>
        <input type="text" name="datafim" />
    </div>
    <button type="submit">Cadastrar</button>
</form:form>
 
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

</body>
</html>