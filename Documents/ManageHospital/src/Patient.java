import java.util.ArrayList; 


public class Patient {

    private String fName;
    private String st_id;
    private String lName;
    private String gender;
    private String Inst_id;
    private ArrayList<Trataments> trataments= new ArrayList();
    private Doctor doctor;
    
    public Patient () {
    }
    

    public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getSt_id() {
		return st_id;
	}


	public void setSt_id(String st_id) {
		this.st_id = st_id;
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


	public String getInst_id() {
		return Inst_id;
	}


	public void setInst_id(String inst_id) {
		Inst_id = inst_id;
	}


	public ArrayList<Trataments> getTrataments() {
		return trataments;
	}


	public void setTrataments(ArrayList<Trataments> trataments) {
		this.trataments = trataments;
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

