/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.cathal.studentregistrationsystem;


import java.util.ArrayList;
import java.util.List;
import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Cathal
 */
public class courseProgramme {
    private String name;         
    List<module> listOfModules = new ArrayList();
    DateTime startDate = new DateTime();
    DateTime endDate = new DateTime();
    
    public courseProgramme(String n, List<module> lm, DateTime sd, DateTime ed) {
        this.name   = n;
        this.listOfModules   = lm;
        this.startDate   = sd;
        this.endDate   = ed;
    }
    
    public String getName() {
    	return name;
    }
    public List getList() {
    	return listOfModules;
    }
    public DateTime getSDate() {
    	return startDate;
    }
    public DateTime getEDate() {
    	return endDate;
    }
    public String toString () {
	return "Course Name:" +" " +name +"," 
              +"List of Modules:" +" " +listOfModules +"," 
              +"Start Date:" +" " +startDate +","
              +"End Date:" +" " +endDate  
              +"\n";
    }
}

