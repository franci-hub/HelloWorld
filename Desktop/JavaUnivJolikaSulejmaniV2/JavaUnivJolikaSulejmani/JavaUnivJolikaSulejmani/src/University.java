import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.7C6A0EAC-4486-95D6-293B-C56E236CC243]
// </editor-fold> 
public class University {
    public static University instance= null;
    public static University getInstance()
    {
        if(instance==null)
            instance= new University();
        return instance;
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.40269E83-8E21-C359-F231-40A4074789AA]
    // </editor-fold> 
    private String name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E9509F60-D6ED-853D-091D-3500A973AEB4]
    // </editor-fold> 
    private ArrayList<Student> students= new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9224FEC8-D03B-DE54-91E7-BF85A0C38925]
    // </editor-fold> 
    private ArrayList<Course> courses= new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0ADAE8C2-9E52-078D-F73B-7C68D3E4061B]
    // </editor-fold> 
    private ArrayList<Instructor> instructors= new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6BE738FB-C417-82F6-40D5-85E8480DCC9C]
    // </editor-fold> 
    University () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CF909F5B-B999-79DC-6754-D723AAB22558]
    // </editor-fold> 
    public ArrayList<Course> getCourses () {
        return courses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BC0601BB-62C7-F6FA-27D5-04723C20AC1F]
    // </editor-fold> 
    public void setCourses (ArrayList<Course> val) {
        this.courses = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3A68945E-3C0B-8EA8-3A6A-D794863EC22A]
    // </editor-fold> 
    public ArrayList<Instructor> getInstructors () {
        return instructors;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2FD0716E-81D3-6007-81FB-F3CE7EA44C0E]
    // </editor-fold> 
    public void setInstructors (ArrayList<Instructor> val) {
        this.instructors = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.40079778-3AA8-D155-FD71-335ED64E2D37]
    // </editor-fold> 
    public String getName () {
        return name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.17FD809A-DB72-B9DD-AB5E-6ACFF5A59E9B]
    // </editor-fold> 
    public void setName (String val) {
        this.name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8440A149-954F-F37F-B820-7A0FD24A85C7]
    // </editor-fold> 
    public ArrayList<Student> getStudents () {
        return students;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3B033419-43DD-1F41-830D-553E9387E340]
    // </editor-fold> 
    public void setStudents (ArrayList<Student> val) {
        this.students = val;
    }

}

