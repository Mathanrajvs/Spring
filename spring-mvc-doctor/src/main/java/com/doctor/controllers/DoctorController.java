package com.doctor.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.doctor.exceptions.DoctorNotFoundException;
import com.doctor.exceptions.IdNotFoundException;
import com.doctor.model.Doctor;
import com.doctor.service.IDoctorService;

@Controller
public class DoctorController {
	@Autowired
	IDoctorService doctorService;
	@RequestMapping("/")
	public String getAll(Model model) {
		List<Doctor> doctors= doctorService.getAllDoctors();
			model.addAttribute("doctors",doctors);

		
		return "home";
	}
	public DoctorController(IDoctorService doctorService) {
		super();
		this.doctorService = doctorService;
	}

	@RequestMapping("/add-doctor")
	 public String addDoctor(Doctor doctor,Model model) {
		doctorService.addDoctor(doctor);
		model.addAttribute("doctor",doctor);
		return "success";
	}
	@RequestMapping("getOne")
	public String identifyDoctor(@RequestParam("updateId")int updateController,Model model) {
		Doctor doctor= doctorService.getById(updateController);
			model.addAttribute("doctor",doctor);
		return "updateform";
	}
	@RequestMapping("/search-doctor")
	public String searchDoctor(@RequestParam("choice")String choice,Model model) {
		List<Doctor> doctor= doctorService.getBySpeciality(choice);
		model.addAttribute("doctor",doctor);

		
		return "success";
	}
	@RequestMapping("/update-doctor")
	public String updateDoctor(@RequestParam("doctorId")int doctorId,@RequestParam("fees") double fees,Model model) {
		doctorService.updateDoctor(doctorId, fees);
		//	model.addAttribute("doctor",doctor);
		return "admin";
	}
// @RequestMapping("add-doctor")
// public String addDoctor(@RequestParam("name")String doctorName,
//		 @RequestParam("id")Integer doctorId,
//		 @RequestParam("speciality")String  speciality,
//		 @RequestParam("fees")double fees,
//		 @RequestParam("experience")int experience,
//		 @RequestParam("startTime")
// 		 @DateTimeFormat(iso=ISO.DATE_TIME)LocalDateTime startTime,
//// 		 String startTime,
//		 @RequestParam("endTime")
// 		 @DateTimeFormat(iso=ISO.DATE_TIME)LocalDateTime endTime
// //		 String endTime,
// 		 ,Model model
//		 ){
//	 Doctor doctor=new Doctor();
//	 doctor.setDoctorName(doctorName);
//	 doctor.setDoctorId(doctorId);
//	 doctor.setSpeciality(speciality);
//	 doctor.setFees(fees);
//	 
//	 doctor.setExperience(experience);
//	 doctor.setStartTime((startTime));
//	 doctor.setEndTime((endTime));
////	 doctor.setStartTime(LocalDateTime.parse(startTime));
////	 doctor.setEndTime(LocalDateTime.parse(endTime));
//	 
//	 model.addAttribute("doctor", doctor);
//	 return "success";
// }
}
