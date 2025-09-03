package lession4;
import java.util.Scanner;
public class lession4practice3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount;
        System.out.println("Enter the amount : ");
        amount = sc.nextInt();
        if (25<amount && amount>=50){
            System.out.println("Your tax amount is 5%");
        }
        else if(50<amount && amount>=100){
            System.out.println("Your tax amount is 20%");
        }
        else if(amount>100){
            System.out.println("Your tax amount is 30%");
        }
        else {
            System.out.println("You are not paying any tax");
        }
    }
}
