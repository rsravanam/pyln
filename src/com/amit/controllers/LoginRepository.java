/**
 * This is the name of the package.
 */
package com.amit.controllers;
/**
 * Importing all the required classes.
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * Login Repository class.
 * @author Amit Agarwal
 *
 */
public class LoginRepository {
/**
 * This method will help in login.
 * @param loguser
 * @return
 */
public Registration getLoginDetails(final Login loguser) {
Registration user = new Registration();
final SessionFactory sessionFactory = 
new Configuration().configure().buildSessionFactory();
final Session session = sessionFactory.openSession();
session.beginTransaction();
user = (Registration) 
session.get(Registration.class, 
loguser.getLoginusername());
session.getTransaction().commit();
return user;
}
}
