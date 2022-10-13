package com.doctorapp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctorapp.model.Doctor;
import com.doctorapp.model.Specialization;
import com.doctorapp.service.DoctorService;

@SpringBootApplication
public class SpringDoctorappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorappJdbcApplication.class, args);
	}
@Autowired
DoctorService doctorService;


	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);

		LocalDate dateLocalStart = LocalDate.parse("2022-10-10", DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		LocalTime timeLocalStart = LocalTime.parse("09:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));

		LocalDate dateLocalEnd = LocalDate.parse("2022-10-10", DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		LocalTime timeLocalEnd = LocalTime.parse("17:00:00", DateTimeFormatter.ofPattern("HH:mm:ss"));


		LocalDateTime startTime = LocalDateTime.of(dateLocalStart,timeLocalStart);
		LocalDateTime endTime = LocalDateTime.of(dateLocalEnd,timeLocalEnd);

		Doctor doctor=new Doctor("Mathan",121,Specialization.ORTHO.type,1000,5,startTime,endTime);
		//doctorService.addDoctor(doctor);
		System.out.println("Update....");
		doctorService.updateDoctor(12, 200);

		System.out.println("Doctor By ID : ");
		System.out.println(doctorService.getById(13));
		System.out.println("Delete....");
		doctorService.deleteDoctor(11);
		System.out.println("All Doctors : ");
		System.out.println(doctorService.getAllDoctors());
		System.out.println("Doctor By Speciality : ");
		System.out.println(doctorService.getBySpeciality("Cardiology"));
		System.out.println("Doctor By Speciality and Fees : ");
		System.out.println(doctorService.getBySpecialityAndFees("Cardiology", 2000));
		System.out.println("Doctor By Speciality and Experience : ");
		System.out.println(doctorService.getBySpecialityAndExp("Cardiology", 2));
		System.out.println("Show Availability time : ");
		System.out.println(doctorService.getByAvailailabilty(startTime));
		
		
	}

}
