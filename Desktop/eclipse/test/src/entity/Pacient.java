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


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDoct_id() {
		return doct_id;
	}


	public void setDoct_id(String doct_id) {
		this.doct_id = doct_id;
	}


	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	@Override
    public String toString()
    {
        return fName + " " + lName;
    }

}

