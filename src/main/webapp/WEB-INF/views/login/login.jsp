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
            <form action="#" method="POST">
                <div class="form-group">
                    <input required type="text" name="username" class="form-control" placeholder="Your username*"/>
                </div>

                <div class="form-group">
                    <input required type="password" name="password" class="form-control" placeholder="Your Password *"/>
                </div>

                <div class="form-group">
                    <input type="submit" class="btnSubmit" value="Login" />
                </div>
            </form>
        </div>
    </div>
</div>

	<script type="text/javascript" src="/js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript" src="/js/bootstrap.min.js"></script>
	
</body>
</html>