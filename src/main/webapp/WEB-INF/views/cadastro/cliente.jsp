<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cliente - Cadastro</title>

<link href="/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<spring:url value="/cadastracliente/cliente" var="cadastra"/>
	<spring:url value="/cadastracliente/atualiza" var="atualiza"/>
	<spring:url value="/cadastracliente/deleta" var="deleta"/>

	<jsp:include page="../universal/cabecalho.jsp"></jsp:include>	

	<div class="container">
	
		<h1>Cadastro Cliente</h1>
		
		<form:form modelAttribute="cliente" action="${cadastra}">
		
			<input type="hidden" name="clienteId" id="clienteId" value="${cliente.clienteId}"/>
			
			<div class="form-group">
				<label for="cpf">CPF</label>
				<input type="text" name="cpf" id="cpf" value="${cliente.cpf}" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="nomeCliente">Nome Cliente</label>
				<input type="text" name="nomeCliente" id="nomeCliente" value="${cliente.nomeCliente}" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="rua">Rua</label>
				<input type="text" name="rua" id="rua" value="${cliente.rua}" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="numeroCasa">N° Casa</label>
				<input type="text" name="numeroCasa" id="numeroCasa" value="${cliente.numeroCasa}" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="cidade">Cidade</label>
				<input type="text" name="cidade" id="cidade" value="${cliente.cidade}" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="teletone">Telefone</label>
				<input type="text" name="telefone" id="telefone" value="${cliente.telefone}" class="form-control">
			</div>
			
<!-- 			<div class="form-group"> -->
<!-- 				<label for="dataAgendamento">Data Agendamento</label> -->
<%-- 				<input type="date" name="dataAgendamento" id="dataAgendamento" value="${cliente.dataAgendamento}"> --%>
<!-- 			</div> -->
			
			<c:if test="${cliente.clienteId == '0'}">
				<button type="submit" class="btn btn-primary">Cadastrar</button>
			</c:if>
			<c:if test="${cliente.clienteId != '0'}">
				<button type="submit" class="btn btn-primary">Atualizar</button>
			</c:if>
			
			
			<c:if test="${cliente.clienteId == '0'}">
				<a href="/" class="btn btn-success">Voltar</a>
			</c:if>
			<c:if test="${cliente.clienteId != '0'}">
				<a href="/exame/novo" class="btn btn-success">Cancelar</a>
			</c:if>
		
		</form:form>
				
	</div>
	
	
	
	<script type="text/javascript" src="/js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript" src="/js/bootstrap.min.js"></script>
</body>
</html>