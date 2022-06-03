import java.util.Scanner;
import java.util.Locale;

public class ExercicioBEE2670 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int resA1 = (a2 * 1 * 2) + (a3 * 2 * 2);
        int resA2 = (a1 * 1 * 2) + (a3 * 1 * 2);
        int resA3 = (a1 * 2 * 2) + (a2 * 1 * 2);
        int aux = resA1;
        if (resA2 < aux) aux = resA2;
        if (resA3 < aux) aux = resA3;
        System.out.println(aux);
        sc.close();
    }
}