package lession6;

public class practice7 {
     public static void main(String[] args){
         int[] arr={12,34,56,78,90};
         int min=1000000;
         for(int element:arr){
            if(element<min){
                min=element;
            }
         }
         System.out.println("The minimum value of array is: " + min);
    }
}
