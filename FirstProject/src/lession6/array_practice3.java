package lession6;

public class array_practice3 {
     public static void main(String[] args){
        float[] marks={98.5f,45.6f,67.1f,89.0f,90.2f};
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("The average of physics marks is: " + sum/marks.length);
        
     }
}
// WAP to calculate the average of physics marks of 5 students in an array.