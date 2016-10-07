/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.cathal.studentregistrationsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cathal
 */
public class student {
    private String fname;     // first name
    private String lname;      // last name
    private String age;     // 
    private int id; 
    private String username;
    
    public student(String f, String l, String age, int id, String u) {
        this.fname   = f;
        this.lname   = l;
        this.age   = age;
        this.id = id;
        this.username = u;
    }
 
     public String getFname() {
    	return fname;
    }
     public String getLname() {
    	return lname;
    }
      public String getAge() {
    	return age;
    }
     public int getId() {
    	return id;
    }
    public String getUsername() {
        return fname + lname + age;
    }
    public String toString () {
	return "name:" +" " +fname +" " +lname +"," 
              +"age:" + " " + age + "," 
              +"id:" + " " + id +"," 
              +"username:" + " " + username 
              +"\n";
    }
}


