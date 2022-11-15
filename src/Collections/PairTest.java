package Collections;

public class PairTest {

    public static void main(String[] args) {
        Pair<String, Integer> firstPair = new Pair<>("Hello World", 10);
        Pair<String, Integer> secondPair = new Pair<>("Bye World", 50);

        boolean equals = firstPair.equals(secondPair);
        String format = "First pair: %s \nsecond pair: %s \nare equals: %s";

        System.out.printf((format) + "%n", firstPair, secondPair, equals);
    }

}
