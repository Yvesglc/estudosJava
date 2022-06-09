import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE2774 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String entrada1 = sc.nextLine();
            String[] entr1 = entrada1.split(" ");
            int H = Integer.parseInt(entr1[0]);
            int M = Integer.parseInt(entr1[1]);
            int QT = H * 60 / M;

            String entrada2 = sc.nextLine();
            String[] entr2 = entrada2.split(" ");
            double[] x = new double[QT];
            double media = 0;
            for (int i = 0; i < QT; i++) {
                x[i] = Double.parseDouble(entr2[i]);
                media += x[i];
            }
            media /= QT;
            double somatorio = 0;
            for (int i = 0; i < QT; i++)
                somatorio += Math.pow(x[i] - media, 2.0);

            double resultado = 0;
            resultado = (double) Math.sqrt(somatorio / (QT - 1));

            System.out.printf("%.5f\n", resultado);
        }
        sc.close();
    }
}