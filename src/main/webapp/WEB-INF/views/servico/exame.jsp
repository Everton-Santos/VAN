<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exames</title>

<link href="/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<spring:url value="/cadastracliente/atualiza" var="atualiza"/>
	<spring:url value="/cadastracliente/deleta" var="deleta"/>

	<jsp:include page="../universal/cabecalho.jsp"></jsp:include>	

	<div class="container">
	
		<h1>Exames em Andamento</h1>
		
		
		<c:if test="${not empty Exame}">
		
		
			<table class="table">
			
				<tr>
					<th>CPF</th>
					<th>Nome Cliente</th>
					<th>Animal</th>
					<th>Espécie</th>
					<th>Data Consulta</th>
					<th>Atualizar</th>
					<th>Deletar</th>
				</tr>
					<c:forEach var="cadastraCliente" items="${Exame}">
					
						<tr>
							<td>${cadastraCliente.cpf} </td>
							<td>${cadastraCliente.nomeCliente}</td>
							<td>${cadastraCliente.nomeAnimal}</td>
							<td>${cadastraCliente.especieAnimal}</td>
							<td>${cadastraCliente.dataAgendamento}</td>
							<td><a href="${atualiza}/${cadastraCliente.clienteId}" class="btn btn-success">Atualizar</a></td>
							<td><a href="${deleta}/${cadastraCliente.clienteId}" class="btn btn-danger">Deletar</a></td>
						</tr>
				
					</c:forEach>
						
			</table>
		
		</c:if>
		
		
	
		
				
	</div>
	
	
	<script type="text/javascript" src="/js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript" src="/js/bootstrap.min.js"></script>
</body>
</html>