package Homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int [] mas = {1, 2, 3, 4, 5};
        StringBuilder str = new StringBuilder();
        Arrays.stream(mas).forEach(i -> str.append(Integer.toString(i)));
        System.out.println(str);

    }

}
