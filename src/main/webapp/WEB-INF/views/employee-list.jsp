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
</head>
<body>
	<div class="container">
		<c:set var="message" scope="request"><%=request.getParameter("message") != null
						&& "employeecreated".equalsIgnoreCase(request.getParameter("message"))%>
		</c:set>
		<c:if test="${message}">
			<div class="alert alert-success alert-dismissible fade show"
				role="alert">
				Çalışan kaydı başarılı!
				<button class="close" type="button" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">x</span>
				</button>
			</div>
		</c:if>

		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Ad</th>
					<th>Soyad</th>
					<th>Cinsiyet</th>
					<th>Maaş</th>
					<th>İşlemler</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${employees}" var="employee">
					<tr>
						<td>${employee.id}</td>
						<td>${employee.name}</td>
						<td>${employee.surname}</td>
						<td>${employee.gender}</td>
						<td>${employee.salary}</td>
						<td><a class="btn btn-danger"
							href="/employee/delete/${employee.uuid}">Sil</a> <a
							class="btn btn-info" href="/employee/edit/${employee.uuid}">Düzenle</a>
						</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>