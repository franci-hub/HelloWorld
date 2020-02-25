import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.F893AD23-32AC-F8B9-B073-9BFE580DE835]
// </editor-fold> 
public class Patient {
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9BA29BA1-7858-7916-7D58-6E7478F9D672]
    // </editor-fold> 
    private String fName;
    private String st_id;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2FB3F02B-9B5C-ACA3-FECA-47DC25B0377C]
    // </editor-fold> 
    private String lName;

    public String getSt_id() {
        return st_id;
    }

    public void setSt_id(String st_id) {
        this.st_id = st_id;
    }
    
    private String gender;
    private String Inst_id;

    public String getInst_id() {
        return Inst_id;
    }

    public void setInst_id(String Inst_id) {
        this.Inst_id = Inst_id;
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.69DCEC41-0E76-33CF-DAAA-1875750A2540]
    // </editor-fold> 
    private ArrayList<Trataments> trataments= new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D83DB149-0919-194E-3189-04D266667565]
    // </editor-fold> 
    private Doctor doctor;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A3A0AF5F-84BC-9E0D-1FBE-E5D0175202E8]
    // </editor-fold> 
    public Patient () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5DAD3D97-55F6-199E-B98D-D48705BC6A85]
    // </editor-fold> 
    public ArrayList<Trataments> getCourses () {
        return trataments;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9E31F627-7443-F4A7-EF37-F1EA8C59A6B6]
    // </editor-fold> 
    public void setCourses (ArrayList<Trataments> val) {
        this.trataments = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2FF42C3C-E976-7FFE-D6C4-8611948D2704]
    // </editor-fold> 
    public String getFName () {
        return fName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.565DBCD2-D491-7307-DAE8-3A1CFFFD1BE9]
    // </editor-fold> 
    public void setFName (String val) {
        this.fName = val;
    }

     public String getGender () {
        return gender;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BF35712C-3BB7-2E02-52F9-4344C85D703C]
    // </editor-fold> 
    public Doctor getInstructor () {
        return doctor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.95CD43FB-28DC-F50D-4E24-18AA88EF10A6]
    // </editor-fold> 
    public void setInstructor (Doctor val) {
        this.doctor = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DBFC9BB8-AAF6-5588-E777-1F2177781CB7]
    // </editor-fold> 
    public String getLName () {
        return lName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C137F4B5-9118-3FBD-0F7D-28DB2299C948]
    // </editor-fold> 
    public void setLName (String val) {
        this.lName = val;
    }
    
    @Override
    public String toString()
    {
        return fName + " " + lName;
    }

}

