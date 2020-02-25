public class Treatment {

    private String descriptiom;

    private double unitPrice;
    private Dentist dentist;
    
    public Treatment () {
    }

    public Dentist getDentist () {
        return dentist;
    }

    public void setDentist (Dentist val) {
        this.dentist = val;
    }

    public String getDescriptiom () {
        return descriptiom;
    }

 
    public void setDescriptiom (String val) {
        this.descriptiom = val;
    }

    public double getUnitPrice () {
        return unitPrice;
    }

    public void setUnitPrice (double val) {
        this.unitPrice = val;
    }

	@Override
	public String toString() {
		return " " + descriptiom ;
	}

    
}

