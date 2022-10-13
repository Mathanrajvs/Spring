package com.doctor.dao;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.doctor.model.Doctor;
import com.doctor.util.DoctorMapper;
import com.doctor.util.Queries;

 @Repository
public class DoctorDaoImpl implements IDoctorDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addDoctor(Doctor doctor) {
		Object[] doctorArray = { doctor.getDoctorName(), doctor.getSpeciality(), doctor.getFees(),
				doctor.getExperience(), Timestamp.valueOf(doctor.getStartTime()),
				Timestamp.valueOf(doctor.getEndTime()) };
		jdbcTemplate.update(Queries.INSERTQUERY, doctorArray);
		
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		jdbcTemplate.update(Queries.UPDATEQUERY,fees,doctorId);		
	}

	@Override
	public Doctor findById(int doctorId) {
		Doctor ndoctor=jdbcTemplate.queryForObject(Queries.FINDQUERY, (rs,rowNum)->{
			Doctor doctor=new Doctor();
			doctor.setDoctorId(rs.getInt("doctorId"));
			doctor.setDoctorName(rs.getString("doctorName"));
			doctor.setSpeciality(rs.getString("speciality"));
			doctor.setFees(rs.getDouble("fees"));
			doctor.setExperience(rs.getInt("experience"));
			doctor.setStartTime(rs.getTimestamp("startTime").toLocalDateTime());
			doctor.setEndTime(rs.getTimestamp("endTime").toLocalDateTime());
			return doctor;
		},doctorId);
		return ndoctor;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		jdbcTemplate.update(Queries.DELETEQUERY,doctorId);
	}

	@Override
	public List<Doctor> findAllDoctors() {
		RowMapper<Doctor> mapper=new DoctorMapper();
		
		List<Doctor> doctors=jdbcTemplate.query(Queries.SELECTQUERY, mapper);
		return doctors;
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) {
		List<Doctor> doctors=jdbcTemplate.query(Queries.SPECIALITYQUERY,new DoctorMapper(),speciality);
		return doctors;
	}

	@Override
	public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
		List<Doctor> doctors=jdbcTemplate.query(Queries.SPECIALITYANDEXPERIENCEQUERY,new DoctorMapper(),speciality,experience);
		return doctors;
	}

	@Override
	public List<Doctor> findBySpecialityAndFees(String speciality, double fees) {
		List<Doctor> doctors=jdbcTemplate.query(Queries.SPECIALITYANDFEESQUERY,new DoctorMapper(),speciality,fees);
		return doctors;
	}

	@Override
	public List<Doctor> findByAvailailabilty(LocalDateTime startTime) {
		List<Doctor> doctors=jdbcTemplate.query(Queries.TIMEBETWEENQUERY,new DoctorMapper(),startTime);
		return doctors;
	}
	


}
