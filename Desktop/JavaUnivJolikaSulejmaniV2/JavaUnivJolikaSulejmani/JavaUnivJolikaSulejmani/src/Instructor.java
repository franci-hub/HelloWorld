import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.FA4A3015-F871-6565-F547-BB7FE5448CB3]
// </editor-fold> 
public class Instructor {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1AF712BF-F592-142E-EFBD-1714AAE09CDA]
    // </editor-fold> 
    private String fName;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A64A0A2F-4CAC-3EA3-9620-026C087BE8AD]
    // </editor-fold> 
    private String lname;
    private String gender;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5EBC3D86-E25B-901C-0E0A-3ED34B612FF4]
    // </editor-fold> 
    private ArrayList<Course> courses= new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D8C11D7B-9D78-39CC-EBEE-6A8CFEBFFBE7]
    // </editor-fold> 
    private ArrayList<Student> students= new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A19DA3AE-6061-A4C7-A95E-5C996D022D2E]
    // </editor-fold> 
    public Instructor () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.24BB38CD-CCB6-2863-2E8B-EC4134A33C81]
    // </editor-fold> 
    public ArrayList<Course> getCourses () {
        return courses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2AE89BC5-2926-45D3-905B-AFC20DA36830]
    // </editor-fold> 
    public void setCourses (ArrayList<Course> val) {
        this.courses = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.66FE41FC-7A5D-91CD-196C-6A0DA5410008]
    // </editor-fold> 
    public String getFName () {
        return fName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.78E30358-1EE6-1E0B-F79C-9F23334B3BF4]
    // </editor-fold> 
    public void setFName (String val) {
        this.fName = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EB2023E1-396A-B7AD-969B-F918ED9FBA7D]
    // </editor-fold> 
    public String getLname () {
        return lname;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.79CE1B5E-5F92-C1B4-6534-CF2DEA8FB30A]
    // </editor-fold> 
    public void setLname (String val) {
        this.lname = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FA8C50D1-9966-6903-80F5-CD261CC73DF9]
    // </editor-fold> 
    public ArrayList<Student> getStudents () {
        return students;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.96927D6B-8B6A-198D-B0A0-5934F15F6C56]
    // </editor-fold> 
    public void setStudents (ArrayList<Student> val) {
        this.students = val;
    }
    
    public String getGender()
    {
        return gender;
    } 
    
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    
        
    public String toString()
    {
        return fName+" "+lname;
    }
}

