package entity;

import java.util.ArrayList;

public class Doctor {
	
	private String doct_id;
    private String fName;
    private String lname;
    private String gender;
   // private ArrayList<Course> courses= new ArrayList();
    private ArrayList<Pacient> pacients= new ArrayList();
    
    

    public Doctor() {
    }

//    public ArrayList<Course> getCourses () {
//        return courses;
//    }
//
//    public void setCourses (ArrayList<Course> val) {
//        this.courses = val;
//    }

    public String getDoct_id() {
		return doct_id;
	}

	public void setDoct_id(String doct_id) {
		this.doct_id = doct_id;
	}

	public String getFName () {
        return fName;
    }

    public void setFName (String val) {
        this.fName = val;
    }
 
    public String getLname () {
        return lname;
    }


    public void setLname (String val) {
        this.lname = val;
    }

    public ArrayList<Pacient> getPacients () {
        return pacients;
    }

    public void setPacients (ArrayList<Pacient> val) {
        this.pacients = val;
    }
    
    public String getGender()
    {
        return gender;
    } 
    
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    
        
    public String toString()
    {
        return fName+" "+lname;
    }
}
