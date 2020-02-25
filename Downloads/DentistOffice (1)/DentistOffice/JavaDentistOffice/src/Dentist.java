import java.util.ArrayList; 

public class Dentist {

    private String name;
    private ArrayList<Treatment> treatments = new ArrayList();
    private ArrayList<Appointment> appointments = new ArrayList();

    public Dentist () {
    }
 
    public ArrayList<Appointment> getAppointments () {
        return appointments;
    }


    public void setAppointments (ArrayList<Appointment> val) {
        this.appointments = val;
    }


    public String getName () {
        return name;
    }

    public void setName (String val) {
        this.name = val;
    }
 
    public ArrayList<Treatment> getTreatments () {
        return treatments;
    }

    public void setTreatments (ArrayList<Treatment> val) {
        this.treatments = val;
    }

	@Override
	public String toString() {
		return " " + name ;
	}

    
}

