package ComparatorDemo;

import java.util.Comparator;

public class StudentAvrgComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAvrgGrade(), o2.getAvrgGrade());
    }
}