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
public class module {
    private String mname;     
    private String mid;      
    List<student> listOfStudents = new ArrayList(); 
    
    public module(String m, String i, List<student> l) {
        this.mname = m;
        this.mid = i;
        this.listOfStudents = l;
    }
 
     public String getMname() {
    	return mname;
    }
     public String getMID() {
    	return mid;
    }
      public List getMlist() {
    	return listOfStudents;
    }
    
    public String toString () {
	return "Module Name:" +" " +mname +"," 
              +"Module ID:" +" " +mid +"," 
              +"List of Students:" +" " +listOfStudents 
              +"\n";
    }
}
