package Controller;

import java.util.*;

//import javax.jws.WebParam.Mode;

import Model.Student;
import Model.Model;
import View.ViewEng;

public class Controller {
    // Экземпляры модели и представления
    private iGetModel model;
    private iGetView view;

    // Конструктор, передает экземпляры модели и представления
    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    // Метод для запуска приложения
    public void run() {
        Scanner scanner = new Scanner(System.in);

        // Бесконечный цикл
        while (true) {
            // Вывод меню
            view.showView("Choose an action:");
            view.showView("1. Add student");
            view.showView("2. Delete student");
            view.showView("3. Show all students");

            // Считывание выбранного пункта
            int choice = scanner.nextInt();

            // Переход в соответствующую ветку программы
            switch (choice) {
                case 1:
                    // Добавление нового студента
                    view.showView("Enter student name:");
                    String name = scanner.next();
                    view.showView("Enter student number:");
                    long number = scanner.nextLong();
                    Student student = new Student(name, number);
                    model.addStudent(student);
                    view.showView("Student was added.");
                    break;
                case 2:
                    // Удаление студента
                    view.showView("Enter student number to delete:");
                    long num = scanner.nextLong();
                    model.deleteStudent(num);
                    if (model.getStudents().containsKey(num)) {
                        view.showView("Student was not deleted.");
                    } else {
                        view.showView("Student was deleted.");
                    }
                    break;
                case 3:
                    // Вывод всех студентов
                    HashMap<Long, Student> students = model.getStudents();
                    for (Object key : students.keySet()) {
                        view.showView(students.get(key).toString());
                    }
                    break;
                default:
                    // Обработка ошибки
                    view.showView("Wrong choice, try again.");
                    break;
            }
        }
    }
}
