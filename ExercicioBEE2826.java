import java.util.Scanner;

public class ExercicioBEE2826 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        if (A.compareTo(B) < 0) {
            System.out.println(A);
            System.out.println(B);
        } else if (A.compareTo(B) > 0) {
            System.out.println(B);
            System.out.println(A);
        } else {
            System.out.println(A);
            System.out.println(B);
        }
    }

}