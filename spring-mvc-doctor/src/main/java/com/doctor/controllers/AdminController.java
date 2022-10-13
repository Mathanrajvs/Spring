package com.doctor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AdminController {

	@RequestMapping("adminview")
	public String admin(Model model) { 
		return "admin";

	}
	@RequestMapping("add-doctor-form")
	public String addDoctor(Model model) {
		return "addDoctorform";
	}
	@RequestMapping("update-doctor-form")
	public String showEditForm(Model model) {
		return "editform";
	}
	@RequestMapping("delete-doctor-form")
	public String showdeleteForm(Model model) {
		return "deleteform";
	}
}
