import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.1FAAE2D1-9CFD-5B4E-E286-D6AC7D71A2DC]
// </editor-fold> 
public class DocOffice {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.55376CAF-6800-8F03-0A80-38C41C7FEFA2]
    // </editor-fold> 
    private String address;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1FDA09B6-7DC7-72AD-CF16-EABFDBF8EE95]
    // </editor-fold> 
    private ArrayList<Doctor> doctors = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0B0E7D2C-9F99-32D5-4F92-20C89056B2D1]
    // </editor-fold> 
    private ArrayList<Patient> patients = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.94F4C877-5AF6-2EA4-2787-00524F1818D8]
    // </editor-fold> 
    private ArrayList<Appointment> appointments = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8B966721-B9D9-7738-2330-D5C1B34DAA04]
    // </editor-fold> 
    public DocOffice () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.83EB5859-2630-AD8B-E589-2DB656FED912]
    // </editor-fold> 
    public String getAddress () {
        return address;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A4FDE58B-88CE-07F0-B0F7-2855645F9FE0]
    // </editor-fold> 
    public void setAddress (String val) {
        this.address = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9CAAD1E2-C174-3B0E-A1AD-F47EE844E842]
    // </editor-fold> 
    public ArrayList<Appointment> getAppointments () {
        return appointments;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.64FF0D64-9782-2F05-DFB5-0D12C92528F7]
    // </editor-fold> 
    public void setAppointments (ArrayList<Appointment> val) {
        this.appointments = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.05FBEF77-70F6-1516-A04C-066F1BB6B5E9]
    // </editor-fold> 
    public ArrayList<Doctor> getDoctors () {
        return doctors;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8C025276-6873-988F-9B98-CDB396FBED0D]
    // </editor-fold> 
    public void setDoctors (ArrayList<Doctor> val) {
        this.doctors = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.84CF28A5-CD8C-5189-A1D7-78F6EA3C0642]
    // </editor-fold> 
    public ArrayList<Patient> getPatients () {
        return patients;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0F90B75A-8A21-62AC-21F4-02E79C76D674]
    // </editor-fold> 
    public void setPatients (ArrayList<Patient> val) {
        this.patients = val;
    }

}

