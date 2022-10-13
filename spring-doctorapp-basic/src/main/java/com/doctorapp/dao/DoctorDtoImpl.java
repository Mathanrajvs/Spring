package com.doctorapp.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DoctorDetails;

/**
 * @author MathanRajS
 *
 */
@Component
public class DoctorDtoImpl implements IDoctorDto {
	@Autowired
	DoctorDetails doctorDetails;
	@Override
	public Doctor findById(int doctorId) {
		return doctorDetails.getDoctors().stream().filter((doctor)->doctor.getDoctotId()==doctorId).findFirst().orElseThrow(()->new DoctorNotFoundException("not found"));
	}

	@Override
	public List<Doctor> findAllDoctors() {
		return doctorDetails.getDoctors();
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) {
		return doctorDetails.getDoctors().stream().filter((doctor)->doctor.getSpeciality().equalsIgnoreCase(speciality)).collect(Collectors.toList());
	}

	@Override
	public List<Doctor> findBySpecialityAndFees(String speciality, double fees) {
		return doctorDetails.getDoctors().stream().filter((doctor)->doctor.getSpeciality().equalsIgnoreCase(speciality)&&doctor.getFees()<fees).collect(Collectors.toList());
	}

	@Override
	public List<Doctor> findBySpecialityName(String speciality,String name) {
		return doctorDetails.getDoctors().stream().filter((doctor)->doctor.getSpeciality().equalsIgnoreCase(speciality)&&doctor.getDoctName().equalsIgnoreCase(name)).collect(Collectors.toList());
	}



	
}
