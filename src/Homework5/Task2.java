package Homework5;

import java.util.*;


public class Task2 {

    private interface containsOverNum{
        abstract public boolean test(ArrayList<String> s, String s1);
    }

    private static void task2(String str){
        String[] strings = str.split("\n");
        ArrayList<String> stringArrayList = new ArrayList<>();
        Arrays.stream(strings)
                .filter(s -> s.length() > 45)
                .forEach(s -> {
                    if (!stringArrayList.contains(s))
                        stringArrayList.add(s);
                });
        System.out.println(stringArrayList);
    }

    public static void main(String[] args) {
        String magnumOpus = """
                Ще не вмерла України і слава, і воля.
                Ще нам, браття молодії, усміхнеться доля.
                Згинуть наші вороженьки, як роса на сонці,
                Запануєм і ми, браття, у своїй сторонці.
                Душу й тіло ми положим за нашу свободу,
                І покажем, що ми, браття, козацького роду.
                Станем, браття, в бій кривавий від Сяну до Дону,
                В ріднім краю панувати не дамо нікому;
                Чорне море ще всміхнеться, дід Дніпро зрадіє,
                Ще у нашій Україні доленька наспіє.
                А завзяття, праця щира свого ще докаже,
                Ще ся волі в Україні піснь гучна розляже,
                За Карпати відоб'ється, згомонить степами,
                України слава стане поміж ворогами.
                Станем, браття, в бій кривавий від Сяну до Дону,
                """;
        task2(magnumOpus);

    }
}
