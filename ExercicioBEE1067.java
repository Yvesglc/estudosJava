import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1067 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num >= 1 && num <= 1000) {
            for (int i = 1; i <= num; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}