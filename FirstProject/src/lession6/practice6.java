package lession6;

public class practice6 {
    public static void main(String[] args){
         int[] arr={12,34,56,78,90};
         int max=0;
         for(int element:arr){
            if(element>max){
                max=element;
            }
         }
         System.out.println("The maximum value of array is: " + max);
    }
}
// WAP to calculate the maximum value of an array.