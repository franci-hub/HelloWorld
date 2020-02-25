import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.C9274C32-2180-2A42-2536-6AF5186B07B4]
// </editor-fold> 
public class Doctor {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6E64CAFC-2763-293E-2B49-821871F1BABD]
    // </editor-fold> 
    private String fName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6D8CBFB0-9D92-BBD3-21D0-B30283301F31]
    // </editor-fold> 
    private String lName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2488A4BF-FFE5-4056-0803-97342039D786]
    // </editor-fold> 
    private ArrayList<Appointment> appointments = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3880EA86-5288-F3BD-A7DF-8C0844F12BBA]
    // </editor-fold> 
    public Doctor () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B6253F38-9A53-570C-378B-AA0B1B2811EE]
    // </editor-fold> 
    public ArrayList<Appointment> getAppointments () {
        return appointments;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B7F8FE22-E1B1-5A5B-A719-A14837DBDA60]
    // </editor-fold> 
    public void setAppointments (ArrayList<Appointment> val) {
        this.appointments = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FC019E77-1A31-251E-5F78-65A992F015DF]
    // </editor-fold> 
    public String getFName () {
        return fName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.28F718DE-421E-01C8-7685-94156EE7CCE7]
    // </editor-fold> 
    public void setFName (String val) {
        this.fName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.019755E7-7440-AFF8-631D-04815AEB244E]
    // </editor-fold> 
    public String getLName () {
        return lName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.40CD70FD-B3A8-7E1D-835F-B7C8CA45CD61]
    // </editor-fold> 
    public void setLName (String val) {
        this.lName = val;
    }
    
    @Override
    public String toString(){
    return this.getFName() + " "+this.getLName();
    }

}

