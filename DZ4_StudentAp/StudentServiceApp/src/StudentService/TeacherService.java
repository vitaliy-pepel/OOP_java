package StudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import StudentDomen.User;
import StudentDomen.Teacher;
import StudentDomen.UserComparator;

// Класс TeacherService с реализацией интерфейса iUserService объектов класса Teacher
public class TeacherService implements iUserService<Teacher> {
    private List<Teacher> teachers;

    public TeacherService() {
        teachers = new ArrayList<Teacher>();
    }

    // добавление преподавателя
    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }
    // удаление преподавателя
    @Override
    public void delete(Teacher teacher) {
        teachers.remove(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }


    @Override
    public void create(String firstName, String secondName, int age) {

    }

    @Override
    public void sort(Comparator<User> comparator) {
        Collections.sort(teachers, comparator);
    }
    // поиск преподавателя по id
    @Override
    public Teacher getById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null;
    }

    @Override
    public void create(Teacher teacher) {

    }
    // метод сортировки
    @Override
    public void update(Teacher teacher) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == teacher.getId()) {
                teachers.set(i, teacher);
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == id) {
                teachers.remove(i);
                break;
            }
        }
    }
    // вывод всех преподавателей из списка
    public void printSortedTeachers() {
        Collections.sort(teachers, new UserComparator());
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }


}
