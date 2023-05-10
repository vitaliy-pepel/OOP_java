package StudentDomen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Student extends User implements Comparable<Student>{
    private long studentID;

    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }


    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public String getFullName() {
        return "Student{"

                +" " +super.getFirstName()
                +" " +super.getSecondName()
                +", " +super.getAge()+
                ", studentID= " + studentID +
                " }";
    }


    @Override
    public int compareTo(Student o) {

        System.out.println(super.getFirstName()+" - "+o.getFirstName());
        if(super.getAge()==o.getAge())
        {
            if(this.studentID==o.studentID)
            {
                return 0;
            }
            if(this.studentID<o.studentID)
            {
                return -1;
            }
            return 1;
        }
        if(super.getAge()<o.getAge())
        {
            return -1;
        }
        return 1;
    }
}