package com.app.reglog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.reglog.model.RegisterModel;
import com.app.reglog.repositary.RegisterRepo;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private RegisterRepo registerRepo;

	
	@Override
	public void userRegister(RegisterModel registerModel) {
		// TODO Auto-generated method stub
		 registerRepo.save(registerModel);
	}

}
