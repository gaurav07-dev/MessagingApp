package com.gaurav.MessagingApp.login.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document(collection = "users")
public class User {
	
	@Id
	String _id;
	String username;
	String password;
	String firstName;
	String lastName;
	String email;
	
	@Override
	public String toString() {
		return super.toString();
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
