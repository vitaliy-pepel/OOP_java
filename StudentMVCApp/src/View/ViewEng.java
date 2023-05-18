package View;

import Controller.iGetView;
import Model.Student;

import java.util.List;
import java.util.Scanner;

//Класс ViewEng на английском

public class ViewEng implements iGetView {
    @Override
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-----Вывод списка студентов-----");
        for(Student person :students)
        {
            System.out.println(person);
        }
        System.out.println("-----Конец списка-----");
    }

    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    // Метода интерфейса iGetView
    @Override
    public void showView(String message) {
        System.out.println(message);
    }
}
