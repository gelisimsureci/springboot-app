<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<style>
.login-form {
	width: 340px;
	margin: 50px auto;
	font-size: 15px;
}

.login-form form {
	margin-bottom: 15px;
	background: #f7f7f7;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}

.login-form h2 {
	margin: 0 0 15px;
}

.form-control, .btn {
	min-height: 38px;
	border-radius: 2px;
}

.btn {
	font-size: 15px;
	font-weight: bold;
}
</style>
</head>
<body>
	<div class="container">
		<div class="login-form">
			<form action="/examples/actions/confirmation.php" method="post">
				<h2 class="text-center">Kullanıcı Giriş</h2>
				<div class="form-group">
					<input type="text" class="form-control" placeholder="E-Posta"
						required>
				</div>
				<div class="form-group">
					<input type="password" class="form-control" placeholder="Parola"
						required>
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary btn-block">Giriş</button>
				</div>
				<div class="clearfix">
					<a href="#" class="float-right">Şifreni mi Unuttun?</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>