/*
 * This defines the name of the package!
 */
package com.amit.controllers;
/*
 * Importing all the required classes.
 */
//Used for @Entity annotation
import javax.persistence.Entity;
//used for @NotEmpty annotation
import org.hibernate.validator.constraints.NotEmpty;
/*
 * This is the Login class.
 */
/**
 * This is the class which is uswed for Login purpose.
 * @author Amit Agarwal
 *
 */
//@Entity annotation tells that this is a table
@Entity
public class Login {
/*
 * Login username variable.
 */
/**
 * Represents the user name.
 */
//@NotEmpty annotation makes sure that its not empty
@NotEmpty
private String loginusername;
/*
 * Login password variable.
 */
/**
 * Represents the user password.
 */
//@NotEmpty annotation makes sure that its not empty
@NotEmpty
private String loginpassword;
/*
 * Login username getter.
 */
/**
 * Method for getting logged user name.
 * @return the user name of logged person
 */
//returns the name of the logged user
public final String getLoginusername() {
return loginusername;
}
/*
 * Login username setter.
 */
/**
 * Method for setting logged user name.
 * @param loginusername user name
 */
//initializes the name of the logged user
public final void setLoginusername(final String loginusername) {
this.loginusername = loginusername;
}
/*
 * Login password getter.
 */
/**
 * Method for getting logged user password.
 * @return the password of logged person
 */
//returns the password of the logged user
public final String getLoginpassword() {
return loginpassword;
}
/*
 * Login password setter.
 */
/**
 * Method for getting logged user password.
 * @param loginpassword user password
 */
//sets the password of the logged user
public final void setLoginpassword(final String loginpassword) {
this.loginpassword = loginpassword;
}
}
