import java.util.Scanner;
import java.util.Locale;

public class ExercicioBEE2780 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();
        if (D <= 800)
            System.out.println("1");
        else if (800 < D && D <= 1400)
            System.out.println("2");
        else if (1400 < D && D <= 2000)
            System.out.println("3");
        sc.close();
    }
}