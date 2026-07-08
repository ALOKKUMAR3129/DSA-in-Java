package BASIC;

import java.util.Scanner;

public class volumeofsphere {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius = ");
        double r = sc.nextDouble();
        double a = (4.0/3.0) *3.141592 * r * r * r;
        System.out.println("Volume of Sphere = " + a);
        sc.close();
    }
}
