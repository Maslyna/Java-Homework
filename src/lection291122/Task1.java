package lection291122;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class Task1 {

    private static final String EMPTY = "";
    private static final String SPACE = " ";

    private Task1() {
    }


    public static Map<String, Integer> calcWordFrequency(String text) {
        Map<String, Integer> resultMap = new HashMap<>();
        String[] words = text
                .replace("\n", SPACE)
                .replace(" — ", SPACE)
                .replace("  ", SPACE)
                .replace(",", EMPTY)
                .replace("!", EMPTY)
                .split(SPACE);
        System.out.println(Arrays.toString(words));
        for (String word : words) {
            Integer oldCount = resultMap.get(word);
            Integer newCount = oldCount == null ? 1 : oldCount + 1;
            resultMap.put(word, newCount);
        }

        return resultMap;
    }

}

class Demo {
    private static final String EMPTY = "";
    private static final String SPACE = " ";

    public static void main(String[] args) {
        String text = """
                Even if I call you18
                I won't explain the reasons
                Just don't yell
                Probably, change the numbers
                The others' voices and faces
                I still can't sleep
                Take me away from my thoughts
                Everything for two of us and everything is water
                Your love melts before eyes
                Of mine — cotton candy
                """;// Знайдіть щось по тексту нормального

        System.out.println(Task1.calcWordFrequency(text));

    }
}

