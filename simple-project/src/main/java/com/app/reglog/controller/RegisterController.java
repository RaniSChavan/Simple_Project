package com.app.reglog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.reglog.model.RegisterModel;
import com.app.reglog.repositary.RegisterRepo;

@Controller
public class RegisterController {
	
	@Autowired
	private RegisterRepo registerRepo;
	
	@GetMapping("/")
	
	public String home() {
		return "register";
	}
	
	@PostMapping("signup")
	@ResponseBody
	public String register(@ModelAttribute RegisterModel model) {
		System.out.println(model);
		registerRepo.save(model);
		return "redirect:/";
	}
}
