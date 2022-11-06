package Homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0, key = 0;

        for (int i = 0; ; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
                sum += i;
                key++;
            }
            if (key == n) { System.out.println("\nsum = " + sum); break;}
        }

        ////////

        for (int i = 10; i <= 50; i++) {
            if (i % 3 == 0) System.out.print(i + " ");
        }

        ////////

        int temp;
        boolean prime = true;
        int num =scan.nextInt();
        for (int i=2; i<=num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println(num + " - proste");
        }
        else {
            System.out.println(num + " - skadne");
        }

        /////

        int n1 = 1, n2 = 1;
        int fib;
        double sum1 = 0;
        System.out.print(1 + " "+ 1 + " ");
        sum1 += 2;
        for(int i = 3; i <= 20; i++){
            fib = n1 + n2;
            sum1 += fib;
            System.out.print(fib + " ");
            n1=n2;
            n2=fib;
        }
        System.out.println("\n" + (sum1 / 20));


        scan.close();
    }
}
