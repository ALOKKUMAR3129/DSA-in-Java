package ifelse;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price = ");
        Double x = sc.nextDouble();
        System.out.print("Enter Selling Price = ");
        Double y = sc.nextDouble();
        if(x<y){
            double z = y - x;
            System.out.println("Profit = "+ z);
        }
        else if(x>y){
            double z = x - y;
            System.out.println("Loss = "+ z);
        }
        else{
            System.out.println("No Profit No Loss");
        }
        sc.close();
    }
}
