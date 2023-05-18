package Model;

import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

//Класс Model вариант модели с хранилищем типа HashMap

public class Model implements iGetModel {

    // Хранилище типа HashMap
    private HashMap<Long,Student> students = new HashMap<>();

    public Model(List<Student> students) {
    }

    @Override
    public List<Student> getAllStudent() {
        return null;
    }

    // Реализация метода интерфейса iGetModel
    @Override
    public void addStudent(Student student) {
        // Добавление студента в хранилище
        students.put(student.getNumber(), student);
    }

    // Реализация метода интерфейса iGetModel
    @Override
    public void deleteStudent(long number) {
        // Удаление студента из хранилища
        if (students.containsKey(number)) {
            students.remove(number);
        }
    }
    // Геттер для получения хранилища
    public HashMap<Long, Student> getStudents() {
        return students;
    }
}