package lession6;

public class practice4 {
    public static void main(String[] args) {
    int[][] matrices1 = {{101 ,103, 102}, {201,203, 202}};
    int[][] matrices2 = { {201,405, 202}, {301,505, 302}};
    int[][] result = {{0,0,0}, {0,0,0}};
    for(int i=0; i<matrices1.length; i++){
        for(int j=0; j<matrices1[i].length; j++){
           System.out.format("setting value for i=%d and j=%d\n",i,j);
           result[i][j]= matrices1[i][j]+ matrices2[i][j];
            //System.out.print(" ");
        }
        
    }
}
}
