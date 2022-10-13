package com.doctor.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.doctor.model.Doctor;

public class DoctorMapper implements RowMapper<Doctor> {

	@Override
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {

		Doctor doctor=new Doctor();
		doctor.setDoctorId(rs.getInt("doctorId"));
		doctor.setDoctorName(rs.getString("doctorName"));
		doctor.setSpeciality(rs.getString("speciality"));
		doctor.setFees(rs.getDouble("fees"));
		doctor.setExperience(rs.getInt("experience"));
		doctor.setStartTime(rs.getTimestamp("startTime").toLocalDateTime());
		doctor.setEndTime(rs.getTimestamp("endTime").toLocalDateTime());
		return doctor;
	}

}
