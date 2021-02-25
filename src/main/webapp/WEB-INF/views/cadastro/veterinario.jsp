<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Veterinário - Cadastro</title>

<link href="/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<spring:url value="/cadastraveterinario/veterinario" var="cadastra" />
	<spring:url value="/cadastraveterinario/atualiza" var="atualiza"/>
	<spring:url value="/cadastraveterinario/deleta" var="deleta"/>

	<jsp:include page="../universal/cabecalho.jsp"></jsp:include>	

	<div class="container">
	
		<h1>Cadastro Veterinário</h1>
		
		<form:form modelAttribute="veterinario" action="${cadastra}">
			
			
		
			<div class="form-group">
				<label for="crmv">CRMV</label>
				<input type="text" name="crmv" id="crmv" value="${veterinario.crmv}" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="nomeVeterinario">Nome Veterinário</label>
				<input type="text" name="nomeVeterinario" id="nomeVeterinario" value="${veterinario.nomeVeterinario}" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="rua">Rua</label>
				<input type="text" name="rua" id="rua" value="${veterinario.rua}" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="numeroCasa">N° Casa</label>
				<input type="text" name="numeroCasa" id="numeroCasa" value="${veterinario.numeroCasa}" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="cidade">Cidade</label>
				<input type="text" name="cidade" id="cidade" value="${veterinario.cidade}" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="telefone">Telefone</label>
				<input type="text" name="telefone" id="telefone" value="${veterinario.telefone}" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="especialidades">Especialidades</label>
				<input type="text" name="especialidades" id="especialidades" value="${veterinario.especialidades}" class="form-control">
			</div>
			
			
			<c:if test="${veterinario.veterinarioId == '0'}">
				<button type="submit" class="btn btn-primary">Cadastrar</button>
			</c:if>
			<c:if test="${veterinario.veterinarioId != '0'}">
				<button type="submit" class="btn btn-primary">Atualizar</button>
			</c:if>
			
			
			<c:if test="${veterinario.veterinarioId == '0'}">
				<a href="/" class="btn btn-success">Voltar</a>
			</c:if>
			<c:if test="${veterinario.veterinarioId != '0'}">
				<a href="/exame/novo" class="btn btn-success">Cancelar</a>
			</c:if>
			
			
		</form:form>
				
	</div>
	
	
	<spring:url value="/cadastraveterinario/atualiza" var="atualiza"/>
	<spring:url value="/cadastraveterinario/deleta" var="deleta"/>
	
	<div class="container">
		<h1>Veterinários Cadastrados</h1>
		
		<c:if test="${not empty Veterinario}">
		
			<table class="table">
			
				<tr>
					<th>CRMV</th>
					<th>Nome Veterinário</th>
					<th>Especialidades</th>
					<th>Atualizar</th>
					<th>Deletar</th>
				</tr>
					<c:forEach var="cadastraVeterinario" items="${Veterinario}">
					
						<tr>
							<td>${cadastraVeterinario.crmv} </td>
							<td>${cadastraVeterinario.nomeVeterinario}</td>
							<td>${cadastraVeterinario.especialidades}</td>
							<td><a href="${atualiza}/${cadastraVeterinario.veterinarioId}" class="btn btn-success">Atualizar</a></td>
							<td><a href="${deleta}/${cadastraVeterinario.veterinarioId}" class="btn btn-danger">Deletar</a></td>
						</tr>
				
					</c:forEach>
						
			</table>
		
		</c:if>
			
	</div>
	
	
	
	<script type="text/javascript" src="/js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript" src="/js/bootstrap.min.js"></script>
</body>
</html>