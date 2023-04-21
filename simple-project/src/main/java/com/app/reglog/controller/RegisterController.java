package com.app.reglog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.reglog.model.RegisterModel;
import com.app.reglog.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;
//	private RegisterRepo registerRepo;
	
//	@GetMapping("/")
//	public String home() {
//		return "register";
//	}
//	
//	@PostMapping("/signup")
//	public String register(@ModelAttribute RegisterModel reg, HttpSession session) {
//		System.out.println(reg);
//		registerRepo.save(reg);
//		session.setAttribute("message", "User Register Successfully");
//		return "redirect:/";
//	}
//	
//	@GetMapping("/login")
//    public String login(Model model) {
//		
//        return "login";
//    }
	
	@GetMapping("/")
	public String register(Model model) {
		RegisterModel registerModel=new RegisterModel();
		model.addAttribute("register", registerModel);
		return "register";
	}
	
	@PostMapping("/signup")
	public String registerUser(@ModelAttribute("register") RegisterModel registerModel) {
		System.out.println(registerModel);
		registerService.userRegister(registerModel);
		return "login";
	}
	
//	@GetMapping("/")
//	public String login(@PathVariable String email, Model model ) {
//		model.addAttribute("email");
//		
//		return "";
//		
//	}
}

