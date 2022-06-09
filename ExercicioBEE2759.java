import java.util.Scanner;
import java.util.Locale;

public class ExercicioBEE2759 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);//2
        char b = sc.next().charAt(0);//3
        char c = sc.next().charAt(0);//4
        System.out.printf("A = %c, B = %c, C = %c\n", a, b, c);
        System.out.printf("A = %c, B = %c, C = %c\n", b, c, a);
        System.out.printf("A = %c, B = %c, C = %c\n", c, a, b);
        sc.close();
    }
}