import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1174 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        double[] w = new double[100];

        for (int aux = 0; aux < 100; aux++)
            w[aux]=sc.nextDouble();

        for (int i = 0; i < 100; i++)
            if (w[i] <= 10.0)
                System.out.printf("A[%d] = %.1f\n",i,w[i]);

        sc.close();
    }
}