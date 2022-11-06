package Homework3;

import java.util.Arrays;

public class Homework3 {

    public static void main(String[] args) {
        int values[] = {1, 0, 2, 5, 6, 4, 10, 3},
                max = values[0], min = values[0],
                maxIndex = 0, minIndex = 0, sum = 0;
        for (int i = 0; i < values.length; i++){
            if (values[i] > max) {
                max = values[i];
                maxIndex = i;
            }
            if (values[i] < min){
                min = values[i];
                minIndex = i;
            }
        }
        System.out.println("Task 1:");
        System.out.println("Max value in array: " + max
                + "\nMin value in array: " + min);
        for (int i = minIndex + 1; i < maxIndex; i++)
            sum += values[i];
        System.out.println("Sum: " + sum);

        ////// int values[] = {1, 0, 2, 5, 6, 4, 10, 3},
        int[] b = new int[values.length];
        for (int i = values.length - 1; i >= 0; i--) {
            if (i + 1 >= values.length){
                b[i + 1 - values.length] = values[i];
            } else {
                b[i + 1] = values[i];
            }
        }
        System.out.println("\nTask 2: \nwas: " + Arrays.toString(values));
        System.out.println("now: " + Arrays.toString(b));

        //////

        int[] arr0 = {1, 2, 3, 4, 5};
        int[] arr1 = {5, 6, 7};

        int[] mas = new int[arr0.length + arr1.length];
        int count0 = 0, count1 = 0;
        for (int i = 0; i < mas.length; i++){
            if (i % 2 == 0) {
                mas[i] = arr0[count0];
                count0++;
                if (count0 == arr0.length)
                    count0 = 0;
            } else {
                mas[i] = arr1[count1];
                count1++;
                if (count1 == arr1.length)
                    count1 = 0;
            }
        }
        System.out.println("\nTask 3: " + Arrays.toString(mas));

    }

}
