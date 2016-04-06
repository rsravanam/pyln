package com.amit.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.amit.controllers.Login;
import com.amit.controllers.LoginRepository;
import com.amit.controllers.RegisterRepository;
import com.amit.controllers.Registration;

public class TestLoginRepository {

	@Test
	public void testGetLoginDetails() {
		LoginRepository loginRepository = new LoginRepository();
		Registration user1 = new Registration();
		user1.setFirstName("first name");
		user1.setLastName("last name");
		user1.setGender("Male");
		user1.setMobile("9582451236");
		user1.setEmail("first@gmail.com");
		user1.setUsername("username");
		user1.setPassword("agarwal");
		user1.setCpassword("agarwal");
		Login loguser = new Login();
		loguser.setLoginusername("username");
		loguser.setLoginpassword("agarwal");
		Registration actual = loginRepository.getLoginDetails(loguser);
		assertEquals(actual.getUsername(), user1.getUsername());
		
	}

}
