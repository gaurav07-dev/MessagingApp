package com.gaurav.MessagingApp.login;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gaurav.MessagingApp.login.entity.User;
import com.gaurav.MessagingApp.login.repository.LoginUserRepository;

@Service
public class LoginService {
	
	LoginUserRepository loginUserRepository;
	
	public LoginService(LoginUserRepository loginUserRepository) {
		this.loginUserRepository = loginUserRepository;
	}
	
	public void registerNewUser(User user) {
		loginUserRepository.insert(user);
	}
	
	public List<User> getUserDetail() {
		return loginUserRepository.findAll();
	}

}
