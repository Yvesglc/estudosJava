import java.util.Scanner;
import java.util.Locale;

public class ExercicioBEE2551 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        while (sc.hasNext()) {
            int N = sc.nextInt();
            double R = 0;

            for (int i = 1; i <= N; i++) {
                Double T = sc.nextDouble();
                Double D = sc.nextDouble();
                if (D / T > R) {
                    System.out.println(i);
                    ;
                    R = D / T;
                }
            }
        }
        sc.close();
    }
}