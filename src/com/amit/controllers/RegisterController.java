/*
 * This represents the name of the package.
 */
package com.amit.controllers;
/*
 * Imports all the required classes.
 */
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/*
 * This is the register controller class.
 * It is responsible for storing the user values
 * in the data base on the conditions.
 */
/**
 * This is the RegisterController class.
 * @author Amit Agarwal
 *
 */
//@Controller represents that this class is a controller
@Controller
public class RegisterController {
/*
 * when user enters the url this is the
 * first method which is going to be invoked 
 * which displays the home page
 * having user registration page.
 */
/**
 * This method returns the home page.
 * @return the login page
 */
//The request '/Home.html' will map to the below method if its GET
//The value parameter is for request URL
//The method parameter is for requested type
//The method takes no argument
@RequestMapping(value = "/Home.html", method = RequestMethod.GET)
protected final ModelAndView returnHomePage() { 
return new ModelAndView("HelloPage");
}
/*
 * This method will be invoked when the user
 * posts back the registration form to the server.
 */
/**
 * This method returns login page after it posts the content to db.
 * @param user1 represents the registration entity
 * @param result represents binding errors
 * @return the login view after registration is done
 */
//The request '/Home.html' will map to the below method if its POST
//The value parameter is for request URL
//The method parameter is for requested type
//The method takes 2 argument
//The 1st parameter is Registration object
//The 2nd parameter is of BindingResult object
@RequestMapping(value = "/Home.html", method = RequestMethod.POST)
protected final ModelAndView returnPageAfteRegistration(
@Valid @ModelAttribute("user1")
final Registration user1,
final BindingResult result) {
/*
 * creating a modelandview object.
 */
ModelAndView modelandview = new ModelAndView();
/*
 * checking for the validation errors.
 */
// if for has any validation errors.
if (result.hasErrors()) {
modelandview = new ModelAndView("HelloPage");
}
/*
 * checking for the password matching condition.
 * if password matches then  save the details in the database
 * else return the same registration page with errors.
 */
// if password matches.
if (user1.getPassword().equals(user1.getCpassword())) {
final RegisterRepository registerRepository = new RegisterRepository();
final boolean res = registerRepository.storeUserDetails(user1);
modelandview = new ModelAndView("Login");
if (res) {
modelandview.addObject("message", "Successfully Registered!!");
} else {
// returning the same view on error.
modelandview = new ModelAndView("HelloPage");
// adding error message.
modelandview.addObject(
"errormsg", "Password Mismatch!");
}
}
return modelandview;
}
}
