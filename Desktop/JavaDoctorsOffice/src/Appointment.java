
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.DCBA96B4-6CD2-5E93-BC94-2B6707F56AD2]
// </editor-fold> 
public class Appointment {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.21540701-E0BF-DAEC-BEE5-3E01D7E3E765]
    // </editor-fold> 
    private String day;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EC321EBD-ED16-7B02-F641-C0E7F698CFE6]
    // </editor-fold> 
    private String time;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DA546348-272B-19F6-FC05-B1BB1DB94E5F]
    // </editor-fold> 
    private Doctor doctor;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.36F4BF3F-B67E-232C-32E8-2B4F3245E5A2]
    // </editor-fold> 
    private Patient mPatient;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BE2F81BF-D684-6163-6A1F-DB1A1F76998C]
    // </editor-fold> 
    private Treatment mTreatment;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AD736B29-7E81-DAD6-A22A-F4C05E7D69C8]
    // </editor-fold> 
    public Appointment () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.75DE179C-9785-8B61-E92D-9C2EF6C74A62]
    // </editor-fold> 
    public String getDay () {
        return day;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DA292AE6-EA8A-58EE-0DA2-4C98A441544B]
    // </editor-fold> 
    public void setDay (String val) {
        this.day = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3CA9219A-7813-5D60-659D-65D25B1BC5BF]
    // </editor-fold> 
    public Doctor getDoctor () {
        return doctor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C65E539F-DA47-87D7-CB14-FB36C6722270]
    // </editor-fold> 
    public void setDoctor (Doctor val) {
        this.doctor = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FD56AAF9-F8F3-B6BC-E261-315ABF0EE410]
    // </editor-fold> 
    public Patient getPatient () {
        return mPatient;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4BC2953F-EF67-B818-387F-905356638D8D]
    // </editor-fold> 
    public void setPatient (Patient val) {
        this.mPatient = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.336FE461-0A0B-5722-5AD2-EF04A0637AD4]
    // </editor-fold> 
    public Treatment getTreatment () {
        return mTreatment;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E2300369-61CC-0820-0956-8BC7741B0FB9]
    // </editor-fold> 
    public void setTreatment (Treatment val) {
        this.mTreatment = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0B6BD83E-34CF-4603-3B23-018099502791]
    // </editor-fold> 
    public String getTime () {
        return time;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E68242A8-91C4-139C-EFFF-92C2F4B4EDA5]
    // </editor-fold> 
    public void setTime (String val) {
        this.time = val;
    }

}

