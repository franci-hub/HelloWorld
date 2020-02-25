import java.util.Iterator;

import com.sun.swing.internal.plaf.metal.resources.metal;

public class Reports {

	public static void main(String[] args) {
		
        DocOffice dof = new DocOffice();
        dof.setAddress("6 Andon Cajuapi");
        
        //create doctors
        Doctor d1 = new Doctor();
        d1.setFName("Anna");
        d1.setLName("Rexia");
        dof.getDoctors().add(d1);
        
        Doctor d2 = new Doctor();
        d2.setFName("Arden");
        d2.setLName("Roussell");
        dof.getDoctors().add(d2);
        
        Doctor d3 = new Doctor();
        d3.setFName("Arturo");
        d3.setLName("Abila");
        dof.getDoctors().add(d3);
        
        Doctor d4 = new Doctor();
        d4.setFName("Arty");
        d4.setLName("Ficial");    
        dof.getDoctors().add(d4);
        
        Patient p1 = new Patient();
        p1.setFName("Beryl");
        p1.setLName("Kepley");
        dof.getPatients().add(p1);
        
        Patient p2 = new Patient();
        p2.setFName("Alketa");
        p2.setLName("Vejsiu"); 
        dof.getPatients().add(p2);
        
        Patient p3 = new Patient();
        p3.setFName("Carl");
        p3.setLName("Lewis"); 
        dof.getPatients().add(p3);
        
        Patient p4 = new Patient();
        p4.setFName("Danrien");
        p4.setLName("Lagman"); 
        dof.getPatients().add(p4);
        
        Patient p5 = new Patient();
        p5.setFName("Eda");
        p5.setLName("Torial"); 
        dof.getPatients().add(p5);
        
        
        Appointment app1 = new Appointment();
        app1.setDay("Monday");
        app1.setTime("10:00");
        app1.setDoctor(d1);
        d1.getAppointments().add(app1);
        app1.setPatient(p1);
        dof.getAppointments().add(app1);
        
        Appointment app2 = new Appointment();
        app2.setDay("Wednesday");
        app2.setTime("10:00");
        app2.setDoctor(d2);
        d2.getAppointments().add(app2);
        app2.setPatient(p2);
        dof.getAppointments().add(app2);
        
        Appointment app3 = new Appointment();
        app3.setDay("Wednesday");
        app3.setTime("10:00");
        app3.setDoctor(d3);
        d3.getAppointments().add(app3);
        app3.setPatient(p3);
        dof.getAppointments().add(app3);
        
        Appointment app4 = new Appointment();
        app4.setDay("Thursday");
        app4.setTime("10:00");
        app4.setDoctor(d4);
        d4.getAppointments().add(app4);
        app4.setPatient(p4);
        dof.getAppointments().add(app4);
        
        Treatment tr1 = new Treatment();
        tr1.setDesc("Nervous breakdown");
        tr1.setStDate("Monday");
        tr1.setEndDate("Friday");
        app1.setTreatment(tr1);
        tr1.setAppointment(app1);
        
        Treatment tr2 = new Treatment();
        tr2.setDesc("Hernie de disc Treatment");
        tr2.setStDate("Monday");
        tr2.setEndDate("Sunday");
        app2.setTreatment(tr2);
        tr2.setAppointment(app2);
        
        Treatment tr3 = new Treatment();
        tr3.setDesc("Weight loss Treatment");
        tr3.setStDate("Monday");
        tr3.setEndDate("Thursday");
        app3.setTreatment(tr3);
        tr3.setAppointment(app3);
        
        Treatment tr4 = new Treatment();
        tr4.setDesc("Heart treatments");
        tr4.setStDate("Wednesday");
        tr4.setEndDate("Friday");
        app4.setTreatment(tr4);
        tr4.setAppointment(app4);
        
        Patient patient1 = tr1.getAppointment().getPatient();
        patient1.getTreatments().add(tr1);
        
        Patient patient2 = tr2.getAppointment().getPatient();
        patient2.getTreatments().add(tr2);
        
        Patient patient3 = tr3.getAppointment().getPatient();
        patient3.getTreatments().add(tr3);
        
        Patient patient4 = tr4.getAppointment().getPatient();
        patient4.getTreatments().add(tr4);
        
        
        Medicine med1 = new Medicine();
        med1.setMed("Luminal");
        med1.setDoses(4);
        med1.setFrequency(2);
        
        tr1.getMedicines().add(med1);
        
        Medicine med2 = new Medicine();
        med2.setMed("Luminal");
        med2.setDoses(3);
        med2.setFrequency(5);
        
        tr2.getMedicines().add(med2);
        
        Medicine med3 = new Medicine();
        med3.setMed("Luminal");
        med3.setDoses(5);
        med3.setFrequency(2);
        
        tr3.getMedicines().add(med3);
        
        Medicine med4 = new Medicine();
        med4.setMed("Luminal");
        med4.setDoses(4);
        med4.setFrequency(2);
        
        tr4.getMedicines().add(med4);
        
        System.out.println("Report 1:");
        System.out.println();
        System.out.println("List of Doctor works at the  office at "+dof.getAddress()+" are:");
        
        Iterator<Doctor> doctorName = dof.getDoctors().iterator();
        
        while (doctorName.hasNext()) {
        	Doctor doctor = doctorName.next();
           System.out.println(" - "+doctor.getFName()+ " "+ doctor.getLName());  
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");
        
        System.out.println("Report 2:");
        System.out.println();
        System.out.println("List of Patient at the  office at "+dof.getAddress()+" are:");
        
        Iterator<Patient> patientName = dof.getPatients().iterator();
        
        while (patientName.hasNext()) {
        	Patient patient = patientName.next();
           System.out.println(" - "+patient.getFName()+ " "+ patient.getLName());  
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");
        
        System.out.println("Report 3:");
        System.out.println();
        System.out.println("List of doctors and their corresponding patients at the  office at "+dof.getAddress()+" are:");
        
        Iterator<Doctor> docs =  dof.getDoctors().iterator();
        while (docs.hasNext()) {
	        Doctor doctor = docs.next();
	        System.out.println("Doctor:"+doctor);
	        Iterator<Appointment> apps =  doctor.getAppointments().iterator();
	        while (apps.hasNext()){
	        	Appointment ap = apps.next();
	            System.out.println("- Patient: "+ap.getPatient().getFName()+ " "+ ap.getPatient().getLName());
	        }
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");
        
        
        System.out.println("Report 4:");
        System.out.println();
        System.out.println("List of tratment you can do and the doctor that do it at the  office at "+dof.getAddress()+" are:");
        System.out.println(); 
        Iterator<Appointment> appoint = dof.getAppointments().iterator();
    	 while (appoint.hasNext()) {
    		 Appointment ap = appoint.next();
    		 Doctor d = ap.getDoctor();
	         System.out.println("Doctor:"+ d.toString()); 
		     System.out.println("  Treatment: "+ap.getTreatment().getDesc());
		     System.out.println();
	    
    	 }
     System.out.println("---------------------------------------------------------------------------------");
     
     
     System.out.println("Report 5:");
     System.out.println();
     System.out.println("List of medicines patient received and the doctor that subscribed the medicine at the  office at "+dof.getAddress()+" are:");
     
     Iterator<Appointment> appoint2 = dof.getAppointments().iterator();
     while (appoint2.hasNext()) {
     Appointment ap = appoint2.next();
     Doctor d = ap.getDoctor();
     String namePatient = ap.getPatient().getFName();
     String lnamePatient = ap.getPatient().getLName();
     System.out.println("Patient:" +namePatient+ " "+lnamePatient);
         System.out.println(" the doctor is "+ d.toString());
     Iterator<Medicine> meds = ap.getTreatment().getMedicines().iterator();
     while (meds.hasNext()) {
     
     Medicine md = meds.next();
         System.out.println(" the medicine is "+ md.getMed()+ " with doses "+md.getDoses()+ 
                 " this many times a day "+md.getFrequency());
     }
     }
     System.out.println();
     System.out.println("---------------------------------------------------------------------------------"); 

     System.out.println("Report 6:");
     System.out.println();
     System.out.println("List of tratments and appointment days at the  office at "+dof.getAddress()+" are:");
     
     Iterator<Appointment> appoint3 = dof.getAppointments().iterator();
     while (appoint3.hasNext()) {
	     Appointment ap = appoint3.next();
	     String namePatient = ap.getPatient().getFName();
	     String lnamePatient = ap.getPatient().getLName();
	     System.out.println("Patient:" +namePatient+ " "+lnamePatient);
	     String day = ap.getDay();
	     String time = ap.getTime();
	     System.out.println("Day: "+day+ "at "+time);
	     System.out.println();
     }
     System.out.println("---------------------------------------------------------------------------------"); 
     
     
     System.out.println("Report 7:");
     System.out.println();
     System.out.println("List of Tratament and the day we can do it at the  office at "+dof.getAddress()+" are:");
     
     Iterator<Appointment> appoint5 = dof.getAppointments().iterator();
	 while (appoint5.hasNext()) {
		 Appointment treatment = appoint5.next();

    	 String stDate = treatment.getTreatment().getStDate();
    	 String endDate = treatment.getTreatment().getEndDate();
    	 String description = treatment.getTreatment().getDesc();
    	 
     	String drFN= treatment.getDoctor().getFName();
     	String drLN= treatment.getDoctor().getLName();
        System.out.println("Doctor:  - "+drFN+ " "+ drLN);
        System.out.println("Date: " + stDate+ " - "+endDate);
        System.out.println("Tratment: "+description);
        System.out.println();
     }
     System.out.println("---------------------------------------------------------------------------------");
     
	}
}
