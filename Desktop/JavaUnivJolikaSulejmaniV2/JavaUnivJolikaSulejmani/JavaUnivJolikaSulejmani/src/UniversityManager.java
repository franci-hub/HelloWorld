import java.util.ArrayList;
import java.util.Iterator;


public class UniversityManager {
    public static void main(String[] args) {
        
        University uni = new University();
        uni.setName("CIT");
        
        Student s1 = new Student();
        s1.setFName("Jolika");
        s1.setLName("Sulejmani");
        
        Student s2 = new Student();
        s2.setFName("Super");
        s2.setLName("Mario");
        
        Student s3 = new Student();
        s3.setFName("Luigji");
        s3.setLName("Bros");
        
        Student s4 = new Student();
        s4.setFName("Princess");
        s4.setLName("Diana");
        
        uni.getStudents().add(s1);//add student to university
        uni.getStudents().add(s2);
        uni.getStudents().add(s3);
        uni.getStudents().add(s4);
        
        Instructor i1= new Instructor();
        i1.setFName("Petraq");
        i1.setLname("Papajorgji");
        
        s1.setInstructor(i1);//link instructor to student
        s2.setInstructor(i1);
        s3.setInstructor(i1);
        
        Instructor i2= new Instructor();
        i2.setFName("Artur");
        i2.setLname("Jaupaj");
        
        s4.setInstructor(i2);//link instructor to student
        
        uni.getInstructors().add(i1);//add instructor to university
        uni.getInstructors().add(i2);
        
        Course c1= new Course();
        c1.setCName("Java Programming");
        c1.setCNumber("J23");
        
        Course c2= new Course();
        c2.setCName("Communication skills");
        c2.setCNumber("CS30");
        
        Course c3= new Course();
        c3.setCName("DB");
        c3.setCNumber("D123B");
        
        uni.getCourses().add(c1);//add course to university
        uni.getCourses().add(c2);
        uni.getCourses().add(c3);
        
        c1.getStudents().add(s1);//add std to course 1
        c1.getStudents().add(s2);
        c1.getStudents().add(s3);
        c1.getStudents().add(s4);
        c2.getStudents().add(s1);
        c2.getStudents().add(s2);
        c3.getStudents().add(s4);
        c3.getStudents().add(s1);
        c3.getStudents().add(s2); 
        
        i1.getCourses().add(c1);//add course 1 to instructor
        i2.getCourses().add(c2);//add course 2 to instructor
        i1.getCourses().add(c3);
        
        c1.setInstructor(i1);//link instructor 1 to course
        c2.setInstructor(i2);//link instructor 2 to course
        c3.setInstructor(i1);
        
        i1.getStudents().add(s1);//add student to instructor
        i1.getStudents().add(s2);
        i1.getStudents().add(s3);
        i2.getStudents().add(s4);
        
        s1.getCourses().add(c1);//add course to student
        s1.getCourses().add(c2);
        s2.getCourses().add(c1);
        s2.getCourses().add(c2);
        s3.getCourses().add(c1);
        s4.getCourses().add(c1);
        
        System.out.println("CREATING REPORTS");

        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF STUDENTS");
        Iterator iterator1=uni.getStudents().iterator();
        while(iterator1.hasNext())
        {
            Student s= (Student)iterator1.next();
            System.out.println(" Student: "+s.getFName()+" "+s.getLName());
        }
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF INSTRUCTORS");
        Iterator iterator2=uni.getInstructors().iterator();
        while(iterator2.hasNext())
        {
            Instructor i=(Instructor)iterator2.next();
            System.out.println("Instructor: "+i.getFName()+" "+i.getLname());
        }
        
         System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF COURSES");
        Iterator iterator3=uni.getCourses().iterator();
        while(iterator3.hasNext())
        {
            Course c=(Course)iterator3.next();
            System.out.println(" The course name is: "+c.getCName()+" "+c.getCNumber());
   
        }
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF STUDENTS AND THEIR ADVISORS");
        Iterator iterator4=uni.getStudents().iterator();
        while(iterator4.hasNext())
        {
            Student s= (Student)iterator4.next();
            System.out.println(" Student: "+s.getFName()+" "+s.getLName());
            System.out.println("  The advisor is: "+s.getInstructor().getFName()+" "+s.getInstructor().getLname());
        }
               
       
        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF THE ADVISORS AND THEIR STUDENTS");
        Iterator iterator5=uni.getInstructors().iterator();
        while(iterator5.hasNext())
        {
            Instructor i=(Instructor)iterator5.next();
            System.out.println(" Adivsor: "+i.getFName()+" "+i.getLname());
            Iterator i_st= i.getStudents().iterator();
            while(i_st.hasNext()){
                Student st= (Student)i_st.next();
                System.out.println("  Name of the student "+st.getFName()+" "+st.getLName());
            }
        }
                
        System.out.println("--------------------------------------------------------------------");
        System.out.println("LIST OF COURSES + NAME OF INSTRUCTORS + NAME OF STUDENTS");
        Iterator iterator6=uni.getCourses().iterator();
        while(iterator6.hasNext())
        {
            Course c=(Course)iterator6.next();
            System.out.println(" The course name is: "+c.getCName()+" "+c.getCNumber());
            System.out.println("  Name of the instructor "+c.getInstructor().getFName()+" "+c.getInstructor().getLname());
            Iterator iterator7= c.getStudents().iterator();
            while(iterator7.hasNext())
            {
                Student stud=(Student)iterator7.next();
                System.out.println("   Name of the student: "+stud.getFName()+" "+stud.getLName());
            }
        }
        
        //transfering the load of the st from instructor1 to instructor2
        System.out.println("");
        System.out.println("");
        System.out.println("Transfering everything from instructor 1 to instructor 2");
        System.out.println("--------------------------------------------------------------------");
        
        //i2.setStudents(i1.getStudents()); this will replace the students of i2 with the ones of i1
        //i2.setCourses(i1.getCourses());
        
        //for each student of i2 need to point to i1
        Iterator iterator8 = i1.getStudents().iterator();
        while(iterator8.hasNext())
        {
            Student p = (Student)iterator8.next();
            p.setInstructor(i2);
        }
        
        //add the students from i1 to i2
        Iterator iterator9 = i1.getStudents().iterator();
        while(iterator9.hasNext())
        {
            Student ok = (Student)iterator9.next();
            i2.getStudents().add(ok);
        }
        
        
         //assign to each course of i1 to i2
        Iterator iterator10= i1.getCourses().iterator();
        while(iterator10.hasNext())
        {
            Course ccc= (Course)iterator10.next();
            ccc.setInstructor(i2);
        }
        
        //assign the courses from i1 to i2
        Iterator iterator11 = i1.getCourses().iterator();
        while(iterator11.hasNext())
        {
            Course ik = (Course)iterator11.next();
            i2.getCourses().add(ik);
        }
        System.out.println("");
        System.out.println("LIST OF STUDENTS FOR INSTRUCTOR 2");        
        Iterator iterator12=i2.getStudents().iterator();
        int i=1;
        while(iterator12.hasNext())
        {
            Student q = (Student)iterator12.next();
            System.out.println(" Student "+i+" of inst 2 is: "+q.getFName()+" "+q.getLName());
            i++;
        }
        
        System.out.println("");
        System.out.println("LIST OF COURSES FOR INSTRUCTOR 2");        
        Iterator iterator13=i2.getCourses().iterator();
        while(iterator13.hasNext())
        {
            Course course =(Course)iterator13.next();
            System.out.println(" Course: "+course.getCName());
        }
        
        System.out.println("");
        System.out.println("LIST OF STUDENTS AND THEIR ADVISER");
        
        Iterator iterator14 = uni.getStudents().iterator();
        while(iterator14.hasNext())
        {
            Student s= (Student)iterator14.next();
            Instructor in= s.getInstructor();
            System.out.println(" Student: "+s.getFName()+" and his advisor: "+in.getFName());
        } 

        System.out.println("");
        // list of courses and their instructor
        System.out.println("LIST OF COURSES AND THEIR INSTRUCTORS");

        Iterator iterator15 = uni.getCourses().iterator();
        while(iterator15.hasNext())
        {
            Course cc = (Course)iterator15.next();
            Instructor in = cc.getInstructor();
            System.out.println(" Course name: "+cc.getCName()+" and instructor:"+in.getFName());
        }

        System.out.println("");
            System.out.println("LIST OF COURSES + NAME OF INSTRUCTORS + NAME OF STUDENTS");
            Iterator iterator16=uni.getCourses().iterator();
            while(iterator16.hasNext())
        {
            Course c=(Course)iterator16.next();
            System.out.println(" The course name is: "+c.getCName()+" "+c.getCNumber());
            System.out.println("  Name of the instructor "+c.getInstructor().getFName()+" "+c.getInstructor().getLname());
            Iterator iterator17= c.getStudents().iterator();
            while(iterator17.hasNext())
            {
                Student stud=(Student)iterator17.next();
                System.out.println("   Name of the student: "+stud.getFName()+" "+stud.getLName());
            }
        }
        
        //Setcourses and students null for instructor 1
        i1.setCourses(new ArrayList());
        i1.setStudents(new ArrayList());
    
    }
}