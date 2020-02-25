import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.7E306623-48A6-69E3-9A1E-6DF5D562BF92]
// </editor-fold> 
public class Treatment {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CBAAFD22-E1CC-9555-9669-D47798145C3D]
    // </editor-fold> 
    private String desc;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2D2E6D97-3859-C70B-D289-81A021D9F279]
    // </editor-fold> 
    private String stDate;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.73422CDC-8622-FE3E-95E9-776C1B271E5F]
    // </editor-fold> 
    private String endDate;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.64208AF8-0FCA-8594-4BEB-75C51E71C7AD]
    // </editor-fold> 
    private ArrayList<Medicine> medicines = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6CFDC491-3600-9904-42C0-698C86D5344F]
    // </editor-fold> 
    private Appointment appointment;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FB339DC8-BCB3-FD7F-5E4F-A4B84CFE0F3C]
    // </editor-fold> 
    public Treatment () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E82A0B1C-1489-F794-0648-BFEAD7893DA8]
    // </editor-fold> 
    public Appointment getAppointment () {
        return appointment;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D4C97885-F310-0CEB-57BD-78D540B1FEA1]
    // </editor-fold> 
    public void setAppointment (Appointment val) {
        this.appointment = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.601BD3C5-B61D-DA3D-23B9-99119911BD90]
    // </editor-fold> 
    public String getDesc () {
        return desc;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.557722A0-C999-0D09-5435-7F3C2107E0A7]
    // </editor-fold> 
    public void setDesc (String val) {
        this.desc = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.ECF540F3-8B67-5F2C-AF99-3D435CAD1C55]
    // </editor-fold> 
    public String getEndDate () {
        return endDate;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5EFF33B3-35A6-852C-FE9F-6A17FAC73694]
    // </editor-fold> 
    public void setEndDate (String val) {
        this.endDate = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B6C1914A-B503-A03E-4715-F7A9D65095B1]
    // </editor-fold> 
    public ArrayList<Medicine> getMedicines () {
        return medicines;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0E5F3CE5-A826-2BBC-8876-F004CA2C0E2B]
    // </editor-fold> 
    public void setMedicines (ArrayList<Medicine> val) {
        this.medicines = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5AD76FB7-5BFC-2303-0F91-754821351C20]
    // </editor-fold> 
    public String getStDate () {
        return stDate;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7A3272EB-2283-74F1-4408-D4CDC219547C]
    // </editor-fold> 
    public void setStDate (String val) {
        this.stDate = val;
    }

}

