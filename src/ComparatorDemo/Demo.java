package ComparatorDemo;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Misha", "Ordyntsev", 18, 81.7),
                new Student("Anna", "Shevchenko", 19, 91.9),
                new Student("Sergii", "Balabanov", 21, 60.1),
                new Student("Anna", "Shvetz", 20, 60.3),
                new Student("Katya", "Morozova", 19, 77.0)
        );
        System.out.println(studentList);
        studentList.sort(new StudentNameComparator());
        System.out.println(studentList);
        studentList.sort(new StudentAvrgComparator().reversed());
        System.out.println(studentList);
        System.out.println("The Best AVRG: " + studentList.iterator().next().getAvrgGrade());
    }
}
