package lession4;
import java.util.Scanner;
public class company {
    public static void main(String[] args) {
int age;
System.out.println("enter your age : ");
Scanner sc = new Scanner(System.in);
age = sc.nextInt();
if (age>20){
System.out.println("less experienced");
}
 if(age>30){
System.out.println("experienced");
}
else if(age>50){
    System.out.println("most experienced");
}
else{
    System.out.println("not exprienced");  
}
}
}
