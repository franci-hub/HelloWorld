
import java.util.Iterator;


public class OfficeManager {
    public static void main(String[] args) {
        DocOffice dof = new DocOffice();
        dof.setAddress("6 Andon Cajuapi");
        
        //create doctors
        Doctor d1 = new Doctor();
        d1.setFName("Bes");
        d1.setLName("Sallaku");
        
        dof.getDoctors().add(d1);
        
        Doctor d2 = new Doctor();
        d2.setFName("Bleona");
        d2.setLName("Qerreti");
        
        dof.getDoctors().add(d2);
        
        Patient p1 = new Patient();
        p1.setFName("Stress");
        p1.setLName("Noisy");
        
        dof.getPatients().add(p1);
        
        Patient p2 = new Patient();
        p2.setFName("Alketa");
        p2.setLName("Vejsiu");
        
        dof.getPatients().add(p2);
        
        
        Appointment app1 = new Appointment();
        app1.setDay("Monday");
        app1.setTime("10:00");
        app1.setDoctor(d1);
        d1.getAppointments().add(app1);
        app1.setPatient(p1);
        
        dof.getAppointments().add(app1);
        
        Appointment app2 = new Appointment();
        app2.setDay("Monday");
        app2.setTime("10:00");
        app2.setDoctor(d2);
        d2.getAppointments().add(app2);
        app2.setPatient(p2);
        
        dof.getAppointments().add(app1);
        
        Treatment tr1 = new Treatment();
        tr1.setDesc("Nervous breakdown");
        tr1.setStDate("Monday");
        tr1.setEndDate("Sunday");
        app1.setTreatment(tr1);
        tr1.setAppointment(app1);
        
        Patient patient = tr1.getAppointment().getPatient();
        patient.getTreatments().add(tr1);
        
        Medicine med1 = new Medicine();
        med1.setMed("Luminal");
        med1.setDoses(4);
        med1.setFrequency(2);
        
        tr1.getMedicines().add(med1);
        
        System.out.println("List of doctors and their corresponding patients");
        
        Iterator docs =  dof.getDoctors().iterator();
        while (docs.hasNext()) {
        Doctor doctor = (Doctor)docs.next();
        System.out.println(doctor);
        Iterator apps =  doctor.getAppointments().iterator();
        while (apps.hasNext()){
        Appointment ap = (Appointment)apps.next();
            System.out.println("..and the patient is "+ap.getPatient().getFName()+ " "+ ap.getPatient().getLName());
        }
            
            System.out.println("list of medicines patient "+p1.getFName()+" "+p1.getLName() +
                    " received and the doctor that subscribed the medicine");
         Iterator appoint = p1.getAppointments().iterator();
         while (appoint.hasNext()) {
         Appointment ap = (Appointment)appoint.next();
         Doctor d = ap.getDoctor();
             System.out.println(" the doctor is "+ d.toString());
         Iterator meds = ap.getTreatment().getMedicines().iterator();
         while (meds.hasNext()) {
         
         Medicine md = (Medicine)meds.next();
             System.out.println(" the medicine is "+ md.getMed()+ " with doses "+md.getDoses()+ 
                     " this many times a day "+md.getFrequency());
         }
         }
        }
        
    }
}
