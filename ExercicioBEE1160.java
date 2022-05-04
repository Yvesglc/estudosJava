import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1160 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), anos;
        double g1, g2;
        int pa, pb;
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        for (int i = 0; i < t; i++) {
            anos = 101;
            pa = sc.nextInt();
            pb = sc.nextInt();
            g1 = format.parse(sc.next()).doubleValue();
            g2 = format.parse(sc.next()).doubleValue();
            for (int j = 0; j < 100; j++) {
                pa = (int) ((1 + (g1 / 100)) * pa);
                pb = (int) ((1 + (g2 / 100)) * pb);
                if (pa > pb) {
                    anos = (j + 1);
                    break;
                }
            }
            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }
        sc.close();
    }
}
