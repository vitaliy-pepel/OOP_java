package StudentService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.Teacher;
import StudentDomen.User;
import StudentDomen.UserComparator;

public class EmploeeService implements iUserService<Emploee> {
    private int count;
    private List<Emploee> emploees;
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }
    @Override
    public void create(String firstName, String secondName, int age) {
       Emploee per = new Emploee(firstName, secondName, age, count);
       count++;
       emploees.add(per);
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
    public List<Emploee> getAll()
    {
        return emploees;
    }

    public List<Emploee> getSortedByFIOStudentGroup(int numberGroup)
    {
        List<Emploee> emps = new ArrayList<>(emploees);
        emps.sort(new UserComparator<Emploee>());
        return emps;
    }
}
