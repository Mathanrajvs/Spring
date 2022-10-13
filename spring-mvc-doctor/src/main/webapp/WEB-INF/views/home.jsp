<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align:right">
<a href="adminview">Admin</a><br>
</div>
<h2>All Doctors</h2>
${doctors}
<hr>
<form action="search-doctor">
<select name="choice">
<option value="Cardiology">Cardiology</option>
<option value="Orthopeadician">Orthopeadician</option>
<option value="General Physician">General Physician</option>
<option value="Diabetician">Diabetician</option>
</select>
<input type="submit" value="submit">
</form>
</body>
</html>