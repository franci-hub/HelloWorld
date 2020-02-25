package entity;
import java.util.ArrayList; 

public class Pacient {
    private String pc_id;
    private String fName;
    private String lName;
    private String gender;
    private String doct_id;
   // private ArrayList<Course> courses= new ArrayList();
    private Doctor doctor;
    
    public Pacient () {
    }
    public String getPc_id() {
        return pc_id;
    }

    public void setPc_id(String pc_id) {
        this.pc_id = pc_id;
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
		doct_id = doct_id;
	}
	public String getFName () {
        return fName;
    }

    public void setFName (String val) {
        this.fName = val;
    }

     public String getGender () {
        return gender;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }
    

    public Doctor getdoctor () {
        return doctor;
    }

 
    public void setdoctor (Doctor val) {
        this.doctor = val;
    }


    public String getLName () {
        return lName;
    }


    public void setLName (String val) {
        this.lName = val;
    }
    
    @Override
    public String toString()
    {
        return fName + " " + lName;
    }

}

