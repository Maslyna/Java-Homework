package Homework1;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int digit = scan.nextInt();

        if (digit % 10 == 3)
            System.out.println("Last number is 3");
        else
            System.out.println("Last nubber isn`t 3");

        System.out.println("End of task 1");

        /////////////////////////////////////////

        System.out.println("Enter how much we have gryvnas: ");
        digit = scan.nextInt();

        if (digit <= 10 && digit > 0) {
            System.out.println("We have gryvnas!, We are not moneyless! YAY!");
            if (digit == 1)
                System.out.println("We have: " + digit + " gryvnya");
            else if (digit < 5)
                System.out.println("We have: " + digit + " gryvny");
            else System.out.println("We have: " + digit + " gryven`");
        } else if (digit > 10) {
            System.out.println("We have gryvnas!, We are not moneyless! YAY!");
            System.out.println(" WE ARE REACH ! ");
        } else {
            System.out.println("We don`t have gryvnas..., we are moneyless :(");
        }

        System.out.println("End of task 2");

        /////////////////////////////////////////

        System.out.println("Enter a, b, c: ");
        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();

        if (b % 2 == 0) {
            double D1 = Math.sqrt(Math.pow((b / 2), 2) - a * c);
            if (D1 == 0) {
                System.out.println("Discriminant == 0, so we have only 1 solution");
                double x1 = ((-b / 2) + D1) / a;
                System.out.println("x = " + x1);
            } else if (D1 > 0) {
                double x1 = ((-b / 2) + D1) / a;
                double x2 = ((-b / 2) - D1) / a;
                System.out.println("x1 = " + x1 + "\nx2 = " + x2);
            } else {
                System.out.println("This equation don`t have connections or crossing with X axis");
            }

        } else {
            double D = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
            if (D == 0) {
                System.out.println("Discriminant == 0, so we have only 1 solution");
                double x1 = (-b + D) / (2 * a);
                System.out.println("x = " + x1);
            } else if (D > 0) {
                double x1 = (-b + D) / (2 * a);
                double x2 = (-b - D) / (2 * a);
                System.out.println("x1 = " + x1 + "\nx2 = " + x2);
            } else {
                System.out.println("This equation don`t have connections or crossing with X axis");
            }
        }
        scan.close();
        System.out.println("The End!");
    }
}
