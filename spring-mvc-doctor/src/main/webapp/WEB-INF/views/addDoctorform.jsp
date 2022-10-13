<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="add-doctor">
		<table>
			<tr>
				<th><label>Doctor name:</label></th>
				<td><input type="text" name="doctorName"></td>
			</tr>
			<tr>
				<th><label>Doctor ID:</label></th>
				<td><input type="number" name="doctorId"></td>
			</tr>
			<tr>
				<th><label>Speciality:</label></th>
				<td><input type="radio" name="speciality" value="Cardiology">
					<label>Cardiology</label> 
					<input type="radio" name="speciality" value="Orthopeadician"> 
					<label>Orthopeadician</label> 
					<input type="radio" name="speciality" value="General Physician"> 
					<label>General Physician</label> 
					<input type="radio" name="speciality" value="Diabetician"> 
					<label>Diabetician</label> 
					<input type="radio" name="speciality" value="Pediatrician"> <label>Pediatrician</label></td>
			</tr>
			<tr>
				<th><label>Fees:</label></th>
				<td><input type="number" name="fees"></td>
			</tr>
			<tr>
				<th><label>Doctor Experience:</label></th>
				<td><input type="number" name="experience"></td>
			</tr>
			<tr>
				<th><label>Doctor Start Time:</label></th>
				<td><input type="datetime-local" name="startTime"></td>
			</tr>
			<tr>
				<th><label>Doctor End Time:</label></th>
				<td><input type="datetime-local" name="endTime"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Doctor"></td>
			</tr>
		</table>
	</form>
</body>
</html>