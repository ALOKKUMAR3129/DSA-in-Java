package BASIC;

import java.util.Scanner;

public class sumof3numbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER 1ST NUMBER =");
        double a = sc.nextDouble();
        System.out.print("ENTER 2ND NUMBER =");
        double b = sc.nextDouble();
        System.out.print("ENTER 3RD NUMBER =");
        double c = sc.nextDouble();
        double sum = a + b + c;
        System.out.println("SUM OF THREE NUMBERS = " + sum);

        sc.close();

    }
}
