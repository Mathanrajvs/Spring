package com.doctor.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.dao.IDoctorDao;
import com.doctor.exceptions.DoctorNotFoundException;
import com.doctor.exceptions.IdNotFoundException;
import com.doctor.model.Doctor;
@Service
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	IDoctorDao iDoctorDao ;

	public DoctorServiceImpl(IDoctorDao iDoctorDao) {
		super();
		this.iDoctorDao = iDoctorDao;
	}

	@Override
	public void addDoctor(Doctor doctor) {
		iDoctorDao.addDoctor(doctor);
		
	}

	@Override
	public void updateDoctor(int doctorId, double fees) throws DoctorNotFoundException {
		iDoctorDao.updateDoctor(doctorId, fees);
	}

	@Override
	public Doctor getById(int doctorId) throws IdNotFoundException {
		return iDoctorDao.findById(doctorId);
	}

	@Override
	public void deleteDoctor(int doctorId) throws DoctorNotFoundException {
		iDoctorDao.deleteDoctor(doctorId);
		
	}

	@Override
	public List<Doctor> getAllDoctors() throws DoctorNotFoundException {
		List<Doctor> doctors=iDoctorDao.findAllDoctors();
		if(doctors.isEmpty()) {
			throw new DoctorNotFoundException("DOCTORS ARE NOT FOUND");
		}
		return doctors;
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
		List<Doctor> doctors=iDoctorDao.findBySpeciality(speciality);
		if(doctors.isEmpty()) {
			throw new DoctorNotFoundException("SPECIALITY IS NOT FOUND");
		}
		
		
		return doctors;
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		List<Doctor> doctors=iDoctorDao.findBySpecialityAndExp(speciality, experience);
		if(doctors.isEmpty()) {
			throw new DoctorNotFoundException("SPECIALITY AND EXPERIENCED DOCTOR IS NOT FOUND");
		}
		
		
		return doctors;
	}

	@Override
	public List<Doctor> getBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		List<Doctor> doctors=iDoctorDao.findBySpecialityAndFees(speciality, fees);
		if(doctors.isEmpty()) {
			throw new DoctorNotFoundException("SPECIALITY AND FEES IS NOT FOUND");
		}
		return doctors;
	}

	@Override
	public List<Doctor> getByAvailailabilty(LocalDateTime startTime) throws DoctorNotFoundException {
		List<Doctor> doctors=iDoctorDao.findByAvailailabilty(startTime);
		if(doctors.isEmpty()) {
			throw new DoctorNotFoundException("DOCTOR IS NOT AVAILABLE");
		}
		return doctors;
	}

}
