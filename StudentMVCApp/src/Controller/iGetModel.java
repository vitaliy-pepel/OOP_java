package Controller;

import java.util.HashMap;
import java.util.List;

import Model.Student;

public interface iGetModel {
    public List<Student> getAllStudent();

    // Реализация метода интерфейса iGetModel
    void addStudent(Student student);

    // Реализация метода интерфейса iGetModel
    void deleteStudent(long number);

    HashMap<Long, Student> getStudents();
}
