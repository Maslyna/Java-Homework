package Homework5;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("teststring", 1);
        map.put("test", 2);
        map.put("string", 3);
        map.put("amogus", 4);
        map.put("sus", 5);

        List<Integer> list = new ArrayList<>();

        int sum = map.entrySet().stream()
                .filter(p -> p.getKey().length() < 7)
                .flatMapToInt(n -> IntStream.of(n.getValue()))
                .sum();
        System.out.println(sum);

    }
}
