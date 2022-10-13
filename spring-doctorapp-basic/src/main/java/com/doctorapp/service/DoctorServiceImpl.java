package com.doctorapp.service;

import java.util.List;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorapp.dao.DoctorDtoImpl;
import com.doctorapp.dao.IDoctorDto;
import com.doctorapp.model.Doctor;
@Service
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	IDoctorDto iDoctorDto;

	@Override
	public Doctor getById(int doctorId) {
		
		return iDoctorDto.findById(doctorId);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		return iDoctorDto.findAllDoctors();
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) {
		return iDoctorDto.findBySpeciality(speciality);
	}

	@Override
	public List<Doctor> getBySpecialityAndFees(String speciality, double fees) {
		return iDoctorDto.findBySpecialityAndFees(speciality, fees);
	}

	@Override
	public List<Doctor> getBySpecialityName(String speciality,String name) {
		return iDoctorDto.findBySpecialityName(speciality,name);
	}


}
