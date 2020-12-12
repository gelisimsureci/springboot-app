<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<form action="/employee/update/${employee.uuid}" method="post">
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="name">Ad</label> <input type="text"
						value="${employee.name}" class="form-control" id="name"
						name="name" placeholder="Ad">
				</div>
				<div class="form-group col-md-6">
					<label for="surname">Soyad</label> <input type="text"
						value="${employee.surname}" class="form-control" id="surname"
						name="surname" placeholder="Soyad">
				</div>
			</div>
			<div class="form-group">
				<label for="address">Adres</label> <input type="text"
					value="${employee.address}" class="form-control" id="address"
					name="address" placeholder="Tuzla/Ist">
			</div>
			<div class="form-row">
				<div class="form-group col-md-4">
					<label for="gender">Cinsiyet</label> <select id="gender"
						name="gender" class="form-control">
						<option disabled selected>Seciniz...</option>
						<option value="Kadin"
							${employee.gender eq 'Kadin' ? 'selected' : '' }>Kadin</option>
						<option value="Erkek"
							${employee.gender eq 'Erkek' ? 'selected' : '' }>Erkek</option>
					</select>
				</div>
				<div class="form-group col-md-4">
					<label for="salary">Maaş</label> <input type="number"
						value="${employee.salary}" class="form-control" id="salary"
						name="salary" placeholder="Maaş">
				</div>
			</div>
			<input type="submit" class="btn btn-primary" value="Güncelle">
		</form>
	</div>
</body>
</html>