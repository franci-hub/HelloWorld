import java.util.ArrayList;
import java.util.Iterator;


public class HospitalManager {
    public static void main(String[] args) {
        
        Hospital uni = new Hospital();
        uni.setName("Nene Tereza");
        
        Patient s1 = new Patient();
        s1.setfName("Naim");
        s1.setlName("Sulejmani");
        
        Patient s2 = new Patient();
        s2.setfName("Super");
        s2.setlName("Mario");
        
        Patient s3 = new Patient();
        s3.setfName("Luigji");
        s3.setlName("Bros");
        
        Patient s4 = new Patient();
        s4.setfName("Princess");
        s4.setlName("Diana");
        
        uni.getPatients().add(s1);//add patient to hospital
        uni.getPatients().add(s2);
        uni.getPatients().add(s3);
        uni.getPatients().add(s4);
        
        Doctor i1= new Doctor();
        i1.setfName("Gregor");
        i1.setLname("Gjylameti");
        
        s1.setDoctor(i1);//link doctor to patient
        s2.setDoctor(i1);
        s3.setDoctor(i1);
        
        Doctor i2= new Doctor();
        i2.setfName("Artur");
        i2.setLname("Jaupaj");
        
        s4.setDoctor(i2);//link doctor to patient
        
        uni.getDoctors().add(i1);//add instructor to university
        uni.getDoctors().add(i2);
        
        Trataments c1= new Trataments();
        c1.setcName("Gjendje gripale");
        c1.setcNumber("J23");
        
        Trataments c2= new Trataments();
        c2.setcName("Dialize");
        c2.setcNumber("CS30");
        
        Trataments c3= new Trataments();
        c3.setcName(" trataments genera");
        c3.setcNumber("D123B");
        
        uni.getTrataments().add(c1);//add trataments to Hospital
        uni.getTrataments().add(c2);
        uni.getTrataments().add(c3);
        
        c1.getPatients().add(s1);//add patient to trataments 1
        c1.getPatients().add(s2);
        c1.getPatients().add(s3);
        c1.getPatients().add(s4);
        c2.getPatients().add(s1);
        c2.getPatients().add(s2);
        c3.getPatients().add(s4);
        c3.getPatients().add(s1);
        c3.getPatients().add(s2); 
        
        i1.getTrataments().add(c1);//add tratament 1 to doctor
        i2.getTrataments().add(c2);//add tratament 2 to doxtor
        i1.getTrataments().add(c3);
        
        c1.setDoctor(i1);//link doctor 1 to tratament
        c2.setDoctor(i2);//link instructor 2 to tratament
        c3.setDoctor(i1);
        
        i1.getPatients().add(s1);//add patient to doctor
        i1.getPatients().add(s2);
        i1.getPatients().add(s3);
        i2.getPatients().add(s4);
        
        s1.getTrataments().add(c1);//add tratament to patient
        s1.getTrataments().add(c2);
        s2.getTrataments().add(c1);
        s2.getTrataments().add(c2);
        s3.getTrataments().add(c1);
        s4.getTrataments().add(c1);
        
        System.out.println("CREATING REPORTS");
        System.out.println();
        System.out.println("- Report 1 ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF Patients");
        Iterator iterator1=uni.getPatients().iterator();
        while(iterator1.hasNext())
        {
            Patient s= (Patient)iterator1.next();
            System.out.println(" Patient: "+s.getfName()+" "+s.getlName());
        }
        System.out.println();
        System.out.println("- Report 2 ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF Doctors");
        Iterator iterator2=uni.getDoctors().iterator();
        while(iterator2.hasNext())
        {
            Doctor i=(Doctor)iterator2.next();
            System.out.println("Doctor: "+i.getfName()+" "+i.getLname());
        }
        System.out.println();
        System.out.println("- Report 3 ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF Trataments");
        Iterator iterator3=uni.getTrataments().iterator();
        while(iterator3.hasNext())
        {
            Trataments c=(Trataments)iterator3.next();
            System.out.println(" The tratament name is: "+c.getcName()+" "+c.getcNumber());
   
        }
        System.out.println();
        System.out.println("- Report 4 ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF Patient AND THEIR Doctor");
        Iterator iterator4=uni.getPatients().iterator();
        while(iterator4.hasNext())
        {
            Patient s= (Patient)iterator4.next();
            System.out.println(" Patient: "+s.getfName()+" "+s.getlName());
            System.out.println("  The Doctor is: "+s.getDoctor().getfName()+" "+s.getDoctor().getLname());
        }
               
       System.out.println();
        System.out.println("- Report 5 ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF THE Doctor AND THEIR Patients");
        Iterator iterator5=uni.getDoctors().iterator();
        while(iterator5.hasNext())
        {
            Doctor i=(Doctor)iterator5.next();
            System.out.println(" Doctor: "+i.getfName()+" "+i.getLname());
            Iterator i_st= i.getPatients().iterator();
            while(i_st.hasNext()){
                Patient st= (Patient)i_st.next();
                System.out.println("  Name of the patient "+st.getfName()+" "+st.getlName());
            }
        }
        System.out.println();    
        System.out.println("- Report 6 ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF Tratament + NAME OF Doctor + NAME OF Patient");
        Iterator iterator6=uni.getTrataments().iterator();
        while(iterator6.hasNext())
        {
            Trataments c=(Trataments)iterator6.next();
            System.out.println(" The Tratament name is: "+c.getcName()+" "+c.getcNumber());
            System.out.println("  Name of the Doctor "+c.getDoctor().getfName()+" "+c.getDoctor().getLname());
            Iterator iterator7= c.getPatients().iterator();
            while(iterator7.hasNext())
            {
                Patient stud=(Patient)iterator7.next();
                System.out.println("   Name of the Patient: "+stud.getfName()+" "+stud.getlName());
            }
        }
        
        //transfering the load of the st from Doctor1 to Doctor2
        System.out.println("");
        System.out.println("");
        System.out.println("Transfering everything from Doctor 1 to Doctor 2");
        System.out.println("--------------------------------------------------------------------");
        
        //i2.setPatients(i1.getPatients()); this will replace the Patients of i2 with the ones of i1
        //i2.setTrataments(i1.getTrataments());
        
        //for each Patients of i2 need to point to i1
        Iterator iterator8 = i1.getPatients().iterator();
        while(iterator8.hasNext())
        {
            Patient p = (Patient)iterator8.next();
            p.setDoctor(i2);
        }
        
        //add the Patients from i1 to i2
        Iterator iterator9 = i1.getPatients().iterator();
        while(iterator9.hasNext())
        {
            Patient ok = (Patient)iterator9.next();
            i2.getPatients().add(ok);
        }
        
        
         //assign to each tratament of i1 to i2
        Iterator iterator10= i1.getTrataments().iterator();
        while(iterator10.hasNext())
        {
            Trataments ccc= (Trataments)iterator10.next();
            ccc.setDoctor(i2);
        }
        
        //assign the tratament from i1 to i2
        Iterator iterator11 = i1.getTrataments().iterator();
        while(iterator11.hasNext())
        {
            Trataments ik = (Trataments)iterator11.next();
            i2.getTrataments().add(ik);
        }
        System.out.println("");
        System.out.println("LIST OF Patients FOR Doctor 2");        
        Iterator iterator12=i2.getPatients().iterator();
        int i=1;
        while(iterator12.hasNext())
        {
            Patient q = (Patient)iterator12.next();
            System.out.println(" Patient "+i+" of inst 2 is: "+q.getfName()+" "+q.getlName());
            i++;
        }
        
        System.out.println("");
        System.out.println("LIST OF Treataments FOR Doctor 2");        
        Iterator iterator13=i2.getTrataments().iterator();
        while(iterator13.hasNext())
        {
            Trataments trataments =(Trataments)iterator13.next();
            System.out.println(" Tratament: "+trataments.getcName());
        }
        System.out.println();
        System.out.println("- Report 7 ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("");
        System.out.println("LIST OF Patisnets AND THEIR Doctor");
        
        Iterator iterator14 = uni.getPatients().iterator();
        while(iterator14.hasNext())
        {
            Patient s= (Patient)iterator14.next();
            Doctor in= s.getDoctor();
            System.out.println(" Patient: "+s.getfName()+" and his docotr: "+in.getfName());
        } 
        System.out.println();
        System.out.println("- Report 8 ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("");
        // list of courses and their instructor
        System.out.println("LIST OF Tratament AND THEIR docotr");

        Iterator iterator15 = uni.getTrataments().iterator();
        while(iterator15.hasNext())
        {
            Trataments cc = (Trataments)iterator15.next();
            Doctor in = cc.getDoctor();
            System.out.println(" Tratament name: "+cc.getcName()+" and Doctor:"+in.getfName());
        }
        System.out.println();
        System.out.println("- Report 9 ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("");
            System.out.println("LIST OF Tratament + NAME OF Doctor + NAME OF Patient");
            Iterator iterator16=uni.getTrataments().iterator();
            while(iterator16.hasNext())
        {
            Trataments c=(Trataments)iterator16.next();
            System.out.println(" The tratament name is: "+c.getcName()+" "+c.getcNumber());
            System.out.println("  Name of the doctor "+c.getDoctor().getfName()+" "+c.getDoctor().getLname());
            Iterator iterator17= c.getPatients().iterator();
            while(iterator17.hasNext())
            {
                Patient stud=(Patient)iterator17.next();
                System.out.println("   Name of the patient: "+stud.getfName()+" "+stud.getlName());
            }
        }
        
        //Settratament and patients null for doctor 1
        i1.setTrataments(new ArrayList());
        i1.setPatients(new ArrayList());
    
    }
}