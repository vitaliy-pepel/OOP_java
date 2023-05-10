package StudentDomen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private int streamNumber;
    private List<StudentGroup> groups;

    public StudentStream(int streamNumber) {
        this.streamNumber = streamNumber;
        groups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }

    public void printGroups() {
        System.out.println("Stream " + streamNumber + ":");
        for (StudentGroup group : groups) {
            System.out.println("Group " + group.getGroupName() + ":");
            for (Student student : group.getStudents()) {
                System.out.println(student.getFullName());
            }
        }
    }

    public void sortGroups() {
        Collections.sort(groups);
    }
}
