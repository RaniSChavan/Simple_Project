package com.app.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.sms.entity.Student;
import com.app.sms.service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	// Handler method to handle list students and return model and view
    @GetMapping("/students")
	public String listStudents(Model model) {
	model.addAttribute("students", studentService.getAllStudents());
	return "students";
}
    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
    	//create Student object to hold student form data
    	Student student=new Student();
    	model.addAttribute("student", student);
    	return "createStudent.html";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student ) {
    	 studentService.saveStudent(student);
    	 return "redirect:/students";
    }
    
    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
    	model.addAttribute("student", studentService.getStudentById(id));
    	return "editStudent";
    }
    
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
    	// get Student from database by id
    	Student existStudent= studentService.getStudentById(id);
    	existStudent.setId(id);
    	existStudent.setFirstname(student.getFirstname());
    	existStudent.setLastname(student.getLastname());
    	existStudent.setEmail(student.getEmail());
    	
    	//save updated student object
    	studentService.updateStudent(existStudent);
    	return "redirect:/students";
    }
    
    // handler method to handle delete Student request
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
    	studentService.deleteStudentById(id);
    	return "redirect:/students";
    }
}

