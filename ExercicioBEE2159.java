import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE2159 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int n = sc.nextInt();
        Double minimo, maximo;
        if (n >= 17 && n <= 1000000000) {
            minimo = n / Math.log(n);
            maximo = 1.25506 * (minimo);

            System.out.printf("%.1f %.1f\n", minimo, maximo);
        }
        sc.close();
    }
}