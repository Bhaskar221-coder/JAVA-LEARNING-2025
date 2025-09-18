package lession6;

import java.util.Scanner;

public class array_practice2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= sc.nextInt();
        boolean isInArray = false;
        int[] marks = {12, 23, 34, 45, 56};
        for(int element: marks){
           if (n==element){
            isInArray = true;
            break;
           }
        }
        if(isInArray){
            System.out.print("The value of n is present in the array");
        }
        else{
            System.out.print("The value of n is not valid");
        }
    }
}

