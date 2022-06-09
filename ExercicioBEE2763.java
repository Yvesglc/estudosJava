import java.util.Scanner;

public class ExercicioBEE2763 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String STR = sc.next();
        String A = STR.substring(0, 3);
        String B = STR.substring(4, 7);
        String C = STR.substring(8, 11);
        String D = STR.substring(12, 14);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }

}