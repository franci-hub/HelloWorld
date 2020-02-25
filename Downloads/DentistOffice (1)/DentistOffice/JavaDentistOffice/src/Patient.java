import java.util.ArrayList; 


public class Patient {

    private String name;
    private ArrayList<Appointment> appointments;


    public Patient () {
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

	@Override
	public String toString() {
		return " " + name ;
	}

    
}

