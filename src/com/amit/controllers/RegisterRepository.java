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
 * This is the Repository class for Database Storing.
 * @author Amit Agarwal
 *
 */
public class RegisterRepository {
/**
 * This method Stores the User Details in db.
 * @param user1 represents user details
 * @return boolean value
 */
public final boolean storeUserDetails(final Registration user1) {
final SessionFactory sessionFactory = 
new Configuration().configure().buildSessionFactory();
final Session session = sessionFactory.openSession();
session.beginTransaction();
session.save(user1);
session.getTransaction().commit();
return true;
}
}
