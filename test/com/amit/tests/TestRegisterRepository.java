/**
 * Name of the Package.
 */
package com.amit.tests;
/**
 * Importing the required classes.
 */
import static org.junit.Assert.*;
import org.junit.Test;

import com.amit.controllers.RegisterRepository;
import com.amit.controllers.Registration;
/**
 * Class for testing the Reigster Repository Methods. 
 * @author Amit Agarwal
 *
 */
public class TestRegisterRepository {

	@Test
	public void testStoreUserDetails() {
		RegisterRepository registerRepository = new RegisterRepository();
		Registration user1 = new Registration();
		user1.setFirstName("firstName");
		user1.setLastName("lastName");
		user1.setGender("Male");
		user1.setMobile("9878909876");
		user1.setEmail("amit@gmail.com");
		user1.setUsername("username1");
		user1.setPassword("password");
		user1.setCpassword("cpassword");
		boolean actual = registerRepository.storeUserDetails(user1);
		boolean expected = true;
		assertEquals(actual, expected);
	}

}
