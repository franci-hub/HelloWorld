import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.6E93FB01-76A9-8959-4C2A-CF268DD575AC]
// </editor-fold> 
public class Patient {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5857BA38-1707-D7A0-2EF7-06DCB603552F]
    // </editor-fold> 
    private String fName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.44AB2003-B90E-2C79-E2CF-99650972B426]
    // </editor-fold> 
    private String lName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DB4ABBF8-A477-377D-C8D7-EB3051A79853]
    // </editor-fold> 
    private ArrayList<Appointment> appointments = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6F753431-F0B4-3C68-51D1-2CF3CE2F1F3A]
    // </editor-fold> 
    private ArrayList<Treatment> treatments = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.364041F2-EEF8-2984-6D06-6FF1D166F0AA]
    // </editor-fold> 
    public Patient () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.54B535A8-1AFB-D8A2-29BA-9C7F3D29EFDE]
    // </editor-fold> 
    public ArrayList<Appointment> getAppointments () {
        return appointments;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E6F4DE53-C6A5-4A55-2889-C5B428EB93B1]
    // </editor-fold> 
    public void setAppointments (ArrayList<Appointment> val) {
        this.appointments = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2C32B530-B184-80E5-FB54-3317DA47D93C]
    // </editor-fold> 
    public String getFName () {
        return fName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.86758B96-9C0E-E60D-5F63-5196A237DA59]
    // </editor-fold> 
    public void setFName (String val) {
        this.fName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6612CFB7-6B1C-BBD2-6C71-E526ED293177]
    // </editor-fold> 
    public String getLName () {
        return lName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BF39530C-60E6-B538-C1AD-E062823D9A2F]
    // </editor-fold> 
    public void setLName (String val) {
        this.lName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C1C04017-D2C5-38BA-256D-A180271541D2]
    // </editor-fold> 
    public ArrayList<Treatment> getTreatments () {
        return treatments;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6D517151-EC17-B52A-594C-236B9B2D3B89]
    // </editor-fold> 
    public void setTreatments (ArrayList<Treatment> val) {
        this.treatments = val;
    }

}

