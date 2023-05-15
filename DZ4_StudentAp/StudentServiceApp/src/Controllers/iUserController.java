package Controllers;

import StudentDomen.Teacher;
import StudentDomen.User;

import java.util.Comparator;
import java.util.List;

public interface iUserController<T extends User> {
    void create(String firstName, String secondName, int age);

    void addUser(Teacher teacher);

    void deleteUser(Teacher teacher);

    List<Teacher> getAllUsers();

    void sortUsers(Comparator<User> comparator);

    // поиск учителя по id
    Teacher getUserById(int id);

    void getById(int id);
}
