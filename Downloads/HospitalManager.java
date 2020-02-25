import java.util.ArrayList;
import java.util.Iterator;


public class HospitalManager {
    public static void main(String[] args) {
        
        Hospital uni = new Hospital();
        uni.setName("CIT");
        
        Patient s1 = new Patient();
        s1.setfName("Jolika");
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
        
        uni.getPatients().add(s1);//add student to university
        uni.getPatients().add(s2);
        uni.getPatients().add(s3);
        uni.getPatients().add(s4);
        
        Doctor i1= new Doctor();
        i1.setfName("Petraq");
        i1.setLname("Papajorgji");
        
        s1.setDoctor(i1);//link instructor to student
        s2.setDoctor(i1);
        s3.setDoctor(i1);
        
        Doctor i2= new Doctor();
        i2.setfName("Artur");
        i2.setLname("Jaupaj");
        
        s4.setDoctor(i2);//link instructor to student
        
        uni.getDoctors().add(i1);//add instructor to university
        uni.getDoctors().add(i2);
        
        Trataments c1= new Trataments();
        c1.setcName("Java Programming");
        c1.setcNumber("J23");
        
        Trataments c2= new Trataments();
        c2.setcName("Communication skills");
        c2.setcNumber("CS30");
        
        Trataments c3= new Trataments();
        c3.setcName("DB");
        c3.setcNumber("D123B");
        
        uni.getTrataments().add(c1);//add course to university
        uni.getTrataments().add(c2);
        uni.getTrataments().add(c3);
        
        c1.getPatients().add(s1);//add std to course 1
        c1.getPatients().add(s2);
        c1.getPatients().add(s3);
        c1.getPatients().add(s4);
        c2.getPatients().add(s1);
        c2.getPatients().add(s2);
        c3.getPatients().add(s4);
        c3.getPatients().add(s1);
        c3.getPatients().add(s2); 
        
        i1.getTrataments().add(c1);//add course 1 to instructor
        i2.getTrataments().add(c2);//add course 2 to instructor
        i1.getTrataments().add(c3);
        
        c1.setDoctor(i1);//link instructor 1 to course
        c2.setDoctor(i2);//link instructor 2 to course
        c3.setDoctor(i1);
        
        i1.getPatients().add(s1);//add student to instructor
        i1.getPatients().add(s2);
        i1.getPatients().add(s3);
        i2.getPatients().add(s4);
        
        s1.getTrataments().add(c1);//add course to student
        s1.getTrataments().add(c2);
        s2.getTrataments().add(c1);
        s2.getTrataments().add(c2);
        s3.getTrataments().add(c1);
        s4.getTrataments().add(c1);
        
        System.out.println("CREATING REPORTS");

        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF STUDENTS");
        Iterator iterator1=uni.getPatients().iterator();
        while(iterator1.hasNext())
        {
            Patient s= (Patient)iterator1.next();
            System.out.println(" Student: "+s.getfName()+" "+s.getlName());
        }
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF INSTRUCTORS");
        Iterator iterator2=uni.getDoctors().iterator();
        while(iterator2.hasNext())
        {
            Doctor i=(Doctor)iterator2.next();
            System.out.println("Instructor: "+i.getfName()+" "+i.getLname());
        }
        
         System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF COURSES");
        Iterator iterator3=uni.getTrataments().iterator();
        while(iterator3.hasNext())
        {
            Trataments c=(Trataments)iterator3.next();
            System.out.println(" The course name is: "+c.getcName()+" "+c.getcNumber());
   
        }
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF STUDENTS AND THEIR ADVISORS");
        Iterator iterator4=uni.getPatients().iterator();
        while(iterator4.hasNext())
        {
            Patient s= (Patient)iterator4.next();
            System.out.println(" Student: "+s.getfName()+" "+s.getlName());
            System.out.println("  The advisor is: "+s.getDoctor().getfName()+" "+s.getDoctor().getLname());
        }
               
       
        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF THE ADVISORS AND THEIR STUDENTS");
        Iterator iterator5=uni.getDoctors().iterator();
        while(iterator5.hasNext())
        {
            Doctor i=(Doctor)iterator5.next();
            System.out.println(" Adivsor: "+i.getfName()+" "+i.getLname());
            Iterator i_st= i.getPatients().iterator();
            while(i_st.hasNext()){
                Patient st= (Patient)i_st.next();
                System.out.println("  Name of the student "+st.getfName()+" "+st.getlName());
            }
        }
                
        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF COURSES + NAME OF INSTRUCTORS + NAME OF STUDENTS");
        Iterator iterator6=uni.getTrataments().iterator();
        while(iterator6.hasNext())
        {
            Trataments c=(Trataments)iterator6.next();
            System.out.println(" The course name is: "+c.getcName()+" "+c.getcNumber());
            System.out.println("  Name of the instructor "+c.getDoctor().getfName()+" "+c.getDoctor().getLname());
            Iterator iterator7= c.getPatients().iterator();
            while(iterator7.hasNext())
            {
                Patient stud=(Patient)iterator7.next();
                System.out.println("   Name of the student: "+stud.getfName()+" "+stud.getlName());
            }
        }
        
        //transfering the load of the st from instructor1 to instructor2
        System.out.println("");
        System.out.println("");
        System.out.println("Transfering everything from instructor 1 to instructor 2");
        System.out.println("--------------------------------------------------------------------");
        
        //i2.setStudents(i1.getPatients()); this will replace the students of i2 with the ones of i1
        //i2.setTrataments(i1.getTrataments());
        
        //for each student of i2 need to point to i1
        Iterator iterator8 = i1.getPatients().iterator();
        while(iterator8.hasNext())
        {
            Patient p = (Patient)iterator8.next();
            p.setDoctor(i2);
        }
        
        //add the students from i1 to i2
        Iterator iterator9 = i1.getPatients().iterator();
        while(iterator9.hasNext())
        {
            Patient ok = (Patient)iterator9.next();
            i2.getPatients().add(ok);
        }
        
        
         //assign to each course of i1 to i2
        Iterator iterator10= i1.getTrataments().iterator();
        while(iterator10.hasNext())
        {
            Trataments ccc= (Trataments)iterator10.next();
            ccc.setDoctor(i2);
        }
        
        //assign the courses from i1 to i2
        Iterator iterator11 = i1.getTrataments().iterator();
        while(iterator11.hasNext())
        {
            Trataments ik = (Trataments)iterator11.next();
            i2.getTrataments().add(ik);
        }
        System.out.println("");
        System.out.println("LIST OF STUDENTS FOR INSTRUCTOR 2");        
        Iterator iterator12=i2.getPatients().iterator();
        int i=1;
        while(iterator12.hasNext())
        {
            Patient q = (Patient)iterator12.next();
            System.out.println(" Student "+i+" of inst 2 is: "+q.getfName()+" "+q.getlName());
            i++;
        }
        
        System.out.println("");
        System.out.println("LIST OF COURSES FOR INSTRUCTOR 2");        
        Iterator iterator13=i2.getTrataments().iterator();
        while(iterator13.hasNext())
        {
            Trataments trataments =(Trataments)iterator13.next();
            System.out.println(" Course: "+trataments.getcName());
        }
        
        System.out.println("");
        System.out.println("LIST OF STUDENTS AND THEIR ADVISER");
        
        Iterator iterator14 = uni.getPatients().iterator();
        while(iterator14.hasNext())
        {
            Patient s= (Patient)iterator14.next();
            Doctor in= s.getDoctor();
            System.out.println(" Student: "+s.getfName()+" and his advisor: "+in.getfName());
        } 

        System.out.println("");
        // list of courses and their instructor
        System.out.println("LIST OF COURSES AND THEIR INSTRUCTORS");

        Iterator iterator15 = uni.getTrataments().iterator();
        while(iterator15.hasNext())
        {
            Trataments cc = (Trataments)iterator15.next();
            Doctor in = cc.getDoctor();
            System.out.println(" Course name: "+cc.getcName()+" and instructor:"+in.getfName());
        }

        System.out.println("");
            System.out.println("LIST OF COURSES + NAME OF INSTRUCTORS + NAME OF STUDENTS");
            Iterator iterator16=uni.getTrataments().iterator();
            while(iterator16.hasNext())
        {
            Trataments c=(Trataments)iterator16.next();
            System.out.println(" The course name is: "+c.getcName()+" "+c.getcNumber());
            System.out.println("  Name of the instructor "+c.getDoctor().getfName()+" "+c.getDoctor().getLname());
            Iterator iterator17= c.getPatients().iterator();
            while(iterator17.hasNext())
            {
                Patient stud=(Patient)iterator17.next();
                System.out.println("   Name of the student: "+stud.getfName()+" "+stud.getlName());
            }
        }
        
        //Setcourses and students null for instructor 1
        i1.setTrataments(new ArrayList());
        i1.setPatients(new ArrayList());
    
    }
}