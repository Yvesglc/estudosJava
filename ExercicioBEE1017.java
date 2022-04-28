import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();

        double distancia = velocidade * tempo;
        double gasolina = distancia / 12;

        System.out.printf("%.3f%n", gasolina);

    }
}
