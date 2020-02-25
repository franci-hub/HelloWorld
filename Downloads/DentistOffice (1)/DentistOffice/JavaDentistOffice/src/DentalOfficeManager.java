
import java.util.Iterator;


public class DentalOfficeManager {
    public static void main(String[] args) {
        DentistOffice dof = new DentistOffice();
        dof.setAddress("Sulejman Delvina 6");
        
        Treatment tr1 = new Treatment();
        tr1.setDescriptiom("Cleanning");
        tr1.setUnitPrice(3000);
        
        Treatment tr2 = new Treatment();
        tr2.setDescriptiom("Filling");
        tr2.setUnitPrice(4000);
        
        Treatment tr3 = new Treatment();
        tr3.setDescriptiom("whitenning");
        tr3.setUnitPrice(2000);
        
        Treatment tr4 = new Treatment();
        tr4.setDescriptiom("tooth removal");
        tr4.setUnitPrice(7000);
        
        //add treatment to collection
        
        dof.getTreatments().add(tr1);
        dof.getTreatments().add(tr2);
        dof.getTreatments().add(tr3);
        dof.getTreatments().add(tr4);
        
        Dentist d1 = new Dentist();
        d1.setName("Filan Fisteku");        
        dof.getDentists().add(d1);
        
        Dentist d2 = new Dentist();
        d2.setName("Dentis Guy");        
        dof.getDentists().add(d2);
        
        Patient p1 = new Patient();
        p1.setName("Good Patient");
        dof.getPatients().add(p1);
        
        Patient p2 = new Patient();
        p2.setName("Other Patient");
        dof.getPatients().add(p2);
        
        Appointment ap1 = new Appointment();
        ap1.setTime("Saturday 11:00");
        dof.getAppointments().add(ap1);
        
        Appointment ap2 = new Appointment();
        ap2.setTime("Tuesday 11:00");
        dof.getAppointments().add(ap2);
        
        Appointment ap3 = new Appointment();
        ap3.setTime("Monday 9:00");
        dof.getAppointments().add(ap3);
        
        //assign treatment to dentist
        d1.getTreatments().add(tr4);
        d1.getTreatments().add(tr1);
        d1.getTreatments().add(tr3);
        
        d2.getTreatments().add(tr2);
        
        tr1.setDentist(d1);
        tr2.setDentist(d2);
        tr3.setDentist(d1);
        tr4.setDentist(d1);
        
        //linking appointment to dentist and treatment and patient
        ap1.setDentist(d1);
        ap1.setTreatment(tr4);
        ap1.setPatient(p1);
        
        
        System.out.println("List of treatments offered by the office at "+dof.getAddress());
        
        Iterator trts = dof.getTreatments().iterator();
        
        while (trts.hasNext()) {
           Treatment tr = (Treatment)trts.next();
            System.out.println("Description: "+tr.getDescriptiom() + "  -  price: "+ tr.getUnitPrice());
            
            System.out.println("..offered by dentist "+tr.getDentist().getName());
       
        }
        
        System.out.println("---------------------------------------------------------------------------------");
       System.out.println("List of dentist, his/her patient, the treatment on Saturday morning at 11:00 ");
       
       Iterator apps = dof.getAppointments().iterator();
       while (apps.hasNext()) {
       Appointment ap = (Appointment)apps.next();
       
       if (ap.getTime().equals("Saturday 11:00")) {
       
         String dName = ap.getDentist().getName();
         String pName = ap.getPatient().getName();
         String trDes = ap.getTreatment().getDescriptiom();
         System.out.println("Saturday morning at 11 patient "+ pName + " will see doctor "+dName + " for "+ trDes);
         
       }
       }
        
    }
}
