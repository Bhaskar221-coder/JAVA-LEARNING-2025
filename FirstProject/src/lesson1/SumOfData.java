package lesson1;

import java.util.Scanner;

public class SumOfData {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the marks:");
	 float num1= sc.nextFloat();
	 float sum = (num1/70)*100;
	 System.out.println(sum);
	 sc.close();
			 }
}