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
	.center {
		margin: auto;
		width: 50%;
		padding: 10px;
	}
</style>
</head>
<body>
	<div class="container">

		<div class="row">
			<div class="col-md-5 center" >
				<form action="/user/create"  method="post">
					<fieldset>
						<p class="text-uppercase pull-center"> KAYIT OL</p>
						<div class="form-group">
							<input type="text" name="name" id="name" class="form-control input-lg" placeholder="İsim">
						</div>

						<div class="form-group">
							<input type="text" name="surname" id="surname" class="form-control input-lg" placeholder="Soyisim">
						</div>

						<div class="form-group">
							<input type="email" name="email" id="email" class="form-control input-lg" placeholder="Mail Adres">
						</div>
						<div class="form-group">
							<input type="password" name="password" id="password" class="form-control input-lg" placeholder="Parola">
						</div>
						<div>
							<input type="submit" class="btn btn-primary btn-block"   value="Kaydet"/>
						</div>

					</fieldset>
				</form>
			</div>
		</div>
	</div>
</body>
</html>