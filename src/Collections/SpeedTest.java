package Collections;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class SpeedTest {

    public static void main(String[] args) {

        LocalDateTime startOfProgram = LocalDateTime.now();

        ArrayList<String> stringArrayList = new ArrayList<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();
        for (double i = 0; i < 10_000_000; i++){
            stringArrayList.add("Num: " + i);
        }
        for (double i = 0; i < 10_000_000; i++) {
            stringLinkedList.add("Num: " + i);
        }

        System.out.println("Size of Lists: " + stringArrayList.size());

        LocalDateTime start = LocalDateTime.now();

        stringArrayList.add(5_000_000, "test");
        LocalDateTime end = LocalDateTime.now();
        long difference = ChronoUnit.MILLIS.between(start, end);
        System.out.println("Difference ArrayList add in middle = " + difference);

        start = LocalDateTime.now();
        stringLinkedList.add(5_000_000, "test");
        end = LocalDateTime.now();
        difference = ChronoUnit.MILLIS.between(start, end);
        System.out.println("Difference LinkedList add in middle = " + difference);

        start = LocalDateTime.now();
        stringArrayList.add(0, "test");
        end = LocalDateTime.now();
        difference = ChronoUnit.MILLIS.between(start, end);
        System.out.println("Difference ArrayList add in start = " + difference);

        start = LocalDateTime.now();
        stringLinkedList.add(0, "test");
        end = LocalDateTime.now();
        difference = ChronoUnit.MILLIS.between(start, end);
        System.out.println("Difference LinkedList add in start = " + difference);

        start = LocalDateTime.now();
        stringArrayList.add("test");
        end = LocalDateTime.now();
        difference = ChronoUnit.MILLIS.between(start, end);
        System.out.println("Difference ArrayList add in end = " + difference);

        start = LocalDateTime.now();
        stringLinkedList.add("test");
        end = LocalDateTime.now();
        difference = ChronoUnit.MILLIS.between(start, end);
        System.out.println("Difference LinkedList add in end = " + difference);

        LocalDateTime endOfProgram = LocalDateTime.now();
        difference = ChronoUnit.MILLIS.between(startOfProgram, endOfProgram);
        System.out.println("All time: " + difference);
    }

}
