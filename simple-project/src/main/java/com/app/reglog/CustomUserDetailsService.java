package com.app.reglog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.app.reglog.model.RegisterModel;
import com.app.reglog.repositary.RegisterRepo;

public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private RegisterRepo repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		RegisterModel registerModel=repo.findByEmail(email);
		if(registerModel==null) {
			throw new UsernameNotFoundException("User Not Found");
		}
		return new CostomUserDetails(registerModel);
	}
}
