package lession6;

public class practice5 {
     public static void main(String[] args){
        int[] arr = {12, 23, 34, 45, 56};
        int l = arr.length;
         int a= Math.floorDiv(l, 3); 
         int temp;
         for(int i=0; i<a; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
         }
            for(int element: arr){
        System.out.println(element);
    
     }

}
}
