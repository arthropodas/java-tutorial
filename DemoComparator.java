import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student other) {
        System.out.println("compareTo is calling...........");
        return this.rollNo - other.rollNo;
    }

    @Override
    public String toString() {
        return name + " (" + rollNo + ")";
    }
}

public class DemoComparator {
    public static void main(String[] args) {
        Comparator<Student> com = (i, j) -> i.rollNo > j.rollNo ? 1 : -1;

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 2));

        Collections.sort(students, com); // uses the custom comparator

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
