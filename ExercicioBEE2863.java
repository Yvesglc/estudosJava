import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE2863 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = sc.nextInt();
            double melhor = 999;

            for (int i = 0; i < N; i++) {
                double n = sc.nextDouble();
                if (n < melhor) melhor = n;
            }
            System.out.println(melhor);

        }
    }
}
