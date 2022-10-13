package com.doctorapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctorapp.service.IDoctorService;

@SpringBootApplication
public class SpringDoctorappBasicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorappBasicApplication.class, args);
	}
	@Autowired
	IDoctorService doctorService;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("All Doctors : ");
		System.out.println(doctorService.getAllDoctors());
		System.out.println("Doctor By ID : ");
		System.out.println(doctorService.getById(1));
		System.out.println("Doctor By Speciality : ");
		System.out.println(doctorService.getBySpeciality("Cardiology"));
		System.out.println("Doctor By Speciality and Fees : ");
		System.out.println(doctorService.getBySpecialityAndFees("Cardiology", 1000));
		System.out.println("Doctor By Speciality and Name : ");
		System.out.println(doctorService.getBySpecialityName("Cardiology", "Rani"));
		
	}

}
