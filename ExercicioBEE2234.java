import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE2234 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        System.out.printf("%.2f\n", A / B);
        sc.close();
    }
}