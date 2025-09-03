package lession4;
import java.util.Scanner;
public class breakcase {
    public static void main(String[] args) {
        int day = 4;
        System.out.println("enter your age : ");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        switch (day) {
            case 18:
                System.out.println("adult");
                break;
            case 23:
                System.out.println("join a job");
                break;
            case 60:
                System.out.println("retired");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }
        System.out.println("Thanks for using my java code");
    }
    
}
