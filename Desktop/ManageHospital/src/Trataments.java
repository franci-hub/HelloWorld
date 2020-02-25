import java.util.ArrayList; 

public class Trataments {

    private String cName;

    private String cNumber;

    private ArrayList<Patient> patients=new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B37C5D42-9859-8D84-3A64-E580EE14FEB5]
    // </editor-fold>
    private Doctor doctor;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5AADC741-15AC-B899-FCA6-157892E9C187]
    // </editor-fold> 
    public Trataments () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2057E545-DCC3-1B24-CDA9-368F717210DB]
    // </editor-fold> 
    public String getCName () {
        return cName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.480D6B9D-8515-B537-F342-A49F9DCE7461]
    // </editor-fold> 
    public void setCName (String val) {
        this.cName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B96EFFFD-222A-C0D3-2B7A-ED663D60F5BA]
    // </editor-fold> 
    public String getCNumber () {
        return cNumber;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CBFD66C7-DA6D-0D67-8D8D-2A2EEBD3FD41]
    // </editor-fold> 
    public void setCNumber (String val) {
        this.cNumber = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2E928685-EB14-8B15-FB3C-1AFF9C51EEC1]
    // </editor-fold> 
    public Doctor getInstructor () {
        return doctor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D09A2A2D-4F1A-E891-0CE1-9B90D042B3FD]
    // </editor-fold> 
    public void setInstructor (Doctor val) {
        this.doctor = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3FB56744-C4C0-0522-82D1-64B7B4F3278E]
    // </editor-fold> 
    public ArrayList<Patient> getStudents () {
        return patients;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4092F16F-844B-B114-A566-F2039F935F03]
    // </editor-fold> 
    public void setStudents (ArrayList<Patient> val) {
        this.patients = val;
    }

}

