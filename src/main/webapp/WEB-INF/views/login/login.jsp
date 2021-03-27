<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Veterinaria Arca de Noé</title>

<link href="/css/login.css" rel="stylesheet">
<link href="/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<jsp:include page="../universal/cabecalho.jsp"></jsp:include>

<div class="container login-container">
    <div class="row">
    
    <form:form modelAttribute="login">
		
			<div class="form-group">
				<form:input path="login" cssClass="form-control"/>
			</div>
		</form:form>
		
        <div class="col-md-6 login-form-2">
            <h3>Login</h3>
            <form class="form-signin was-validated" action="/" method="POST">
            
<%--             <div th:if="${alerta != null}" th:class="${alerta == 'erro'} ? 'alert alert-danger' : 'alert alert-success'"  --%>
<!--             	 role="alert"> -->
<%--              <h4 th:text="${titulo}" class="alert-heading">Credenciais...</h4> --%>
<%--              <p text="${texto}">Login ou senha incorretos...</p> --%>
<!--              <hr> -->
<%--              <p class="mb-0"><small th:text="${subtexto}">Acesso permitido...</small></p> --%>
<!--             </div> -->
            
                <div class="form-group">
                    <input type="text" name="username" class="form-control" placeholder="Your username*" required autofocus/>
                </div>

                <div class="form-group">
                    <input required type="password" name="password" class="form-control" placeholder="Your Password *"/>
                </div>

                <div class="form-group">
                    <input type="submit" href="/login/novo" class="btnSubmit" value="Login" />
                </div>
                <div class="form-group"> 
                    <input type="submit" class="btnSubmit" value="Cadastrar" />
                </div>
            </form>
        </div>
    </div>
</div>

	<script type="text/javascript" src="/js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript" src="/js/bootstrap.min.js"></script>
	
</body>
</html>