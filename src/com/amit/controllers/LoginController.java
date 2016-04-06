/*
 * this is the name of the package.
 */
package com.amit.controllers;
/*
 * importing all the required classes.
 */
import javax.validation.Valid;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/*
 * This is the login controller class.
 * It is responsible for the authentication 
 * of the user.
 */
/**
 * This is a controller which helps in
 * connecting to database and authenticating a valid user.
 * @author Amit Agarwal
 *
 */
//@Controller annotation tells that this is a controller class
@Controller
public class LoginController {
/*
 * Declaration of a variable.
 * It stores the name of the login form.
 */
/**
 * variable to store a string.
 */
private static String val = "Login"; 
/*
 * This method is responsible for
 * returning the login page when the
 * login page button is clicked.
 */
/**
 * Implementation of the method.
 * @return login page
 */
//The request 'Login.html' will map to the below method if it's a GET
//the value attribute is for the request
//the method is for method type here its GET
@RequestMapping(value = "/Login.html", method = RequestMethod.GET)
protected final ModelAndView returnLoginPage() { 
return new ModelAndView(val);
}
/*
 * This method is responsible for
 * checking the user is valid or not
 * and if its valid it navigates to the dash board
 * else returns the same login page with errors.
 */
/**
 * Implementation of the method.
 * @param loguser represents login entity
 * @param result represents binding errors
 * @return different views
 */
//The request 'Login.html' will map to the below method if it's a POST
//the value attribute is for the request
//the method is for method type here its POST
//The method has 2 parameters
//Login is for sending login user information
//BindingResult is for form validation
@RequestMapping(value = "/Login.html", method = RequestMethod.POST)
protected final ModelAndView returnUserdashboardAfterLogin(
@Valid @ModelAttribute("loguser") final Login loguser, 
final BindingResult result) {
/*
 * creating a ModelAndView object.
 */
ModelAndView mav = new ModelAndView();
/*
 * checks for the validation errors on the login page.
 */
if (result.hasErrors()) {
mav = new ModelAndView(val);
//fetching login user name
final String username = loguser.getLoginusername();
//fetching the login user password
final String password = loguser.getLoginpassword();
// if user name is not entered
if (username.isEmpty()) {
mav.addObject("usernameError", "Enter Username");
}
// if password is not entered
if (password.isEmpty()) {
mav.addObject("passwordError", "Enter Password");
}
// when both are entered
} else {
Registration user = new Registration();
LoginRepository loginRepository = new LoginRepository();
user = loginRepository.getLoginDetails(loguser);
if (user == null) {
mav = new ModelAndView(val);
mav.addObject("message", "Not a Valid User!");
}
// checking if password matches.
if (user.getPassword().
equals(loguser.getLoginpassword())) {
mav = new ModelAndView("UserDashboard");
} else {
mav = new ModelAndView(val);
mav.addObject("message", "Not a Valid User!");
}
}
return mav;
}
}
