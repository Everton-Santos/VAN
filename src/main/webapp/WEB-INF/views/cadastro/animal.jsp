<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Animal - Cadastro</title>

<link href="/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<spring:url value="/cadastraanimal/animal" var="cadastra" />
	<spring:url value="/cadastraanimal/atualiza" var="atualiza"/>
	<spring:url value="/cadastraanimal/deleta" var="deleta"/>

	<jsp:include page="../universal/cabecalho.jsp"></jsp:include>	

	<div class="container">
	
		<h1>Cadastro Animal</h1>
		
		<form:form modelAttribute="cadastraanimal" action="${cadastra}">
		
		
		
			<div class="form-group">
				<label for="nomeAnimal">Nome</label>
				<input type="text" name="nomeAnimal" id="nomeAnimal" value="${cadastraanimal.nomeAnimal}" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="especieAnimal">Espécie</label>
				<input type="text" name=especieAnimal id="especieAnimal" value="${cadastraanimal.especieAnimal}" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="racaAnimal">Raça</label>
				<input type="text" name="racaAnimal" id="racaAnimal" value="${cadastraanimal.racaAnimal}" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="idadeAnimal">Idade</label>
				<input type="text" name="idadeAnimal" id="idadeAnimal" value="${cadastraanimal.idadeAnimal}" class="form-control">
			</div>
			
			
			
			<button type="submit" class="btn btn-primary">Cadastrar</button>
			
			<a href="/" class="btn btn-success">Voltar</a>
			
		</form:form>
		
		</div>
		
		
		<spring:url value="/cadastraanimal/atualiza" var="atualiza"/>
		<spring:url value="/cadastraanimal/deleta" var="deleta"/>
		
		<div class="container">
		<h1>Animais Cadastrados</h1>
		
		<c:if test="${not empty animal}">
		
			<table class="table">
			
				<tr>
					<th>Nome</th>
					<th>Espécie</th>
					<th>Raça</th>
					<th>Idade</th>
					<th>Atualizar</th>
					<th>Deletar</th>
				</tr>
					<c:forEach var="animal" items="${animal}">
					
						<tr>
							<td>${animal.nomeAnimal} </td>
							<td>${animal.especieAnimal}</td>
							<td>${animal.racaAnimal}</td>
							<td>${animal.idadeAnimal}</td>
							<td><a href="${atualiza}/${animal.animalId}" class="btn btn-success">Atualizar</a></td>
							<td><a href="${deleta}/${animal.animalId}" class="btn btn-danger">Deletar</a></td>
						</tr>
				
					</c:forEach>
						
			</table>
		
		</c:if>
		
		
				
	</div>
	
	
	<script type="text/javascript" src="/js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript" src="/js/bootstrap.min.js"></script>
</body>
</html>