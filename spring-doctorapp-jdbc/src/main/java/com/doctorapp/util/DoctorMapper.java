package com.doctorapp.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.doctorapp.model.Doctor;

public class DoctorMapper implements RowMapper<Doctor> {

	@Override
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {

		Doctor doctor=new Doctor();
		doctor.setDoctotId(rs.getInt("doctorId"));
		doctor.setDoctName(rs.getString("doctorName"));
		doctor.setSpeciality(rs.getString("speciality"));
		doctor.setFees(rs.getDouble("fees"));
		doctor.setExperience(rs.getInt("experience"));
		doctor.setStartTime(rs.getTimestamp("startTime").toLocalDateTime());
		doctor.setEndTime(rs.getTimestamp("endTime").toLocalDateTime());
		return doctor;
	}

}
