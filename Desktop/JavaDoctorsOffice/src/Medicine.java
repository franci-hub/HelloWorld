
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.D701715A-4361-8898-18A0-8A4EB011AC42]
// </editor-fold> 
public class Medicine {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B3DFF424-673E-876C-3B10-FA7BE1400777]
    // </editor-fold> 
    private String med;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D5C32F69-794F-EC9F-2881-184E2DCB6EF9]
    // </editor-fold> 
    private int doses;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D9FB80AB-1718-5C63-04C2-0E2902CFAF03]
    // </editor-fold> 
    private int frequency;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F998D26B-A962-BDA9-267A-0027D8B0B2C2]
    // </editor-fold> 
    private Treatment treatment;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4E45C6A0-960D-D01E-E5DF-ABF2794DC360]
    // </editor-fold> 
    public Medicine () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.38A3E770-68A6-7193-EBB9-0F6583D8D27B]
    // </editor-fold> 
    public int getDoses () {
        return doses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4C3A334C-9828-FF45-FD31-D3C6DFFEB823]
    // </editor-fold> 
    public void setDoses (int val) {
        this.doses = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7BC8FCC2-756B-5E65-2AAF-43CC6439D1EB]
    // </editor-fold> 
    public int getFrequency () {
        return frequency;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CF36215F-E66D-46E3-DC06-C1088C017EFE]
    // </editor-fold> 
    public void setFrequency (int val) {
        this.frequency = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C58F1FB5-57D6-A498-4059-99B16A2F847C]
    // </editor-fold> 
    public String getMed () {
        return med;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9B570830-A8E3-03AE-8C2D-A0A523C3D4A5]
    // </editor-fold> 
    public void setMed (String val) {
        this.med = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.75AE37FD-F45C-4FA3-8764-49E1BEAFEF5F]
    // </editor-fold> 
    public Treatment getTreatment () {
        return treatment;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8F996097-C6A6-7276-7FE2-F63ADD5A2B8E]
    // </editor-fold> 
    public void setTreatment (Treatment val) {
        this.treatment = val;
    }

}

