import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1933 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;

        if (a == b) c = a;
        else if (a > b) c = a;
        else c = b;

        System.out.println(c);

        sc.close();
    }
}