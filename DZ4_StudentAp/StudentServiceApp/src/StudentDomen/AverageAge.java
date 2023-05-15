package StudentDomen;
import java.util.List;

// Класс AverageAge для подсчёта среднего возроста
public class AverageAge<T extends User> {
    private List<T> users;

    public AverageAge(List<T> users) {
        this.users = users;
    }

    // метод подсчета среднего возраста
    public double getAverageAge() {
        int sum = 0;
        for (T user : users) {
            sum += user.getAge();
        }
        return sum / users.size();
    }
}
