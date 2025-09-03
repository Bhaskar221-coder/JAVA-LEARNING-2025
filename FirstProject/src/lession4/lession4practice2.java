package lession4;
import java.util.Scanner;
public class lession4practice2 {
     public static void main(String[] args){
          int MathsMarks;
          Scanner sc = new Scanner(System.in);
System.out.println("enter the maths marks: ");

MathsMarks = sc.nextInt();
int PhyMarks;
System.out.println("enter the phy marks: ");
PhyMarks = sc.nextInt();
int chemMarks;
System.out.println("enter the chem marks: ");
chemMarks = sc.nextInt();
if(PhyMarks >= 33 && MathsMarks >= 33 && chemMarks >= 33){
    System.out.println("You are pass");
}else{
     System.out.println("You are fail");
     }
}
}