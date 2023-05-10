import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.User;
import StudentDomen.StudentStream;


public class Main {
    public static void main(String[] args) {
        StudentStream stream = new StudentStream(1);

        StudentGroup group1 = new StudentGroup("Group A");
        group1.addStudent(new Student("Сергей", "Иванов", 22, (long)101));
        group1.addStudent(new Student("Андрей", "Сидоров", 22, (long)111));
        group1.addStudent(new Student("Иван", "Петров", 22, (long)121));

        StudentGroup group2 = new StudentGroup("Group B");
        group2.addStudent(new Student("Игорь", "Иванов", 23, (long)301));
        group2.addStudent(new Student("Даша", "Цветкова", 23, (long)171));

        stream.addGroup(group1);
        stream.addGroup(group2);

        for (StudentGroup group : stream) {
            System.out.println(group.getGroupName());
        }

        stream.printGroups();
        System.out.println("************ Sorted groups ************");
        stream.sortGroups();
        stream.printGroups();
    }
}