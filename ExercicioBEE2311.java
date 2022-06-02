import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE2311 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int n = Integer.parseInt(sc.next());
        String nome = "";
        double graudif = 0.0;
        List<Double> nota = new ArrayList<>();
        Double somanota = 0.0;
        for (int i = 0; i < n; i++) {
            nome = sc.next();
            graudif = sc.nextDouble();
            nota.add(sc.nextDouble());
            nota.add(sc.nextDouble());
            nota.add(sc.nextDouble());
            nota.add(sc.nextDouble());
            nota.add(sc.nextDouble());
            nota.add(sc.nextDouble());
            nota.add(sc.nextDouble());
            Collections.sort(nota);
            nota.remove(0);
            nota.remove(5);
            for (Double valor : nota)
                somanota += valor;
            System.out.printf("%s %.2f\n", nome, somanota * graudif);
            somanota = 0.0;
            nota = new ArrayList<>();
        }
        sc.close();
    }
}