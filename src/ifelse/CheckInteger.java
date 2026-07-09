package ifelse;

import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        double n = sc.nextDouble();
        if(n == (int)n){
            System.out.println("It is an Integer");
        }
        else{
            System.out.println("It is not an Integer");

        }


    }
}
