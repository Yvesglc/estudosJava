import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        double distancia = (Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2));
        double dist = Math.sqrt(distancia);
        System.out.printf("%.4f%n", dist);


    }
}
