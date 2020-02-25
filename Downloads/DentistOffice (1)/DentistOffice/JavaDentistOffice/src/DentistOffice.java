import java.util.ArrayList; 

public class DentistOffice {

    private String address;
    private ArrayList<Dentist> dentists = new ArrayList();
    private ArrayList<Patient> patients = new ArrayList();; 
    private ArrayList<Appointment> appointments = new ArrayList();;
    private ArrayList<Treatment> treatments = new ArrayList();;

    public DentistOffice () {
    }
 
    public String getAddress () {
        return address;
    }

    public void setAddress (String val) {
        this.address = val;
    }

    public ArrayList<Appointment> getAppointments () {
        return appointments;
    }

    public void setAppointments (ArrayList<Appointment> val) {
        this.appointments = val;
    }

    public ArrayList<Dentist> getDentists () {
        return dentists;
    }

    public void setDentists (ArrayList<Dentist> val) {
        this.dentists = val;
    }

    public ArrayList<Patient> getPatients () {
        return patients;
    }

    public void setPatients (ArrayList<Patient> val) {
        this.patients = val;
    }

    public ArrayList<Treatment> getTreatments () {
        return treatments;
    }

    public void setTreatments (ArrayList<Treatment> val) {
        this.treatments = val;
    }

}

