//sum of first n even number
package lession5;
import java.util.Scanner;
public class loop_practice2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number:");
          int n = sc.nextInt();
        int sum=0;
        for (int i = sum; i < n; i++) {
            sum=(sum+i*2);
        }   
        System.out.print("first n even number is:");
        System.out.println(sum);
    }
}
