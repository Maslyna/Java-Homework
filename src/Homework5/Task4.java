package Homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> arrayList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        StringBuilder str = new StringBuilder();
        arrayList.forEach(str::append);
        System.out.println(str);

    }

}
