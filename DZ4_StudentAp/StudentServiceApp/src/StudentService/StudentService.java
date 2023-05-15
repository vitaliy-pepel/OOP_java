package StudentService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.Teacher;
import StudentDomen.User;

public class StudentService implements iUserService<Student> {
    private int count;
    private List<Student> students;
    public StudentService() {
        this.students = new ArrayList<Student>();
    }
    @Override
    public void create(String firstName, String secondName, int age) {
       Student per = new Student(firstName, secondName, age, count);
       count++;  
       students.add(per);      
    }

    @Override
    public void sort(Comparator<User> comparator) {

    }

    @Override
    public Teacher getById(int id) {
        return null;
    }

    @Override
    public void create(Teacher teacher) {

    }

    @Override
    public void update(Teacher teacher) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void add(Teacher teacher) {

    }

    @Override
    public void delete(Teacher teacher) {

    }

    @Override
    public List<Student> getAll() {
        return students;
    }   

    // public List<Student> getAll()
    // {
    //     return students;
    // }


}
