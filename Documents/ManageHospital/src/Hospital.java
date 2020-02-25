import java.util.ArrayList; 


public class Hospital {
	
    private String name;
    private ArrayList<Patient> patients= new ArrayList();
    private ArrayList<Trataments> trataments= new ArrayList();
    private ArrayList<Doctor> doctors= new ArrayList();

    Hospital () {
    }
    
    public static Hospital instance= null;
    public static Hospital getInstance()
    {
        if(instance==null)
            instance= new Hospital();
        return instance;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}


	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}


	public ArrayList<Trataments> getTrataments() {
		return trataments;
	}


	public void setTrataments(ArrayList<Trataments> trataments) {
		this.trataments = trataments;
	}


	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}


	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}


	public static void setInstance(Hospital instance) {
		Hospital.instance = instance;
	}


}

