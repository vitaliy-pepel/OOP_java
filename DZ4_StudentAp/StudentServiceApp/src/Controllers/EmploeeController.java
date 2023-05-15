package Controllers;

import StudentDomen.Emploee;
import StudentDomen.Teacher;
import StudentDomen.User;
import StudentService.EmploeeService;

import java.util.Comparator;
import java.util.List;

public class EmploeeController implements iUserController<Emploee> {
    private final EmploeeService empService = new EmploeeService();

    @Override
    public void create(String firstName, String secondName, int age) {
        empService.create(firstName, secondName, age);
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

    static public <T extends Emploee> void paySalary(T person)
    {
        System.out.println(((User) person).getFirstName()+" зп 10000р ");
    }

    static public <T extends Number> Double mean(T[] num)
    {
        double sum = 0.0;
        for(int i =0; i<num.length;i++)
        {
            sum= sum+num[i].doubleValue();
        }
        sum=sum/num.length;
        return sum;
    }
}
