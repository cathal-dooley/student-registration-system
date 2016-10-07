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
//student class
public class student {
    //student variables
    private String fname;     
    private String lname;     
    private String age;       
    private int id; 
    private String username;
    
    //student constructer
    public student(String f, String l, String age, int id, String u) {
        this.fname   = f;
        this.lname   = l;
        this.age   = age;
        this.id = id;
        this.username = u;
    }
    //student get methods
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
    //student toString method returns student object as string
    public String toString () {
	return "name:" +" " +fname +" " +lname +"," 
              +"age:" + " " + age + "," 
              +"id:" + " " + id +"," 
              +"username:" + " " + username 
              +"\n";
    }
}


