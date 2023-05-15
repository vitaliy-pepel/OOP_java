package Controllers;

import java.util.Comparator;
import java.util.List;
import StudentDomen.User;
import StudentDomen.Teacher;
import StudentService.TeacherService;

// Класс TeacherController с реализацией интерфейса iUserController объектов класса Teacher
public class TeacherController implements iUserController<Teacher> {
    private TeacherService teacherService;

    public TeacherController() {
        teacherService = new TeacherService();
    }

    @Override
    public void create(String firstName, String secondName, int age) {

    }

    // добавление преподавателя
    @Override
    public void addUser(Teacher teacher) {
        teacherService.add(teacher);
    }
    // удаление преподавателя
    @Override
    public void deleteUser(Teacher teacher) {
        teacherService.delete(teacher);
    }

    @Override
    public List<Teacher> getAllUsers() {
        return teacherService.getAll();
    }
    // компаратор
    @Override
    public void sortUsers(Comparator<User> comparator) {
        teacherService.sort(comparator);
    }

    @Override
    public Teacher getUserById(int id) {
        return null;
    }

    // поиск по id
    @Override
    public void getById(int id) {
        Teacher teacher = teacherService.getById(id);
        if (teacher != null) {
            System.out.println(teacher);
        } else {
            System.out.println("Преподаватель не найден");
        }
    }

}

