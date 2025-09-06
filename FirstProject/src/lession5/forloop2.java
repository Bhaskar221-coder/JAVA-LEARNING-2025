package lession5;

public class forloop2 {
    public static void main(String[] args) {
        for (int a = 1; a <= 5; a++) {
            System.out.println(a);
            if(a == 3) {
                 System.out.println("end the loop");
              break;
            }
            if(a == 2) {
                System.out.println("skip the value");
                continue;
            }
           System.out.println(a);
          System.out.println("skip the value");
        }
    }
}

