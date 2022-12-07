package Homework5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("David", "McCalagan", 20));
        personList.add(new Person("Mykhailo", "Ordyntsev", 18));
        personList.add(new Person("Sasha", "Bukin", 19));
        personList.add(new Person("Mark", "Arvilii", 50));
        personList.add(new Person("MarkusIlianMaximusAve", "Arvilii", 50));

        System.out.println(personList.stream().filter(person -> person.firstName.length() < 15).max(new PersonAgeComparator()));

    }

}
