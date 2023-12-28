package com.gaurav.MessagingApp.login;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.MessagingApp.login.entity.User;

@RestController
public class LoginController {
	
	LoginService loginService;
	
	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> registerNewUser(@RequestBody User user){
		loginService.registerNewUser(user);
		return ResponseEntity.ok("Your registration was successful!");
	}
	
	@GetMapping("/login")
	public List<User> getUserDetail(){
		return loginService.getUserDetail();
	}
}
