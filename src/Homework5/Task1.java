package Homework5;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;

@FunctionalInterface
interface _task1 <T extends Number> {
    boolean test(T a);
}

public class Task1 {
    public static void main(String[] args) {
        double [] mas = {10, 15, 20, 35, 55, 50};

        System.out.println(Arrays.stream(mas).filter(p -> p % 2 == 1 && p % 5 == 0).average());
    }
}
