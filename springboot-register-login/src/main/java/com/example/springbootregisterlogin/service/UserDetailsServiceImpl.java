package com.example.springbootregisterlogin.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.example.springbootregisterlogin.model.Role;
import com.example.springbootregisterlogin.model.User;
import com.example.springbootregisterlogin.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByUsername(username);
		if(user==null) 
			throw new UsernameNotFoundException(username);
		
		Set<GrantedAuthority> grantedAuthorities=new HashSet<>();
		for(Role role : user.getRoles()) {
		grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
		}	
		return new org.springframework.security.core.userdetails.User(user.getPassword(), user.getPassword(), grantedAuthorities);
	}

}
