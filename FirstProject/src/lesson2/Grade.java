package lesson2;

public class Grade {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
