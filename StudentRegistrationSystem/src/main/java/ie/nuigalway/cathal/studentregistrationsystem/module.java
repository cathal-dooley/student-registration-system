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
//module class
public class module {
    //module variables 
    private String mname;     
    private String mid;
    //list of students in the module
    List<student> listOfStudents = new ArrayList(); 
    
    //module constructor
    public module(String m, String i, List<student> l) {
        this.mname = m;
        this.mid = i;
        this.listOfStudents = l;
    }
    //module get methods
     public String getMname() {
    	return mname;
    }
     public String getMID() {
    	return mid;
    }
      public List getMlist() {
    	return listOfStudents;
    }
    //module toString method returns module object as string
    public String toString () {
	return "Module Name:" +" " +mname +"," 
              +"Module ID:" +" " +mid +"," 
              +"List of Students:" +" " +listOfStudents 
              +"\n";
    }
}
