import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if ((A == 0) | (B * B - 4 * A * C < 0)) {
            System.out.println("Impossivel calcular");
            return;
        }

        double bascara = Math.sqrt((B * B) - 4 * A * C);
        double R1 = (-B + bascara) / (2 * A);
        double R2 = (-B - bascara) / (2 * A);
        System.out.println(String.format("R1 = %.5f", R1));
        System.out.println(String.format("R2 = %.5f", R2));
    }
}

