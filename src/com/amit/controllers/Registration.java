/*
 * This defines the name of the package!
 */
package com.amit.controllers;
/*
 * Importing all the required classes.
 */
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
/*
 * This is the Registration class.
 */
/**
 * This is the Registration class for user registration.
 * @author Amit Agarwal
 *
 */
//@Entity represents that its a table
@Entity
public class Registration {
/*
 * constant for minimum length.
 */
/**
 * Defining a constant for minimum size.
 */
public static final int MIN_SIZE = 4;
/*
 * constant for maximum length.
 */
/**
 * Defining a constant for maximum size.
 */
public static final int MAX_SIZE = 10;
/*
 * constant for minimum user name length.
 */
/**
 * Defining a constant for minimum length of user name.
 */
public static final int MIN_SIZE_USERNAME = 5;
/*
 * constant for minimum password length.
 */
/**
 * Defining a constant for minimum length of password.
 */
public static final int MIN_SIZE_PASSWORD = 7;
/*
 * variable for username.
 */
/**
 *  Represents User's User name.
 */
//@ID annotation is used for uniqueness of user name
@Id
//@Size specifies the required size min or max
// message is for custom messages
@Size(min = MIN_SIZE_USERNAME, 
message = "Username Should Be Of Minimum 5 Characters!")
private String username;
/*
 * variable for first name.
 */
/**
 * Represents User's first name.
 */
//@Size specifies the required size min or max
//message is for custom messages
@Size(min = MIN_SIZE, max = MAX_SIZE, 
message = "Should Be In Between {min} & {max}!")
private String firstName;
/*
 * variable for last name.
 */
/**
 *  Represents User's Last Name.
 */
//@Size specifies the required size min or max
//message is for custom messages
@Size(min = MIN_SIZE, max = MAX_SIZE, 
message = "Should Be In Between {min} & {max}!")
private String lastName;
/*
 * variable for gender.
 */
/**
 *  Represents User's Gender.
 */
private String gender;
/*
 * variable for mobile.
 */
/**
 *  Represents User's Mobile.
 */
//@NotEmpty makes sure that its not empty
@NotEmpty(message = "Mobile Number Cannot Be Empty!")
//@Pattern is for regular expression for validation
//message is for custom messages
@Pattern(regexp = "(^$|[0-9]{10})", 
message = "Enter Valid Number")
private String mobile;
/*
 * variable for email.
 */
/**
 *  Represents User's Email.
 */
//@NotEmpty makes sure that its not empty
@NotEmpty(message = "Email ID Cannot Be Empty!")
//@Pattern is for regular expression for validation
//message is for custom messages
@Pattern(regexp = 
"^[\\w-]+(\\.[\\w-]+)*@([a-z0-9-]+(\\.[a-z0-9-]+)*?\\.[a-z]{2,6}|"
+ "(\\d{1,3}\\.){3}\\d{1,3})(:\\d{4})?$",
message = "Enter Valid Email!")
private String email;
/*
 * variable for password.
 */
/**
 *  Represents User's password.
 */
//@Size specifies the required size min or max
//message is for custom message
@Size(min = MIN_SIZE_PASSWORD, 
message = "Minimum Length should Be of 7")
private String password;
/*
 * variable for confirm password.
 */
/**
 *  Represents User's Confirm Password.
 */
//@Size specifies the required size min or max
//message is for custom message
@Size(min = MIN_SIZE_PASSWORD, 
message = "Minimum Length should Be of 7")
private String cpassword;
/*
 * first name getter.
 */
/**
 * Method to get User's First Name.
 * @return firstName user's first name
 */
//returns the first name
public final String getFirstName() {
return firstName;
}
/*
 * first name setter
 */
/**
 * Method to set User's First Name.
 * @param firstName the First name
 */
//sets the first name 
public final void setFirstName(final String firstName) {
this.firstName = firstName;
}
/*
 * last name getter
 */
/**
 * Method to get User's Last Name.
 * @return lastName user's last name
 */
//returns the last name
public final String getLastName() {
return lastName;
}
/*
 * last name setter
 */
/**
 * Method to set User's Last Name.
 * @param lastName user's last name
 */
//sets the last name
public final void setLastName(final String lastName) {
this.lastName = lastName;
}
/*
 * getter for gender.
 */
/**
 * Method to get User's Gender.
 * @return the user's gender
 */
//returns the gender
public final String getGender() {
return gender;
}
/*
 * setter for gender.
 */
/**
 * Method to set User's Gender.
 * @param gender user's gender
 */
//sets the gender
public final void setGender(final String gender) {
this.gender = gender;
}
/*
 * getter for mobile.
 */
/**
 * Method to get User's Mobile.
 * @return the user's mobile Number
 */
//returns the mobile
public final String getMobile() {
return mobile;
}
/*
 * setter for mobile.
 */
/**
 * Method to set User's Mobile.
 * @param mobile user's mobile number
 */
//sets the mobile number
public final void setMobile(final String mobile) {
this.mobile = mobile;
}
/*
 * getter for email.
 */
/**
 * Method to get User's Email Id.
 * @return the user's email
 */
//returns the email 
public final String getEmail() {
return email;
}
/*
 * setter for email.
 */
/**
 * Method to set User's Gender.
 * @param email user's email
 */
//sets the email id
public final void setEmail(final String email) {
this.email = email;
}
/*
 * getter for user name.
 */
/**
 * Method to get User's Name.
 * @return the user name
 */
//returns the user name
public final String getUsername() {
return username;
}
/*
 * setter for user name.
 */
/**
 * Method to set User's name.
 * @param username user's user name
 */
//sets the user name
public final void setUsername(final String username) {
this.username = username;
}
/*
 * getter for password.
 */
/**
 * Method to get User's Password.
 * @return the user's password
 */
//returns the password
public final String getPassword() {
return password;
}
/*
 * setter for password.
 */
/**
 * Method to set User's password.
 * @param password user's password
 */
//sets the password
public final void setPassword(final String password) {
this.password = password;
}
/*
 * getter for confirm password.
 */
/**
 * Method to get User's Confirm Password.
 * @return the confirm password
 */
//returns the confirm password
public final String getCpassword() {
return cpassword;
}
/*
 * setter for confirm password.
 */
/**
 * Method to set User's Confirm password.
 * @param cpassword user's confirm password
 */
//sets the confirm password
public final void setCpassword(final String cpassword) {
this.cpassword = cpassword;
}
}
