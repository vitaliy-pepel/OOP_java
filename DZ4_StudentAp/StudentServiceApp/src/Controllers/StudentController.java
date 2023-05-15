package Controllers;

import StudentDomen.Student;
import StudentDomen.Teacher;
import StudentDomen.User;
import StudentService.StudentGroupService;
import StudentService.StudentService;

import java.util.Comparator;
import java.util.List;

public class StudentController implements iUserController<Student> {

    private final StudentService dataService = new StudentService();
    private final StudentGroupService groupService = new StudentGroupService();
    
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }

    @Override
    public void addUser(Teacher teacher) {

    }

    @Override
    public void deleteUser(Teacher teacher) {

    }

    @Override
    public List<Teacher> getAllUsers() {
        return null;
    }

    @Override
    public void sortUsers(Comparator<User> comparator) {

    }

    @Override
    public Teacher getUserById(int id) {
        return null;
    }

    @Override
    public void getById(int id) {

    }

}
