public class Appointment {

	private Treatment treatment;
    private String time;
    private Patient patient;
    private Dentist dentist;

    public Appointment () {
    }

    public Dentist getDentist () {
        return dentist;
    }

    public void setDentist (Dentist val) {
        this.dentist = val;
    }

    public Patient getPatient () {
        return patient;
    }

    public void setPatient (Patient val) {
        this.patient = val;
    }

    public String getTime () {
        return time;
    }

    public void setTime (String val) {
        this.time = val;
    }


    public Treatment getTreatment () {
        return treatment;
    }


    public void setTreatment (Treatment val) {
        this.treatment = val;
    }

    @Override
	public String toString() {
		return "Appointment [treatment=" + treatment + ", time=" + time + ", patient=" + patient + ", dentist="
				+ dentist + "]";
	}
}

