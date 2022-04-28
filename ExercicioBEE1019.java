import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1019 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int horas = N / 3600;
        N -= horas * 3600;
        int minutos = N / 60;
        N -= minutos * 60;
        int segundos = N;

        System.out.println(horas + ":" + minutos + ":" + segundos);
        sc.close();
    }
}
