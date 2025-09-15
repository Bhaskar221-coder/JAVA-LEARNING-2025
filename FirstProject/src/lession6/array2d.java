package lession6;

public class array2d {
    public static void main(String[] args) {
        
        int[][] flats = {{101, 102}, {201, 202}, {301, 302}};
       for(int i=0; i<flats.length; i++){
        for(int j=0; j<flats[i].length; j++){
            System.out.print(flats[i][j]);
            System.out.print(" ");
        }
    System.out.println("\n");
       }
    }
}
