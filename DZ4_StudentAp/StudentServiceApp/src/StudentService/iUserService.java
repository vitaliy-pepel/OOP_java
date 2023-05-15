package StudentService;

import StudentDomen.Teacher;
import StudentDomen.User;

import java.util.Comparator;
import java.util.List;

public interface iUserService<T> {
    void add(Teacher teacher);

    void delete(Teacher teacher);

    List<T> getAll();
    void create(String firstName, String secondName, int age);

    void sort(Comparator<User> comparator);

    Teacher getById(int id);

    void create(Teacher teacher);

    void update(Teacher teacher);

    void delete(int id);
}
