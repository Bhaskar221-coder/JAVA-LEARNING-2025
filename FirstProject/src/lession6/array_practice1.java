package lession6;

public class array_practice1 {
    public static void main(String[] args){
      float[] marks = {12.7f, 23.8f, 34.5f, 45.3f, 56.0f};
       float sum = 0;
        for(float element: marks){
            sum = sum + element;
        }
        System.out.print("The sum is: " );  
        System.out.print(sum); 
    }
}
