package com.app.reglog;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.app.reglog.model.RegisterModel;
import com.app.reglog.repositary.RegisterRepo;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

	@Autowired
	private RegisterRepo repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateUser() {
		RegisterModel registerModel=new RegisterModel();
		registerModel.setEmail("rani@gmail.com");
		registerModel.setPwd("rani@123");
		registerModel.setFname("Rani");
		registerModel.setLname("Chavan");
		
		RegisterModel savedUser=repo.save(registerModel);
		RegisterModel existUser=entityManager.find(RegisterModel.class, savedUser.getEmail());
		assertThat(registerModel.getEmail()).isEqualTo(registerModel.getEmail());
	}
	
	public void testFindUserByEmail() {
		String email="ravikumar@gmail.com";
		RegisterModel model=repo.findByEmail(email);
		
		assertThat(model).isNotNull();	
	}
}
