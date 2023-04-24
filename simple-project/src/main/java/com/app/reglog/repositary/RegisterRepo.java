package com.app.reglog.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.reglog.model.RegisterModel;

public interface RegisterRepo extends JpaRepository<RegisterModel, String> {
	
	@Query("SELECT r FROM SignupDtls r WHERE r.email=?1")
  RegisterModel findByEmail(String email);
}
