package com.app.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.sms.entity.Student;
import com.app.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		System.out.println("Application started");
	}
    
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Student student=new Student("Rani", "Chavan", "rani123@gmail.com");
//		studentRepository.save(student);
//		
//		Student student1=new Student("Virat", "Kohli", "kohli123@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2=new Student("Mahesh", "Chavan", "chavan123@gmail.com");
//		studentRepository.save(student2);
//	     
//		Student student3=new Student("Sachin", "Tendulkar", "sachin123@gmail.com");
//		studentRepository.save(student3);
		
	}

}
