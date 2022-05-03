import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 6; i++) {
            float A = sc.nextFloat();
            if (A > 0) {
                cont++;
            }
        }
        System.out.printf("%d valores positivos\n", cont);
    }
}
