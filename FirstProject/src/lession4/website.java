package lession4;
import java.util.Scanner;

import lession3.string;
public class website {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
    System.out.println("Enter the website name: ");
    String website = sc.nextLine();
    if (website.endsWith(".com")){
        System.out.println("This is a commercial website");
    }
    else if(website.endsWith(".org")){
        System.out.println("This is an organizational website");
    }
    else if(website.endsWith(".in")){
        System.out.println("This is an Indian website");
    }
    else{
        System.out.println("This is not a valid website");
    }}}
