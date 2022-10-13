<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="update-doctor">
		<table>
			<tr>
				<th><label>Doctor name:</label></th>
				<td><input type="text" name="doctorName" value="${doctor.doctorName}" readonly/></td>
			</tr>
			<tr>
				<th><label>Doctor ID:</label></th>
				<td><input type="number" name="doctorId" value="${doctor.doctorId}" readonly/></td>
			</tr>
			<tr>
				<th><label>Speciality:</label></th>
				<td><input type="text" name="speciality"value="${doctor.speciality}" readonly/></td>
			</tr>
			<tr>
				<th><label>Fees:</label></th>
				<td><input type="number" name="fees" value="${doctor.fees}"/></td>
			</tr>
			<tr>
				<th><label>Doctor Experience:</label></th>
				<td><input type="number" name=" experience" value="${doctor.experience}" readonly/></td>
			</tr>
			<tr>
				<th><label>Doctor Start Time:</label></th>
				<td><input type="datetime-local" name="startTime"value="${doctor.startTime}" readonly/></td>
			</tr>
			<tr>
				<th><label>Doctor End Time:</label></th>
				<td><input type="datetime-local" name="endTime" value="${doctor.endTime}" readonly/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update Doctor"></td>
			</tr>
		</table>
	</form>
</body>
</html>