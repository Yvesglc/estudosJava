import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE2160 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        String entrada = sc.nextLine();
        if (entrada.length() <= 80)
            System.out.println("YES");
        else
            System.out.println("NO");

        sc.close();
    }
}