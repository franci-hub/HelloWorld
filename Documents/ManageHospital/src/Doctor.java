import java.util.ArrayList; 


public class Doctor {

    private String fName;
    private String id;
    private String lname;
    private String gender;
    private ArrayList<Trataments> trataments= new ArrayList();
    private ArrayList<Patient> patients= new ArrayList();
    
    public Doctor () {
    }

 
        
    public String getfName() {
		return fName;
	}



	public void setfName(String fName) {
		this.fName = fName;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public ArrayList<Trataments> getTrataments() {
		return trataments;
	}



	public void setTrataments(ArrayList<Trataments> trataments) {
		this.trataments = trataments;
	}



	public ArrayList<Patient> getPatients() {
		return patients;
	}



	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}



	public String toString()
    {
        return fName+" "+lname;
    }
}

