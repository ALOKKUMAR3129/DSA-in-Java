package basic;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER = ");
        double n = sc.nextDouble();
        double s = n * n;
        System.out.println("SQUARE OF NUMBER = " + s);
        sc.close();
    }
}
