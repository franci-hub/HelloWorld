import java.util.Iterator;
public class Reports {

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
        
        
        //added dentists
        Dentist d1 = new Dentist();
        d1.setName("Aaron Ottix");        
        dof.getDentists().add(d1);
        
        Dentist d2 = new Dentist();
        d2.setName("Buck Kinnear");        
        dof.getDentists().add(d2);
        
        Dentist d3 = new Dentist();
        d3.setName("Mike Roscope");        
        dof.getDentists().add(d3);
        
        Dentist d4 = new Dentist();
        d4.setName("David Harroch");        
        dof.getDentists().add(d4);
        
        Dentist d5 = new Dentist();
        d5.setName("Anne Fibbiyon");        
        dof.getDentists().add(d5);
        
        //fill with patient
        Patient p1 = new Patient();
        p1.setName("Anglea Rushin");
        dof.getPatients().add(p1);
        
        Patient p2 = new Patient();
        p2.setName("Arthur Itis");
        dof.getPatients().add(p2);
        
        Patient p3 = new Patient();
        p3.setName("Amber Alert");
        dof.getPatients().add(p3);
        
        Patient p4 = new Patient();
        p4.setName("Anglea Rushin");
        dof.getPatients().add(p4);
        
        
        Appointment ap1 = new Appointment();
        ap1.setTime("Saturday 11:00");
        dof.getAppointments().add(ap1);
        
        Appointment ap2 = new Appointment();
        ap2.setTime("Tuesday 11:00");
        dof.getAppointments().add(ap2);
        
        Appointment ap3 = new Appointment();
        ap3.setTime("Monday 9:00");
        dof.getAppointments().add(ap3);
        
        Appointment ap4 = new Appointment();
        ap4.setTime("Thursday 9:00");
        dof.getAppointments().add(ap4);
        
        Appointment ap5 = new Appointment();
        ap5.setTime("Tuesday 11:00");
        dof.getAppointments().add(ap5);
        
        
        //assign treatment to dentist
        d1.getTreatments().add(tr4);
        d1.getTreatments().add(tr1);
        d1.getTreatments().add(tr3);
        d2.getTreatments().add(tr2);
        d5.getTreatments().add(tr4);
        d4.getTreatments().add(tr2);
        
        tr1.setDentist(d1);
        tr2.setDentist(d2);
        tr3.setDentist(d4);
        tr4.setDentist(d5);
        
        //linking appointment to dentist and treatment and patient
        ap1.setDentist(d1);
        ap1.setTreatment(tr1);
        ap1.setPatient(p1);
        
        ap2.setDentist(d2);
        ap2.setTreatment(tr2);
        ap2.setPatient(p2);
        
        ap3.setDentist(d3);
        ap3.setTreatment(tr3);
        ap3.setPatient(p3);
        
        ap4.setDentist(d4);
        ap4.setTreatment(tr4);
        ap4.setPatient(p4);
        
        ap5.setDentist(d5);
        ap5.setTreatment(tr4);
        ap5.setPatient(p3);
        
    
       System.out.println("Report 1:");
       System.out.println();
       System.out.println("List of Dentist works at the  office at "+dof.getAddress()+" are:");
       
       Iterator<Dentist> dentistName = dof.getDentists().iterator();
       
       while (dentistName.hasNext()) {
          Dentist dentist = dentistName.next();
          System.out.println(" - "+dentist.getName());  
       }
       System.out.println();
       System.out.println("---------------------------------------------------------------------------------"); 
       
       
       System.out.println("Report 2:");
       System.out.println();
       System.out.println("List of Patients at the  office at "+ dof.getAddress() +" are: ");
       
       Iterator<Patient> patientName = dof.getPatients().iterator();
       
       while (patientName.hasNext()) {
          Patient patient = patientName.next();
          System.out.println(" - "+patient.getName());  
       }
       System.out.println();
       System.out.println("---------------------------------------------------------------------------------");
       
       
       System.out.println("Report 3:");
       System.out.println();
       System.out.println("List of treatments offered by the office at "+dof.getAddress());
       
       Iterator<Treatment> trts = dof.getTreatments().iterator();
       
       while (trts.hasNext()) {
          Treatment tr = trts.next();
           System.out.println("Description: "+tr.getDescriptiom() + "  -  price: "+ tr.getUnitPrice()+ " - offered by dentist: "+tr.getDentist().getName());
          // System.out.println("..offered by dentist "+tr.getDentist().getName());
       } 
       
       System.out.println();
       System.out.println("---------------------------------------------------------------------------------");
       
       
       System.out.println("Report 4:");
       System.out.println();

       System.out.println("List of dentist, his/her patient, the treatment on Saturday morning at 11:00 offered by the office at "+dof.getAddress());
       Iterator<Appointment> apps = dof.getAppointments().iterator();
       while (apps.hasNext()) {
    	   Appointment ap = apps.next();
    	   if (ap.getTime().equals("Saturday 11:00")) {
    		   String dName = ap.getDentist().getName();
    		   String pName = ap.getPatient().getName();
    		   String trDes = ap.getTreatment().getDescriptiom();
    		   System.out.println("Saturday morning at 11 patient "+ pName + " will see doctor "+dName + " for "+ trDes);
    	  }
       }
       System.out.println();
       System.out.println("---------------------------------------------------------------------------------");
       
       
       System.out.println("Report 5:");
       System.out.println();

       System.out.println("List of dentist, his/her patient, the treatment on Tuesday morning at 11:00 offered by the office at "+dof.getAddress());
       Iterator<Appointment> apps1 = dof.getAppointments().iterator();
       while (apps1.hasNext()) {
    	   Appointment ap = apps1.next();
    	   if (ap.getTime().equals("Tuesday 11:00")) {
    		   String dName = ap.getDentist().getName();
    		   String pName = ap.getPatient().getName();
    		   String trDes = ap.getTreatment().getDescriptiom();
    		   System.out.println("Tuesday morning at 11 patient "+ pName + " will see doctor "+dName + " for "+ trDes);
    	  }
       }
       System.out.println();
       System.out.println("---------------------------------------------------------------------------------");
       
    
       System.out.println("Report 6:");
       System.out.println();
       System.out.println("List of Appointment at the  office at "+ dof.getAddress() +" are: ");
       
       Iterator<Appointment> appointments = dof.getAppointments().iterator();
       
       while (appointments.hasNext()) {
    	   Appointment appointment = appointments.next();
          System.out.println(" - "+appointment.toString());  
       }
       System.out.println();
       System.out.println("---------------------------------------------------------------------------------");
       
    
       
       System.out.println("Report 7:");
       System.out.println();
       System.out.println("List of Appointment at the  office at "+ dof.getAddress() +" offered by dentist: Anglea Rushin ");

       Iterator<Appointment> appointments2 = dof.getAppointments().iterator();
       while (appointments2.hasNext()) {
    	   
    	   Appointment dt = appointments2.next();
    	   if (dt.getDentist().getName().equals("Buck Kinnear")) {
    		   String dName = dt.getDentist().getName();
    		   String patientNames =  appointments2.next().getPatient().getName();
    		   String tratamentOfDt = appointments2.next().getTreatment().getDescriptiom();
    		   String  appointmentOfDt = appointments2.next().getTime();
    		   System.out.println("Dentist:"+ dName + " have this appointments "+tratamentOfDt + " at "+appointmentOfDt+ " with " +patientNames);
    	  }
       }
       System.out.println();
       System.out.println("---------------------------------------------------------------------------------");   
 } 
}



