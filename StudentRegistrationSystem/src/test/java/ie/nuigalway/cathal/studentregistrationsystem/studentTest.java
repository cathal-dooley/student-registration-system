/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.cathal.studentregistrationsystem;


import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author Cathal
 */

public class studentTest {
    @Test
    public void testGet() {
        // assign variable values
        String fname = "Cathal";
        String lname = "Dooley";
        String age = "20";
        int id = 13533663; 
        String username = "CathalDooley20";
        //new student object
        student student = new student(fname, lname, age, id, username);
        //create a string uname using the getUsername() method from the student class
        String uname = student.getUsername();
        //test to determine if username correctly concatenates 
        Assert.assertEquals(username, uname);
           
    }
}