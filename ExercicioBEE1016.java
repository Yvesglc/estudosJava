import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1016 {
    public static void main(String[] args) {
        Locale .setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int tempo = x * 2;

        System.out.println(tempo + " minutos");
    }
}
