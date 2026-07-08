package BASIC;

import java.util.Scanner;

public class tsaofcuboid {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length = ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth = ");
        double b = sc.nextDouble() ;
        System.out.print("Enter Height = ");
        double h = sc.nextDouble();
        double tsa = 2*((l*b)+(b*h)+(h*l));
        System.out.println("TSA of Cuboid = " + tsa);
        sc.close();

    }
}
